/*******************************************************************************
 * Copyright (c) 2012 Cho Hyun Jong.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cho Hyun Jong - initial API and implementation
 ******************************************************************************/
package com.hangum.db.system;

import junit.framework.TestCase;

import com.hangum.db.dao.system.UserDAO;
import com.hangum.db.define.Define;

/**
 * {@link com.hangum.db.system.TadpoleSystem_UserInfoData 기본정보 테스트}
 * 
 * @author hangum
 *
 */
public class TadpoleSystem_UserInfoDataTest extends TestCase {
	
	@Override
	protected void setUp() throws Exception {
		try {
			TadpoleSystem_UserQuery.deleteUser(TadpoleSystem_UserQueryTest.defaultUserDAO);
		} catch (Exception e) {
			fail("delete user");
		}
		
		super.setUp();
	}
	
	/**
	 * {@link com.hangum.db.system.TadpoleSystem_UserInfoData#insertUserInfoData(UserDAO) 기본정보 테스트}
	 */
	public void testInsertUserInfoDataUserDAO() {
		try {
			UserDAO user = TadpoleSystem_UserQuery.newUser(TadpoleSystem_UserQueryTest.groupSeq, TadpoleSystem_UserQueryTest.email, TadpoleSystem_UserQueryTest.passwd, TadpoleSystem_UserQueryTest.name, Define.USER_TYPE.ADMIN.toString());
			
			TadpoleSystem_UserInfoData.insertUserInfoData(user);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
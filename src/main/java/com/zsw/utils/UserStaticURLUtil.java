package com.zsw.utils;

/**
 * Created by zhangshaowei on 2020/4/15.
 */
public class UserStaticURLUtil {

    public  static  final String permissionController = "/permission";
    public  static  final String permissionController_initPermission = CommonStaticWord.System_Url + "/init_permission";

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    public  static  final String userController = "/user";
    public  static  final String userController_login = "/login";
    public  static  final String userController_resetPassWord = "/resetPassWord";
    public  static  final String userController_newUser = "/newUser";
    public  static  final String userController_getUser = "/getUser";
    public  static  final String userController_updateUser = "/updateUser";
    public  static  final String userController_batchBan = "/batchBan";
    public  static  final String userController_usersPage = "/usersPage";
    public  static  final String userController_loginOut = "/loginOut";

    public  static  final String userController_checkRememberToken = CommonStaticWord.System_Url + "/checkRememberToken";

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    public  static  final String companyController = "/company";
    public  static  final String companyController_getUserCompanys = "/getUserCompanys";
    public  static  final String companyController_selectUserCompany = "/selectUserCompany";

    public  static  final String companyController_companysPage = "/companysPage";
    public  static  final String companyController_newCompany = "/newCompany";
    public  static  final String companyController_getCompany = "/getCompany";
    public  static  final String companyController_updateCompany = "/updateCompany";
    public  static  final String companyController_deleteCompany = "/deleteCompany";

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    public  static  final String departmentController = "/department";

    public  static  final String departmentController_departmentsPage = "/departmentsPage";
    public  static  final String departmentController_newDepartment = "/newDepartment";
    public  static  final String departmentController_getDepartment = "/getDepartment";
    public  static  final String departmentController_updateDepartment = "/updateDepartment";
    public  static  final String departmentController_deleteDepartment = "/deleteDepartment";
    public  static  final String departmentController_updateStatusDepartment = "/updateStatusDepartment";

    public  static  final String departmentController_relationDepartmentUser = "/relationDepartmentUser";
    public  static  final String departmentController_deleteDepartmentUser = "/deleteDepartmentUser";

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


    public  static  final String adminUserController = "/adminUser";

}

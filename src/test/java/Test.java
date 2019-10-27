/**
 * @author QiaoGuanHui
 * @date 2019/10/15-13:24
 */
public class Test {
    public static void main(String[] args) {
        String sql ="INSERT all INTO easybuy_user VALUES (2,'admin','系统管理员','123123',0,'130406198302141869','hello11@bdqn.com','1583233515',1,'7.jpg'),(10,'cgn','程广宁','123',1,'140225189987854589','1044732267@qq.com','13366055011',0,'2.jpg'),(11,'hyl','韩语良','1231',1,'140225198874584539','1044732267@qq.com','13366055010',0,'3.jpg'),(12,'ck','陈康','123',1,'140225189987854589','1044732267@qq.com','13366055010',0,'4.jpg'),(13,'kys','康有沈','123',1,'1402251985512541525','1044732267@qq.com','13366055010',0,'5.jpg'),(14,'sb','沈白','123',1,'140225158987854589','1044732267@qq.com','13366055010',0,'6.jpg'),(16,'lgw','李高伟','123123',1,'140225189987854589','1011322658@qq.com','1336998554',0,'7.jpg'),(18,'shangzezhong','尚泽忠','123123',1,'140225198810013745','1044888844@qq.com','13366528458',0,'8.jpg'),(19,'liguangliang','李光亮','123123',1,'140225198841547785','1047777@qq.com','13366055048',0,'9.jpg'),(20,'szz','李光亮','123123',1,'140225198810013748','1044732267@qq.com','13366555010',1,'10.jpg'),(21,'zhangsan','张三','123123',0,'610456789098765432','163@163.com','13523456789',0,'5.jpg'),(22,'zhangsan2','张三','123123',0,'610999999999999999','123123123@163.com','123123',0,'5.jpg'),(23,'lili','丽丽','123123',0,'111111111111111111','15029180718@163.com','15029180718',0,'5.jpg');";
        String newSql = changeSql(sql,") INTO easybuy_user VALUES ");
        System.out.println(newSql);
    }

    /**
     *
     * @param sql mysql导出的插入语句,需要在第一个里面自己添加 一个all
     * @param str 替换的代码 ,将原来sql中的的"),"替换成") into table values "
     * @return 返回替换后的slq
     */
    public static String changeSql(String sql,String  str){
        boolean flag = true;
        while(flag){
            if(sql.contains("),")){
                sql =sql.replace("),",str);
            }else{
                flag = false;
            }
        }
        return sql.substring(0,sql.indexOf(";")) +" select 1 from dual;";
    }
}

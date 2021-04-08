## 关联关系查询
 * 一对多(一个班级有多个学生案例)
 
    ```
        <sql id="Base_Classes_Students">
            tc.id,
            tc.cname,
            ts.id as student_id,
            ts.classes_id,
            ts.`name`
        </sql>
        
        <resultMap id="BaseResultMap" type="com.zhangfuyin.entity.Classes" >
    
            <id column="id" property="id"/>
            <result column="cname" property="cname"/>
            <collection property="students" ofType="com.zhangfuyin.entity.Student">
                <id column="student_id" property="id"/>
                <result column="classes_id" property="classesId"/>
                <result column="name" property="name"/>
            </collection>
    
        </resultMap>
    
        <select id="selectById" resultMap="BaseResultMap">
    
            SELECT
                <include refid="Base_Classes_Students"/>
            FROM
            t_classes tc ,t_student ts
            WHERE
            tc.id = ts.classes_id
            AND tc.id = #{id}
    
        </select>     
          
           
    ```
     
 * 多对一
 * 多对多
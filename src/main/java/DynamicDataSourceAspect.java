import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 切换数据源Advice  @Order(-1) 保证该AOP在@Transactional之前执行
 */
@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {

    public void changeDataSource(JoinPoint point, TargetDataSource ds){

    }

}

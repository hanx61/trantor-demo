package io.terminus.trantor.demo.user.biz.repo;

import io.terminus.trantor.demo.user.model.LongId;
import io.terminus.trantor.sdk.autumn.dao.TrantorDAO;
import org.springframework.stereotype.Repository;

/**
 * @author Xyf
 */
@Repository
public class LongIdRepo extends TrantorDAO<LongId, Long> {
}

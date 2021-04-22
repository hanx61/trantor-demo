package io.terminus.trantor.demo.staff.flow.impl;

import io.terminus.trantor.demo.staff.flow.CreatePositionFlow;
import io.terminus.trantor.demo.staff.func.CreatePositionFunc;
import io.terminus.trantor.demo.staff.model.Position;
import io.terminus.trantorframework.api.annotation.FlowImpl;
import io.terminus.trantorframework.api.annotation.RouteRuleValue;

/**
 * @author liuyayue
 * @create 2021/4/22 08:53 下午
 */
@FlowImpl(name = "create other position with dynamic route")
@RouteRuleValue({"middle","primary"})
public class CreateOtherPositionFlowImpl implements CreatePositionFlow {

    private CreatePositionFunc createPositionFunc;

    @Override
    public Position execute(Position position) {
        Position result = createPositionFunc.execute(position);
        return result;
    }
}

package org.jlua.main.nodes;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

/**
 * Created by Lucas Allan Amorim on 2014-09-08.
 */
@TypeSystemReference(LuaTypes.class)
public abstract class LuaExpressionNode extends Node {

	public abstract void executeGeneric(VirtualFrame frame);
	
	public void executeVoid(VirtualFrame frame) {
		executeGeneric(frame);
	}

    public boolean executeBoolean(VirtualFrame frame) {
        return true;
    }

}
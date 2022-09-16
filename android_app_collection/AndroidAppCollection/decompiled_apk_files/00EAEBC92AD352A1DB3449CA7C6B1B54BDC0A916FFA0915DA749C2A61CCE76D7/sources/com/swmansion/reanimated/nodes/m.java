package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
/* loaded from: classes.dex */
public abstract class m {
    private List<m> mChildren;
    private final Map<String, Long> mLastLoopID = new HashMap();
    private final Map<String, Object> mMemoizedValue = new HashMap();
    protected final int mNodeID;
    protected final com.swmansion.reanimated.b mNodesManager;
    protected final com.swmansion.reanimated.d mUpdateContext;
    public static final Double ZERO = Double.valueOf(0.0d);
    public static final Double ONE = Double.valueOf(1.0d);

    public m(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        this.mLastLoopID.put("", -1L);
        this.mNodeID = i;
        this.mNodesManager = bVar;
        this.mUpdateContext = bVar.p;
    }

    private static void findAndUpdateNodes(m mVar, Set<m> set, Stack<j> stack) {
        if (set.contains(mVar)) {
            return;
        }
        set.add(mVar);
        List<m> list = mVar.mChildren;
        if (list != null) {
            for (m mVar2 : list) {
                findAndUpdateNodes(mVar2, set, stack);
            }
        }
        if (!(mVar instanceof j)) {
            return;
        }
        stack.push((j) mVar);
    }

    public static void runUpdates(com.swmansion.reanimated.d dVar) {
        UiThreadUtil.assertOnUiThread();
        ArrayList<m> arrayList = dVar.f9977c;
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            findAndUpdateNodes(arrayList.get(i), hashSet, stack);
            if (i == arrayList.size() - 1) {
                while (!stack.isEmpty()) {
                    ((j) stack.pop()).a();
                }
            }
        }
        arrayList.clear();
        dVar.f9975a++;
    }

    public void addChild(m mVar) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(mVar);
        mVar.dangerouslyRescheduleEvaluate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dangerouslyRescheduleEvaluate() {
        this.mLastLoopID.put(this.mUpdateContext.f9976b, -1L);
        markUpdated();
    }

    public final Double doubleValue() {
        Object value = value();
        if (value == null) {
            return ZERO;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (value instanceof Boolean) {
            return ((Boolean) value).booleanValue() ? ONE : ZERO;
        }
        throw new IllegalStateException("Value of node " + this + " cannot be cast to a number");
    }

    /* renamed from: evaluate */
    protected abstract Object mo321evaluate();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void forceUpdateMemoizedValue(Object obj) {
        this.mMemoizedValue.put(this.mUpdateContext.f9976b, obj);
        markUpdated();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void markUpdated() {
        UiThreadUtil.assertOnUiThread();
        this.mUpdateContext.f9977c.add(this);
        this.mNodesManager.c();
    }

    public void removeChild(m mVar) {
        List<m> list = this.mChildren;
        if (list != null) {
            list.remove(mVar);
        }
    }

    public final Object value() {
        if (this.mLastLoopID.containsKey(this.mUpdateContext.f9976b)) {
            long longValue = this.mLastLoopID.get(this.mUpdateContext.f9976b).longValue();
            com.swmansion.reanimated.d dVar = this.mUpdateContext;
            if (longValue >= dVar.f9975a) {
                return this.mMemoizedValue.get(dVar.f9976b);
            }
        }
        Map<String, Long> map = this.mLastLoopID;
        com.swmansion.reanimated.d dVar2 = this.mUpdateContext;
        map.put(dVar2.f9976b, Long.valueOf(dVar2.f9975a));
        Object mo321evaluate = mo321evaluate();
        this.mMemoizedValue.put(this.mUpdateContext.f9976b, mo321evaluate);
        return mo321evaluate;
    }
}

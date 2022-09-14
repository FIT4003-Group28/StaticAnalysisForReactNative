package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f10009a;

    public l(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10009a = com.swmansion.reanimated.e.a(readableMap.getArray("input"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public Double mo321evaluate() {
        WritableArray createArray = Arguments.createArray();
        int i = 0;
        while (true) {
            int[] iArr = this.f10009a;
            if (i >= iArr.length) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", this.mNodeID);
                createMap.putArray("args", createArray);
                this.mNodesManager.a("onReanimatedCall", createMap);
                return m.ZERO;
            }
            m a2 = this.mNodesManager.a(iArr[i], m.class);
            if (a2.value() == null) {
                createArray.pushNull();
            } else {
                Object value = a2.value();
                if (value instanceof String) {
                    createArray.pushString((String) value);
                } else {
                    createArray.pushDouble(a2.doubleValue().doubleValue());
                }
            }
            i++;
        }
    }
}

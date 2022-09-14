package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class EventNode extends m implements RCTEventEmitter {
    private final List<a> mMapping;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f9984a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f9985b;

        public a(ReadableArray readableArray) {
            int size = readableArray.size() - 1;
            this.f9985b = new String[size];
            for (int i = 0; i < size; i++) {
                this.f9985b[i] = readableArray.getString(i);
            }
            this.f9984a = readableArray.getInt(size);
        }

        public Double a(ReadableMap readableMap) {
            int i = 0;
            while (readableMap != null) {
                String[] strArr = this.f9985b;
                if (i >= strArr.length - 1) {
                    break;
                }
                String str = strArr[i];
                readableMap = readableMap.hasKey(str) ? readableMap.mo210getMap(str) : null;
                i++;
            }
            if (readableMap != null) {
                String[] strArr2 = this.f9985b;
                String str2 = strArr2[strArr2.length - 1];
                if (!readableMap.hasKey(str2)) {
                    return null;
                }
                return Double.valueOf(readableMap.getDouble(str2));
            }
            return null;
        }
    }

    public EventNode(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.mMapping = processMapping(readableMap.getArray("argMapping"));
    }

    private static List<a> processMapping(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(readableArray.mo208getArray(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public Double mo321evaluate() {
        return m.ZERO;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap != null) {
            for (int i2 = 0; i2 < this.mMapping.size(); i2++) {
                a aVar = this.mMapping.get(i2);
                Double a2 = aVar.a(writableMap);
                if (a2 != null) {
                    ((u) this.mNodesManager.a(aVar.f9984a, u.class)).a(a2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Animated events must have event data.");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by animated events");
    }
}

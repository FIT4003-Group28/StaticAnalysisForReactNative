package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import java.text.NumberFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public class g extends m {

    /* renamed from: b  reason: collision with root package name */
    private static final NumberFormat f10001b = NumberFormat.getInstance(Locale.ENGLISH);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f10002a;

    static {
        f10001b.setMinimumFractionDigits(0);
        f10001b.setGroupingUsed(false);
    }

    public g(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10002a = com.swmansion.reanimated.e.a(readableMap.getArray("input"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate  reason: collision with other method in class */
    public String mo321evaluate() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int[] iArr = this.f10002a;
            if (i < iArr.length) {
                Object value = this.mNodesManager.a(iArr[i], m.class).value();
                if (value instanceof Double) {
                    value = f10001b.format((Double) value);
                }
                sb.append(value);
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}

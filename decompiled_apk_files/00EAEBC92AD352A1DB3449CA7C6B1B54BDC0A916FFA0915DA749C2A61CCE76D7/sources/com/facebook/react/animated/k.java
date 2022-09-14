package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends s {
    private final l i;
    private final int[] j;

    public k(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.j = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
     */
    @Override // com.facebook.react.animated.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r6 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6.f5405f = r0
            r0 = 0
        L5:
            int[] r1 = r6.j
            int r2 = r1.length
            if (r0 >= r2) goto L2f
            com.facebook.react.animated.l r2 = r6.i
            r1 = r1[r0]
            com.facebook.react.animated.b r1 = r2.d(r1)
            if (r1 == 0) goto L27
            boolean r2 = r1 instanceof com.facebook.react.animated.s
            if (r2 == 0) goto L27
            double r2 = r6.f5405f
            com.facebook.react.animated.s r1 = (com.facebook.react.animated.s) r1
            double r4 = r1.e()
            double r2 = r2 * r4
            r6.f5405f = r2
            int r0 = r0 + 1
            goto L5
        L27:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.multiply node"
            r0.<init>(r1)
            throw r0
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.k.a():void");
    }
}

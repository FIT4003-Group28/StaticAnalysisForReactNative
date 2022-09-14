package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class a extends s {
    private final l i;
    private final int[] j;

    public a(ReadableMap readableMap, l lVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
     */
    @Override // com.facebook.react.animated.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r6 = this;
            r0 = 0
            r6.f5405f = r0
            r0 = 0
        L5:
            int[] r1 = r6.j
            int r2 = r1.length
            if (r0 >= r2) goto L2e
            com.facebook.react.animated.l r2 = r6.i
            r1 = r1[r0]
            com.facebook.react.animated.b r1 = r2.d(r1)
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof com.facebook.react.animated.s
            if (r2 == 0) goto L26
            double r2 = r6.f5405f
            com.facebook.react.animated.s r1 = (com.facebook.react.animated.s) r1
            double r4 = r1.e()
            double r2 = r2 + r4
            r6.f5405f = r2
            int r0 = r0 + 1
            goto L5
        L26:
            com.facebook.react.bridge.JSApplicationCausedNativeException r0 = new com.facebook.react.bridge.JSApplicationCausedNativeException
            java.lang.String r1 = "Illegal node ID set as an input for Animated.Add node"
            r0.<init>(r1)
            throw r0
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.a.a():void");
    }
}

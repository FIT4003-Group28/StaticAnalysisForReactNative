package com.facebook.react.flat;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalDrawCommandManager.java */
/* loaded from: classes.dex */
public final class ah extends e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(s sVar, h[] hVarArr) {
        super(sVar, hVarArr);
    }

    @Override // com.facebook.react.flat.e
    int a() {
        int binarySearch = Arrays.binarySearch(this.f3390a, this.e.top);
        return binarySearch < 0 ? ~binarySearch : binarySearch;
    }

    @Override // com.facebook.react.flat.e
    int a(int i) {
        int binarySearch = Arrays.binarySearch(this.f3391b, i, this.f3391b.length, this.e.bottom);
        return binarySearch < 0 ? ~binarySearch : binarySearch;
    }

    @Override // com.facebook.react.flat.e
    int a(float f, float f2) {
        int binarySearch = Arrays.binarySearch(this.f3393d, f2 + 1.0E-4f);
        return binarySearch < 0 ? ~binarySearch : binarySearch;
    }

    @Override // com.facebook.react.flat.e
    boolean a(int i, float f, float f2) {
        return this.f3392c[i] < f2;
    }
}

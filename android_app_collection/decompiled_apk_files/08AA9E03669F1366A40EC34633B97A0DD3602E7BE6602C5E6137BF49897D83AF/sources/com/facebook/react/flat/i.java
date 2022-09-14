package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawCommandManager.java */
/* loaded from: classes.dex */
public abstract class i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Canvas canvas);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Rect rect);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract v b(float f, float f2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Canvas canvas);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract v c(float f, float f2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(s sVar, h[] hVarArr) {
        return new ah(sVar, hVarArr);
    }
}

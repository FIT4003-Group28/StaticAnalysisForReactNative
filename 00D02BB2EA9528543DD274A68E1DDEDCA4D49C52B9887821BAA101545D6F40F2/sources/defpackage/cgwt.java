package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgwt  reason: default package */
/* loaded from: classes4.dex */
public class cgwt implements cguy {
    private final boov a;
    private final boqk b;

    public cgwt(boov boovVar, Activity activity) {
        this.a = boovVar;
        this.b = new boow(boovVar, activity);
    }

    @Override // defpackage.cguy
    public cqkl a() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.cguy
    public boqk b() {
        return this.b;
    }
}

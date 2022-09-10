package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: boow  reason: default package */
/* loaded from: classes3.dex */
public class boow implements boqk {
    private final booy a;
    private final boov b;

    public boow(boov boovVar, Activity activity) {
        this.b = boovVar;
        this.a = new booy(activity);
    }

    @Override // defpackage.boqk
    public jab a() {
        return this.a;
    }

    @Override // defpackage.boqk
    public cqkl b() {
        this.b.a();
        return cqkl.a;
    }

    @Override // defpackage.boqk
    public cqkl c() {
        boov boovVar = this.b;
        cgfb cgfbVar = (cgfb) boovVar;
        cgfbVar.a.Nw(new cgfa(this.a.a()));
        cgfbVar.a.aT();
        return cqkl.a;
    }
}

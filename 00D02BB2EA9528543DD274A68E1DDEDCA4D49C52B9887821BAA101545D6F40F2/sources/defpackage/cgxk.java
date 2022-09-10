package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgxk  reason: default package */
/* loaded from: classes4.dex */
public class cgxk implements cgvk {
    private final Activity a;
    private final dorc b;
    private final dxio<afha> c;

    public cgxk(Activity activity, dorc dorcVar, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = dorcVar;
        this.c = dxioVar;
    }

    @Override // defpackage.cgvk
    public String a() {
        return this.b.b;
    }

    @Override // defpackage.cgvk
    public Boolean b() {
        int a = dorb.a(this.b.c);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgvk
    public Boolean c() {
        return Boolean.valueOf((this.b.a & 4) != 0);
    }

    @Override // defpackage.cgvk
    public cqkl d() {
        afha a = this.c.a();
        Activity activity = this.a;
        doqz doqzVar = this.b.d;
        if (doqzVar == null) {
            doqzVar = doqz.b;
        }
        a.k(activity, doqzVar.a, 1);
        return cqkl.a;
    }
}

package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aflf  reason: default package */
/* loaded from: classes2.dex */
public final class aflf implements afnk {
    public final Activity a;
    public final dxio<qbt> b;
    public final dxio<vxa> c;

    public aflf(Activity activity, dxio<qbt> dxioVar, dxio<vxa> dxioVar2) {
        this.a = activity;
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    @Override // defpackage.afnk
    public final Runnable a(amvh amvhVar, duqc duqcVar, qbs qbsVar) {
        return new afle(this, qbsVar, amvhVar, duqcVar);
    }
}

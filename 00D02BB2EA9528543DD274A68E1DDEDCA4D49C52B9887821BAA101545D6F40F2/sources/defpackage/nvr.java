package defpackage;

import android.app.Activity;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nvr  reason: default package */
/* loaded from: classes7.dex */
public final class nvr implements nxe {
    private final Activity a;
    private final dxio<afha> b;

    public nvr(Activity activity, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 2097152) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        afha a = this.b.a();
        Activity activity = this.a;
        dtks dtksVar = nviVar.a.s;
        if (dtksVar == null) {
            dtksVar = dtks.b;
        }
        dplx dplxVar = dtksVar.a;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        a.C(activity, dplxVar);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.INVOKE_EXTERNAL_APP);
    }
}

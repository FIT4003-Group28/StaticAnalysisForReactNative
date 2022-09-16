package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auuo  reason: default package */
/* loaded from: classes.dex */
class auuo extends aujb {
    private static final dcqe c = dcqe.c("auuo");
    private final auhi d;
    private final auhj e;
    private final Context f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auuo(android.app.Application r2, defpackage.auhi r3, defpackage.auhj r4, defpackage.dpyv r5) {
        /*
            r1 = this;
            int r5 = r5.dm
            aujc r5 = defpackage.aujd.d(r5)
            r0 = 3
            r5.c(r0)
            aujd r5 = r5.a()
            r1.<init>(r5)
            r1.f = r2
            r1.d = r3
            r1.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auuo.<init>(android.app.Application, auhi, auhj, dpyv):void");
    }

    @Override // defpackage.aujb
    public final void s(@dzsi btlu btluVar, dlfv dlfvVar, boolean z) {
        if (Build.VERSION.SDK_INT < 24 || z) {
            return;
        }
        aujb h = this.d.h(dpyv.SOCIAL_PLANNING_GROUP_SUMMARY.dm);
        if (h == null) {
            bvoo.h("NotificationType cannot be null. Not posting group summary notification.", new Object[0]);
            return;
        }
        augc b = this.e.b(dpyv.SOCIAL_PLANNING_GROUP_SUMMARY.dm, h);
        b.E(new Intent("android.intent.action.VIEW", Uri.parse(dlfvVar.c)), auhw.ACTIVITY);
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        b.C = dlgnVar.C;
        Boolean bool = true;
        if (bool.booleanValue() && Build.VERSION.SDK_INT < 24) {
            bvoo.h("Group summary notifications are only supported on Android versions N and higher.", new Object[0]);
        }
        b.D = bool.booleanValue();
        if (bool.booleanValue()) {
            b.u = true;
        }
        b.D(this.f.getResources().getColor(R.color.quantum_googblue));
        dlgn dlgnVar2 = dlfvVar.g;
        if (dlgnVar2 == null) {
            dlgnVar2 = dlgn.G;
        }
        b.e = dlgnVar2.C;
        this.d.j(b.a());
    }
}

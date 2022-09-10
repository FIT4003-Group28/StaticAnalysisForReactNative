package defpackage;

import android.app.Activity;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nvo  reason: default package */
/* loaded from: classes7.dex */
public final class nvo implements nxe {
    private final Activity a;
    private final dxio<qbt> b;

    public nvo(Activity activity, dxio<qbt> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 2) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dqvj dqvjVar;
        dtjx dtjxVar = nviVar.a.d;
        if (dtjxVar == null) {
            dtjxVar = dtjx.f;
        }
        dsrj<dtov> dsrjVar = dtjxVar.b;
        if (dsrjVar.size() >= 2) {
            dtjx dtjxVar2 = nviVar.a.d;
            if (dtjxVar2 == null) {
                dtjxVar2 = dtjx.f;
            }
            dtjv dtjvVar = dtjxVar2.c;
            if (dtjvVar == null) {
                dtjvVar = dtjv.d;
            }
            dwao dwaoVar = null;
            if ((dtjxVar2.a & 1) != 0) {
                dqvjVar = dqvj.c(dtjvVar.b);
                if (dqvjVar == null) {
                    dqvjVar = dqvj.DRIVE;
                }
            } else {
                dqvjVar = null;
            }
            amvh a = oxd.a(dsrjVar.get(0), this.a);
            amvh a2 = oxd.a(dsrjVar.get(dsrjVar.size() - 1), this.a);
            if ((dtjxVar2.a & 1) != 0 && (dwaoVar = dtjvVar.c) == null) {
                dwaoVar = dwao.R;
            }
            cjsb cjsbVar = new cjsb();
            cjsbVar.e(nviVar.c.b);
            cjsbVar.j(dtjxVar2.d);
            dnqh a3 = cjsbVar.a();
            dtjx dtjxVar3 = nviVar.a.d;
            if (dtjxVar3 == null) {
                dtjxVar3 = dtjx.f;
            }
            qbs qbsVar = dtjxVar3.e ? qbs.NAVIGATION : qbs.DEFAULT;
            qcw x = qcx.x();
            x.s(dqvjVar);
            x.r(a);
            x.u(a2);
            x.w(dwaoVar);
            x.v(a3);
            x.k(qbsVar);
            this.b.a().m(x.a());
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DIRECTIONS);
    }
}

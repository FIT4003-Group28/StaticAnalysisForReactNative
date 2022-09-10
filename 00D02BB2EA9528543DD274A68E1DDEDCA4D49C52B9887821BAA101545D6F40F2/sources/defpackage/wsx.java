package defpackage;

import android.content.Context;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wsx  reason: default package */
/* loaded from: classes7.dex */
public final class wsx implements nxe {
    private final Context a;
    private final vxa b;
    private final tmu c;

    public wsx(tmu tmuVar, Context context, vxa vxaVar) {
        this.c = tmuVar;
        this.a = context;
        this.b = vxaVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 2) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtjx dtjxVar = nviVar.a.d;
        if (dtjxVar == null) {
            dtjxVar = dtjx.f;
        }
        dccx F = dcdc.F();
        for (dtov dtovVar : dtjxVar.b) {
            F.g(oxd.a(dtovVar, this.a));
        }
        vxa vxaVar = this.b;
        dtjv dtjvVar = dtjxVar.c;
        if (dtjvVar == null) {
            dtjvVar = dtjv.d;
        }
        dwao dwaoVar = dtjvVar.c;
        if (dwaoVar == null) {
            dwaoVar = dwao.R;
        }
        dtjv dtjvVar2 = dtjxVar.c;
        if (dtjvVar2 == null) {
            dtjvVar2 = dtjv.d;
        }
        dqvj c = dqvj.c(dtjvVar2.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        dwao d = vxaVar.d(dwaoVar, c, 3, vul.DIRECTIONS_UI);
        tmu tmuVar = this.c;
        dcdc<amvh> q = dcdc.q(F.f());
        if (q.size() < 2) {
            q.size();
        } else {
            tmuVar.a.b.bX(q, d);
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DIRECTIONS);
    }
}

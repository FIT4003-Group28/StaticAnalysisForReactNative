package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: ahcg  reason: default package */
/* loaded from: classes2.dex */
public class ahcg implements agzb {
    @dzsi
    private final btlu a;
    private final Boolean b;
    @dzsi
    private final ahcc c;
    private final ahce d;

    public ahcg(ahcd ahcdVar, ahcf ahcfVar, @dzsi btlu btluVar, boolean z) {
        this.a = btluVar;
        this.b = Boolean.valueOf(z);
        gga a = ahcfVar.a.a();
        ahcf.a(a);
        this.d = new ahce(a);
        if (btlu.i(btluVar) != btlt.GOOGLE) {
            this.c = null;
            return;
        }
        dbsk.s(btluVar);
        cqhn a2 = ahcdVar.a.a();
        ahcd.a(a2, 1);
        ahbk a3 = ahcdVar.b.a();
        ahcd.a(a3, 2);
        agwa a4 = ahcdVar.c.a();
        ahcd.a(a4, 3);
        ahcs a5 = ahcdVar.d.a();
        ahcd.a(a5, 4);
        gga a6 = ahcdVar.e.a();
        ahcd.a(a6, 5);
        dxio a7 = ((dxjh) ahcdVar.f).a();
        ahcd.a(a7, 6);
        afzs a8 = ahcdVar.g.a();
        ahcd.a(a8, 7);
        bvrb a9 = ahcdVar.h.a();
        ahcd.a(a9, 8);
        ahcd.a(btluVar, 9);
        this.c = new ahcc(a2, a3, a4, a5, a6, a7, a8, a9, btluVar, z);
    }

    @Override // defpackage.agzb
    @dzsi
    public agyy a() {
        return this.c;
    }

    public void b() {
        ahcc ahccVar;
        if (Build.VERSION.SDK_INT >= 26 || (ahccVar = this.c) == null) {
            return;
        }
        for (ahcn ahcnVar : ahccVar.b.c) {
            isc iscVar = ahcnVar.k;
            if (iscVar != null) {
                iscVar.dismiss();
            }
        }
    }

    @dzsi
    public btlu c() {
        return this.a;
    }

    public Boolean d() {
        return this.b;
    }

    public ahce e() {
        return this.d;
    }

    public void f() {
        ahcc ahccVar = this.c;
        if (ahccVar != null) {
            ahccVar.h();
        }
    }
}

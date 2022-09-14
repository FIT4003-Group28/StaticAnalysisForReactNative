package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvs  reason: default package */
/* loaded from: classes7.dex */
public final class nvs implements nxe {
    private static final dcqe b = dcqe.c("nvs");
    private final dxio<anhg> a;

    public nvs(dxio<anhg> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 16384) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtlp dtlpVar = nviVar.a.l;
        if (dtlpVar == null) {
            dtlpVar = dtlp.b;
        }
        dtlo dtloVar = dtlo.INVALID_PAGE;
        dtlo b2 = dtlo.b(dtlpVar.a);
        if (b2 == null) {
            b2 = dtlo.INVALID_PAGE;
        }
        if (b2.ordinal() == 1) {
            this.a.a().C();
            return;
        }
        Object[] objArr = new Object[1];
        dtlo b3 = dtlo.b(dtlpVar.a);
        if (b3 == null) {
            b3 = dtlo.INVALID_PAGE;
        }
        objArr[0] = b3;
        bvoo.h("Unexpected page type '%s'", objArr);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_MAPS_ACTIVITIES);
        set.add(dthd.LOAD_MAPS_ACTIVITIES_LOCATION_HISTORY);
        set.add(dthd.DELETE_HOME_WORK_IN_PROFILE);
    }
}

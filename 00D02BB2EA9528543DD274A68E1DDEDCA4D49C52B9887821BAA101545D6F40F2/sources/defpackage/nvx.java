package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvx  reason: default package */
/* loaded from: classes7.dex */
public final class nvx implements nxe {
    private final dxio<axwy> a;
    private final cjqy b;

    public nvx(dxio<axwy> dxioVar, cjqy cjqyVar) {
        this.a = dxioVar;
        this.b = cjqyVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 2048) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.b.i(cjtd.a(dtyd.bM));
        dtmb dtmbVar = nviVar.a.D;
        if (dtmbVar == null) {
            dtmbVar = dtmb.b;
        }
        this.a.a().E(dtmbVar.a);
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.LOAD_PLACE_LIST);
    }
}

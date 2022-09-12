package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nwu  reason: default package */
/* loaded from: classes7.dex */
public final class nwu implements nxe {
    private final bzpr a;

    public nwu(bzpr bzprVar) {
        this.a = bzprVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.b & 1) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.b(new nwv(nviVar.e)).a("odelay_cardui");
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.TRIGGER_WEB_APP_ACTIVITY_SETTING);
    }
}

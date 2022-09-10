package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nvm  reason: default package */
/* loaded from: classes7.dex */
public final class nvm implements nxe {
    private final dxio<axwy> a;

    public nvm(dxio<axwy> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 512) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dtjj dtjjVar = nviVar.a.i;
        if (dtjjVar == null) {
            dtjjVar = dtjj.d;
        }
        String str = dtjjVar.c;
        if ((dtjjVar.a & 1) != 0) {
            this.a.a().Y(azwm.p(str, dtjjVar.b), new nvl(nviVar));
        }
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DELETE_MAPS_HISTORY_ITEM);
    }
}

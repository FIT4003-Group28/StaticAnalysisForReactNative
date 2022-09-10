package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nws  reason: default package */
/* loaded from: classes7.dex */
public final class nws implements nxe {
    private final akfc a;

    public nws(akfc akfcVar) {
        this.a = akfcVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 4096) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.j();
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SIGN_IN);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: csbk  reason: default package */
/* loaded from: classes5.dex */
final class csbk extends csbz {
    public csbk() {
        super("MOLECULE");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.m(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (!csbz.j(csciVar) || j2 - j >= 100) {
            csbz.i(csciVar);
            return false;
        }
        csciVar.b.l(12.0f);
        csciVar.c.l(9.0f);
        csciVar.d.l(14.0f);
        csciVar.e.l(8.0f);
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
    }
}

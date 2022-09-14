package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cskw  reason: default package */
/* loaded from: classes5.dex */
public final class cskw extends cskz {
    final /* synthetic */ csky a;

    public cskw(csky cskyVar) {
        this.a = cskyVar;
    }

    @Override // defpackage.cskz
    public final void a(cskv cskvVar) {
        if (this.a.b.get(cskvVar).booleanValue()) {
            return;
        }
        this.a.b.put(cskvVar, true);
        csky cskyVar = this.a;
        cskyVar.c++;
        cskyVar.c();
    }
}

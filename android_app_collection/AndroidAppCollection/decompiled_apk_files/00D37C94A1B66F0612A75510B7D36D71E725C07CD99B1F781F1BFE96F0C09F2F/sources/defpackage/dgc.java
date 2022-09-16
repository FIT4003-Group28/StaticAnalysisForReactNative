package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgc  reason: default package */
/* loaded from: classes3.dex */
public final class dgc extends dfv {
    final /* synthetic */ dgd b;

    public dgc(dgd dgdVar) {
        this.b = dgdVar;
    }

    @Override // defpackage.dfv
    public final void c(long j) {
        dgd dgdVar = this.b;
        dgdVar.e = false;
        if (!dgdVar.d) {
            return;
        }
        if (dgdVar.f != j) {
            dgdVar.c.a(j);
            dgdVar.f = j;
        }
        if (!dgdVar.d) {
            return;
        }
        dgdVar.a();
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nfo  reason: default package */
/* loaded from: classes3.dex */
public final class nfo implements fqc {
    final /* synthetic */ nfq a;

    public nfo(nfq nfqVar) {
        this.a = nfqVar;
    }

    @Override // defpackage.fqc
    public final void a() {
        nfq nfqVar = this.a;
        nfqVar.g.j(nfqVar);
    }

    @Override // defpackage.fqc
    public final void b() {
        nfq nfqVar = this.a;
        nfqVar.g.i(nfqVar);
        nfq nfqVar2 = this.a;
        if (nfqVar2.l == null || nfqVar2.q == null) {
            return;
        }
        boolean z = false;
        if (nfqVar2.k.g() && nfqVar2.q.ap()) {
            z = true;
        }
        nfqVar2.s(z);
    }
}

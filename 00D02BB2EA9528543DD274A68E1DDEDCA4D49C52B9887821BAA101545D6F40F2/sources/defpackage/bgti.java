package defpackage;
/* compiled from: PG */
/* renamed from: bgti  reason: default package */
/* loaded from: classes3.dex */
final class bgti implements bnij {
    final /* synthetic */ bgtm a;

    public bgti(bgtm bgtmVar) {
        this.a = bgtmVar;
    }

    @Override // defpackage.bnij
    public final void a(String str, boolean z) {
        if (!this.a.g.equals(str)) {
            bgtm bgtmVar = this.a;
            bgtmVar.g = str;
            cqkx.p(bgtmVar);
        }
    }
}

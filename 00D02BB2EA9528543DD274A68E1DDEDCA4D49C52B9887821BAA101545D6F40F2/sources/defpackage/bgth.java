package defpackage;
/* compiled from: PG */
/* renamed from: bgth  reason: default package */
/* loaded from: classes3.dex */
final class bgth implements bgsg {
    final /* synthetic */ bgtm a;

    public bgth(bgtm bgtmVar) {
        this.a = bgtmVar;
    }

    @Override // defpackage.bgsg
    public final void a(qjc qjcVar, dhnl dhnlVar) {
        this.a.a.g(!qjcVar.b().booleanValue() ? qjcVar.a() : "");
        if (qjcVar.b().booleanValue()) {
            this.a.g(qjcVar.a());
        } else {
            this.a.g(null);
        }
        cqkx.p(this.a);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cuzh  reason: default package */
/* loaded from: classes5.dex */
final class cuzh implements degu<Void> {
    final /* synthetic */ cuzo a;

    public cuzh(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.a.b);
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(message).length());
        sb.append("error blocking conversation: ");
        sb.append(valueOf);
        sb.append(", error: ");
        sb.append(message);
        sb.toString();
        cstl.a("ConvPresenter");
        ViewT viewt = this.a.a;
        if (viewt != 0) {
            viewt.l();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r1) {
        ViewT viewt = this.a.a;
        if (viewt != 0) {
            viewt.l();
        }
    }
}

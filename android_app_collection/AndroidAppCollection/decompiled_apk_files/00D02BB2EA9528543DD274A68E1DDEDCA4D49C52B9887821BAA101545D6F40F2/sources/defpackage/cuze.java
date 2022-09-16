package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuze  reason: default package */
/* loaded from: classes5.dex */
public final class cuze implements degu<Void> {
    final /* synthetic */ cugu a;
    final /* synthetic */ cuzo b;

    public cuze(cuzo cuzoVar, cugu cuguVar) {
        this.b = cuzoVar;
        this.a = cuguVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.a.c());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(message).length());
        sb.append("error send in conv: ");
        sb.append(valueOf);
        sb.append(", error: ");
        sb.append(message);
        sb.toString();
        cstl.a("ConvPresenter");
        this.b.y.a();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r1) {
        this.b.y.a();
    }
}

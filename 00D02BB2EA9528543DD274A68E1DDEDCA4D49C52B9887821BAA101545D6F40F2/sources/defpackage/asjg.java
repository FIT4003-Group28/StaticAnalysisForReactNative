package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asjg  reason: default package */
/* loaded from: classes2.dex */
public final class asjg implements degu<Boolean> {
    final /* synthetic */ asjl a;

    public asjg(asjl asjlVar) {
        this.a = asjlVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcqe dcqeVar = asjl.a;
        this.a.q();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (!bool.booleanValue()) {
            this.a.q();
            return;
        }
        asjl asjlVar = this.a;
        ff J = asjlVar.J();
        if (J == null) {
            String valueOf = String.valueOf(asjlVar.ap.i.toString());
            bvoo.d(new IllegalStateException(valueOf.length() != 0 ? "Trying to show the Opt In dialog in a bad state: %s ".concat(valueOf) : new String("Trying to show the Opt In dialog in a bad state: %s ")));
            return;
        }
        asji asjiVar = new asji(asjlVar);
        asiz asizVar = new asiz();
        asizVar.aq = asjiVar;
        asizVar.Pl(J.g().b(), asjl.b);
    }
}

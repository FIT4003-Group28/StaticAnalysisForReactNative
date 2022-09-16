package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cybd  reason: default package */
/* loaded from: classes5.dex */
public final class cybd implements degu<cych> {
    final /* synthetic */ cybo a;

    public cybd(cybo cyboVar) {
        this.a = cyboVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.c(this.a.p, 41, cyos.a(th), cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cych cychVar) {
        char c;
        if (cychVar.c == cycg.FAILED_NOT_LOGGED_IN) {
            cybo cyboVar = this.a;
            cyph cyphVar = cyboVar.p;
            String str = cyboVar.g;
            int hashCode = str.hashCode();
            if (hashCode != 248019588) {
                if (hashCode == 879034182 && str.equals("com.google")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals("com.google.android.gm.exchange")) {
                    c = 1;
                }
                c = 65535;
            }
            cypg.c(cyphVar, 41, c != 0 ? c != 1 ? 18 : 19 : 17, cyor.a);
        }
    }
}

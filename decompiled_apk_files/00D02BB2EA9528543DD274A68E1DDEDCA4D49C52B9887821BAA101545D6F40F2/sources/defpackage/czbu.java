package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
/* compiled from: PG */
/* renamed from: czbu  reason: default package */
/* loaded from: classes5.dex */
final class czbu implements degu<cych> {
    final /* synthetic */ cyem a;
    final /* synthetic */ String b;
    final /* synthetic */ ClientConfigInternal c;
    final /* synthetic */ cyor d;
    final /* synthetic */ czbw e;

    public czbu(czbw czbwVar, cyem cyemVar, String str, ClientConfigInternal clientConfigInternal, cyor cyorVar) {
        this.e = czbwVar;
        this.a = cyemVar;
        this.b = str;
        this.c = clientConfigInternal;
        this.d = cyorVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (String.valueOf(th.getMessage()).length() == 0) {
            new String("Failed to get AccountData: ");
        }
        cypg.c(this.e.d, 6, 3, this.d);
        cyem cyemVar = this.a;
        czck d = czcl.d();
        d.d(cyes.FAILED_UNKNOWN);
        cyemVar.a(d.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cych cychVar) {
        final cych cychVar2 = cychVar;
        if (!dyaw.d()) {
            dehp c = dehx.c(this.e.a);
            final cyem cyemVar = this.a;
            final String str = this.b;
            final ClientConfigInternal clientConfigInternal = this.c;
            final cyor cyorVar = this.d;
            c.a(new Runnable(this, cyemVar, str, clientConfigInternal, cychVar2, cyorVar) { // from class: czbt
                private final czbu a;
                private final cyem b;
                private final String c;
                private final ClientConfigInternal d;
                private final cych e;
                private final cyor f;

                {
                    this.a = this;
                    this.b = cyemVar;
                    this.c = str;
                    this.d = clientConfigInternal;
                    this.e = cychVar2;
                    this.f = cyorVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    czbu czbuVar = this.a;
                    this.b.a(czbuVar.e.a(this.c, this.d, this.e, this.f));
                }
            });
        } else if (cychVar2.c != cycg.SUCCESS_LOGGED_IN) {
            cyem cyemVar2 = this.a;
            czck d = czcl.d();
            d.d(cyes.SKIPPED);
            cyemVar2.a(d.a());
        } else {
            dehp c2 = dehx.c(this.e.a);
            final cyem cyemVar3 = this.a;
            final String str2 = this.b;
            final ClientConfigInternal clientConfigInternal2 = this.c;
            final cyor cyorVar2 = this.d;
            c2.a(new Runnable(this, cyemVar3, str2, clientConfigInternal2, cychVar2, cyorVar2) { // from class: czbs
                private final czbu a;
                private final cyem b;
                private final String c;
                private final ClientConfigInternal d;
                private final cych e;
                private final cyor f;

                {
                    this.a = this;
                    this.b = cyemVar3;
                    this.c = str2;
                    this.d = clientConfigInternal2;
                    this.e = cychVar2;
                    this.f = cyorVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    czbu czbuVar = this.a;
                    this.b.a(czbuVar.e.a(this.c, this.d, this.e, this.f));
                }
            });
        }
    }
}

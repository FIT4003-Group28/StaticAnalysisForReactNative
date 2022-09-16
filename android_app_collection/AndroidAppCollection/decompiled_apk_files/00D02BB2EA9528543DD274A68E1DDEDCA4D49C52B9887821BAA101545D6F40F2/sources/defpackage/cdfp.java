package defpackage;

import android.accounts.Account;
import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdfp  reason: default package */
/* loaded from: classes4.dex */
public final class cdfp {
    final /* synthetic */ dcka a;
    final /* synthetic */ dcha b;
    final /* synthetic */ Account c;
    final /* synthetic */ dwyd d;
    final /* synthetic */ cjqm e;
    final /* synthetic */ deig f;
    final /* synthetic */ cdfs g;

    public cdfp(cdfs cdfsVar, dcka dckaVar, dcha dchaVar, Account account, dwyd dwydVar, cjqm cjqmVar, deig deigVar) {
        this.g = cdfsVar;
        this.a = dckaVar;
        this.b = dchaVar;
        this.c = account;
        this.d = dwydVar;
        this.e = cjqmVar;
        this.f = deigVar;
    }

    public final void a(final List<bbtn> list) {
        bvrb bvrbVar = this.g.d;
        final dcka dckaVar = this.a;
        final dcha dchaVar = this.b;
        final Account account = this.c;
        final dwyd dwydVar = this.d;
        final cjqm cjqmVar = this.e;
        final deig deigVar = this.f;
        bvrbVar.b(new Runnable(this, list, dckaVar, dchaVar, account, dwydVar, cjqmVar, deigVar) { // from class: cdfo
            private final cdfp a;
            private final List b;
            private final dcka c;
            private final dcha d;
            private final Account e;
            private final dwyd f;
            private final cjqm g;
            private final deig h;

            {
                this.a = this;
                this.b = list;
                this.c = dckaVar;
                this.d = dchaVar;
                this.e = account;
                this.f = dwydVar;
                this.g = cjqmVar;
                this.h = deigVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cdfp cdfpVar = this.a;
                List<bbtn> list2 = this.b;
                dcka dckaVar2 = this.c;
                dcha<ilo, Uri> dchaVar2 = this.d;
                Account account2 = this.e;
                dwyd dwydVar2 = this.f;
                cjqm cjqmVar2 = this.g;
                deig deigVar2 = this.h;
                for (bbtn bbtnVar : list2) {
                    cdfpVar.g.f.add(bbtnVar.a().toString());
                    decs b = bbtnVar.b();
                    if (b != null) {
                        cdfpVar.g.f.add(b.toString());
                    }
                }
                boolean z = list2.size() == dckaVar2.l();
                if (z && !dchaVar2.D()) {
                    cdfpVar.g.k(dchaVar2, account2.name, dwydVar2, cjqmVar2);
                }
                deigVar2.j(Boolean.valueOf(z));
            }
        }, bvrj.UI_THREAD);
    }
}

package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwno  reason: default package */
/* loaded from: classes5.dex */
public final class cwno implements cwlw {
    private final csqo a;
    private final cwll b;
    private final cwmx d;
    private final cwnz e;
    private final cwnw f;
    private final cwnm g = new cwnm(this);
    private final List<cwgc> c = new ArrayList();

    public cwno(Context context, csqo csqoVar, cwll cwllVar, cwkn cwknVar, cwmw cwmwVar) {
        dbsk.s(context);
        dbsk.s(csqoVar);
        this.a = csqoVar;
        this.b = cwllVar;
        this.d = cwmwVar.a(context, cwllVar, new OnAccountsUpdateListener(this) { // from class: cwng
            private final cwno a;

            {
                this.a = this;
            }

            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                cwno cwnoVar = this.a;
                cwnoVar.g();
                for (Account account : accountArr) {
                    cwnoVar.h(account);
                }
            }
        });
        dbae.c(cwllVar.a(), new cwnn(this), dege.a);
        this.e = new cwnz(context, csqoVar, cwllVar, cwknVar);
        this.f = new cwnw(csqoVar);
    }

    public static <T> dehn<T> i(dehn<dbsg<T>> dehnVar) {
        return dbae.b(dehnVar, cwnl.a, dege.a);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> a() {
        return this.e.a(cwnh.a);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> b() {
        return this.e.a(cwni.a);
    }

    @Override // defpackage.cwlw
    public final void c(cwgc cwgcVar) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                this.d.a();
            }
            this.c.add(cwgcVar);
        }
    }

    @Override // defpackage.cwlw
    public final void d(cwgc cwgcVar) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                return;
            }
            this.c.remove(cwgcVar);
            if (this.c.isEmpty()) {
                this.d.b();
            }
        }
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(String str, int i) {
        return this.f.a(cwnj.a, str, i);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(String str, int i) {
        return this.f.a(cwnk.a, str, i);
    }

    public final void g() {
        synchronized (this.c) {
            for (cwgc cwgcVar : this.c) {
                cwgcVar.a();
            }
        }
    }

    public final void h(Account account) {
        csqn a = this.a.a(account);
        a.f(this.g);
        a.e(this.g, dege.a);
    }
}

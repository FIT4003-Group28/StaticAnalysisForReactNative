package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ura  reason: default package */
/* loaded from: classes4.dex */
public final class ura implements uqe {
    private final uac a;
    private final upx b;
    private final tzz c = new uqy(this);
    private final List d = new ArrayList();
    private final uqq e;
    private final urh f;
    private final ure g;

    public ura(Context context, uac uacVar, upx upxVar, upg upgVar, uqp uqpVar) {
        context.getClass();
        uacVar.getClass();
        this.a = uacVar;
        this.b = upxVar;
        this.e = uqpVar.a(context, upxVar, new OnAccountsUpdateListener() { // from class: uqw
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                ura uraVar = ura.this;
                uraVar.i();
                for (Account account : accountArr) {
                    uraVar.h(account);
                }
            }
        });
        this.f = new urh(context, uacVar, upxVar, upgVar);
        this.g = new ure(uacVar);
    }

    public static ankt g(ankt anktVar) {
        return amnt.e(anktVar, uag.i, anjk.a);
    }

    @Override // defpackage.uqe
    public final ankt a() {
        return this.f.a(uag.g);
    }

    @Override // defpackage.uqe
    public final ankt b() {
        return this.f.a(uag.h);
    }

    @Override // defpackage.uqe
    public final void c(ukz ukzVar) {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                this.e.a();
                amnt.g(this.b.a(), new uqz(this), anjk.a);
            }
            this.d.add(ukzVar);
        }
    }

    @Override // defpackage.uqe
    public final void d(ukz ukzVar) {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return;
            }
            this.d.remove(ukzVar);
            if (this.d.isEmpty()) {
                this.e.b();
            }
        }
    }

    @Override // defpackage.uqe
    public final ankt e(String str, int i) {
        return this.g.a(uqx.b, str, i);
    }

    @Override // defpackage.uqe
    public final ankt f(String str, int i) {
        return this.g.a(uqx.a, str, i);
    }

    public final void h(Account account) {
        uab a = this.a.a(account);
        a.f(this.c);
        a.e(this.c, anjk.a);
    }

    public final void i() {
        synchronized (this.d) {
            for (ukz ukzVar : this.d) {
                ukzVar.a();
            }
        }
    }
}

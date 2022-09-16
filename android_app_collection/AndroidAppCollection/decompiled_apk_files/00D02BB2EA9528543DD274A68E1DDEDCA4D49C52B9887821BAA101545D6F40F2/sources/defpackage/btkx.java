package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: btkx  reason: default package */
/* loaded from: classes4.dex */
public final class btkx implements btjs {
    private static final dcqe i = dcqe.c("btkx");
    public final Activity a;
    public final cjqy b;
    public final apkr c;
    public final akfa d;
    public final Executor e;
    public final btvo f;
    public final dxio<afha> g;
    @dzsi
    public dehn<Boolean> h;
    private final btjt j;
    private final bzqc k;
    private final acey l;
    private final ania m;
    private final Preference n;
    @dzsi
    private dehn<cpfa> o;

    public btkx(Activity activity, Context context, btjt btjtVar, bzqc bzqcVar, acey aceyVar, cjqy cjqyVar, ania aniaVar, apkr apkrVar, akfa akfaVar, Executor executor, btvo btvoVar, dxio<afha> dxioVar) {
        this.a = activity;
        this.j = btjtVar;
        this.k = bzqcVar;
        this.l = aceyVar;
        this.b = cjqyVar;
        this.m = aniaVar;
        this.c = apkrVar;
        this.d = akfaVar;
        this.e = executor;
        this.f = btvoVar;
        this.g = dxioVar;
        Preference a = bvjo.a(context);
        this.n = a;
        a.x(R.string.SETTINGS_ITEM_WEB_AND_APP_ACTIVITY_DESCRIPTION_REVISED);
        a.o = new btkv(this);
        this.o = null;
        this.h = null;
        f(k());
    }

    public static void j(btks btksVar, @dzsi dehn<Boolean> dehnVar, Executor executor) {
        if (dehnVar == null) {
            bvoo.h("runOnSuccessfulFutureFacsResult must not be called before refresh", new Object[0]);
        } else {
            deha.q(dehnVar, new btkq(btksVar), executor);
        }
    }

    private final int k() {
        return this.m.a() ? 2 : 3;
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.n);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.n;
    }

    @Override // defpackage.btjs
    public final void c() {
        if (!this.f.getEnableFeatureParameters().bq) {
            this.o = this.k.e(bzqb.WEB_AND_APP_ACTIVITY);
            i(new btkw(this) { // from class: btkn
                private final btkx a;

                {
                    this.a = this;
                }

                @Override // defpackage.btkw
                public final void a(cpfa cpfaVar) {
                    this.a.f(cpfaVar.a().a.b);
                }
            });
            return;
        }
        Account m = this.d.m();
        if (m != null) {
            this.h = this.l.a(m);
            j(new btko(this), this.h, this.e);
            return;
        }
        this.h = deha.a(false);
        g(false);
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }

    public final void g(boolean z) {
        this.m.c(z, 2);
        if (z) {
            this.n.t(R.string.SETTINGS_ITEM_WEB_AND_APP_ACTIVITY_TITLE_STATUS_ON);
        } else {
            this.n.s(this.j.a(R.string.SETTINGS_ITEM_WEB_AND_APP_ACTIVITY_TITLE_STATUS_OFF));
        }
    }

    public final boolean h() {
        return k() == 2;
    }

    public final void i(btkw btkwVar) {
        dehn<cpfa> dehnVar = this.o;
        if (dehnVar == null) {
            bvoo.h("runOnSuccessfulFutureResult must not be called before refresh", new Object[0]);
        } else {
            deha.q(dehnVar, new btkp(btkwVar), dege.a);
        }
    }

    public final void f(int i2) {
        if (i2 == 2) {
            this.n.t(R.string.SETTINGS_ITEM_WEB_AND_APP_ACTIVITY_TITLE_STATUS_ON);
        } else if (i2 == 3) {
            this.n.s(this.j.a(R.string.SETTINGS_ITEM_WEB_AND_APP_ACTIVITY_TITLE_STATUS_OFF));
        } else {
            this.n.t(R.string.SETTINGS_ITEM_WEB_AND_APP_ACTIVITY_TITLE_STATUS_UNKNOWN);
        }
    }
}

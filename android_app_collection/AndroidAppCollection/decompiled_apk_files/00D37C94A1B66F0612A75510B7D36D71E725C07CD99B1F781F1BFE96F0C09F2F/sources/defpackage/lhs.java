package defpackage;

import android.content.Intent;
import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: lhs  reason: default package */
/* loaded from: classes3.dex */
public final class lhs implements fry {
    public final dt a;
    public final whe b;
    public final sdb c;
    private final wgy d;
    private final wgz e;
    private final afvn f;
    private final lgt g;

    public lhs(dt dtVar, sdb sdbVar, lgt lgtVar, wgy wgyVar, wgz wgzVar, afvn afvnVar, whe wheVar, byte[] bArr) {
        dtVar.getClass();
        this.a = dtVar;
        sdbVar.getClass();
        this.c = sdbVar;
        this.g = lgtVar;
        this.d = wgyVar;
        this.e = wgzVar;
        this.f = afvnVar;
        this.b = wheVar;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_settings;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_settings;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        final Intent a = this.g.a();
        if (this.e.a()) {
            ylx.n(this.a, this.d.a(this.f.c()), lcz.o, new zdt() { // from class: lhr
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    lhs lhsVar = lhs.this;
                    Intent intent = a;
                    AccountId accountId = (AccountId) obj;
                    accountId.getClass();
                    amad.a(intent, accountId);
                    lhsVar.b.b(11, 1, 25);
                    lhsVar.a.startActivity(intent.putExtra("show_offline_items", lhsVar.c.a));
                }
            });
            return true;
        }
        this.a.startActivity(a.putExtra("show_offline_items", this.c.a));
        return true;
    }
}

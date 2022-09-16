package defpackage;

import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adtw  reason: default package */
/* loaded from: classes.dex */
public final class adtw implements adtu {
    public final dp a;
    public final acti b;
    public waj c;
    private final wal d;
    private final ajmy e;
    private final afvn f;
    private final adux g;
    private boolean h = true;
    private View i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private View n;

    public adtw(dp dpVar, wal walVar, ajmy ajmyVar, afvn afvnVar, adux aduxVar, acti actiVar) {
        this.a = dpVar;
        this.d = walVar;
        this.e = ajmyVar;
        this.f = afvnVar;
        this.g = aduxVar;
        this.b = actiVar;
        actiVar.d(acuo.a(36382), null, null);
    }

    @Override // defpackage.adtu
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_account_chooser_fragment, viewGroup, false);
        inflate.findViewById(R.id.cancel_button).setOnClickListener(new adtv(this, 1));
        this.i = inflate.findViewById(R.id.profile);
        this.j = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.k = (TextView) inflate.findViewById(R.id.name);
        this.l = (TextView) inflate.findViewById(R.id.email);
        TextView textView = (TextView) inflate.findViewById(R.id.continue_as_button);
        this.m = textView;
        textView.setOnClickListener(new adtv(this));
        inflate.findViewById(R.id.switch_accounts_button).setOnClickListener(new adtv(this, 2));
        View findViewById = inflate.findViewById(R.id.sign_in_button);
        this.n = findViewById;
        findViewById.setOnClickListener(new adtv(this, 3));
        return inflate;
    }

    @Override // defpackage.adtu
    public final void b(boolean z, String str, boolean z2) {
        if (z && !z2) {
            adux aduxVar = this.g;
            str.getClass();
            aduxVar.a(str, "canceled");
        }
        this.b.n(new acte(acuo.b(36380)));
        if (!this.f.t() || this.d.a() == null) {
            this.i.setVisibility(8);
            this.n.setVisibility(0);
            this.b.n(new acte(acuo.b(36383)));
            return;
        }
        this.c = this.d.a();
        this.i.setVisibility(0);
        this.n.setVisibility(8);
        Spanned spanned = this.c.d;
        this.k.setText(spanned);
        this.l.setText(this.c.b);
        aalc aalcVar = this.c.e;
        if (aalcVar != null) {
            this.e.h(this.j, aalcVar.e());
        }
        this.m.setText(this.a.rh().getString(R.string.mdx_tvsignin_account_chooser_continue_as, spanned));
        this.b.n(new acte(acuo.b(36381)));
        this.b.n(new acte(acuo.b(36384)));
    }

    @Override // defpackage.adtu
    public final void c(Intent intent) {
        String stringExtra = intent.getStringExtra("authAccount");
        stringExtra.getClass();
        f(stringExtra);
    }

    @Override // defpackage.adtu
    public final boolean d() {
        return this.h;
    }

    public final void e() {
        Intent newChooseAccountIntent;
        if (Build.VERSION.SDK_INT >= 23) {
            newChooseAccountIntent = AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, null, null, null, null);
        } else {
            newChooseAccountIntent = AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, false, null, null, null, null);
        }
        this.a.startActivityForResult(newChooseAccountIntent, 1);
    }

    public final void f(String str) {
        this.h = false;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail", str);
        aczo.b((TvSignInActivity) this.a.mJ(), TvSignInActivity.class, 1, bundle);
    }
}

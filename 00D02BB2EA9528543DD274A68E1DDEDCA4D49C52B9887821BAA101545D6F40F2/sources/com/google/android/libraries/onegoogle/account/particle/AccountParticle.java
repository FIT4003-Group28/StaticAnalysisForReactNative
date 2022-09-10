package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AccountParticle<AccountT> extends ConstraintLayout implements cvwq<AccountT> {
    public cvwp<AccountT> c;
    public final AccountParticleDisc<AccountT> d;
    public final TextView e;
    public final TextView f;
    private final TextView g;

    public AccountParticle(Context context) {
        this(context, null);
    }

    @Override // defpackage.cvwq
    public final AccountParticleDisc<AccountT> c() {
        return this.d;
    }

    @Override // defpackage.cvwq
    public final TextView d() {
        return this.e;
    }

    @Override // defpackage.cvwq
    public final TextView e() {
        return this.f;
    }

    @Override // defpackage.cvwq
    public final TextView f() {
        return this.g;
    }

    public void setAccount(AccountT accountt) {
        this.c.a(accountt);
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvws.a, i, 2132017739);
        try {
            LayoutInflater.from(context).inflate(true != obtainStyledAttributes.getBoolean(2, false) ? R.layout.account_particle_small_disc_size : R.layout.account_particle, (ViewGroup) this, true);
            AccountParticleDisc<AccountT> accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
            dbsk.s(accountParticleDisc);
            this.d = accountParticleDisc;
            TextView textView = (TextView) findViewById(R.id.account_display_name);
            dbsk.s(textView);
            this.e = textView;
            TextView textView2 = (TextView) findViewById(R.id.account_name);
            dbsk.s(textView2);
            this.f = textView2;
            this.g = (TextView) findViewById(R.id.counter);
            qf.a(textView, obtainStyledAttributes.getResourceId(1, -1));
            qf.a(textView2, obtainStyledAttributes.getResourceId(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

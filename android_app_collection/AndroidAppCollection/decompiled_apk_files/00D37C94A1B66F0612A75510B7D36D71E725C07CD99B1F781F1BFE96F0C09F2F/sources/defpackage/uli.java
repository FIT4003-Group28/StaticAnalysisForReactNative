package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: uli  reason: default package */
/* loaded from: classes4.dex */
public final class uli extends yo {
    public final AccountParticle t;
    public final ampq u;
    public final ampq v;

    public uli(AccountParticle accountParticle, zgd zgdVar, ujx ujxVar, ampq ampqVar, boolean z, ampq ampqVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(accountParticle);
        this.t = accountParticle;
        this.u = ampqVar2;
        this.v = ampqVar;
        AccountParticleDisc accountParticleDisc = accountParticle.j;
        ujw ujwVar = new ujw() { // from class: ulg
            @Override // defpackage.ujw
            public final void a() {
                uli.this.E();
            }
        };
        accountParticle.addOnAttachStateChangeListener(new ulh(this, accountParticleDisc, ujwVar));
        if (lj.aj(accountParticle)) {
            accountParticleDisc.c(ujwVar);
            E();
        }
        if (z != accountParticleDisc.e) {
            aqxo.z(!accountParticleDisc.f(), "setAllowRings is only allowed before calling initialize.");
            accountParticleDisc.e = z;
        }
        accountParticle.j.g(ujxVar, zgdVar);
        accountParticle.i = new ukv(accountParticle, zgdVar, ampqVar2, null, null, null);
    }

    public final void E() {
        String str;
        if (this.t.j.g == null) {
            this.a.setContentDescription(null);
            return;
        }
        View view = this.a;
        Context context = view.getContext();
        Object[] objArr = new Object[1];
        ukv ukvVar = this.t.i;
        AccountParticleDisc accountParticleDisc = ukvVar.b;
        zgd zgdVar = ukvVar.d;
        Object obj = accountParticleDisc.g;
        if (obj == null) {
            str = "";
        } else {
            String d = usg.d(obj);
            String b = accountParticleDisc.b();
            if (!b.isEmpty()) {
                String valueOf = String.valueOf(d);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + b.length());
                sb.append(valueOf);
                sb.append("\n");
                sb.append(b);
                str = sb.toString();
            } else {
                str = d;
            }
        }
        ampq ampqVar = ukvVar.c;
        objArr[0] = str;
        view.setContentDescription(context.getString(R.string.og_use_account_a11y_no_period, objArr));
    }
}

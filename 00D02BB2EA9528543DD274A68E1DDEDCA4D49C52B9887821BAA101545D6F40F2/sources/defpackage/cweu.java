package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cweu  reason: default package */
/* loaded from: classes5.dex */
public final class cweu extends cvxj {
    final /* synthetic */ cwev a;
    private final String b;

    public cweu(cwev cwevVar) {
        this.a = cwevVar;
        this.b = cwevVar.b.getResources().getString(cwevVar.d.b());
    }

    @Override // defpackage.cvxj
    public final void a(Object obj) {
        Drawable drawable = null;
        if (this.a.d.e()) {
            this.a.g.b(37);
            AccountParticleDisc<AccountT> accountParticleDisc = this.a.b;
            cwiw cwiwVar = new cwiw(new View.OnClickListener(this) { // from class: cwet
                private final cweu a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cweu cweuVar = this.a;
                    cweuVar.a.c.d(csgw.a(), view);
                    cweg<AccountT> cwegVar = cweuVar.a.d;
                    view.getContext();
                    cwegVar.g();
                }
            });
            cwiwVar.b(this.a.g, 48);
            cwiwVar.c = this.a.e.a();
            cwiwVar.d = this.a.e.b();
            accountParticleDisc.setOnClickListener(cwiwVar.a());
            this.a.b.setContentDescription(this.b);
            od.m(this.a.b, 1);
            AccountParticleDisc<AccountT> accountParticleDisc2 = this.a.b;
            int d = cwiz.d(accountParticleDisc2.getContext());
            if (d != 0 && (drawable = this.a.b.getContext().getDrawable(d)) != null && Build.VERSION.SDK_INT >= 23) {
                ((RippleDrawable) drawable).setRadius(this.a.h / 2);
            }
            od.U(accountParticleDisc2, drawable);
            return;
        }
        this.a.b.setOnClickListener(null);
        this.a.b.setContentDescription(null);
        od.m(this.a.b, 4);
        od.U(this.a.b, null);
    }
}

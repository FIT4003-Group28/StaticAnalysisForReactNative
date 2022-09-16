package defpackage;

import android.os.Handler;
import com.google.cardboard.sdk.R;
/* compiled from: PG */
/* renamed from: acam  reason: default package */
/* loaded from: classes.dex */
final class acam implements afzf {
    final /* synthetic */ acay a;
    final /* synthetic */ abxw b;

    public acam(acay acayVar, abxw abxwVar) {
        this.a = acayVar;
        this.b = abxwVar;
    }

    private final void d(final int i, final boolean z, final long j) {
        Handler handler = this.a.n;
        final abxw abxwVar = this.b;
        handler.post(new Runnable() { // from class: acal
            @Override // java.lang.Runnable
            public final void run() {
                final int i2;
                final abxw abxwVar2 = abxw.this;
                int i3 = i;
                boolean z2 = z;
                long j2 = j;
                if (!abxwVar2.b.d.d()) {
                    return;
                }
                int i4 = abxwVar2.a;
                StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedWidthMinor);
                sb.append("Start stream failed: status=");
                sb.append(i3);
                sb.append(", remainingAttempts=");
                sb.append(i4);
                sb.append(", mayRetry=");
                sb.append(z2);
                sb.append(", minDelayMillis=");
                sb.append(j2);
                zep.l(sb.toString());
                if (!z2 || (i2 = abxwVar2.a) <= 0) {
                    abxwVar2.b.j.m();
                } else {
                    abxwVar2.b.t.postDelayed(new Runnable() { // from class: abxv
                        @Override // java.lang.Runnable
                        public final void run() {
                            abxw abxwVar3 = abxw.this;
                            int i5 = i2;
                            abyk abykVar = abxwVar3.b;
                            if (abykVar.U) {
                                abykVar.k(i5 - 1);
                            }
                        }
                    }, Math.max(1000L, j2));
                }
            }
        });
    }

    private final void e() {
        d(1, true, 500L);
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String valueOf = String.valueOf(acay.n(cffVar));
        zep.b(valueOf.length() != 0 ? "Error starting broadcast: ".concat(valueOf) : new String("Error starting broadcast: "));
        abxa.b().n(8, 1, cffVar);
        e();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ascx ascxVar = (ascx) obj;
        int i = 1;
        if (ascxVar == null) {
            zep.b("Start broadcast: missing response");
            abxa.b().n(8, 1, null);
            e();
        } else if (ascxVar.c.size() > 0) {
            asue asueVar = ((ascv) ascxVar.c.get(0)).b;
            if (asueVar == null) {
                asueVar = asue.a;
            }
            abxa b = abxa.b();
            int x = akzj.x(asueVar.d);
            if (x == 0) {
                x = 1;
            }
            b.n(8, acay.o(x), null);
            int x2 = akzj.x(asueVar.d);
            if (x2 != 0) {
                i = x2;
            }
            d(acay.p(i), asueVar.e, asueVar.f);
        } else {
            abxa.b().m(10);
            Handler handler = this.a.n;
            final abxw abxwVar = this.b;
            handler.post(new Runnable() { // from class: acak
                @Override // java.lang.Runnable
                public final void run() {
                    abxw abxwVar2 = abxw.this;
                    if (!abxwVar2.b.d.d()) {
                        return;
                    }
                    abxwVar2.b.c.t();
                    abxwVar2.b.j.d();
                }
            });
        }
    }
}

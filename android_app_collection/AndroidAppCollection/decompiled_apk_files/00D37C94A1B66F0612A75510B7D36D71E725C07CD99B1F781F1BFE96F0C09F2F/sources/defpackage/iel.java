package defpackage;

import j$.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iel  reason: default package */
/* loaded from: classes3.dex */
public final class iel {
    public final Executor a;
    public final String b;
    public aulu c = aulu.a;
    public boolean d;
    public int e;
    public int f;
    public final vne g;

    public iel(vne vneVar, apy apyVar, Executor executor, snc sncVar) {
        this.g = vneVar;
        this.a = executor;
        this.b = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(sncVar.c()));
        ylx.n(apyVar, vneVar.a(), hmv.j, new zdt() { // from class: iej
            @Override // defpackage.zdt
            public final void a(Object obj) {
                iel ielVar = iel.this;
                ihr ihrVar = (ihr) obj;
                if (!ielVar.b.equals(ihrVar.e)) {
                    ielVar.f = 0;
                    ielVar.e = 0;
                    return;
                }
                ielVar.f = ihrVar.c;
                ielVar.e = ihrVar.d;
                ielVar.d = ihrVar.b | ielVar.d;
            }
        });
    }

    public final void a(aulu auluVar) {
        auluVar.getClass();
        this.c = auluVar;
    }

    public final boolean b() {
        return d() == 2;
    }

    public final int d() {
        aulu auluVar = this.c;
        int i = auluVar.b;
        if ((i & 2) != 0) {
            if (auluVar.d > 0 && this.d) {
                return 4;
            }
        } else if ((i & 1) == 0) {
            return 3;
        }
        if ((i & 1) != 0) {
            int i2 = auluVar.c;
            if (i2 == 0) {
                return 3;
            }
            return (i2 <= 0 || this.e < i2) ? 2 : 3;
        }
        return 2;
    }

    public final void c() {
        if (this.d) {
            aulu auluVar = this.c;
            if ((auluVar.b & 2) != 0 && auluVar.d > 0) {
                Optional.empty();
                return;
            }
        }
        this.e++;
        Optional.of(this.g.b(new iek(this, 1), this.a));
    }
}

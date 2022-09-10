package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cwoh  reason: default package */
/* loaded from: classes5.dex */
final class cwoh implements cwlw {
    public final cwlw a;
    final /* synthetic */ cwoi b;
    private final cwlw c;

    public cwoh(cwoi cwoiVar, cwlw cwlwVar, cwlw cwlwVar2) {
        this.b = cwoiVar;
        this.c = cwlwVar;
        this.a = cwlwVar2;
    }

    private final dehn<dcdc<cwls>> h(final dbrn<cwlw, dehn<dcdc<cwls>>> dbrnVar) {
        return dbae.d(dbrnVar.a(this.c), cwnp.class, new defg(this, dbrnVar) { // from class: cwod
            private final cwoh a;
            private final dbrn b;

            {
                this.a = this;
                this.b = dbrnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cwoh cwohVar = this.a;
                dbrn dbrnVar2 = this.b;
                cwnp cwnpVar = (cwnp) obj;
                cwohVar.g();
                return (dehn) dbrnVar2.a(cwohVar.a);
            }
        }, dege.a);
    }

    private final dehn<Bitmap> i(final cwoa cwoaVar, final String str, final int i) {
        return dbae.d(cwoaVar.a(this.c, str, i), cwnp.class, new defg(this, cwoaVar, str, i) { // from class: cwog
            private final cwoh a;
            private final cwoa b;
            private final String c;
            private final int d;

            {
                this.a = this;
                this.b = cwoaVar;
                this.c = str;
                this.d = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cwoh cwohVar = this.a;
                cwoa cwoaVar2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                cwnp cwnpVar = (cwnp) obj;
                cwohVar.g();
                return cwoaVar2.a(cwohVar.a, str2, i2);
            }
        }, dege.a);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> a() {
        return h(cwob.a);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> b() {
        return h(cwoc.a);
    }

    @Override // defpackage.cwlw
    public final void c(cwgc cwgcVar) {
        synchronized (this.b.c) {
            this.b.c.add(cwgcVar);
            this.c.c(cwgcVar);
        }
    }

    @Override // defpackage.cwlw
    public final void d(cwgc cwgcVar) {
        synchronized (this.b.c) {
            this.b.c.remove(cwgcVar);
            this.c.d(cwgcVar);
        }
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(String str, int i) {
        return i(cwoe.a, str, i);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(String str, int i) {
        return i(cwof.a, str, i);
    }

    public final void g() {
        int i = cwoi.d;
        synchronized (this.b.c) {
            for (cwgc cwgcVar : this.b.c) {
                this.a.c(cwgcVar);
            }
            cwoi cwoiVar = this.b;
            cwoiVar.a = this.a;
            cwoiVar.b = true;
            for (cwgc cwgcVar2 : cwoiVar.c) {
                this.c.d(cwgcVar2);
            }
            this.b.c.clear();
        }
    }
}

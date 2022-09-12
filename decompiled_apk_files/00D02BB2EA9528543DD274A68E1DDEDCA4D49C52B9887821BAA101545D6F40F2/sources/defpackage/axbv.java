package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: axbv  reason: default package */
/* loaded from: classes.dex */
public final class axbv implements awvy {
    public static final dcqe a = dcqe.c("axbv");
    public final cqat b;
    public final bvrb c;
    public final axbd d;
    public final axcf e;
    public final awyu f;
    public final axbw g;
    public final awvj h;

    public axbv(cqat cqatVar, bvrb bvrbVar, axcf axcfVar, axbd axbdVar, awyu awyuVar, axbw axbwVar, awvj awvjVar) {
        this.b = cqatVar;
        this.c = bvrbVar;
        this.d = axbdVar;
        this.f = awyuVar;
        this.e = axcfVar;
        this.g = axbwVar;
        this.h = awvjVar;
    }

    @dzsi
    public static <P extends dssj> P e(@dzsi axds axdsVar, awvv<P> awvvVar) {
        awwx a2 = awwy.a(awvvVar);
        if (axdsVar == null || a2.a(axdsVar) <= 0) {
            return null;
        }
        return (P) a2.j(axdsVar, 0);
    }

    @Override // defpackage.awvy
    public final dehn<awwb> a(final awvx awvxVar) {
        final deig d = deig.d();
        c(awvxVar, bvpj.b(new dbsz(awvxVar, d) { // from class: axbm
            private final awvx a;
            private final deig b;

            {
                this.a = awvxVar;
                this.b = d;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                awvx awvxVar2 = this.a;
                deig deigVar = this.b;
                awwb awwbVar = (awwb) obj;
                dcep<awvv<?>> b = awvxVar2.d().b();
                if (awwh.a(awwbVar, b)) {
                    return;
                }
                if (awwh.b(awwbVar, b)) {
                    deigVar.j(awwbVar);
                } else {
                    deigVar.k(new Exception("Unable to produce a complete model."));
                }
            }
        }), bvrj.CURRENT);
        return d;
    }

    @Override // defpackage.awvy
    public final dehn<awwb> b(final awvx awvxVar) {
        final deig d = deig.d();
        c(awvxVar, bvpj.b(new dbsz(awvxVar, d) { // from class: axbn
            private final awvx a;
            private final deig b;

            {
                this.a = awvxVar;
                this.b = d;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                awvx awvxVar2 = this.a;
                deig deigVar = this.b;
                awwb awwbVar = (awwb) obj;
                dcep<awvv<?>> b = awvxVar2.d().b();
                if (awwh.b(awwbVar, b)) {
                    deigVar.j(awwbVar);
                } else if (awwh.a(awwbVar, b)) {
                } else {
                    deigVar.k(new Exception("Unable to produce a model with complete data."));
                }
            }
        }), bvrj.CURRENT);
        return d;
    }

    @Override // defpackage.awvy
    public final void c(final awvx awvxVar, final bvpj<awwb> bvpjVar, final bvrj bvrjVar) {
        this.c.b(new Runnable(this, awvxVar, bvpjVar, bvrjVar) { // from class: axbo
            private final axbv a;
            private final awvx b;
            private final bvpj c;
            private final bvrj d;

            {
                this.a = this;
                this.b = awvxVar;
                this.c = bvpjVar;
                this.d = bvrjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axbv axbvVar = this.a;
                awvx awvxVar2 = this.b;
                bvpj<awwb> bvpjVar2 = this.c;
                bvrj bvrjVar2 = this.d;
                aif aifVar = new aif();
                dcpd<awvv<?>> it = awvxVar2.d().b().iterator();
                while (it.hasNext()) {
                    aifVar.put(it.next(), awwa.DATA_INCOMPLETE_FETCH_IN_PROGRESS);
                }
                axbvVar.d(true, aifVar, awvxVar2, bvpjVar2, bvrjVar2);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    public final void d(final boolean z, final Map<awvv<?>, awwa> map, final awvx awvxVar, final bvpj<awwb> bvpjVar, final bvrj bvrjVar) {
        this.b.b();
        this.d.a(new dbsz(this, bvpjVar, awvxVar, map, z, bvrjVar) { // from class: axbp
            private final axbv a;
            private final bvpj b;
            private final awvx c;
            private final Map d;
            private final boolean e;
            private final bvrj f;

            {
                this.a = this;
                this.b = bvpjVar;
                this.c = awvxVar;
                this.d = map;
                this.e = z;
                this.f = bvrjVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
            @Override // defpackage.dbsz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void NU(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 1273
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axbp.NU(java.lang.Object):void");
            }
        });
    }
}

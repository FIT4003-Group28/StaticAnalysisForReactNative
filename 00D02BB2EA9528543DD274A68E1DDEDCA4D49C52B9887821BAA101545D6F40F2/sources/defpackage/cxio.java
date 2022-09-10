package defpackage;

import com.google.android.gms.facs.cache.FacsCacheCallOptions;
/* compiled from: PG */
/* renamed from: cxio  reason: default package */
/* loaded from: classes5.dex */
public final class cxio implements cxil {
    private final cocd a;
    private final String b;

    public cxio(cocd cocdVar, String str) {
        this.a = cocdVar;
        dbsk.s(str);
        this.b = str;
    }

    private final FacsCacheCallOptions c() {
        return new FacsCacheCallOptions(this.b, 1L);
    }

    private static <T> dehn<T> d(cpcq<T> cpcqVar) {
        final deig d = deig.d();
        cpcqVar.n(dege.a, new cpcf(d) { // from class: cxin
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar2) {
                deig deigVar = this.a;
                if (((cpcx) cpcqVar2).d) {
                    deigVar.cancel(false);
                } else if (cpcqVar2.b()) {
                    deigVar.j(cpcqVar2.d());
                } else {
                    Exception e = cpcqVar2.e();
                    if (e != null) {
                        deigVar.k(e);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return d;
    }

    @Override // defpackage.cxil
    public final dehn<dslt> a(cxik cxikVar) {
        cxik cxikVar2 = cxik.FORCED_SYNC;
        int ordinal = cxikVar.ordinal();
        if (ordinal == 0) {
            cocd cocdVar = this.a;
            final FacsCacheCallOptions c = c();
            cntc builder = cntd.builder();
            builder.a = new cnsr(c) { // from class: cobv
                private final FacsCacheCallOptions a;

                {
                    this.a = c;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    FacsCacheCallOptions facsCacheCallOptions = this.a;
                    ((cocl) ((coci) obj).L()).e(new cobz((cpct) obj2), facsCacheCallOptions);
                }
            };
            builder.c = 1801;
            return d(cocdVar.c(builder.a()));
        } else if (ordinal == 1) {
            cocd cocdVar2 = this.a;
            final FacsCacheCallOptions c2 = c();
            cntc builder2 = cntd.builder();
            builder2.a = new cnsr(c2) { // from class: cobx
                private final FacsCacheCallOptions a;

                {
                    this.a = c2;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    FacsCacheCallOptions facsCacheCallOptions = this.a;
                    ((cocl) ((coci) obj).L()).g(new cocb((cpct) obj2), facsCacheCallOptions);
                }
            };
            builder2.c = 1803;
            return d(cocdVar2.c(builder2.a()));
        } else {
            throw new AssertionError(cxikVar);
        }
    }

    @Override // defpackage.cxil
    public final dehn<dsmn> b(final dsml dsmlVar) {
        cocd cocdVar = this.a;
        final FacsCacheCallOptions c = c();
        cntc builder = cntd.builder();
        builder.a = new cnsr(dsmlVar, c) { // from class: cobw
            private final dsml a;
            private final FacsCacheCallOptions b;

            {
                this.a = dsmlVar;
                this.b = c;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                dsml dsmlVar2 = this.a;
                FacsCacheCallOptions facsCacheCallOptions = this.b;
                ((cocl) ((coci) obj).L()).f(new coca((cpct) obj2), dsmlVar2.bS(), facsCacheCallOptions);
            }
        };
        builder.c = 1802;
        return d(cocdVar.c(builder.a()));
    }
}

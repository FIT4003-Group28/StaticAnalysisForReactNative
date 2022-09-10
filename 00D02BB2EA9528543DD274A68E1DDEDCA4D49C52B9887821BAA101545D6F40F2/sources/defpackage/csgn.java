package defpackage;

import android.content.Context;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csgn  reason: default package */
/* loaded from: classes5.dex */
public final class csgn extends csgj {
    cnjz a;
    cnjz b;
    private final Context c;
    private final Executor d;

    public csgn(Context context, Executor executor) {
        this.c = context;
        this.d = executor;
    }

    @Override // defpackage.csgj
    public final dehn<Void> a(final csgi csgiVar, dehn<csfs> dehnVar) {
        final String a = csgiVar.a();
        final dssj b = csgiVar.b();
        final dbrn dbrnVar = new dbrn(csgiVar) { // from class: csgk
            private final csgi a;

            {
                this.a = csgiVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dspd bR;
                csgi csgiVar2 = this.a;
                cnjv cnjvVar = (cnjv) obj;
                if (csgiVar2.c() != null && (bR = csgiVar2.c().bR()) != null) {
                    dujh dujhVar = cnjvVar.c;
                    if (dujhVar.c) {
                        dujhVar.bF();
                        dujhVar.c = false;
                    }
                    duji dujiVar = (duji) dujhVar.b;
                    duji dujiVar2 = duji.m;
                    bR.getClass();
                    dujiVar.a |= 262144;
                    dujiVar.j = bR;
                }
                if (csgiVar2.d() != null) {
                    cnjvVar.d(csgiVar2.d().intValue());
                }
                if (csgiVar2.h() != 1) {
                    cnjvVar.k = csgiVar2.h();
                }
                if (csgiVar2.e() != null && csgiVar2.f() != null) {
                    long longValue = csgiVar2.e().longValue();
                    long longValue2 = csgiVar2.f().longValue();
                    dujh dujhVar2 = cnjvVar.c;
                    if (dujhVar2.c) {
                        dujhVar2.bF();
                        dujhVar2.c = false;
                    }
                    duji dujiVar3 = (duji) dujhVar2.b;
                    duji dujiVar4 = duji.m;
                    dujiVar3.a = 1 | dujiVar3.a;
                    dujiVar3.b = longValue;
                    dujh dujhVar3 = cnjvVar.c;
                    if (dujhVar3.c) {
                        dujhVar3.bF();
                        dujhVar3.c = false;
                    }
                    duji dujiVar5 = (duji) dujhVar3.b;
                    dujiVar5.a |= 2;
                    dujiVar5.c = longValue2;
                    dujh dujhVar4 = cnjvVar.c;
                    cnjz cnjzVar = cnjvVar.a;
                    long a2 = cnjy.a(((duji) dujhVar4.b).b);
                    if (dujhVar4.c) {
                        dujhVar4.bF();
                        dujhVar4.c = false;
                    }
                    duji dujiVar6 = (duji) dujhVar4.b;
                    dujiVar6.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    dujiVar6.i = a2;
                }
                int[] g = csgiVar2.g();
                if (g != null && g.length > 0) {
                    cnjvVar.b(g);
                }
                return cnjvVar;
            }
        };
        return deee.h(deew.g(dehnVar, new defg(this, b, dbrnVar, a) { // from class: csgm
            private final csgn a;
            private final dssj b;
            private final dbrn c;
            private final String d;

            {
                this.a = this;
                this.b = b;
                this.c = dbrnVar;
                this.d = a;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csgn csgnVar = this.a;
                dssj dssjVar = this.b;
                dbrn dbrnVar2 = this.c;
                String str = this.d;
                csfs csfsVar = (csfs) obj;
                cnjz b2 = csgnVar.b(csfsVar);
                if (b2 == null) {
                    return deha.a(null);
                }
                cnjv d = b2.d(dssjVar.bS());
                dbrnVar2.a(d);
                d.i = str;
                int i = csfsVar.b - 1;
                if (i == 0) {
                    d.f(csfsVar.a);
                } else if (i == 1) {
                    d.f(null);
                } else if (i != 2) {
                    throw new IllegalArgumentException("Dropped logs must not be logged.");
                }
                return deew.h(csac.b(d.a()), dbrs.b(null), dege.a);
            }
        }, this.d), cnob.class, csgl.a, dege.a);
    }

    @dzsi
    public final synchronized cnjz b(csfs csfsVar) {
        int i = csfsVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.a == null) {
                this.a = new cnjz(this.c, null, null);
            }
            return this.a;
        } else if (i != 2) {
            return null;
        } else {
            if (this.b == null) {
                this.b = cnjz.a(this.c, null);
            }
            return this.b;
        }
    }
}

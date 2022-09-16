package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajeg  reason: default package */
/* loaded from: classes.dex */
public final class ajeg implements ajed {
    public static final long a = TimeUnit.SECONDS.toMillis(25);
    public final azqb b;
    public final azqb c;
    private final Executor d;
    private final acrr e;
    private final aiix f;
    private aika g;
    private int h;
    private long i;
    private long j;
    private final aisq k;
    private int l = 1;

    public ajeg(aisq aisqVar, Executor executor, azqb azqbVar, azqb azqbVar2, acrr acrrVar, aiix aiixVar) {
        this.k = aisqVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        executor.getClass();
        this.d = executor;
        this.e = acrrVar;
        this.f = aiixVar;
    }

    public static apzg k(asaa asaaVar) {
        if (l(asaaVar)) {
            arzu arzuVar = asaaVar.n;
            if (arzuVar == null) {
                arzuVar = arzu.a;
            }
            asuv asuvVar = arzuVar.c;
            if (asuvVar == null) {
                asuvVar = asuv.a;
            }
            if ((asuvVar.b & 4) == 0) {
                return null;
            }
            arzu arzuVar2 = asaaVar.n;
            if (arzuVar2 == null) {
                arzuVar2 = arzu.a;
            }
            asuv asuvVar2 = arzuVar2.c;
            if (asuvVar2 == null) {
                asuvVar2 = asuv.a;
            }
            apzg apzgVar = asuvVar2.c;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    private static boolean l(asaa asaaVar) {
        arzu arzuVar = asaaVar.n;
        if (arzuVar == null) {
            arzuVar = arzu.a;
        }
        return (arzuVar.b & 1) != 0;
    }

    private final boolean m() {
        return this.j - this.i < a;
    }

    @Override // defpackage.ajed
    public final int a(ajec ajecVar) {
        asaa asaaVar = ajecVar.a;
        if (asaaVar != null) {
            int cj = awwc.cj(asaaVar.c);
            if (cj == 0) {
                cj = 1;
            }
            this.l = cj;
            int cj2 = awwc.cj(asaaVar.c);
            if (cj2 == 0 || cj2 != 7) {
                return 0;
            }
            if (l(asaaVar)) {
                arzu arzuVar = asaaVar.n;
                if (arzuVar == null) {
                    arzuVar = arzu.a;
                }
                asuv asuvVar = arzuVar.c;
                if (asuvVar == null) {
                    asuvVar = asuv.a;
                }
                asuu asuuVar = asuvVar.g;
                if (asuuVar == null) {
                    asuuVar = asuu.a;
                }
                if ((asuuVar.b & 1) != 0) {
                    return 0;
                }
            }
            this.k.b(new aikd(3, 2, asaaVar.d));
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    @Override // defpackage.ajed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(final defpackage.ajec r10) {
        /*
            r9 = this;
            asaa r0 = r10.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.c
            int r2 = defpackage.awwc.cj(r2)
            r3 = 1
            if (r2 != 0) goto L10
            r2 = 1
        L10:
            apzg r4 = k(r0)
            r5 = 3
            r6 = 2
            if (r4 == 0) goto L6a
            boolean r4 = l(r0)
            if (r4 == 0) goto L6a
            arzu r4 = r0.n
            if (r4 != 0) goto L24
            arzu r4 = defpackage.arzu.a
        L24:
            asuv r4 = r4.c
            if (r4 != 0) goto L2a
            asuv r4 = defpackage.asuv.a
        L2a:
            int r4 = r4.e
            int r4 = defpackage.akzj.w(r4)
            if (r4 != 0) goto L33
            goto L37
        L33:
            r7 = 4
            if (r4 != r7) goto L37
            goto L6a
        L37:
            boolean r4 = r9.m()
            int r7 = r0.b
            r8 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L51
            arzu r7 = r0.n
            if (r7 != 0) goto L48
            arzu r7 = defpackage.arzu.a
        L48:
            asuv r7 = r7.c
            if (r7 != 0) goto L4e
            asuv r7 = defpackage.asuv.a
        L4e:
            boolean r7 = r7.d
            goto L52
        L51:
            r7 = 0
        L52:
            if (r4 != 0) goto L56
            if (r7 == 0) goto L6a
        L56:
            java.util.concurrent.Executor r1 = r9.d
            ajef r2 = new ajef
            r2.<init>()
            r1.execute(r2)
            if (r3 == r4) goto L63
            r5 = 2
        L63:
            r10 = 5
            acrr r1 = r9.e
            defpackage.ajjh.m(r10, r5, r0, r1)
            return r3
        L6a:
            int r4 = r9.l
            r7 = 7
            if (r4 != r7) goto L7a
            aika r4 = r9.g
            aika r8 = defpackage.aika.PLAYBACK_LOADED
            if (r4 != r8) goto L7a
            if (r2 == r7) goto L79
            r4 = 1
            goto L7b
        L79:
            r2 = 7
        L7a:
            r4 = 0
        L7b:
            int r8 = r0.c
            int r8 = defpackage.awwc.cj(r8)
            if (r8 != 0) goto L84
            r8 = 1
        L84:
            r9.l = r8
            if (r4 == 0) goto L98
            java.util.concurrent.Executor r1 = r9.d
            ajee r2 = new ajee
            r2.<init>()
            r1.execute(r2)
            acrr r10 = r9.e
            defpackage.ajjh.m(r6, r6, r0, r10)
            return r3
        L98:
            boolean r10 = defpackage.aijr.k(r0)
            if (r10 == 0) goto Lae
            if (r2 != r7) goto Lae
            boolean r10 = r9.m()
            if (r10 == 0) goto Lae
            int r10 = r9.h
            if (r10 == r6) goto Lae
            if (r10 != r5) goto Lad
            goto Lae
        Lad:
            return r5
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajeg.b(ajec):int");
    }

    @Override // defpackage.ajed
    public final aikd c(asaa asaaVar) {
        return null;
    }

    @Override // defpackage.ajed
    public final aikd d(aart aartVar) {
        return null;
    }

    @Override // defpackage.ajed
    public final ajea e() {
        return null;
    }

    @Override // defpackage.ajed
    public final void f(ahhw ahhwVar) {
        this.g = ahhwVar.c();
        aika aikaVar = aika.NEW;
    }

    @Override // defpackage.ajed
    public final void g(ahhx ahhxVar) {
        this.i = ahhxVar.e();
        this.j = ahhxVar.f();
    }

    @Override // defpackage.ajed
    public final void h(ahia ahiaVar) {
        this.h = ahiaVar.a();
    }

    @Override // defpackage.ajed
    public final void i() {
    }

    @Override // defpackage.ajed
    public final boolean j(ajdy ajdyVar, ajec ajecVar) {
        asaa asaaVar;
        if (aiix.e(this.f.a).P) {
            return (ajdyVar == null || ajdyVar.e == null) ? false : true;
        } else if (ajecVar != null && (asaaVar = ajecVar.a) != null) {
            return l(asaaVar);
        } else {
            if (ajdyVar == null) {
                return false;
            }
            return l(ajdyVar.c);
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iuv  reason: default package */
/* loaded from: classes3.dex */
public final class iuv extends fdm implements abjd {
    public final iuq a;
    public final abkg b;
    public final aafo c;
    public final abje d;
    public final acti e;
    public assn f;
    public apos g;
    public boolean h;
    public boolean i;
    private final yni j;
    private final ayoi k;
    private final airw l;
    private final aypf m;
    private final aypf n;
    private final iuu o;
    private final iut p;
    private final boolean q;
    private final aacz r;

    public iuv(feh fehVar, iuq iuqVar, abkg abkgVar, aafo aafoVar, abje abjeVar, yni yniVar, ayoi ayoiVar, airw airwVar, aacz aaczVar, acti actiVar, abjy abjyVar) {
        super(fehVar);
        this.a = iuqVar;
        this.b = abkgVar;
        this.c = aafoVar;
        this.d = abjeVar;
        this.j = yniVar;
        this.k = ayoiVar;
        this.l = airwVar;
        this.r = aaczVar;
        this.e = actiVar;
        this.q = abjyVar.a();
        this.m = new aypf();
        this.n = new aypf();
        this.o = new iuu(this);
        this.p = new iut(this);
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("toggle_source", this);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    @Override // defpackage.abjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L12
            apos r1 = r3.g
            int r2 = r1.b
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L12
            apzg r1 = r1.k
            if (r1 != 0) goto L13
            apzg r1 = defpackage.apzg.a
            goto L13
        L12:
            r1 = r0
        L13:
            if (r4 != 0) goto L23
            apos r4 = r3.g
            int r2 = r4.b
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L23
            apzg r1 = r4.p
            if (r1 != 0) goto L23
            apzg r1 = defpackage.apzg.a
        L23:
            aafo r4 = r3.c
            r4.c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuv.d(boolean):void");
    }

    @Override // defpackage.feg
    public final void kF() {
        if (!eog.aq(this.r)) {
            this.j.m(this.o);
        }
        this.j.m(this.p);
        this.n.c();
        this.m.c();
    }

    @Override // defpackage.fdm
    public final void nJ() {
        if (this.q) {
            return;
        }
        super.nJ();
    }

    @Override // defpackage.feg
    public final void nr() {
        if (eog.aq(this.r)) {
            aypf aypfVar = this.n;
            aynx G = this.l.ao().I().G(aypa.a());
            final iuu iuuVar = this.o;
            iuuVar.getClass();
            aypfVar.d(G.aa(new ayqb() { // from class: iur
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    iuu.this.a((ahhm) obj);
                }
            }, ick.e));
        } else {
            this.j.g(this.o);
        }
        this.j.g(this.p);
        this.m.d(this.k.as(new ayqb() { // from class: ius
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                iuv iuvVar = iuv.this;
                abkb abkbVar = (abkb) obj;
                boolean z = !iuvVar.a.j();
                if (iuvVar.g != null) {
                    aopa createBuilder = asjj.a.createBuilder();
                    aopa createBuilder2 = askc.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    askc askcVar = (askc) createBuilder2.instance;
                    askcVar.c = 1;
                    askcVar.b = 1 | askcVar.b;
                    createBuilder2.copyOnWrite();
                    askc askcVar2 = (askc) createBuilder2.instance;
                    askcVar2.b |= 2;
                    askcVar2.d = z;
                    createBuilder.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder.instance;
                    askc askcVar3 = (askc) createBuilder2.mo39build();
                    askcVar3.getClass();
                    asjjVar.H = askcVar3;
                    asjjVar.c |= 134217728;
                    iuvVar.e.H(3, new acte(iuvVar.g.v.I()), (asjj) createBuilder.mo39build());
                }
                apzg apzgVar = null;
                if (z) {
                    apos aposVar = iuvVar.g;
                    if ((aposVar.b & 512) != 0 && (apzgVar = aposVar.k) == null) {
                        apzgVar = apzg.a;
                    }
                }
                if (!z) {
                    apos aposVar2 = iuvVar.g;
                    if ((aposVar2.b & 16384) != 0 && (apzgVar = aposVar2.p) == null) {
                        apzgVar = apzg.a;
                    }
                }
                iuvVar.c.c(apzgVar, iuvVar.a());
            }
        }));
        this.a.kU();
    }
}

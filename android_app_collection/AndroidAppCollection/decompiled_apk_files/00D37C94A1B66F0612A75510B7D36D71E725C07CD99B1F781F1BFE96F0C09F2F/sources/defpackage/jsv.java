package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: jsv  reason: default package */
/* loaded from: classes3.dex */
public final class jsv extends ajyq implements ynl {
    private final jsj F;
    private final ayor G;
    private final ayor H;
    private final jsf I;

    /* renamed from: J  reason: collision with root package name */
    private final axxh f217J;
    private aypg K;
    private final aypg L;
    private aqos M;
    private final fbj N;
    public final fcl a;
    public final fbu b;
    public final jsd c;
    public String d;
    public aypg e;
    private final Context h;
    private final jjh m;
    private final amqo n;
    private final jml o;
    private final Executor p;
    private final azqb q;
    private final ajsm r;
    private final jsb s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jsv(defpackage.ajyi r17, defpackage.yni r18, defpackage.yzj r19, defpackage.fcl r20, defpackage.jml r21, java.util.concurrent.Executor r22, defpackage.azqb r23, defpackage.ajin r24, defpackage.ajin r25, final defpackage.fbu r26, final defpackage.eri r27, defpackage.jsd r28, defpackage.fbj r29, defpackage.jsj r30, final defpackage.ayor r31, final defpackage.ayor r32, defpackage.jsf r33, defpackage.axxh r34, android.app.Activity r35, defpackage.aari r36, defpackage.acti r37, defpackage.akam r38, defpackage.jjh r39, defpackage.amqo r40) {
        /*
            r16 = this;
            r8 = r16
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r31
            r13 = r32
            r14 = r38
            ajsm r15 = new ajsm
            r15.<init>()
            akam r6 = defpackage.akam.a(r38)
            r0 = r16
            r1 = r36
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r37
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r20
            r8.a = r0
            r0 = r21
            r8.o = r0
            r0 = r22
            r8.p = r0
            r0 = r23
            r8.q = r0
            r0 = r35
            r8.h = r0
            r0 = r39
            r8.m = r0
            r0 = r40
            r8.n = r0
            r8.b = r11
            r0 = r28
            r8.c = r0
            r0 = r29
            r8.N = r0
            r0 = r30
            r8.F = r0
            r8.G = r12
            r8.H = r13
            r0 = r33
            r8.I = r0
            r1 = r34
            r8.f217J = r1
            r8.r = r15
            akab r1 = r8.f
            jsb r2 = new jsb
            r1.getClass()
            r2.<init>(r15, r1)
            r8.s = r2
            boolean r1 = r14 instanceof defpackage.jsu
            if (r1 == 0) goto L8b
            r1 = r14
            jsu r1 = (defpackage.jsu) r1
            java.lang.String r2 = r1.a
            r8.d = r2
            ajsm r1 = r1.b
            r15.p(r1)
            boolean r1 = r26.b()
            if (r1 == 0) goto L85
            r16.k()
            goto L88
        L85:
            r16.l()
        L88:
            r16.n()
        L8b:
            kxi r1 = new kxi
            r2 = 1
            r1.<init>(r2)
            r15.mG(r1)
            jso r1 = new jso
            r2 = 2
            r1.<init>(r8, r2)
            r15.mG(r1)
            if (r9 == 0) goto La2
            r8.L(r9)
        La2:
            if (r10 == 0) goto La9
            akab r1 = r8.g
            r1.b(r10)
        La9:
            ayos r0 = r33.a()
            jsm r1 = new jsm
            r1.<init>()
            ayoc r0 = r0.h(r1)
            jsk r1 = new jsk
            r2 = r27
            r1.<init>()
            aypg r0 = r0.T(r1)
            r8.L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.<init>(ajyi, yni, yzj, fcl, jml, java.util.concurrent.Executor, azqb, ajin, ajin, fbu, eri, jsd, fbj, jsj, ayor, ayor, jsf, axxh, android.app.Activity, aari, acti, akam, jjh, amqo):void");
    }

    private final void n() {
        if ("downloads_page_recommendations_item_section_identifier".equals(this.d)) {
            final int orElse = zhn.j(this.h, R.attr.ytGeneralBackgroundA).orElse(0);
            this.r.mG(new ajrt() { // from class: gel
                @Override // defpackage.ajrt
                public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                    elk.f(ajrsVar, orElse);
                }
            });
            this.r.add(0, fju.b());
            fjv fjvVar = new fjv();
            fjvVar.a = true;
            this.r.mG(fjvVar);
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.d)) {
            this.r.mG(new jso(this, 1));
            this.r.mG(new jso(this));
        }
    }

    private static final boolean o(Object obj) {
        awnc c;
        if ((obj instanceof ajhh) && (c = jsd.c((ajhh) obj)) != null) {
            return c.qn(aqpv.b);
        }
        return false;
    }

    private static final boolean r(Object obj) {
        awnc c;
        if ((obj instanceof ajhh) && (c = jsd.c((ajhh) obj)) != null) {
            return c.qn(aqpq.b);
        }
        return false;
    }

    private static final boolean s(Object obj) {
        awnc c;
        if ((obj instanceof ajhh) && (c = jsd.c((ajhh) obj)) != null) {
            return c.qn(aqqj.b);
        }
        return false;
    }

    public final void c() {
        int i = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            Object obj = this.i.get(i2);
            if ((obj instanceof apke) || (obj instanceof ajhh)) {
                return;
            }
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.d)) {
            if (this.a.k() || this.a.j()) {
                i = 1;
            } else {
                lB();
            }
            ajfz ajfzVar = this.B;
            aqpa aqpaVar = aqpa.FILTER_TYPE_UNSPECIFIED;
            if (ajfzVar != null) {
                aqpaVar = llm.l(ajfzVar);
            }
            C(this.o.a(this.a, aqpaVar), i);
        } else if ("downloads_page_recommendations_item_section_identifier".equals(this.d)) {
            lB();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b4 A[ADDED_TO_REGION] */
    @Override // defpackage.ajyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.aakq r17) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.i(aakq):void");
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        aypg aypgVar = this.e;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        aypg aypgVar2 = this.K;
        if (aypgVar2 != null) {
            azof.f((AtomicReference) aypgVar2);
        }
        aypg aypgVar3 = this.L;
        if (aypgVar3 != null) {
            ayqi.c((AtomicReference) aypgVar3);
        }
        super.j();
    }

    public final void k() {
        this.p.execute(new Runnable() { // from class: jsp
            @Override // java.lang.Runnable
            public final void run() {
                jsv jsvVar = jsv.this;
                jsvVar.K(false);
                jsvVar.ad();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x018f, code lost:
        if (defpackage.azoq.f(r4, r8) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsv.l():void");
    }

    @Override // defpackage.ajxh
    public final void lr(ajfz ajfzVar) {
        A();
        super.lr(ajfzVar);
    }

    @Override // defpackage.ajyq, defpackage.ajwq
    public final void lx(aumx aumxVar, apzg apzgVar) {
        aqot aqotVar;
        boolean z = false;
        if ("downloads_page_downloads_item_section_identifier".equals(this.d)) {
            if (this.b.b()) {
                ajfz g = ajna.g(aumxVar);
                if (g != null) {
                    ampq k = llm.k(g);
                    if (k.h()) {
                        aqoy aqoyVar = (aqoy) k.c();
                        if (aqoyVar.b == 2) {
                            aqotVar = (aqot) aqoyVar.c;
                        } else {
                            aqotVar = aqot.a;
                        }
                        aqos b = aqos.b(aqotVar.c);
                        if (b == null) {
                            b = aqos.REQUEST_TYPE_UNSPECIFIED;
                        }
                        if (b.equals(aqos.REQUEST_TYPE_EXPANSION)) {
                            jsj jsjVar = this.F;
                            acvg b2 = ((acvh) jsjVar.a.get()).b(asny.LATENCY_ACTION_DOWNLOADS_EXPANSION);
                            b2.getClass();
                            jsjVar.b = b2;
                            jsjVar.b.c("e_rq");
                            H(new jny(2));
                            z = true;
                        }
                        this.M = b;
                    } else {
                        this.M = null;
                    }
                }
                K(z);
            } else if (!this.f217J.a().booleanValue()) {
                this.r.m(jny.c);
            }
            lr(ajna.g(aumxVar));
        } else if ("downloads_page_smart_downloads_item_section_identifier".equals(this.d)) {
            if (this.f217J.a().booleanValue()) {
                K(false);
            } else {
                ajfz g2 = ajna.g(aumxVar);
                if (g2 != null) {
                    if (aqow.REQUEST_TYPE_LOADING.equals((aqow) llm.p(g2, jvb.a, aqow.REQUEST_TYPE_UNSPECIFIED))) {
                        this.r.clear();
                    } else {
                        Collection.EL.removeIf(this.r, new gka(17));
                        K(false);
                    }
                }
            }
            lr(ajna.g(aumxVar));
        } else {
            if (this.f217J.a().booleanValue()) {
                lr(ajna.g(aumxVar));
            } else {
                super.lx(aumxVar, apzgVar);
            }
            ((RecyclerView) this.n.get()).ab(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajyq
    public final void ly(aakq aakqVar, ajfy ajfyVar) {
        List<zeu> list;
        float d;
        int i;
        zet zetVar;
        int i2 = 0;
        if (!this.f217J.a().booleanValue() || aakqVar != null) {
            if ((!this.b.b() && !this.f217J.a().booleanValue()) || ajfyVar != ajfy.RELOAD || aakqVar == null) {
                super.lz(aakqVar, ajfyVar);
            } else {
                final jsb jsbVar = this.s;
                aslq aslqVar = aakqVar.a;
                amuk amukVar = (amuk) Collection.EL.stream(jsbVar.a).map(jsa.b).collect(amsf.a);
                aslo asloVar = aslqVar.d;
                if (asloVar == null) {
                    asloVar = aslo.a;
                }
                amuk amukVar2 = (amuk) Stream.CC.concat(Stream.CC.of(aakr.a(asloVar)).map(jsa.c), Collection.EL.stream(aslqVar.e).map(new Function() { // from class: jrz
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return function.getClass();
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        jsb jsbVar2 = jsb.this;
                        aslt asltVar = (aslt) obj;
                        if ((asltVar.h & 1048576) != 0) {
                            aqtb aqtbVar = asltVar.av;
                            if (aqtbVar == null) {
                                aqtbVar = aqtb.a;
                            }
                            return Optional.of(aqtbVar);
                        }
                        List a = jsbVar2.b.a(amuk.r(asltVar));
                        if (!a.isEmpty()) {
                            return Optional.of(a.get(0));
                        }
                        return Optional.empty();
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return function.getClass();
                    }
                })).filter(gka.q).map(jsa.d).collect(amsf.a);
                amukVar.getClass();
                amukVar2.getClass();
                boolean isEmpty = amukVar.isEmpty();
                boolean isEmpty2 = amukVar2.isEmpty();
                if (isEmpty && isEmpty2) {
                    list = Collections.emptyList();
                } else if (isEmpty) {
                    list = Collections.singletonList(new zev(3, amuk.o(amukVar2)));
                } else {
                    int i3 = 4;
                    if (isEmpty2) {
                        list = Collections.singletonList(new zev(4, amuk.o(amukVar)));
                    } else if (amukVar.size() == 1 || amukVar2.size() == 1) {
                        int size = amukVar.size();
                        ArrayList arrayList = new ArrayList(size == 1 ? amukVar : amukVar2);
                        if (size == 1) {
                            amukVar = amukVar2;
                        }
                        ArrayList arrayList2 = new ArrayList(amukVar);
                        int indexOf = arrayList2.indexOf(arrayList.get(0));
                        ArrayList arrayList3 = new ArrayList(3);
                        if (indexOf != -1) {
                            int i4 = 4;
                            if (size == 1) {
                                i4 = 3;
                            }
                            if (indexOf > 0) {
                                arrayList3.add(new zev(i4, arrayList2.subList(0, indexOf)));
                            }
                            arrayList3.add(new zev(1, arrayList));
                            int i5 = indexOf + 1;
                            int size2 = arrayList2.size();
                            if (i5 < size2) {
                                arrayList3.add(new zev(i4, arrayList2.subList(i5, size2)));
                            }
                        } else if (size == 1) {
                            arrayList3.add(new zev(4, arrayList));
                            arrayList3.add(new zev(3, arrayList2));
                        } else {
                            arrayList3.add(new zev(4, arrayList2));
                            arrayList3.add(new zev(3, arrayList));
                        }
                        list = arrayList3;
                    } else {
                        List a = zew.a(amukVar);
                        List a2 = zew.a(amukVar2);
                        int size3 = a.size();
                        int size4 = a2.size();
                        ArrayList arrayList4 = new ArrayList(size4);
                        arrayList4.add(null);
                        for (int i6 = 1; i6 < size4; i6++) {
                            arrayList4.add(new zet(3, a2.get(i6), (zet) arrayList4.get(i6 - 1)));
                        }
                        ArrayList arrayList5 = new ArrayList(size4);
                        int i7 = 1;
                        while (i7 < size3) {
                            arrayList5.clear();
                            zet zetVar2 = (zet) arrayList4.get(i2);
                            Object obj = a.get(i7);
                            zet zetVar3 = new zet(i3, obj, (zet) arrayList4.get(i2));
                            arrayList5.add(zetVar3);
                            int i8 = 1;
                            while (i8 < size4) {
                                zet zetVar4 = (zet) arrayList4.get(i8);
                                if (akzj.f(obj, a2.get(i8))) {
                                    d = zet.d(zetVar2);
                                    i = 1;
                                } else {
                                    d = zet.d(zetVar2) + 1.5f;
                                    i = 2;
                                }
                                if (d > zet.d(zetVar3) + 1.0f) {
                                    d = zet.d(zetVar3) + 1.0f;
                                    i = 3;
                                }
                                if (d > zet.d(zetVar4) + 1.0f) {
                                    i = 4;
                                }
                                int i9 = i - 1;
                                if (i9 == 2) {
                                    zetVar = new zet(i, a2.get(i8), (zet) arrayList5.get(i8 - 1));
                                } else if (i9 != 3) {
                                    zetVar3 = new zet(i, a2.get(i8), (zet) arrayList4.get(i8 - 1));
                                    arrayList5.add(zetVar3);
                                    i8++;
                                    zetVar2 = zetVar4;
                                } else {
                                    zetVar = new zet(i, a.get(i7), (zet) arrayList4.get(i8));
                                }
                                zetVar3 = zetVar;
                                arrayList5.add(zetVar3);
                                i8++;
                                zetVar2 = zetVar4;
                            }
                            i7++;
                            i2 = 0;
                            i3 = 4;
                            ArrayList arrayList6 = arrayList4;
                            arrayList4 = arrayList5;
                            arrayList5 = arrayList6;
                        }
                        zet zetVar5 = (zet) arrayList4.get(size4 - 1);
                        if (zetVar5 == null) {
                            list = Collections.emptyList();
                        } else {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i10 = zetVar5.a;
                            ArrayDeque arrayDeque2 = new ArrayDeque();
                            while (zetVar5 != null) {
                                if (!arrayDeque2.isEmpty() && i10 != zetVar5.a) {
                                    arrayDeque.addFirst(zew.b(i10, arrayDeque2));
                                    arrayDeque2.clear();
                                }
                                i10 = zetVar5.a;
                                arrayDeque2.addFirst(zetVar5);
                                zetVar5 = zetVar5.c;
                            }
                            if (!arrayDeque2.isEmpty()) {
                                arrayDeque.addFirst(zew.b(i10, arrayDeque2));
                            }
                            list = amuk.o(arrayDeque);
                        }
                    }
                }
                int i11 = 0;
                for (zeu zeuVar : list) {
                    int size5 = zeuVar.e().size();
                    amuk amukVar3 = (amuk) Collection.EL.stream(zeuVar.e()).map(jsa.a).collect(amsf.a);
                    int c = zeuVar.c() - 1;
                    if (c == 1) {
                        for (int i12 = 0; i12 < amukVar3.size(); i12++) {
                            jsbVar.a.n(i11 + i12, amukVar3.get(i12));
                        }
                    } else if (c == 2) {
                        jsbVar.a.addAll(i11, amukVar3);
                    } else if (c == 3) {
                        jsbVar.a.h(i11, size5);
                    }
                    i11 += zeuVar.a();
                }
                aqos aqosVar = this.M;
                if (aqosVar != null && aqosVar.equals(aqos.REQUEST_TYPE_EXPANSION)) {
                    acvg acvgVar = this.F.b;
                    acvgVar.getClass();
                    acvgVar.c("e_rd");
                }
                ls(aakqVar.a());
            }
        } else {
            lB();
        }
        ajfz ajfzVar = this.B;
        if (!"downloads_page_downloads_item_section_identifier".equals(this.d) || ajfyVar != ajfy.RELOAD || ajfzVar == null || !((aqos) llm.p(ajfzVar, jvb.b, aqos.REQUEST_TYPE_UNSPECIFIED)).equals(aqos.REQUEST_TYPE_FILTER_CHANGE)) {
            return;
        }
        ((RecyclerView) this.n.get()).al(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajyq, defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        lz((aakq) obj, ajfyVar);
    }

    public final boolean m(String str, Object obj) {
        return (obj instanceof ajhh) && str.equals(this.c.b((ajhh) obj));
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ajxh, defpackage.ajzh
    public final akam pn() {
        return new jsu(super.pn(), this.d, this.r);
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == jsv.class) {
            switch (i) {
                case -1:
                    return new Class[]{jiy.class, jiz.class, aabk.class, aabm.class, aawi.class, agno.class, agoa.class, ajym.class};
                case 0:
                    final jiy jiyVar = (jiy) obj;
                    if (this.b.b()) {
                        k();
                        return null;
                    }
                    H(new ampt() { // from class: jsq
                        @Override // defpackage.ampt
                        public final boolean a(Object obj2) {
                            return jsv.this.m(jiyVar.a, obj2);
                        }
                    });
                    c();
                    return null;
                case 1:
                    jiz jizVar = (jiz) obj;
                    if (this.b.b()) {
                        k();
                        return null;
                    }
                    l();
                    c();
                    return null;
                case 2:
                    nn((aabk) obj);
                    return null;
                case 3:
                    no((aabm) obj);
                    return null;
                case 4:
                    N((aawi) obj);
                    return null;
                case 5:
                    final agno agnoVar = (agno) obj;
                    if (this.b.b()) {
                        k();
                        return null;
                    }
                    H(new ampt() { // from class: jsr
                        @Override // defpackage.ampt
                        public final boolean a(Object obj2) {
                            return (obj2 instanceof ajhh) && agnoVar.a.equals(jsv.this.c.a((ajhh) obj2));
                        }
                    });
                    c();
                    return null;
                case 6:
                    final agoa agoaVar = (agoa) obj;
                    if (this.b.b()) {
                        return null;
                    }
                    H(new ampt() { // from class: jss
                        @Override // defpackage.ampt
                        public final boolean a(Object obj2) {
                            return jsv.this.m(agoaVar.a, obj2);
                        }
                    });
                    c();
                    return null;
                case 7:
                    M((ajym) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.ky(cls, obj, i);
    }
}

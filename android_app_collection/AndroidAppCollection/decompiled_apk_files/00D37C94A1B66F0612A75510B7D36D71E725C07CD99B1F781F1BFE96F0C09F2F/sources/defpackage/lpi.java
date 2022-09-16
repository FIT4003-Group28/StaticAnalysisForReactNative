package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lpi  reason: default package */
/* loaded from: classes3.dex */
public class lpi extends ajyq implements lsa, ynl {
    private final ghc a;
    private final snc b;
    private lpf c;
    private long d;
    private long e;
    private String h;
    private final iub m;

    public lpi(ajyi ajyiVar, yni yniVar, yzj yzjVar, ajin ajinVar, snc sncVar, iub iubVar, ampq ampqVar, ajxt ajxtVar, aari aariVar, acti actiVar, akam akamVar) {
        super(aariVar, ajyiVar, yniVar, yzjVar, actiVar, akam.a(akamVar), new ajsm(), ampqVar);
        this.d = 0L;
        this.e = 0L;
        this.h = null;
        sncVar.getClass();
        this.b = sncVar;
        this.m = iubVar;
        if (akamVar instanceof lph) {
            lph lphVar = (lph) akamVar;
            this.a = new ghc(lphVar.a);
            this.d = lphVar.b;
            this.e = lphVar.c;
            this.h = lphVar.d;
        } else {
            this.a = new ghc();
        }
        L(new lpd());
        L(new lpg(ajxtVar));
        L(new lpe());
        L(ajinVar);
        if (this.e == 0 || sncVar.d() - this.d < TimeUnit.SECONDS.toMillis(this.e)) {
            String str = this.h;
            long j = this.d;
            if (!TextUtils.equals(str, "library-recent") || j >= iubVar.d) {
                return;
            }
        }
        ad();
    }

    @Override // defpackage.ajyq
    public void i(aakq aakqVar) {
        super.i(aakqVar);
        this.d = this.b.d();
        aslq aslqVar = aakqVar.a;
        String str = aslqVar.h;
        this.h = str;
        final iub iubVar = this.m;
        if (!iubVar.c && TextUtils.equals(str, "library-recent")) {
            iubVar.c = true;
            iubVar.b.d(new ezb() { // from class: iua
                @Override // defpackage.ezb
                public final void h(ezw ezwVar) {
                    iub iubVar2 = iub.this;
                    if (ezwVar == null) {
                        return;
                    }
                    iubVar2.d = iubVar2.a.d();
                }
            });
        }
        int i = aslqVar.k;
        long j = i;
        if (j == 0 || i <= 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
    }

    public final void n(isw iswVar) {
        Object h = iswVar.h();
        ampq[] ampqVarArr = {iswVar.f(), iswVar.b(), iswVar.e()};
        ampq ampqVar = amon.a;
        for (int i = 0; i < 3; i++) {
            ampqVar = ampqVar.a(ampqVarArr[i]);
        }
        ampq b = ampqVar.b(lhh.m);
        if (b.h()) {
            this.a.b(b.c(), h);
            q(h, b.c());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
        if ((r0.b & 1) == 0) goto L56;
     */
    @Override // defpackage.ajyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nm(defpackage.aakq r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpi.nm(aakq):void");
    }

    @Override // defpackage.ajyq
    public final void nn(aabk aabkVar) {
        if (!(lA() instanceof ajsm)) {
            super.nn(aabkVar);
            return;
        }
        ajsm ajsmVar = (ajsm) lA();
        int indexOf = ajsmVar.indexOf(aabkVar.b());
        if (indexOf < 0) {
            return;
        }
        G(aabkVar.b());
        boolean z = true;
        if (ajsmVar.size() != 1 || !(ajsmVar.get(0) instanceof ajre)) {
            z = false;
        } else {
            ajsmVar.remove(0);
        }
        this.c = new lpf(aabkVar.b(), indexOf, z);
    }

    @Override // defpackage.ajyq
    public final void no(aabm aabmVar) {
        super.no(aabmVar);
        if (lA() instanceof ajsm) {
            ajsm ajsmVar = (ajsm) lA();
            if (ajsmVar.size() != 1 || !(ajsmVar.get(0) instanceof asln)) {
                return;
            }
            ajsmVar.remove(0);
        }
    }

    public final void o(aawj aawjVar) {
        ampq ampqVar;
        ampq i = ampq.i(aawjVar.b());
        if (i.h()) {
            ampqVar = this.a.a(i.c());
        } else {
            ampqVar = amon.a;
        }
        if (!i.h() || !ampqVar.h()) {
            Object c = aawjVar.c();
            lpf lpfVar = this.c;
            if (lpfVar == null || c == null || !c.equals(lpfVar.a)) {
                return;
            }
            lw(aawjVar.c(), this.c.b);
            if (this.c.c) {
                B(new ajre());
            }
            this.c = null;
            return;
        }
        I(i.c(), ampqVar.c());
    }

    @Override // defpackage.ajyq
    public final void p(aslo asloVar) {
        super.p(asloVar);
        asln aslnVar = asloVar.c;
        if (aslnVar == null) {
            aslnVar = asln.a;
        }
        aslk aslkVar = aslnVar.g;
        if (aslkVar == null) {
            aslkVar = aslk.a;
        }
        if ((aslkVar.b & 1) != 0) {
            asln aslnVar2 = asloVar.c;
            if (aslnVar2 == null) {
                aslnVar2 = asln.a;
            }
            aslk aslkVar2 = aslnVar2.g;
            if (aslkVar2 == null) {
                aslkVar2 = aslk.a;
            }
            auov auovVar = aslkVar2.c;
            if (auovVar == null) {
                auovVar = auov.a;
            }
            B(auovVar);
        }
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ajxh, defpackage.ajzh
    public final akam pn() {
        return new lph(super.pn(), this.a.pn(), this.d, this.e, this.h);
    }

    @Override // defpackage.lsa
    public final void q(Object obj, Object obj2) {
        this.a.b(obj2, obj);
        I(obj, obj2);
    }

    @Override // defpackage.ajyq, defpackage.ajxl, defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        if (cls == lpi.class) {
            switch (i) {
                case -1:
                    return new Class[]{isw.class, aabk.class, aabm.class, aawi.class, aawj.class, ajym.class};
                case 0:
                    n((isw) obj);
                    return null;
                case 1:
                    nn((aabk) obj);
                    return null;
                case 2:
                    no((aabm) obj);
                    return null;
                case 3:
                    N((aawi) obj);
                    return null;
                case 4:
                    o((aawj) obj);
                    return null;
                case 5:
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

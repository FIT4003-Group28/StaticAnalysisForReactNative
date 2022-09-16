package defpackage;
/* compiled from: PG */
/* renamed from: lpb  reason: default package */
/* loaded from: classes3.dex */
public final class lpb extends ajxx implements ynl {
    public final auuf a;
    public final ghc b;
    private final yni o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lpb(android.content.Context r16, defpackage.ajyi r17, defpackage.yni r18, defpackage.ajin r19, defpackage.ampq r20, defpackage.ajin r21, defpackage.auuf r22, defpackage.arha r23, defpackage.ajxu r24, defpackage.akam r25) {
        /*
            r15 = this;
            r11 = r15
            r12 = r18
            r13 = r22
            r14 = r25
            akam r7 = defpackage.akam.a(r25)
            ltd r10 = new ltd
            int r0 = r13.s
            int r0 = defpackage.awwc.bc(r0)
            if (r0 != 0) goto L16
            r0 = 1
        L16:
            r1 = r16
            r10.<init>(r1, r0)
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.o = r12
            r11.a = r13
            boolean r0 = r14 instanceof defpackage.lpa
            if (r0 == 0) goto L44
            r0 = r14
            lpa r0 = (defpackage.lpa) r0
            ghc r1 = new ghc
            akam r0 = r0.a
            r1.<init>(r0)
            r11.b = r1
            goto L4b
        L44:
            ghc r0 = new ghc
            r0.<init>()
            r11.b = r0
        L4b:
            java.lang.Class<lpb> r0 = defpackage.lpb.class
            r12.h(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpb.<init>(android.content.Context, ajyi, yni, ajin, ampq, ajin, auuf, arha, ajxu, akam):void");
    }

    @Override // defpackage.ajwl, defpackage.ajwd, defpackage.zdx
    public final void j() {
        super.j();
        this.o.m(this);
    }

    @Override // defpackage.ajwl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        ampq ampqVar;
        if (cls == lpb.class) {
            if (i == -1) {
                return new Class[]{isw.class, aawj.class, ajym.class};
            }
            if (i == 0) {
                isw iswVar = (isw) obj;
                if (iswVar.f().h()) {
                    this.b.b(iswVar.f().c(), iswVar.h());
                    r(iswVar.h(), iswVar.f().c());
                    return null;
                } else if (!iswVar.e().h()) {
                    return null;
                } else {
                    this.b.b(iswVar.e().c(), iswVar.h());
                    r(iswVar.h(), iswVar.e().c());
                    return null;
                }
            } else if (i != 1) {
                if (i == 2) {
                    p(((ajym) obj).a());
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            } else {
                aawj aawjVar = (aawj) obj;
                if (this.a.equals(aawjVar.c())) {
                    t(true);
                    return null;
                }
                ampq i2 = ampq.i(aawjVar.b());
                if (i2.h()) {
                    ampqVar = this.b.a(i2.c());
                } else {
                    ampqVar = amon.a;
                }
                if (!i2.h() || !ampqVar.h()) {
                    return null;
                }
                r(i2.c(), ampqVar.c());
                return null;
            }
        }
        return aolu.q(this, obj, i);
    }

    @Override // defpackage.ajwl, defpackage.ajwd, defpackage.ajzh
    public final akam pn() {
        return new lpa(super.pn(), this.b.pn());
    }
}

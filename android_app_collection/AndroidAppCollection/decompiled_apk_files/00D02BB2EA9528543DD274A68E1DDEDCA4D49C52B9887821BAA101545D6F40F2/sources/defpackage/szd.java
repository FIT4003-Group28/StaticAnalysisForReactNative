package defpackage;
/* compiled from: PG */
/* renamed from: szd  reason: default package */
/* loaded from: classes7.dex */
public class szd extends szn implements syx {
    @dzsi
    private final twj a;
    private final sxp b;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public szd(defpackage.twk r11, defpackage.sxq r12, defpackage.tlv r13, defpackage.amve r14) {
        /*
            r10 = this;
            r10.<init>()
            dpec r0 = r14.b()
            int r0 = r0.b
            dqvj r0 = defpackage.dqvj.c(r0)
            if (r0 != 0) goto L11
            dqvj r0 = defpackage.dqvj.DRIVE
        L11:
            dqvj r1 = defpackage.dqvj.DRIVE
            r2 = 0
            if (r0 == r1) goto L26
            dqvj r1 = defpackage.dqvj.BICYCLE
            if (r0 == r1) goto L26
            dqvj r1 = defpackage.dqvj.TWO_WHEELER
            if (r0 == r1) goto L26
            dqvj r1 = defpackage.dqvj.WALK
            if (r0 == r1) goto L26
            dqvj r1 = defpackage.dqvj.TRANSIT
            if (r0 != r1) goto L75
        L26:
            dpec r0 = r14.b()
            int r0 = r0.b
            dqvj r0 = defpackage.dqvj.c(r0)
            if (r0 != 0) goto L34
            dqvj r0 = defpackage.dqvj.DRIVE
        L34:
            int r0 = r0.ordinal()
            r1 = 5
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 == r3) goto L45
            if (r0 == r1) goto L42
            r7 = r2
            goto L4b
        L42:
            ddho r0 = defpackage.dtxn.ef
            goto L4a
        L45:
            ddho r0 = defpackage.dtxn.K
            goto L4a
        L48:
            ddho r0 = defpackage.dtxn.bk
        L4a:
            r7 = r0
        L4b:
            dpec r0 = r14.b()
            int r0 = r0.b
            dqvj r0 = defpackage.dqvj.c(r0)
            if (r0 != 0) goto L59
            dqvj r0 = defpackage.dqvj.DRIVE
        L59:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L6a
            if (r0 == r3) goto L67
            if (r0 == r1) goto L64
            goto L6c
        L64:
            ddho r2 = defpackage.dtxn.ee
            goto L6c
        L67:
            ddho r2 = defpackage.dtxn.J
            goto L6c
        L6a:
            ddho r2 = defpackage.dtxn.bj
        L6c:
            r8 = r2
            r9 = 1
            r4 = r11
            r5 = r13
            r6 = r14
            twj r2 = r4.a(r5, r6, r7, r8, r9)
        L75:
            r10.a = r2
            sxp r11 = r12.a()
            r10.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szd.<init>(twk, sxq, tlv, amve):void");
    }

    @Override // defpackage.szn
    public void OI(jjn jjnVar) {
        this.b.h(jjnVar);
    }

    @Override // defpackage.syx
    public dcdc<cqix<?>> a() {
        if (this.a != null) {
            return dcdc.g(cqgr.fT(new sua(), this.a), cqgr.fT(new sua(), this.b));
        }
        return dcdc.f(cqgr.fT(new sua(), this.b));
    }
}

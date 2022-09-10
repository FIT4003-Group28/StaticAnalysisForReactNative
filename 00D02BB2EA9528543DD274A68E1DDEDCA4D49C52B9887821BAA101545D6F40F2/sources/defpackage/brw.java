package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brw  reason: default package */
/* loaded from: classes.dex */
public final class brw<TranscodeType> extends chp<brw<TranscodeType>> implements Cloneable {
    public final Context a;
    public bsb<?, ? super TranscodeType> b;
    private final bsa t;
    private final Class<TranscodeType> u;
    private final brk v;
    private Object w;
    private List<chv<TranscodeType>> x;
    private boolean y;

    static {
        new chw().m(bwe.b).n(bro.LOW).q(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public brw(brc brcVar, bsa bsaVar, Class<TranscodeType> cls, Context context) {
        this.t = bsaVar;
        this.u = cls;
        this.a = context;
        brk brkVar = bsaVar.a.b;
        bsb<?, ?> bsbVar = brkVar.e.get(cls);
        if (bsbVar == null) {
            for (Map.Entry<Class<?>, bsb<?, ?>> entry : brkVar.e.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    bsbVar = (bsb<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.b = (bsb<?, ? super TranscodeType>) (bsbVar == null ? (bsb<?, ? super TranscodeType>) brk.a : bsbVar);
        this.v = brcVar.b;
        for (chv<Object> chvVar : bsaVar.d) {
            g(chvVar);
        }
        e(bsaVar.o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        if (r15 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r7.equals(r11) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r8.equals(r0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r9 != r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
        if (r10 != r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r21.i != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
        if (r2.e() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        defpackage.cjn.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        if (r2.d() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <Y extends defpackage.cij<TranscodeType>> void H(Y r19, defpackage.chv<TranscodeType> r20, defpackage.chp r21, java.util.concurrent.Executor r22) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brw.H(cij, chv, chp, java.util.concurrent.Executor):void");
    }

    @Override // defpackage.chp
    /* renamed from: a */
    public final brw<TranscodeType> e(chp<?> chpVar) {
        cjn.b(chpVar);
        return (brw) super.e(chpVar);
    }

    @Override // defpackage.chp
    /* renamed from: b */
    public final brw<TranscodeType> f() {
        brw<TranscodeType> brwVar = (brw) super.clone();
        brwVar.b = (bsb<?, ? super TranscodeType>) brwVar.b.clone();
        return brwVar;
    }

    public final chr<TranscodeType> c() {
        return d(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final chr<TranscodeType> d(int i, int i2) {
        chu chuVar = new chu(i, i2);
        H(chuVar, chuVar, this, cjh.b);
        return chuVar;
    }

    public final void g(chv<TranscodeType> chvVar) {
        if (chvVar != null) {
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(chvVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.cjp.e()
            defpackage.cjn.b(r4)
            int r0 = r3.c
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = defpackage.chp.l(r0, r1)
            if (r0 != 0) goto L5c
            boolean r0 = r3.n
            if (r0 == 0) goto L5c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L5c
            int[] r0 = defpackage.brv.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4c;
                case 2: goto L43;
                case 3: goto L33;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L2a;
                default: goto L29;
            }
        L29:
            goto L5c
        L2a:
            brw r0 = r3.f()
            chp r0 = r0.w()
            goto L5d
        L33:
            brw r0 = r3.f()
            cdi r1 = defpackage.cdi.b
            cdq r2 = new cdq
            r2.<init>()
            chp r0 = super.z(r1, r2)
            goto L5d
        L43:
            brw r0 = r3.f()
            chp r0 = r0.w()
            goto L5d
        L4c:
            brw r0 = r3.f()
            cdi r1 = defpackage.cdi.d
            ccu r2 = new ccu
            r2.<init>()
            chp r0 = r0.x(r1, r2)
            goto L5d
        L5c:
            r0 = r3
        L5d:
            java.lang.Class<TranscodeType> r1 = r3.u
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L6d
            cia r1 = new cia
            r1.<init>(r4)
            goto L7a
        L6d:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L81
            cif r1 = new cif
            r1.<init>(r4)
        L7a:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.cjh.a
            r3.H(r1, r4, r0, r2)
            return
        L81:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 64
            r2.<init>(r1)
            java.lang.String r1 = "Unhandled class: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brw.h(android.widget.ImageView):void");
    }

    public final <Y extends cij<TranscodeType>> void i(Y y) {
        H(y, null, this, cjh.a);
    }

    public final void j(Object obj) {
        this.w = obj;
        this.y = true;
    }

    public final void k(chv<TranscodeType> chvVar) {
        this.x = null;
        g(chvVar);
    }
}

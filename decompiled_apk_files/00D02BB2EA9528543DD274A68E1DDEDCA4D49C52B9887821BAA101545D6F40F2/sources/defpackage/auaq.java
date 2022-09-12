package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auaq  reason: default package */
/* loaded from: classes2.dex */
public final class auaq {
    final /* synthetic */ auax a;

    public auaq(auax auaxVar) {
        this.a = auaxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r6, int r7, @defpackage.dzsi defpackage.dowa r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            auax r2 = r5.a
            dowa r2 = r2.j
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L14
            auax r2 = r5.a
            r2.j = r8
            r8 = 1
            goto L15
        L14:
            r8 = 0
        L15:
            auax r2 = r5.a
            int r3 = r2.l
            r4 = -1
            if (r3 == r6) goto L1f
            r2.l = r6
            goto L21
        L1f:
            if (r8 == 0) goto L49
        L21:
            if (r6 != r4) goto L2c
            r2.b()
            auax r8 = r5.a
            r8.d()
            goto L49
        L2c:
            auam r8 = r2.i
            r8.a()
            auax r8 = r5.a
            r8.b()
            auax r8 = r5.a
            r8.d()
            auax r8 = r5.a
            auam r8 = r8.i
            r8.c()
            auax r8 = r5.a
            auam r8 = r8.i
            r8.b()
        L49:
            if (r6 != r4) goto L94
            if (r7 == r4) goto L94
            auax r6 = r5.a
            btvo r8 = r6.c
            dkyr r8 = r8.getUgcParameters()
            boolean r8 = r8.ae()
            if (r8 == 0) goto L94
            boolean r8 = r6.h
            if (r8 != 0) goto L94
            if (r7 > 0) goto L62
            goto L94
        L62:
            auan r8 = r6.d
            com.google.android.apps.gmm.map.model.location.GmmLocation r8 = r8.h
            if (r8 == 0) goto L94
            boolean r2 = r8.e()
            if (r2 == 0) goto L94
            akra r8 = r8.u()
            if (r8 == 0) goto L94
            int r2 = r6.A
            r3 = 3
            if (r2 != r3) goto L7a
            goto L7b
        L7a:
            r0 = 0
        L7b:
            btrm r1 = r6.a
            crib r2 = new crib
            aryv r3 = new aryv
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            dowa r6 = r6.j
            r3.<init>(r7, r6, r0)
            akqq r6 = r8.S()
            r2.<init>(r3, r6)
            r1.b(r2)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auaq.a(int, int, dowa):void");
    }

    public final void b() {
        auax auaxVar = this.a;
        if (auaxVar.m == -1) {
            return;
        }
        if (auaxVar.z.t().booleanValue() && this.a.z.s().booleanValue()) {
            auax auaxVar2 = this.a;
            if (auaxVar2.m >= 100) {
                auaxVar2.u = true;
            }
        }
        auax auaxVar3 = this.a;
        auaxVar3.m = -1;
        auaxVar3.i.c();
    }

    public final void c(float f) {
        auax auaxVar;
        int i;
        int i2 = (int) (f * (this.a.j == dowa.KILOMETERS ? 3.6f : 2.2369363f));
        auax auaxVar2 = this.a;
        if (i2 == auaxVar2.m) {
            return;
        }
        if (auaxVar2.z.t().booleanValue() && this.a.z.s().booleanValue() && (((i = (auaxVar = this.a).m) < 100 && i2 >= 100) || (i >= 100 && i2 < 100))) {
            auaxVar.u = true;
        }
        auax auaxVar3 = this.a;
        auaxVar3.m = i2;
        auaxVar3.i.c();
    }
}

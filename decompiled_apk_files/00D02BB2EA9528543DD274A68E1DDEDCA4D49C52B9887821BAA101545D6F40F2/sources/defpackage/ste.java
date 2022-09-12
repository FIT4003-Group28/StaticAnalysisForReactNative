package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ste  reason: default package */
/* loaded from: classes7.dex */
public final class ste implements stc {
    public final dxio<acwo> a;
    public final stb b;
    private final gga c;

    public ste(gga ggaVar, dxio<acwo> dxioVar, stb stbVar) {
        this.c = ggaVar;
        this.a = dxioVar;
        this.b = stbVar;
    }

    @Override // defpackage.stc
    public final boolean a() {
        return this.b.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[RETURN] */
    @Override // defpackage.stc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            stb r0 = r4.b
            crzm r0 = r0.b()
            java.lang.Object r0 = r0.l()
            qee r0 = (defpackage.qee) r0
            defpackage.dbsk.s(r0)
            qee r2 = defpackage.qee.DOGFOOD_OPT_IN_ENABLED
            boolean r2 = r0.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            qee r2 = defpackage.qee.ENABLED_DUE_TO_DOGFOOD_OPT_IN
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L29
            goto L4c
        L29:
            stb r0 = r4.b
            boolean r2 = r0.d()
            if (r2 == 0) goto L46
            crzo<java.lang.Boolean> r0 = r0.b
            crzn<V> r0 = r0.a
            java.lang.Object r0 = r0.l()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            defpackage.dbsk.s(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            r2 = r5 ^ 1
            if (r0 != r2) goto L6c
            return r1
        L4c:
            stb r0 = r4.b
            boolean r2 = r0.d()
            if (r2 == 0) goto L69
            crzo<java.lang.Boolean> r0 = r0.c
            crzn<V> r0 = r0.a
            java.lang.Object r0 = r0.l()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            defpackage.dbsk.s(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            if (r0 == r5) goto L80
        L6c:
            if (r5 != 0) goto L7a
            cjkr r5 = r4.c()
            android.app.AlertDialog r5 = r5.q()
            r5.show()
            return r1
        L7a:
            stb r5 = r4.b
            r5.f(r1)
            return r3
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ste.b(boolean):boolean");
    }

    final cjkr c() {
        cjkp B = cjkr.B();
        B.t(this.c.getResources().getString(ssv.TWO_DIRECTION_OPT_OUT_DIALOG_TITLE));
        ((cjke) B).e = this.c.getResources().getString(ssv.TWO_DIRECTION_OPT_OUT_DIALOG_BODY);
        B.y(this.c.getResources().getString(ssv.TWO_DIRECTION_OPT_OUT_DIALOG_CANCEL), null, cjtd.a(dtxn.cg));
        B.z(this.c.getResources().getString(ssv.TWO_DIRECTION_OPT_OUT_DIALOG_CONFIRM), new View.OnClickListener(this) { // from class: std
            private final ste a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ste steVar = this.a;
                steVar.b.f(true);
                steVar.a.a().i(dvum.TWO_DIRECTION_OPT_OUT, null);
            }
        }, cjtd.a(dtxn.ch));
        return B.u(this.c);
    }
}

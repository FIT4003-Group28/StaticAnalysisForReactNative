package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbf  reason: default package */
/* loaded from: classes5.dex */
public final class dbf implements dan {
    private final Map<dal, dfeq<dfiy>> a = new HashMap();
    private int b = 0;
    private boolean c;
    private final dfkc d;

    public dbf(dfkc dfkcVar) {
        this.d = dfkcVar;
    }

    private final void h() {
        this.d.b();
    }

    @Override // defpackage.dan
    public final void a(final dal dalVar) {
        dfeq<dfiy> dfeqVar = new dfeq(dalVar) { // from class: dbe
            private final dal a;

            {
                this.a = dalVar;
            }

            @Override // defpackage.dfeq
            public final void n(Object obj) {
                dal dalVar2 = this.a;
                dfiy dfiyVar = (dfiy) obj;
                if (dfiyVar != null) {
                    dam damVar = dam.UNKNOWN;
                    int a = dfix.a(dfiyVar.a);
                    int i = 1;
                    if (a == 0) {
                        a = 1;
                    }
                    int i2 = a - 1;
                    if (i2 != 0) {
                        i = i2 != 1 ? 3 : 2;
                    }
                    dalVar2.a(i);
                }
            }
        };
        this.a.put(dalVar, dfeqVar);
        this.d.c(dfeqVar);
    }

    @Override // defpackage.dan
    public final void b(dal dalVar) {
        dfeq<dfiy> remove = this.a.remove(dalVar);
        if (remove != null) {
            this.d.d(remove);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // defpackage.dan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.dam r5) {
        /*
            r4 = this;
            dfkc r0 = r4.d
            dfiu r1 = defpackage.dfiu.c
            dsqp r1 = r1.bZ()
            dfis r1 = (defpackage.dfis) r1
            dam r2 = defpackage.dam.UNKNOWN
            int r5 = r5.ordinal()
            r2 = 2
            r3 = 1
            if (r5 == 0) goto L1b
            if (r5 == r3) goto L1c
            if (r5 == r2) goto L19
            goto L1b
        L19:
            r2 = 3
            goto L1c
        L1b:
            r2 = 1
        L1c:
            boolean r5 = r1.c
            if (r5 == 0) goto L26
            r1.bF()
            r5 = 0
            r1.c = r5
        L26:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r1.b
            dfiu r5 = (defpackage.dfiu) r5
            int r2 = r2 + (-1)
            r5.b = r2
            int r2 = r5.a
            r2 = r2 | r3
            r5.a = r2
            dsqw r5 = r1.bK()
            dfiu r5 = (defpackage.dfiu) r5
            r0.e(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbf.c(dam):void");
    }

    @Override // defpackage.dan
    public final void d() {
        this.c = true;
        if (this.b != 0) {
            return;
        }
        this.d.a();
    }

    @Override // defpackage.dan
    public final void e() {
        this.c = false;
        h();
    }

    @Override // defpackage.dan
    public final void f() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            h();
        }
    }

    @Override // defpackage.dan
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        dbsk.l(i >= 0);
        if (this.b != 0 || !this.c) {
            return;
        }
        d();
    }
}

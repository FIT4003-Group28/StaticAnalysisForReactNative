package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cbxt  reason: default package */
/* loaded from: classes4.dex */
public class cbxt extends cbwa implements cbxo {
    public final cbrx a;
    private final cbtv b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cbxt(defpackage.cbrx r5, defpackage.cbss r6, final defpackage.gga r7) {
        /*
            r4 = this;
            cbsb r6 = (defpackage.cbsb) r6
            crzm<cbtv> r0 = r6.c
            java.lang.Object r0 = r0.l()
            cbtv r0 = (defpackage.cbtv) r0
            defpackage.dbsk.s(r0)
            java.lang.String r0 = r0.f
            crzm<cbtv> r1 = r6.c
            java.lang.Object r1 = r1.l()
            cbtv r1 = (defpackage.cbtv) r1
            defpackage.dbsk.s(r1)
            java.lang.String r1 = r1.d
            ddho r2 = defpackage.dtya.dv
            cbxp r3 = new cbxp
            r3.<init>(r7)
            r4.<init>(r0, r1, r2, r3)
            r4.a = r5
            crzm<cbtv> r5 = r6.c
            java.lang.Object r5 = r5.l()
            cbtv r5 = (defpackage.cbtv) r5
            defpackage.dbsk.s(r5)
            r4.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbxt.<init>(cbrx, cbss, gga):void");
    }

    @Override // defpackage.cbxo
    public Boolean a() {
        int a = cbuh.a(this.b.g);
        boolean z = true;
        if (a != 0 && a != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbxo
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: cbxq
            private final cbxt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((cbrz) this.a.a).a.c();
            }
        };
    }

    @Override // defpackage.cbxo
    public Boolean e() {
        int a = cbuh.a(this.b.g);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbxo
    public jez f() {
        return new jez(this) { // from class: cbxr
            private final cbxt a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                ((cbrz) this.a.a).a.d((int) f);
            }
        };
    }

    @Override // defpackage.cbxo
    public Boolean g() {
        int a = cbuh.a(this.b.g);
        boolean z = false;
        if (a != 0 && a == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbxo
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: cbxs
            private final cbxt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((cbrz) this.a.a).a.e();
            }
        };
    }
}

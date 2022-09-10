package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bkdx  reason: default package */
/* loaded from: classes3.dex */
public final class bkdx implements bkdg {
    private final dcdc<bkdh> a;
    private final String b;
    private final bkdf c;
    @dzsi
    private final bked d;

    public bkdx(dgjc dgjcVar, bkdf bkdfVar, final bkea bkeaVar) {
        this.b = dgjcVar.a;
        this.a = dcbg.b(dgjcVar.b).s(new dbrn(bkeaVar) { // from class: bkdw
            private final bkea a;

            {
                this.a = bkeaVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a((dgiy) obj, dtxy.oB, false, false);
            }
        }).z();
        this.c = bkdfVar;
        this.d = bkdfVar == bkdf.CAROUSEL ? new bked() : null;
    }

    @Override // defpackage.bkdg
    public String a() {
        return this.b;
    }

    @Override // defpackage.bkdg
    public Boolean c(bkdf bkdfVar) {
        return Boolean.valueOf(this.c.equals(bkdfVar));
    }

    @Override // defpackage.bkdg
    @dzsi
    public View.OnAttachStateChangeListener d() {
        return this.d;
    }

    @Override // defpackage.bkdg
    /* renamed from: e */
    public dcdc<bkdh> b() {
        return this.a;
    }
}

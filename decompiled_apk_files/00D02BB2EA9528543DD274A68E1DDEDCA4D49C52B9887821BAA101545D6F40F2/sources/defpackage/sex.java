package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: sex  reason: default package */
/* loaded from: classes7.dex */
public final class sex {
    public final eeu a;
    public final rzp b;
    public final rzn c;
    private final gga d;
    private final ckcw e;

    public sex(gga ggaVar, eeu eeuVar, rzn rznVar, ckcw ckcwVar, rzp rzpVar) {
        this.d = ggaVar;
        this.a = eeuVar;
        this.b = rzpVar;
        this.c = rznVar;
        this.e = ckcwVar;
    }

    private final void b(boolean z) {
        gn g = this.d.g();
        dbsk.s(g);
        if (g.j() == 0) {
            if (z) {
                ((ckco) this.e.a(ckeo.Q)).a(ckeh.a(3));
            } else {
                ((ckco) this.e.a(ckeo.Q)).a(ckeh.a(4));
            }
        } else if (z) {
            ((ckco) this.e.a(ckeo.Q)).a(ckeh.a(1));
        } else {
            ((ckco) this.e.a(ckeo.Q)).a(ckeh.a(2));
        }
        this.d.w();
    }

    public final void a() {
        if (this.a.b()) {
            String d = this.b.d();
            if (!TextUtils.isEmpty(d)) {
                if (!this.d.g().h(d, 0)) {
                    b(false);
                    return;
                } else {
                    ((ckco) this.e.a(ckeo.Q)).a(ckeh.a(1));
                    return;
                }
            }
            b(true);
        }
    }
}

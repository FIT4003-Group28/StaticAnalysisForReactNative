package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: bbeo  reason: default package */
/* loaded from: classes3.dex */
public final class bbeo implements bzml {
    public final bzmm a;
    public WeakReference<View> b = new WeakReference<>(null);
    public boolean c = false;
    private final cjnf d;
    private final cjqq e;
    private final dxio<bvjj> f;

    public bbeo(bzmm bzmmVar, cjnf cjnfVar, cjqq cjqqVar, dxio<bvjj> dxioVar) {
        this.a = bzmmVar;
        this.d = cjnfVar;
        this.e = cjqqVar;
        this.f = dxioVar;
    }

    private final boolean g() {
        return this.f.a().m(bvjk.jd, false);
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.DONUT_PLACESHEET_HEADER;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return g() ? bzmj.CRITICAL : bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return g() || this.a.d(dqkc.DONUT_PLACESHEET_HEADER) == 0;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        cjta b = cjtd.b();
        b.d = dtxy.iP;
        if (bzmkVar != bzmk.VISIBLE) {
            if (bzmkVar != bzmk.REPRESSED) {
                return false;
            }
            cjqp g = this.e.g();
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g.d(b.a());
            return true;
        }
        View view = this.b.get();
        if (view == null) {
            return false;
        }
        int i = true != this.c ? R.string.PERSONAL_SCORE_TUTORIAL_LOW_CONFIDENCE_TEXT : R.string.PERSONAL_SCORE_TUTORIAL_HIGH_CONFIDENCE_TEXT;
        cjnf cjnfVar = this.d;
        cjnd i2 = cjne.i();
        i2.d(view);
        i2.c(i);
        cjtd a = b.a();
        cjnb cjnbVar = (cjnb) i2;
        cjnbVar.b = a;
        cjnbVar.c = new Runnable(this) { // from class: bben
            private final bbeo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.f(dqkc.DONUT_PLACESHEET_HEADER);
            }
        };
        cjnfVar.a(i2.a());
        this.f.a().S(bvjk.jd, false);
        return true;
    }
}

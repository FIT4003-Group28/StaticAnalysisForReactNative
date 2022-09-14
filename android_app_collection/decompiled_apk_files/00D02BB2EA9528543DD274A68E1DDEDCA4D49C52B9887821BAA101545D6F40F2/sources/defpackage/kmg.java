package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: kmg  reason: default package */
/* loaded from: classes7.dex */
public final class kmg extends nor {
    private static final cjsz a = new cjsz(dtxm.aG);
    private final not b;
    private final cqkf<koh> c;
    private final koh d;

    public kmg(cjqy cjqyVar, cjqq cjqqVar, noo nooVar, cqkj cqkjVar, not notVar, List<doew> list) {
        super(cjqyVar, cjqqVar);
        this.b = notVar;
        this.c = cqkjVar.d(new knn(), ((npb) notVar).b, false);
        this.d = new koo(cqkjVar.d, nooVar, list);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.c.e(this.d);
    }

    @Override // defpackage.non
    public final noq b() {
        s(a);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.c.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.c.h();
    }

    @Override // defpackage.non
    public final String g() {
        return "EvPaymentMethodsOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.b.b(noeVar, d());
    }
}

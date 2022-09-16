package defpackage;

import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ltb  reason: default package */
/* loaded from: classes7.dex */
final class ltb extends cqiw<lsv> {
    private final View.OnFocusChangeListener a;
    private final boolean b;

    public ltb(View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(onFocusChangeListener, Boolean.valueOf(z));
        this.a = onFocusChangeListener;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqmj<T> d(lsv lsvVar, View.OnFocusChangeListener onFocusChangeListener, Boolean bool) {
        return cqgr.gc(cqgr.aG(lsvVar.c()), cqjv.j(cqfe.ON_FOCUS_CHANGE, onFocusChangeListener), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bp(-1), itj.g(lsvVar.b()), iue.b(lsvVar.d()), cqgr.J(bool), cqgr.az(cqjv.r(npv.a(), bool)), nqu.h(npv.a(), null, false, nqo.ad), cqgr.eE(lsvVar.a()), cqgr.ei(ImageView.ScaleType.CENTER));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<lsv> a() {
        return d(B(), this.a, Boolean.valueOf(this.b));
    }
}

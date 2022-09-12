package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: apew  reason: default package */
/* loaded from: classes2.dex */
public final class apew extends geb {
    private static final dcqe ae;
    apgz ad;
    private final Callable<Integer> af = new Callable(this) { // from class: apet
        private final apew a;

        {
            this.a = this;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            cqkf<bsgz> cqkfVar = this.a.g;
            return Integer.valueOf(cqkfVar != null ? cqkfVar.c().getHeight() : 0);
        }
    };
    public cqkj c;
    public apha d;
    public gga e;
    @dzsi
    public cqkf<bsgz> g;

    static {
        dbsk.s(apew.class.getCanonicalName());
        ae = dcqe.c("apew");
    }

    public static apew w(aoxr aoxrVar, dcdc<aoxr> dcdcVar) {
        apew apewVar = new apew();
        Bundle bundle = new Bundle();
        bundle.putSerializable("currently_sorted_by", aoxrVar);
        bundle.putSerializable("allowed_sort_by", new ArrayList(dcdcVar));
        apewVar.B(bundle);
        return apewVar;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bsgz> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.g = null;
        }
        super.Qe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 == null) goto L7;
     */
    @Override // defpackage.geb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.view.View q(android.os.Bundle r10) {
        /*
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            ff r1 = r9.J()
            r0.<init>(r1)
            apha r1 = r9.d
            apev r6 = new apev
            r6.<init>(r9)
            if (r10 == 0) goto L14
            r2 = r10
            goto L16
        L14:
            android.os.Bundle r2 = r9.o
        L16:
            r3 = 0
            java.lang.String r4 = "No state available in onCreate"
            if (r2 != 0) goto L21
            java.lang.Object[] r2 = new java.lang.Object[r3]
            defpackage.bvoo.h(r4, r2)
            goto L2b
        L21:
            java.lang.String r5 = "currently_sorted_by"
            java.io.Serializable r2 = r2.getSerializable(r5)
            aoxr r2 = (defpackage.aoxr) r2
            if (r2 != 0) goto L2d
        L2b:
            aoxr r2 = defpackage.aoxr.LAST_VISIT_TIME
        L2d:
            r7 = r2
            if (r10 != 0) goto L32
            android.os.Bundle r10 = r9.o
        L32:
            if (r10 != 0) goto L3a
            java.lang.Object[] r10 = new java.lang.Object[r3]
            defpackage.bvoo.h(r4, r10)
            goto L49
        L3a:
            java.lang.String r2 = "allowed_sort_by"
            java.io.Serializable r10 = r10.getSerializable(r2)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L49
            dcdc r10 = defpackage.dcdc.r(r10)
            goto L4d
        L49:
            dcdc r10 = defpackage.dcdc.e()
        L4d:
            r8 = r10
            apgz r10 = new apgz
            dzsj<android.content.res.Resources> r2 = r1.a
            java.lang.Object r2 = r2.a()
            r3 = r2
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            r2 = 1
            defpackage.apha.a(r3, r2)
            dzsj<gga> r1 = r1.b
            java.lang.Object r1 = r1.a()
            r4 = r1
            gga r4 = (defpackage.gga) r4
            r1 = 2
            defpackage.apha.a(r4, r1)
            r1 = 3
            defpackage.apha.a(r9, r1)
            r1 = 4
            defpackage.apha.a(r6, r1)
            r1 = 5
            defpackage.apha.a(r7, r1)
            r1 = 6
            defpackage.apha.a(r8, r1)
            r2 = r10
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.ad = r10
            cqkj r10 = r9.c
            apfp r1 = new apfp
            r1.<init>()
            cqkf r10 = r10.c(r1, r0)
            r9.g = r10
            apgz r1 = r9.ad
            r10.e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apew.q(android.os.Bundle):android.view.View");
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ExpandingScrollView expandingScrollView = ((geb) this).b;
        expandingScrollView.setViewHeaderHeightCallableForSizingCollapsedState(this.af);
        expandingScrollView.setExpandingStateTransition(jkc.o, jkc.o);
        expandingScrollView.setExpandingState(jjn.COLLAPSED, true);
        if (czui.a(21)) {
            ((View) expandingScrollView.getParent()).setAccessibilityDelegate(new apeu(this));
        }
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("currently_sorted_by", this.ad.l());
        bundle.putSerializable("allowed_sort_by", this.ad.a());
    }
}

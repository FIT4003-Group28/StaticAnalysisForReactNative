package defpackage;

import android.view.View;
import com.google.android.apps.gmm.personalplaces.constellations.details.webview.RelatedListsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: ayqg  reason: default package */
/* loaded from: classes3.dex */
public class ayqg implements aymv {
    private static final ddho c = dtxy.eq;
    public final gga b;
    @dzsi
    private final bwrs<baad> e;
    private final ayrm f;
    private final ckcw g;
    private boolean h;
    private final View.OnAttachStateChangeListener d = new ayqf(this);
    @dzsi
    public ges a = null;

    public ayqg(gga ggaVar, ckcw ckcwVar, ayrm ayrmVar, btvo btvoVar, @dzsi bwrs<baad> bwrsVar) {
        this.b = ggaVar;
        this.e = bwrsVar;
        this.f = ayrmVar;
        this.g = ckcwVar;
        this.h = btvoVar.getPlaceListsParameters().b;
    }

    @Override // defpackage.aymv
    public View.OnAttachStateChangeListener a() {
        return this.d;
    }

    @Override // defpackage.aymv
    public Boolean b() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.aymv
    public void c(boolean z) {
        this.h = true;
        ((ckhe) this.g.a(ckiv.b)).c();
        cqkx.p(this);
    }

    public void d() {
        String str;
        bvui bvuiVar;
        if (this.a == null) {
            bwrs<baad> bwrsVar = this.e;
            if (bwrsVar == null || bwrsVar.c() == null) {
                str = "";
            } else {
                baad c2 = this.e.c();
                dbsk.s(c2);
                str = c2.l();
            }
            if (str.isEmpty()) {
                bvuiVar = null;
            } else {
                bvvr e = bvvs.e();
                ((bvvn) e).b = new RelatedListsWebViewCallbacks(this);
                e.b(this.f.a(str, 2));
                bvvs a = e.a();
                ddho ddhoVar = c;
                bvui bvuiVar2 = new bvui();
                bvtr.c(a, ddhoVar, bvuiVar2);
                ((ckhe) this.g.a(ckiv.b)).a();
                bvuiVar = bvuiVar2;
            }
            this.a = bvuiVar;
        }
    }
}

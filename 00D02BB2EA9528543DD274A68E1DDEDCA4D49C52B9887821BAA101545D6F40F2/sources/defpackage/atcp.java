package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atcp  reason: default package */
/* loaded from: classes2.dex */
public final class atcp {
    public static final cqtv j = cqrp.d(18.0d);
    public final atmi a;
    public final atmz b;
    public final atcm c;
    public final atci d;
    public final atcj e;
    public final atcj f;
    public final atcj g;
    public int h;
    public boolean i = false;
    public final atcn k;
    public final View.OnLayoutChangeListener l;
    public final jkh m;
    private final cjmt n;
    private final arrd o;

    public atcp(atmi atmiVar, atmz atmzVar, arre arreVar, atcm atcmVar, atci atciVar, atcj atcjVar, atcj atcjVar2, atcj atcjVar3, ExpandingScrollView expandingScrollView, cjmt cjmtVar) {
        atcf atcfVar = new atcf(this);
        this.o = atcfVar;
        this.l = new atcg(this);
        this.m = new atch(this);
        this.a = atmiVar;
        this.b = atmzVar;
        this.c = atcmVar;
        this.d = atciVar;
        this.e = atcjVar;
        this.f = atcjVar2;
        this.g = atcjVar3;
        this.n = cjmtVar;
        this.k = new atcn(this, expandingScrollView);
        arreVar.d(atcfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        atcm atcmVar = this.c;
        atcmVar.a.e(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.k.b().c(this.a);
    }

    public final void c() {
        this.k.c(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jkc d() {
        atcj b = this.k.b();
        if (b == this.e || b == this.g || b == this.f) {
            return jkc.l;
        }
        return jkc.k;
    }

    public final void e() {
        View findViewById;
        ExpandingScrollView a = this.k.a();
        int measuredHeight = this.c.a().getMeasuredHeight();
        int a2 = (measuredHeight - ((int) cqsg.d(j, cqrp.d(8.0d)).a(a.getContext()))) - this.n.g();
        int e = (measuredHeight - cqrp.d(8.0d).e(a.getContext())) - this.n.g();
        atcm atcmVar = this.c;
        boolean z = this.i;
        View a3 = atcmVar.a();
        View findViewById2 = a3.findViewById(athe.header);
        dbsk.s(findViewById2);
        int measuredHeight2 = findViewById2.getMeasuredHeight();
        if (z && (findViewById = a3.findViewById(R.id.media_app_remote_control)) != null) {
            measuredHeight2 += findViewById.getMeasuredHeight();
        }
        this.h = this.d.b();
        if (this.a.ak().booleanValue()) {
            measuredHeight = true != btpf.c(a.getContext()).f ? a2 : e;
        }
        int min = Math.min(this.h + measuredHeight2, measuredHeight);
        a.setExposurePixels(jjn.HIDDEN, 0);
        a.setExposurePixels(jjn.COLLAPSED, measuredHeight2);
        a.setExposurePixels(jjn.EXPANDED, min);
        a.setExposurePixels(jjn.FULLY_EXPANDED, measuredHeight);
    }
}

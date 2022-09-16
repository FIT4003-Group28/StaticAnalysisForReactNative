package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kke  reason: default package */
/* loaded from: classes3.dex */
public final class kke extends ahyf implements wlw {
    public wlv a;
    private final kkc c;
    private final kkc d;
    private final kkc e;
    private kkc f;
    private boolean g;
    private int h;

    public kke(Context context, kkm kkmVar, kkq kkqVar, kkr kkrVar) {
        super(context);
        kkmVar.getClass();
        this.c = kkmVar;
        kkqVar.getClass();
        this.d = kkqVar;
        kkrVar.getClass();
        this.e = kkrVar;
        l();
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.main_ad_cta_overlay, (ViewGroup) null, false);
        inflate.setVisibility(0);
        return inflate;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
        if (this.f == null) {
            return;
        }
        if (aa(1)) {
            this.f.b(view);
            this.f.c();
        }
        if (!aa(2)) {
            return;
        }
        this.f.g(this.h, this.g);
    }

    @Override // defpackage.wlw
    public final void g() {
        this.a = null;
        l();
    }

    public final void l() {
        this.c.d();
        this.d.d();
        kkr kkrVar = (kkr) this.e;
        ViewGroup viewGroup = kkrVar.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            kkrVar.c.setVisibility(8);
        }
        if (kkrVar.b != null) {
            kkrVar.a.qZ(null);
            kkrVar.b = null;
        }
        kkrVar.e = null;
        kkrVar.d = null;
        this.f = null;
        this.h = 1;
        Y(3);
        kT();
    }

    @Deprecated
    public final void m(boolean z) {
        kkc kkcVar = this.f;
        if (kkcVar != null) {
            kkcVar.e(z);
        }
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.f != null;
    }

    @Override // defpackage.wlw
    public final void o(wlv wlvVar) {
        this.a = wlvVar;
    }

    @Override // defpackage.wlw
    public final void p(aoqu aoquVar) {
        l();
        if (aoquVar instanceof aphn) {
            kkc kkcVar = this.c;
            ((kkn) kkcVar).p = (aphn) aoquVar;
            this.f = kkcVar;
        } else if (aoquVar instanceof apza) {
            kkc kkcVar2 = this.d;
            ((kkn) kkcVar2).p = (apza) aoquVar;
            this.f = kkcVar2;
        } else if (aoquVar instanceof aqtf) {
            kkc kkcVar3 = this.e;
            ((kkr) kkcVar3).d = (aqtf) aoquVar;
            this.f = kkcVar3;
        }
        kkc kkcVar4 = this.f;
        if (kkcVar4 != null) {
            kkcVar4.f(this.a);
            Y(1);
            kU();
        }
    }

    @Override // defpackage.wlw
    public final void q(boolean z) {
        m(z);
    }

    @Override // defpackage.wlw
    public final void r(int i, boolean z) {
        this.h = i;
        this.g = z;
        Y(2);
    }
}

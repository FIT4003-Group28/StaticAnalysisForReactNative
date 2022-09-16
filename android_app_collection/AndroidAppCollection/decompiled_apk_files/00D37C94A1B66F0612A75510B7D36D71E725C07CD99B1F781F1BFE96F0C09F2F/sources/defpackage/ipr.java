package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ipr  reason: default package */
/* loaded from: classes3.dex */
public final class ipr extends ipb implements gbk {
    public fcl a;
    public boolean ag;
    public sdb ah;
    private Object ai;
    private Fragment$SavedState aj;
    private Object ak;
    private Fragment$SavedState al;
    private PaneDescriptor am;
    private boolean an;
    private boolean ao;
    private PaneBackStack ax;
    public aafd b;
    public ind c;
    public jsc d;
    View e;
    final amqo ae = new ipo(this);
    final amqo af = new ipo(this, 1);
    private boolean aw = false;

    private final PaneBackStack aE() {
        if (this.ax == null) {
            this.ax = new PaneBackStack();
        }
        return this.ax;
    }

    private final PaneDescriptor aF() {
        if (aG() != null) {
            return PaneDescriptor.b(aG());
        }
        PaneDescriptor paneDescriptor = this.am;
        return paneDescriptor != null ? paneDescriptor : (PaneDescriptor) this.af.get();
    }

    private final gbd aG() {
        return (gbd) mL().f("detail_fragment_tag");
    }

    private final void aH(PaneDescriptor paneDescriptor, boolean z) {
        Fragment$SavedState fragment$SavedState;
        boolean z2 = this.an;
        int i = R.id.master_layout;
        if (z2) {
            i = R.id.detail_layout;
        } else if (r() != null && !z) {
            this.ai = r().aQ();
            this.aj = mL().c(r());
        }
        gbd d = paneDescriptor.d();
        if (d.m == null) {
            d.ae(new Bundle());
        }
        if (this.an) {
            d.m.putBoolean("needs_nested_header", true);
        }
        if (paneDescriptor == this.am && (fragment$SavedState = this.al) != null) {
            d.ag(fragment$SavedState);
        }
        ex l = mL().l();
        l.u(i, d, "detail_fragment_tag");
        l.i = 0;
        l.a();
    }

    private final void aI(boolean z) {
        if (r() != null) {
            return;
        }
        PaneDescriptor paneDescriptor = (PaneDescriptor) this.ae.get();
        gbd d = paneDescriptor.d();
        Fragment$SavedState fragment$SavedState = this.aj;
        if (fragment$SavedState != null) {
            d.ag(fragment$SavedState);
        }
        ex l = mL().l();
        l.u(R.id.master_layout, d, "master_fragment_tag");
        if (z) {
            bf(aG(), paneDescriptor, true);
            l.i = 8194;
        }
        l.a();
    }

    private final void bd() {
        PaneBackStack.BackStackEntry b = aE().b();
        this.am = b.a;
        this.al = b.b;
        this.ak = b.c;
        bf(aG(), this.am, true);
        aH(this.am, false);
    }

    private final boolean be(PaneDescriptor paneDescriptor) {
        gbd aG = aG();
        return aG != null && this.c.f(PaneDescriptor.b(aG)) && this.c.g(paneDescriptor);
    }

    private static final void bf(gbd gbdVar, PaneDescriptor paneDescriptor, boolean z) {
        aopa createBuilder = atnp.a.createBuilder();
        boolean z2 = true;
        if (gbdVar == null || gbdVar.oi() == null || gbdVar.oi().k() == null) {
            z2 = false;
        } else {
            String k = gbdVar.oi().k();
            createBuilder.copyOnWrite();
            atnp atnpVar = (atnp) createBuilder.instance;
            k.getClass();
            atnpVar.b |= 1;
            atnpVar.c = k;
        }
        if (z) {
            int i = actj.MOBILE_BACK_BUTTON.II;
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 2;
            atnpVar2.d = i;
        } else if (!z2) {
            return;
        }
        paneDescriptor.j((atnp) createBuilder.mo39build());
    }

    @Override // defpackage.gbk
    public final boolean B() {
        return !s() && aE().d();
    }

    @Override // defpackage.gbk
    public final boolean C() {
        if (!B()) {
            if (this.an) {
                bd();
                this.ao = true;
            } else if (aE().d()) {
                aI(true);
                this.ao = false;
            } else {
                bd();
                this.ao = true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gbk
    public final boolean D() {
        if (!B()) {
            if (this.an) {
                if (PaneDescriptor.k(aF(), (PaneDescriptor) this.af.get(), this.b)) {
                    return false;
                }
                aH((PaneDescriptor) this.af.get(), false);
                this.ao = true;
            } else {
                aI(true);
                this.ao = false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gbk
    public final boolean E(PaneDescriptor paneDescriptor) {
        if (!s() || be(paneDescriptor)) {
            if (be(paneDescriptor)) {
                bf(aG(), paneDescriptor, false);
                gbd aG = aG();
                aE().c(PaneDescriptor.b(aG), mL().c(aG), aG.aQ(), null);
            } else {
                bf(r(), paneDescriptor, false);
                aE().e();
            }
            aH(paneDescriptor, false);
            this.ao = true;
            return true;
        }
        return false;
    }

    @Override // defpackage.gbk
    public final boolean G() {
        if (!this.an) {
            return C();
        }
        if (PaneDescriptor.k(aF(), (PaneDescriptor) this.af.get(), this.b)) {
            return false;
        }
        if (C()) {
            return true;
        }
        aH((PaneDescriptor) this.af.get(), false);
        return true;
    }

    @Override // defpackage.gbd
    public final int aJ() {
        return 720;
    }

    @Override // defpackage.gbd
    public final Optional aO(PaneDescriptor paneDescriptor) {
        if (PaneDescriptor.k(paneDescriptor, (PaneDescriptor) this.ae.get(), this.b)) {
            return Optional.ofNullable(this.ai);
        }
        if (PaneDescriptor.k(paneDescriptor, this.am, this.b)) {
            return Optional.ofNullable(this.ak);
        }
        return Optional.empty();
    }

    @Override // defpackage.gbd
    public final Object aQ() {
        ipp ippVar = new ipp();
        if (s()) {
            ippVar.a = this.ai;
            ippVar.d = this.aj;
        } else {
            ippVar.a = r().aQ();
            ippVar.d = mL().c(r());
        }
        if (this.ao) {
            ippVar.b = aG().aQ();
            ippVar.c = aE();
            ippVar.f = aF();
            ippVar.e = mL().c(aG());
        }
        ippVar.g = Boolean.valueOf(this.ao);
        ippVar.h = Boolean.valueOf(this.ag);
        Boolean bool = ippVar.g;
        if (bool == null || ippVar.h == null) {
            StringBuilder sb = new StringBuilder();
            if (ippVar.g == null) {
                sb.append(" showingDetail");
            }
            if (ippVar.h == null) {
                sb.append(" startedInOfflineMode");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ipq(ippVar.a, ippVar.b, ippVar.c, ippVar.d, ippVar.e, ippVar.f, bool.booleanValue(), ippVar.h.booleanValue());
    }

    @Override // defpackage.gbd
    public final void aV(Object obj) {
        if (!(obj instanceof ipq)) {
            return;
        }
        ipq ipqVar = (ipq) obj;
        this.ai = ipqVar.a;
        this.aj = ipqVar.d;
        this.ak = ipqVar.b;
        this.am = ipqVar.f;
        this.ax = ipqVar.c;
        this.al = ipqVar.e;
        this.ao = ipqVar.g;
        this.ag = ipqVar.h;
        this.aw = true;
    }

    @Override // defpackage.gbd
    public final boolean aY() {
        return this.an;
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        return (this.an || !this.ao) ? this.as : aG().lt();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        if (rh().getConfiguration().smallestScreenWidthDp >= 720) {
            inflate = layoutInflater.inflate(R.layout.library_split_fragment_sw720dp, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.library_split_fragment, viewGroup, false);
        }
        this.e = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.master_layout);
        if (rh().getConfiguration().smallestScreenWidthDp >= 840) {
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(rh().getDimensionPixelSize(R.dimen.master_layout_width_sw840dp), -1));
        } else if (rh().getConfiguration().smallestScreenWidthDp >= 720) {
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(rh().getDimensionPixelSize(R.dimen.master_layout_width_sw720dp), -1));
        }
        View findViewById = this.e.findViewById(R.id.detail_layout);
        boolean z = findViewById != null && findViewById.getVisibility() == 0;
        this.an = z;
        this.ao = this.ao || z;
        if (!this.aw) {
            this.ag = this.ah.a && this.a.h();
        }
        if (!s()) {
            aI(false);
        }
        if (this.ao) {
            aH(aF(), true);
        }
        return this.e;
    }

    @Override // defpackage.gbk
    public final /* synthetic */ void n() {
        throw null;
    }

    public final gbd r() {
        return (gbd) mL().f("master_fragment_tag");
    }

    final boolean s() {
        return !this.an && this.ao;
    }
}

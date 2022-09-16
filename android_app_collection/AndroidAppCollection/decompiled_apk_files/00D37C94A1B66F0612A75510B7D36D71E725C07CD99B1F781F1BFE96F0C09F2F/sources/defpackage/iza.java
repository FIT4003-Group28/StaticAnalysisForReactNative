package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iza  reason: default package */
/* loaded from: classes3.dex */
public final class iza implements izq, nxg, izj, num, ynl {
    public final yni a;
    public final adoa b;
    public final iyq c;
    public final izr d;
    public final izb e;
    public final gbq f;
    public final oet g;
    public final nxh h;
    public final azqb i;
    public final azpx j;
    public final ayoi k;
    public int l;
    public final iyg m;
    public MdxWatchDrawerLayout n;
    public ViewGroup o;
    public boolean p;
    public final iyy q;
    public final iyz r;
    public final iyx s;
    private final Context t;
    private final izq u;
    private final nja v;
    private final fsc w;
    private final nwi x;

    public iza(Context context, yni yniVar, adoa adoaVar, azqb azqbVar, iyq iyqVar, izq izqVar, nja njaVar, fsc fscVar, izr izrVar, izb izbVar, gbq gbqVar, oet oetVar, nwi nwiVar, nxh nxhVar, azqb azqbVar2) {
        azpm aI = azpm.aI(Optional.empty());
        this.j = aI;
        this.k = aI.af(iyw.a);
        this.t = context;
        this.a = yniVar;
        this.b = adoaVar;
        this.c = iyqVar;
        this.u = izqVar;
        this.v = njaVar;
        this.w = fscVar;
        this.d = izrVar;
        this.e = izbVar;
        this.f = gbqVar;
        this.g = oetVar;
        this.x = nwiVar;
        this.h = nxhVar;
        this.i = azqbVar2;
        this.q = new iyy(this);
        this.r = new iyz(this);
        this.s = new iyx(this);
        this.m = (iyg) azqbVar.get();
        fscVar.b(fsb.MDX_QUEUE, ake.d(context, R.color.mdx_status_bar_color));
    }

    public final void b() {
        ViewGroup viewGroup = this.o;
        if (viewGroup == null) {
            return;
        }
        this.v.d(this.b.e() != null ? this.h.e() : false, viewGroup.getHeight());
    }

    @Override // defpackage.num
    public final void c(int i) {
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.n;
        if (mdxWatchDrawerLayout == null) {
            return;
        }
        int dimensionPixelOffset = i + this.t.getResources().getDimensionPixelOffset(R.dimen.mdx_queue_header_and_player_gap);
        View view = mdxWatchDrawerLayout.f;
        if (view == null || mdxWatchDrawerLayout.i == dimensionPixelOffset) {
            return;
        }
        view.setPaddingRelative(0, 0, 0, dimensionPixelOffset);
        int g = mdxWatchDrawerLayout.g(mdxWatchDrawerLayout.h, dimensionPixelOffset);
        mdxWatchDrawerLayout.i = dimensionPixelOffset;
        mdxWatchDrawerLayout.h();
        mdxWatchDrawerLayout.j(g, true);
    }

    public final void e(boolean z) {
        View findViewById;
        oeu oeuVar = this.g.a;
        if (oeuVar == null || (findViewById = ((DefaultWatchPanelViewController) oeuVar).n.findViewById(R.id.scrim_for_mdx_expanded_queue)) == null) {
            return;
        }
        findViewById.setVisibility(true != z ? 8 : 0);
    }

    public final void g(float f) {
        this.w.a(fsb.MDX_QUEUE, f);
    }

    @Override // defpackage.izj
    public final boolean h() {
        MdxWatchDrawerLayout mdxWatchDrawerLayout;
        return this.p && (mdxWatchDrawerLayout = this.n) != null && mdxWatchDrawerLayout.a().a();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((adlj) obj) != adlj.CONNECTED_ONLY) {
                    return null;
                }
                ps();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adlj.class};
    }

    @Override // defpackage.nxg
    public final void n(int i) {
        adnt e;
        if (i == 0 && (e = this.b.e()) != null && !e.v().isEmpty()) {
            nwi nwiVar = this.x;
            if (nwiVar.f && nwiVar.e.i.j == 1) {
                ((airr) nwiVar.c.get()).a();
                new AlertDialog.Builder(nwiVar.a).setTitle(R.string.mdx_floaty_bar_clear_queue_dialog_title).setMessage(R.string.mdx_floaty_bar_clear_queue_dialog_message).setPositiveButton(R.string.mdx_floaty_bar_clear_queue_dialog_confirm_button_text, new nwh(nwiVar, 1)).setNegativeButton(R.string.cancel, new nwh(nwiVar)).setCancelable(false).create().show();
            }
        }
        b();
    }

    @Override // defpackage.izq
    public final void ps() {
        this.u.ps();
    }

    @Override // defpackage.izq
    public final void pu(boolean z) {
        boolean z2 = z & (!h());
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.c();
        }
        this.u.pu(z2);
    }
}

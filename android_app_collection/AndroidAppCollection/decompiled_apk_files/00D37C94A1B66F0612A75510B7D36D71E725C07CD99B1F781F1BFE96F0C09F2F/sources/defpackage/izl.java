package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: izl  reason: default package */
/* loaded from: classes3.dex */
public final class izl extends ixt {
    public iza a;
    int b;

    @Override // defpackage.dp
    public final void mR() {
        super.mR();
        iza izaVar = this.a;
        if (!izaVar.p) {
            return;
        }
        izaVar.d.c(null);
        izaVar.b.i(izaVar.q);
        ViewGroup viewGroup = izaVar.o;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(izaVar.r);
        }
        MdxWatchDrawerLayout mdxWatchDrawerLayout = izaVar.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.a.remove(izaVar.s);
            izaVar.n.b = null;
        }
        izaVar.h.b(izaVar);
        izaVar.a.m(izaVar.c);
        iyq iyqVar = izaVar.c;
        if (iyqVar.o) {
            final iyn iynVar = iyqVar.s;
            if (iynVar != null) {
                iynVar.a.i(iynVar);
                iynVar.b.ifPresent(new Consumer() { // from class: iyl
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ((adnt) obj).N(iyn.this);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return consumer.getClass();
                    }
                });
            }
            ((adwt) iyqVar.c.get()).c(iyqVar);
            iyqVar.u.c();
            izu izuVar = iyqVar.d;
            boolean a = izuVar.a();
            izuVar.a = null;
            if (izuVar.a() != a) {
                izuVar.c();
            }
            iyqVar.m = null;
            iyqVar.n = null;
            iyqVar.q = null;
            iyqVar.p = null;
            iyqVar.r = null;
            iyqVar.s = null;
            iyqVar.o = false;
        }
        izaVar.a.m(izaVar);
        iyg iygVar = izaVar.m;
        if (iygVar.f) {
            ((adwt) iygVar.b.get()).c(iygVar);
            iygVar.d = null;
            iygVar.e = null;
            iygVar.f = false;
        }
        izaVar.g(0.0f);
        izaVar.p = false;
        izaVar.j.c(Optional.empty());
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_next_gen_fiji_watch, viewGroup, false);
        final iza izaVar = this.a;
        izaVar.l = this.b;
        if (!izaVar.p) {
            inflate.getClass();
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.mdx_next_gen_fiji_minibar);
            viewGroup2.getClass();
            izaVar.o = viewGroup2;
            izaVar.m.b(viewGroup2);
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.mdx_next_gen_fiji_remote_queue);
            viewGroup3.getClass();
            MdxWatchDrawerLayout mdxWatchDrawerLayout = (MdxWatchDrawerLayout) inflate.findViewById(R.id.mdx_next_gen_fiji_drawer_layout);
            mdxWatchDrawerLayout.getClass();
            izaVar.n = mdxWatchDrawerLayout;
            izaVar.c.a(viewGroup3);
            izaVar.a.g(izaVar);
            izaVar.a.g(izaVar.c);
            izaVar.b();
            oeu oeuVar = izaVar.g.a;
            if (oeuVar != null) {
                nun nunVar = ((DefaultWatchPanelViewController) oeuVar).h;
                izaVar.c(nunVar instanceof nuw ? ((nuw) nunVar).c() : -1);
            }
            izaVar.b.g(izaVar.q);
            viewGroup2.addOnLayoutChangeListener(izaVar.r);
            mdxWatchDrawerLayout.a.add(izaVar.s);
            mdxWatchDrawerLayout.b = izaVar.e;
            mdxWatchDrawerLayout.j = izaVar.l;
            ((nun) izaVar.i.get()).j(izaVar);
            izaVar.h.a(izaVar);
            izaVar.f.l(new gbp() { // from class: iyv
                @Override // defpackage.gbp
                public final void aI(gbr gbrVar) {
                    MdxWatchDrawerLayout mdxWatchDrawerLayout2;
                    iza izaVar2 = iza.this;
                    if (!izaVar2.p || (mdxWatchDrawerLayout2 = izaVar2.n) == null) {
                        return;
                    }
                    mdxWatchDrawerLayout2.c();
                }
            });
            izaVar.d.c(izaVar);
            izaVar.p = true;
            izaVar.j.c(Optional.of(mdxWatchDrawerLayout));
        }
        return inflate;
    }

    public final void o(int i) {
        this.b = i;
        iza izaVar = this.a;
        if (izaVar != null) {
            izaVar.l = i;
            MdxWatchDrawerLayout mdxWatchDrawerLayout = izaVar.n;
            if (mdxWatchDrawerLayout == null) {
                return;
            }
            mdxWatchDrawerLayout.j = i;
            if (mdxWatchDrawerLayout.getMeasuredHeight() == 0) {
                return;
            }
            if (mdxWatchDrawerLayout.k) {
                mdxWatchDrawerLayout.l = true;
                return;
            }
            mdxWatchDrawerLayout.k();
            mdxWatchDrawerLayout.requestLayout();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        iyq iyqVar = this.a.c;
    }
}

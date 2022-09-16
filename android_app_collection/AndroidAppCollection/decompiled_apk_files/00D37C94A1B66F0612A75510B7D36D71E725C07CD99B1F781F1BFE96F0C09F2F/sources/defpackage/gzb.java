package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: gzb  reason: default package */
/* loaded from: classes3.dex */
public final class gzb implements hap {
    public final gzf a;
    public final hba b;
    public final azpq c;
    public akgc d;
    public Long e = null;
    private final Context f;
    private final SortedMap g;

    public gzb(dp dpVar, Map map, gzf gzfVar, hba hbaVar) {
        this.f = dpVar.rg();
        this.a = gzfVar;
        TreeMap treeMap = new TreeMap();
        this.g = treeMap;
        treeMap.putAll(map);
        this.b = hbaVar;
        this.c = azpq.e();
    }

    @Override // defpackage.hap
    public final ayoi a() {
        return this.c.R();
    }

    @Override // defpackage.hap
    public final boolean b(axbm axbmVar, View view) {
        ylr.c();
        boolean z = false;
        if (this.g.isEmpty() || !axbmVar.y()) {
            akgc akgcVar = this.d;
            if (akgcVar == null) {
                return false;
            }
            if (akgcVar.i()) {
                c(true);
                return true;
            }
            zep.b("STooltipCntr: Unexpected - Tooltip is not null but it's not showing");
            return false;
        }
        if (this.d != null) {
            Long l = this.e;
            if (l == null || l.longValue() != axbmVar.e()) {
                c(false);
            } else {
                c(true);
                return true;
            }
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f).inflate(R.layout.shorts_edit_popup, (ViewGroup) null);
        final View g = hqs.g(this.f, view.getMeasuredWidth(), view.getMeasuredHeight(), ((ShortsPlayerView) view).g, axbmVar.g().e);
        akgc akgcVar2 = new akgc(viewGroup, g, 2, 2, 2, R.style.ShortsEditTooltip);
        this.d = akgcVar2;
        akgcVar2.d(false);
        for (Map.Entry entry : this.g.entrySet()) {
            if (((haz) entry.getValue()).b(axbmVar) && this.d != null) {
                viewGroup.addView(((haz) entry.getValue()).a(viewGroup, axbmVar, this.d));
                z = true;
            }
        }
        if (z) {
            this.e = Long.valueOf(axbmVar.e());
            final ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            viewGroup2.addView(g);
            akgc akgcVar3 = this.d;
            if (akgcVar3 != null) {
                akgcVar3.f(new akfz() { // from class: gyz
                    @Override // defpackage.akfz
                    public final void a(int i) {
                        gzb gzbVar = gzb.this;
                        ViewGroup viewGroup3 = viewGroup2;
                        View view2 = g;
                        gzbVar.d = null;
                        gzbVar.e = null;
                        if (i == 1) {
                            gzbVar.b.j(true);
                        }
                        viewGroup3.removeView(view2);
                        gzbVar.c.c(false);
                    }
                });
            }
            g.getViewTreeObserver().addOnGlobalLayoutListener(new gza(this, g, view));
        }
        return z;
    }

    @Override // defpackage.hap
    public final void c(boolean z) {
        akgc akgcVar = this.d;
        if (akgcVar == null || !akgcVar.i()) {
            return;
        }
        this.d.b(3);
        if (!z) {
            return;
        }
        this.b.j(false);
        this.a.f();
    }
}

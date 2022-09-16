package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: mcp  reason: default package */
/* loaded from: classes3.dex */
public class mcp implements fyq, ger, ynl {
    private static final long d = TimeUnit.MINUTES.toMillis(30);
    final mbs a;
    public Integer b = null;
    final mco c = new mco(this);
    private final mbw e;
    private final yni f;
    private final InlinePlaybackLifecycleController g;
    private final zah h;
    private final fyy i;
    private final RecyclerView j;
    private final ajsf k;
    private final ajqv l;

    public mcp(ScrollSelectionController scrollSelectionController, fyy fyyVar, mbw mbwVar, yni yniVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, zah zahVar, RecyclerView recyclerView, ajsf ajsfVar, ajqm ajqmVar, fgz fgzVar) {
        this.j = recyclerView;
        this.k = ajsfVar;
        this.l = new ajqv(ajqmVar, jny.p);
        this.a = new mbs(recyclerView, fgzVar, scrollSelectionController);
        this.i = fyyVar;
        this.e = mbwVar;
        this.f = yniVar;
        this.g = inlinePlaybackLifecycleController;
        this.h = zahVar;
    }

    public static boolean n(Object obj) {
        if (!eog.bo(obj)) {
            if (obj instanceof ajhh) {
                ajhh ajhhVar = (ajhh) obj;
                return ajhhVar.b() != null && ajhhVar.b().b;
            }
            return false;
        }
        return true;
    }

    private final int o() {
        Integer num = this.b;
        if (num == null || num.intValue() < 0) {
            return -1;
        }
        return this.b.intValue();
    }

    @Override // defpackage.fyq
    public final View a() {
        return this.j;
    }

    @Override // defpackage.fyq
    public void b() {
        int o;
        View view;
        LinearLayoutManager linearLayoutManager;
        int J2;
        long a = this.h.a();
        if ((a <= 0 || a <= d) && (o = o()) != -1) {
            int b = this.k.b();
            int i = o + 1;
            while (i < b && !n(this.k.getItem(i))) {
                i++;
            }
            if (i >= b) {
                return;
            }
            xw xwVar = this.j.n;
            if ((xwVar instanceof LinearLayoutManager) && (J2 = (linearLayoutManager = (LinearLayoutManager) xwVar).J()) != -1 && (i != J2 || i != linearLayoutManager.I())) {
                this.a.d = true;
                this.j.al(i);
            }
            ScrollSelectionController scrollSelectionController = this.a.c;
            ges gesVar = scrollSelectionController.a;
            if (gesVar == null) {
                return;
            }
            Iterator it = gesVar.a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                view = (View) it.next();
                int c = gesVar.c(view);
                if (c >= 0 && c == i) {
                    break;
                }
            }
            scrollSelectionController.p(new Pair(view, Integer.valueOf(i)), true, true);
        }
    }

    @Override // defpackage.fyq
    public void c(boolean z) {
        this.i.n(z);
        if (z) {
            this.f.g(this);
            mbs mbsVar = this.a;
            this.k.g(mbsVar.c);
            mbsVar.a.aE(mbsVar);
            mbsVar.b.a.add(mbsVar);
            return;
        }
        this.f.m(this);
        mbw mbwVar = this.e;
        mbwVar.i();
        mbwVar.d = null;
        mbs mbsVar2 = this.a;
        this.k.i(mbsVar2.c);
        mbsVar2.a.aG(mbsVar2);
        mbsVar2.b.a.remove(mbsVar2);
        mbsVar2.a.removeCallbacks(new mbr(mbsVar2));
    }

    @Override // defpackage.fyq
    public final void d() {
        this.j.ab(o());
    }

    @Override // defpackage.fyq
    public final void e() {
    }

    @Override // defpackage.fyq
    public final boolean g() {
        return !this.l.isEmpty();
    }

    @Override // defpackage.fyq
    public final void h() {
    }

    @Override // defpackage.ger
    public final int i() {
        for (int i = 0; i < this.k.b(); i++) {
            if (n(this.k.getItem(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ger
    public int j() {
        return 1;
    }

    @Override // defpackage.ger
    public final RecyclerView k() {
        return this.j;
    }

    public Class[] ky(Class cls, Object obj, int i) {
        return mix.f(this, obj, i);
    }

    @Override // defpackage.ger
    public final mco l() {
        return this.c;
    }

    public final void m(isw iswVar) {
        if (eog.bo(iswVar.h())) {
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.g;
            ggz bm = eog.bm(iswVar.h());
            aypg aypgVar = inlinePlaybackLifecycleController.b;
            if (aypgVar != null && !aypgVar.e()) {
                ayqi.c((AtomicReference) inlinePlaybackLifecycleController.b);
            }
            inlinePlaybackLifecycleController.b = inlinePlaybackLifecycleController.i(bm).S(fzb.b, fzc.a);
        }
    }
}

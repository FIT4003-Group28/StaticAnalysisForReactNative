package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hbv  reason: default package */
/* loaded from: classes3.dex */
public final class hbv implements View.OnClickListener, hci, gzg {
    public final hct a;
    public final azpq b = azpq.e();
    public final azqb c;
    public final azqb d;
    public final hkl e;
    public LinearLayoutManager f;
    public yk g;
    private final azqb h;
    private final ypf i;
    private final ayor j;
    private final acti k;
    private View l;
    private gzh m;
    private gyq n;
    private acti o;
    private aypg p;

    public hbv(hct hctVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, acti actiVar, ypf ypfVar, ayor ayorVar, hkl hklVar) {
        this.a = hctVar;
        this.c = azqbVar;
        this.h = azqbVar2;
        this.d = azqbVar3;
        this.i = ypfVar;
        this.j = ayorVar;
        this.k = actiVar;
        this.e = hklVar;
    }

    @Override // defpackage.hci
    public final gyq a() {
        return this.n;
    }

    @Override // defpackage.hci
    public final acti b() {
        return this.o;
    }

    @Override // defpackage.hci
    public final ayoi c() {
        return this.b.R();
    }

    @Override // defpackage.hci
    public final void d() {
        this.m.c();
        this.n.c(acuo.a(116646)).a();
        aypg aypgVar = this.p;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.p = null;
        }
    }

    @Override // defpackage.hci
    public final void e(View view, acti actiVar) {
        this.m = new gzh(view, this);
        this.e.o();
        View findViewById = view.findViewById(R.id.shorts_edit_timeline_button);
        this.l = findViewById;
        findViewById.setOnClickListener(this);
        this.n = new gyq(this.k);
        this.o = actiVar;
    }

    @Override // defpackage.hci
    public final void f(actj actjVar) {
        this.n.a(actjVar).b();
    }

    @Override // defpackage.hci
    public final void g(long j, actj actjVar) {
        h(j, actjVar != null ? gyq.d(this.o, apzg.a, actjVar.II) : null);
    }

    @Override // defpackage.hci
    public final void h(final long j, apzg apzgVar) {
        if (j != Long.MIN_VALUE) {
            this.p = ((hcy) this.d.get()).b().ag(1L).X(this.j).q(zna.t(this.i.a())).as(new ayqb() { // from class: hbt
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    hcx hcxVar = (hcx) obj;
                    hbv.this.i(j);
                }
            });
        } else {
            LinearLayoutManager linearLayoutManager = this.f;
            if (linearLayoutManager != null) {
                linearLayoutManager.Z(0);
            }
        }
        final hcy hcyVar = (hcy) this.d.get();
        hcyVar.b.clear();
        hcyVar.d.i(new zqx() { // from class: hcw
            @Override // defpackage.zqx
            public final void a(File file, axbw axbwVar) {
                hcy hcyVar2 = hcy.this;
                if (axbwVar != null && axbwVar.a() > 0) {
                    ArrayList<axbm> arrayList = new ArrayList(axbwVar.e());
                    Collections.sort(arrayList, fay.c);
                    for (axbm axbmVar : arrayList) {
                        Iterator it = ((Set) hcyVar2.a.get()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                hdb hdbVar = (hdb) it.next();
                                if (hdbVar.b(axbmVar)) {
                                    hcyVar2.b.add(hdbVar.a(axbmVar));
                                    break;
                                }
                            }
                        }
                    }
                }
                hcyVar2.c.c(new hcx());
            }
        });
        gzh gzhVar = this.m;
        ViewGroup viewGroup = gzhVar.a;
        if (gzhVar.d == null) {
            gzg gzgVar = gzhVar.b;
            View findViewById = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.timeline, gzhVar.a, false).findViewById(R.id.timeline_root);
            RecyclerView recyclerView = (RecyclerView) findViewById.findViewById(R.id.tracks_list);
            recyclerView.af(null);
            findViewById.getContext();
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1);
            hbv hbvVar = (hbv) gzgVar;
            hbvVar.f = linearLayoutManager2;
            linearLayoutManager2.r(true);
            hbvVar.f.n = true;
            hbvVar.g = new hbu(recyclerView.getContext());
            recyclerView.ag(hbvVar.f);
            recyclerView.ad((xo) hbvVar.c.get());
            recyclerView.setImportantForAccessibility(2);
            if (hbvVar.e.m()) {
                new abh(new hcu((hcy) hbvVar.d.get())).h(recyclerView);
            }
            hct hctVar = hbvVar.a;
            hci hciVar = (hci) hctVar.a.get();
            hciVar.getClass();
            gzf gzfVar = (gzf) hctVar.b.get();
            gzfVar.getClass();
            ypf ypfVar = (ypf) hctVar.c.get();
            ((tmn) hctVar.d.get()).getClass();
            ((tmm) hctVar.e.get()).getClass();
            ((tme) hctVar.f.get()).getClass();
            hkl hklVar = (hkl) hctVar.g.get();
            hklVar.getClass();
            findViewById.getClass();
            new hcs(hciVar, gzfVar, ypfVar, hklVar, findViewById);
            gzhVar.d = findViewById;
        }
        if (gzhVar.d.getParent() != null) {
            ((ViewGroup) gzhVar.d.getParent()).removeView(gzhVar.d);
        }
        viewGroup.addView(gzhVar.d, 0);
        gzhVar.d(true);
        gzf gzfVar2 = (gzf) this.h.get();
        gzfVar2.g(0L);
        gzfVar2.e();
        gyp c = this.n.c(acuo.a(116646));
        c.a = apzgVar;
        c.b();
        gyo a = this.n.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_PLAYBACK_BUTTON);
        a.h(true);
        a.a();
        gyo a2 = this.n.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_ADD_TRACK_BUTTON);
        a2.h(true);
        a2.a();
        gyo a3 = this.n.a(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_DONE_BUTTON);
        a3.h(true);
        a3.a();
    }

    @Override // defpackage.hci
    public final void i(long j) {
        yk ykVar;
        if (j == Long.MIN_VALUE || (ykVar = this.g) == null || this.f == null) {
            return;
        }
        int b = ((ajsf) this.c.get()).b();
        while (true) {
            b--;
            if (b < 0) {
                b = 0;
                break;
            } else if (((ajsf) this.c.get()).mp(b) == j) {
                break;
            }
        }
        ykVar.b = b;
        this.f.bd(this.g);
    }

    @Override // defpackage.hci
    public final boolean j() {
        int i;
        gzh gzhVar = this.m;
        return gzhVar == null || (i = gzhVar.c.t) == 5 || i == 4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.l) {
            g(Long.MIN_VALUE, actj.SHORTS_EDITOR_TIMELINE_ENTRY_BUTTON);
        }
    }
}

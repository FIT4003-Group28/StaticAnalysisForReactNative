package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: oeq  reason: default package */
/* loaded from: classes3.dex */
public final class oeq {
    public final ajsf a;
    public final Map b;
    public final fjk c;
    public final oep d;
    public ajsm e;
    public oes f;
    public boolean g;
    public int h;
    private final yni i;
    private final yzj j;
    private final acti k;
    private final aari l;
    private RecyclerView m;
    private LoadingFrameLayout n;
    private boolean o;

    public oeq(yni yniVar, aafo aafoVar, abeb abebVar, yzj yzjVar, ajsg ajsgVar, ajsi ajsiVar, acti actiVar) {
        this.i = yniVar;
        this.j = yzjVar;
        this.l = abebVar;
        actiVar.getClass();
        this.k = actiVar;
        this.d = new oep();
        ajsf a = ajsgVar.a(ajsiVar);
        this.a = a;
        a.rZ(new ajrc(actiVar));
        a.rZ(new ajqt(aafoVar));
        a.rZ(new ajrt() { // from class: oel
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                ajrsVar.f("PLAYLIST_CURRENT_VIDEO_MONITOR", oeq.this.d);
            }
        });
        this.b = new HashMap();
        fjk fjkVar = new fjk();
        this.c = fjkVar;
        a.h(fjkVar.a);
        this.g = false;
    }

    private final void g() {
        if (this.g) {
            return;
        }
        if (this.n == null) {
            zep.l("loadingFrame is not initialized. Will not display the playlist.");
            return;
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            zep.l("recyclerView is not initialized. Will not display the playlist.");
            return;
        }
        this.c.b(ajqr.a);
        this.a.mr();
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        this.f = new oes(this.l, this.i, yni.c(), this.j, this.k, ajsmVar);
        recyclerView.aE(new oeo(this));
        this.g = true;
    }

    public final void a() {
        if (!this.g) {
            return;
        }
        LoadingFrameLayout loadingFrameLayout = this.n;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
        ajsm ajsmVar = this.e;
        if (ajsmVar != null) {
            ajsmVar.clear();
        }
        oes oesVar = this.f;
        if (oesVar != null) {
            oesVar.A();
        }
        this.b.clear();
        this.o = true;
    }

    public final void b(int i, boolean z) {
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            return;
        }
        int max = Math.max(this.c.a(i) - 1, 0);
        xw xwVar = recyclerView.n;
        if (!(xwVar instanceof LinearLayoutManager)) {
            return;
        }
        if (z) {
            new yl();
            xwVar.ao(recyclerView, max);
            return;
        }
        ((LinearLayoutManager) xwVar).aa(max, 0);
    }

    public final void c(Object obj) {
        this.c.d(obj);
    }

    public final void d(LoadingFrameLayout loadingFrameLayout) {
        loadingFrameLayout.getClass();
        this.n = loadingFrameLayout;
    }

    public final void e(audg audgVar) {
        if (audgVar == null) {
            return;
        }
        g();
        ajsm ajsmVar = this.e;
        if (ajsmVar != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (audf audfVar : audgVar.i) {
                int i2 = audfVar.b;
                if ((i2 & 1) != 0) {
                    audk audkVar = audfVar.c;
                    if (audkVar == null) {
                        audkVar = audk.a;
                    }
                    arrayList.add(audkVar);
                    audk audkVar2 = audfVar.c;
                    if (audkVar2 == null) {
                        audkVar2 = audk.a;
                    }
                    String str = audkVar2.o;
                    this.b.put(str, Integer.valueOf(i));
                    audk audkVar3 = audfVar.c;
                    if (audkVar3 == null) {
                        audkVar3 = audk.a;
                    }
                    if (audkVar3.k) {
                        this.d.a(str);
                    }
                } else if ((i2 & 128) != 0) {
                    audh audhVar = audfVar.e;
                    if (audhVar == null) {
                        audhVar = audh.a;
                    }
                    arrayList.add(new krq(audhVar));
                }
                i++;
            }
            ajsmVar.p(arrayList);
            ajsm ajsmVar2 = this.e;
            ArrayList arrayList2 = new ArrayList();
            for (audf audfVar2 : audgVar.i) {
                if ((audfVar2.b & 32) != 0) {
                    audd auddVar = audfVar2.d;
                    if (auddVar == null) {
                        auddVar = audd.a;
                    }
                    arrayList2.add(auddVar);
                }
            }
            ajsmVar2.addAll(arrayList2);
            ajsm ajsmVar3 = this.e;
            if (ajsmVar3 != null) {
                g();
                this.c.b(ajsmVar3);
                this.a.mr();
                LoadingFrameLayout loadingFrameLayout = this.n;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.a();
                }
            }
        }
        oes oesVar = this.f;
        if (oesVar != null) {
            oesVar.c(abgc.b(audgVar));
        }
        if (!this.o) {
            return;
        }
        this.o = false;
        Integer num = (Integer) this.b.get(this.d.a);
        if (num == null) {
            return;
        }
        b(num.intValue(), false);
    }

    public final void f(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.m = recyclerView;
        recyclerView.ad(this.a);
        recyclerView.getContext();
        recyclerView.ag(new oen());
        this.a.mr();
    }
}

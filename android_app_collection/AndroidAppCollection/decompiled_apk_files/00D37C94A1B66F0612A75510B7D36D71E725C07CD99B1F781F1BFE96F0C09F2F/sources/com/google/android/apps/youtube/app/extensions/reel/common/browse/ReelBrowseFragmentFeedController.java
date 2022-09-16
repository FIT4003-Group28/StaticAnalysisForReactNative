package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelBrowseFragmentFeedController implements f, ynl {
    public final acth a;
    public final yni b;
    public final nik c;
    public final SfvAudioItemPlaybackController d;
    public final frv e = new hui(1);
    public fsv f;
    public nij g;
    private final ajsg h;
    private final aath i;
    private final yzj j;
    private final aynx k;
    private final ajyi l;
    private final ajyx m;
    private final aadd n;
    private final akar o;
    private final gew p;
    private final ajpa q;
    private final tdu r;

    public ReelBrowseFragmentFeedController(acth acthVar, ajsg ajsgVar, yni yniVar, aath aathVar, yzj yzjVar, aadd aaddVar, aynx aynxVar, ajyi ajyiVar, akar akarVar, ajyx ajyxVar, nik nikVar, SfvAudioItemPlaybackController sfvAudioItemPlaybackController, gew gewVar, ajpa ajpaVar, tdu tduVar) {
        this.a = acthVar;
        this.h = ajsgVar;
        this.b = yniVar;
        this.i = aathVar;
        this.j = yzjVar;
        this.n = aaddVar;
        this.k = aynxVar;
        this.l = ajyiVar;
        this.o = akarVar;
        this.m = ajyxVar;
        this.c = nikVar;
        this.d = sfvAudioItemPlaybackController;
        this.p = gewVar;
        this.q = ajpaVar;
        this.r = tduVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ajsa] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Object, ajsa] */
    public final void g(Context context, List list, guu guuVar) {
        int i;
        int i2;
        RecyclerView recyclerView;
        View view;
        guv guvVar;
        aaky aakyVar;
        ajzq ajzqVar;
        List list2 = list;
        guu guuVar2 = guuVar;
        this.g.k();
        akaq a = this.o.a(this.i, this.a.oi());
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            aaky aakyVar2 = (aaky) list2.get(i3);
            int i5 = true == aakyVar2.a.f ? i3 : i4;
            aaky aakyVar3 = (aaky) list2.get(i3);
            guv guvVar2 = guuVar2 != null ? (guv) guuVar2.a.get(aakyVar2) : null;
            View inflate = LayoutInflater.from(context).inflate(R.layout.reel_section_list, (ViewGroup) null);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.section_list);
            recyclerView2.ag(linearLayoutManager);
            auuw auuwVar = this.n.a().z;
            if (auuwVar == null) {
                auuwVar = auuw.a;
            }
            if (auuwVar.u) {
                recyclerView = recyclerView2;
                view = inflate;
                guvVar = guvVar2;
                i2 = i3;
                aakyVar = aakyVar3;
                ajzqVar = this.p.a(guvVar2 != null ? guvVar2.a : null, this.q, recyclerView2, this.i, a, this.a.oi(), this.l.get(), akai.Ws, ajzs.d, ajkb.SHORTS, this.r, context);
            } else {
                i2 = i3;
                recyclerView = recyclerView2;
                view = inflate;
                guvVar = guvVar2;
                aakyVar = aakyVar3;
                ajzqVar = new ajzq(guvVar != null ? guvVar.a : null, recyclerView, this.h, this.m, this.i, this.b, a, this.j, this.a.oi(), this.l.get(), akai.Ws, ajzs.d, this.n, this.k);
            }
            ajsm ajsmVar = new ajsm();
            avfo avfoVar = aakyVar.a;
            if ((avfoVar.b & 2048) != 0) {
                avfm avfmVar = avfoVar.i;
                if (avfmVar == null) {
                    avfmVar = avfm.a;
                }
                ajsmVar.add(avfmVar);
            }
            ajzqVar.J(ajsmVar);
            if (guvVar != null) {
                recyclerView.n.Y(guvVar.b);
                ajzqVar.c();
            } else {
                ajzqVar.T(aakyVar.a());
            }
            arrayList.add(new nii(avfoVar, view, ajzqVar, null));
            i3 = i2 + 1;
            list2 = list;
            guuVar2 = guuVar;
            i4 = i5;
        }
        guu guuVar3 = guuVar2;
        if (guuVar3 != null && (i = guuVar3.c) != -1) {
            i4 = i;
        }
        this.g.m(this.f, arrayList, i4);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aawe aaweVar = (aawe) obj;
                for (nii niiVar : this.g.i()) {
                    if (akzj.i("SFV_AUDIO_PICKER_SAVED_TAB", niiVar.a.c)) {
                        niiVar.c.l();
                    }
                }
                if (!akzj.i("SFV_AUDIO_PICKER_SAVED_TAB", ((nii) this.g.i().get(this.g.a())).a.c)) {
                    return null;
                }
                this.d.j();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aawe.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        nij nijVar = this.g;
        if (nijVar != null) {
            nijVar.j();
        }
        this.b.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}

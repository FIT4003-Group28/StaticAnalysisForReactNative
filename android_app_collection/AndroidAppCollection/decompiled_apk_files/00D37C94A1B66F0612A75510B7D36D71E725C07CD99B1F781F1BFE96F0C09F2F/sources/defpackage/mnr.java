package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: mnr  reason: default package */
/* loaded from: classes3.dex */
public final class mnr extends ajsl {
    final RecyclerView a;
    private final Context b;
    private final ajrx c;
    private final gtb d;
    private final ajsm e;
    private final ajsf f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ajsa] */
    public mnr(Context context, gem gemVar, ajyi ajyiVar, ajsg ajsgVar) {
        this.b = context;
        this.c = gemVar;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.reels_grid, (ViewGroup) null);
        this.a = recyclerView;
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        recyclerView.ag(new GridLayoutManager(g(), null));
        ajsf a = ajsgVar.a(ajyiVar.get());
        this.f = a;
        a.h(ajsmVar);
        recyclerView.ad(a);
        gtb gtbVar = new gtb();
        this.d = gtbVar;
        a.rZ(gtbVar);
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mnp
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                mnr.this.f();
            }
        });
        gemVar.c(recyclerView);
        recyclerView.setFocusable(false);
    }

    private final int g() {
        return this.b.getResources().getInteger(R.integer.reel_grid_column_count);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        aulc aulcVar = (aulc) obj;
        f();
        this.f.rZ(new ajrc(ajrsVar.a));
        final Object c = ajrsVar.c("sectionListController");
        if (c != null) {
            this.f.rZ(new ajrt() { // from class: mnq
                @Override // defpackage.ajrt
                public final void a(ajrs ajrsVar2, ajqm ajqmVar, int i) {
                    ajrsVar2.f("sectionListController", c);
                }
            });
        }
        this.e.clear();
        ArrayList arrayList = new ArrayList();
        for (aunb aunbVar : aulcVar.b) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = aunbVar.qn(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) ? (ReelItemRendererOuterClass$ReelItemRenderer) aunbVar.qm(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) : null;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                this.e.add(reelItemRendererOuterClass$ReelItemRenderer);
                apzg apzgVar = reelItemRendererOuterClass$ReelItemRenderer.m;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    apzg apzgVar2 = reelItemRendererOuterClass$ReelItemRenderer.m;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    arrayList.add(apzgVar2);
                }
            }
        }
        this.d.a = new ReelToReelList(Collections.unmodifiableList(arrayList));
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aulc) obj).c.I();
    }

    public final void f() {
        int g = g();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a.n;
        if (gridLayoutManager.b != g) {
            gridLayoutManager.q(g);
            this.a.ag(gridLayoutManager);
        }
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.clear();
        this.d.b();
    }
}

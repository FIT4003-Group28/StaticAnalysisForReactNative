package com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainAppPlayerOverlayDataProvider implements f {
    private final fgc f;
    private final airw g;
    private final kfb h;
    private final tdb j;
    private final DisplayMetrics k;
    private final View l;
    private View.OnLayoutChangeListener m;
    private aypg n;
    public boolean b = false;
    public boolean c = false;
    public final Rect a = new Rect();
    public String d = null;
    public int e = 1;
    private final aypf i = new aypf();

    public MainAppPlayerOverlayDataProvider(Context context, tdb tdbVar, YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, fgc fgcVar, airw airwVar, kfb kfbVar) {
        this.j = tdbVar;
        this.k = context.getResources().getDisplayMetrics();
        this.l = youTubePlayerOverlaysLayout;
        this.f = fgcVar;
        this.g = airwVar;
        this.h = kfbVar;
    }

    private static int h(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public final void g() {
        int i;
        tdb tdbVar = this.j;
        DisplayMetrics displayMetrics = this.k;
        View view = this.l;
        Rect rect = this.a;
        int i2 = this.e;
        String str = this.d;
        boolean z = this.b;
        boolean z2 = this.c;
        int i3 = 0;
        if (view != null) {
            i3 = h(displayMetrics, view.getWidth());
            i = h(displayMetrics, view.getHeight());
        } else {
            i = 0;
        }
        aopa createBuilder = asxs.a.createBuilder();
        createBuilder.copyOnWrite();
        asxs asxsVar = (asxs) createBuilder.instance;
        asxsVar.b |= 1;
        asxsVar.c = i3;
        createBuilder.copyOnWrite();
        asxs asxsVar2 = (asxs) createBuilder.instance;
        asxsVar2.b |= 2;
        asxsVar2.d = i;
        int h = h(displayMetrics, rect.left);
        createBuilder.copyOnWrite();
        asxs asxsVar3 = (asxs) createBuilder.instance;
        asxsVar3.b |= 4;
        asxsVar3.e = h;
        int h2 = h(displayMetrics, rect.right);
        createBuilder.copyOnWrite();
        asxs asxsVar4 = (asxs) createBuilder.instance;
        asxsVar4.b |= 8;
        asxsVar4.f = h2;
        int h3 = h(displayMetrics, rect.top);
        createBuilder.copyOnWrite();
        asxs asxsVar5 = (asxs) createBuilder.instance;
        asxsVar5.b |= 16;
        asxsVar5.g = h3;
        int h4 = h(displayMetrics, rect.bottom);
        createBuilder.copyOnWrite();
        asxs asxsVar6 = (asxs) createBuilder.instance;
        asxsVar6.b |= 32;
        asxsVar6.h = h4;
        createBuilder.copyOnWrite();
        asxs asxsVar7 = (asxs) createBuilder.instance;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        asxsVar7.i = i4;
        asxsVar7.b |= 128;
        createBuilder.copyOnWrite();
        asxs asxsVar8 = (asxs) createBuilder.instance;
        asxsVar8.b |= 1024;
        asxsVar8.l = z;
        createBuilder.copyOnWrite();
        asxs asxsVar9 = (asxs) createBuilder.instance;
        asxsVar9.b |= 512;
        asxsVar9.k = z2;
        if (str != null) {
            createBuilder.copyOnWrite();
            asxs asxsVar10 = (asxs) createBuilder.instance;
            asxsVar10.b |= 256;
            asxsVar10.j = str;
        }
        tdbVar.b("/youtube/app/player_overlay", ((asxs) createBuilder.mo39build()).toByteArray());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.n = this.f.a.Z(new fjj(this, 1));
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: fji
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider = MainAppPlayerOverlayDataProvider.this;
                if (Math.abs(i8 - i6) == Math.abs(i4 - i2) && Math.abs(i7 - i5) == Math.abs(i3 - i)) {
                    return;
                }
                mainAppPlayerOverlayDataProvider.g();
            }
        };
        this.m = onLayoutChangeListener;
        this.l.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.l.removeOnLayoutChangeListener(this.m);
        azof.f((AtomicReference) this.n);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.i.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.i.g(this.g.ae(fcq.l, fcq.m).h(aiwv.l(1)).aa(new fjj(this, 2), dzq.o), this.h.c.as(new fjj(this)));
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import com.google.geo.imagery.viewer.api.Renderer;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: bwve  reason: default package */
/* loaded from: classes4.dex */
public final class bwve implements bwvf {
    public final bnsq a;
    public final dfuh b;
    public final dfrr c;
    public final bwuj d;
    public final Renderer e;
    public final bwuw j;
    private final bwzi l;
    private final dfum m;
    public dftd f = dftd.d;
    @dzsi
    public Runnable g = null;
    @dzsi
    public Runnable h = null;
    public final dhjw i = dhjx.f.bZ();
    public bwvd k = new bwvd(this);

    public bwve(Context context, bnsq bnsqVar, bvrb bvrbVar, ckcw ckcwVar, duux duuxVar, amfi amfiVar, buti butiVar) {
        bwva bwvaVar = new bwva(bnsqVar);
        this.b = bwvaVar;
        bwzi bwziVar = new bwzi(ckcwVar);
        this.l = bwziVar;
        dfrr dfrrVar = new dfrr(context, bwvaVar, Collections.emptyList());
        this.c = dfrrVar;
        this.d = new bwuj(dfrrVar);
        this.a = bnsqVar;
        Resources resources = context.getResources();
        dfum dfumVar = new dfum(bwvaVar, resources);
        this.m = dfumVar;
        dfumVar.setPhotoAOpacity(1.0f);
        dfumVar.setPhotoBOpacity(1.0f);
        dfumVar.setRoadLabelOpacity(0.0f);
        dfumVar.setUiNavArrowOpacity(0.0f);
        dfumVar.setUiSwipeRailOpacity(0.0f);
        bwuw bwuwVar = new bwuw(bwvaVar, bvrbVar, duuxVar, amfiVar, bwziVar, resources, butiVar, false);
        this.j = bwuwVar;
        this.e = Renderer.b(bwuwVar, false);
    }

    @Override // defpackage.bnst
    public final void d() {
        this.e.c();
    }

    @Override // defpackage.bnst
    public final void e(int i, int i2) {
        this.c.d(i, i2);
    }

    @Override // defpackage.bnst
    public final boolean f() {
        bwzi bwziVar = this.l;
        if (!bwziVar.d) {
            bwziVar.d = true;
            bwziVar.a.b();
        }
        bwziVar.b.a();
        GLES20.glClear(16384);
        this.e.d(this.c.e, this.m.a());
        this.l.b.b();
        Runnable runnable = this.h;
        if (runnable != null) {
            this.h = null;
            this.a.post(new bwuz(runnable));
        }
        return true;
    }

    @Override // defpackage.bnst
    public final void g() {
    }

    @Override // defpackage.bnst
    public final void h() {
    }
}

package defpackage;

import com.google.android.apps.gmm.streetview.model.UserOrientation;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.RendererSwigJNI;
/* compiled from: PG */
/* renamed from: bxbm  reason: default package */
/* loaded from: classes4.dex */
final class bxbm implements dfqt {
    final /* synthetic */ bxbs a;

    public bxbm(bxbs bxbsVar) {
        this.a = bxbsVar;
    }

    @Override // defpackage.dfqt
    public final void a() {
        dfqt dfqtVar = this.a.s;
        if (dfqtVar != null) {
            dfqtVar.a();
        }
    }

    @Override // defpackage.dfqt
    public final void b(dfuj<?> dfujVar, float f) {
        dfqt dfqtVar = this.a.s;
        if (dfqtVar != null) {
            dfqtVar.b(dfujVar, f);
        }
        this.a.o.a(dfujVar.a);
        bxbs bxbsVar = this.a;
        dhjz dhjzVar = bxbsVar.v;
        if (dhjzVar != null) {
            dhjz dhjzVar2 = bxbsVar.l().b;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            float h = akqo.h(akqq.j(dhjzVar2), akqq.j(dhjzVar));
            dhkb dhkbVar = dfujVar.a.d;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            bxbsVar.setOrientation(h, dhkbVar.c);
            this.a.v = null;
        }
        bxbs bxbsVar2 = this.a;
        UserOrientation userOrientation = bxbsVar2.w;
        if (userOrientation != null) {
            bxbsVar2.o.i(userOrientation.a, userOrientation.b());
            if (!this.a.o.c()) {
                this.a.o.f(userOrientation.b);
            }
            this.a.w = null;
        }
        bxbs bxbsVar3 = this.a;
        bxbsVar3.r.a(bxbsVar3.l());
        btrm btrmVar = this.a.e;
        Object obj = dfujVar.b;
        dbsk.s(obj);
        btrmVar.b(obj);
    }

    @Override // defpackage.dfqt
    public final void c(int i, dhjz dhjzVar) {
        dfua dfuaVar = this.a.j.b;
        if (dfuaVar != null) {
            synchronized (dfuaVar.b) {
                Renderer renderer = dfuaVar.a;
                if (renderer != null) {
                    RendererSwigJNI.Renderer_clearRouteArrow(renderer.a, renderer);
                }
            }
        }
        dfqt dfqtVar = this.a.s;
        if (dfqtVar != null) {
            dfqtVar.c(i, dhjzVar);
        }
    }
}

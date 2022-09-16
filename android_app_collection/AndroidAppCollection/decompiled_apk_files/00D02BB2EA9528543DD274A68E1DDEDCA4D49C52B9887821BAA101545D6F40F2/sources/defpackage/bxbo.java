package defpackage;

import com.google.geo.imagery.viewer.api.IconRenderer;
import com.google.geo.imagery.viewer.api.IconService;
import com.google.geo.imagery.viewer.api.Renderer;
import com.google.geo.imagery.viewer.api.SchedulingService;
import com.google.geo.imagery.viewer.api.TextService;
import com.google.geo.imagery.viewer.api.TileService;
/* compiled from: PG */
/* renamed from: bxbo  reason: default package */
/* loaded from: classes4.dex */
final class bxbo implements Runnable {
    final /* synthetic */ bxbs a;

    public bxbo(bxbs bxbsVar) {
        this.a = bxbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bxbs bxbsVar = this.a;
        bwvl bwvlVar = bxbsVar.p;
        if (bwvlVar != null) {
            bwvlVar.d = null;
        }
        dfqu dfquVar = bxbsVar.k;
        if (dfquVar != null) {
            synchronized (dfquVar.f) {
                for (dfqz dfqzVar : dfquVar.f) {
                    dfqzVar.d();
                }
                dfquVar.f.clear();
            }
            this.a.k.j = null;
        }
        bxbs bxbsVar2 = this.a;
        dfrh dfrhVar = bxbsVar2.l;
        if (dfrhVar != null) {
            dfrhVar.f = null;
            dfrhVar.h.d = null;
        }
        dfuo dfuoVar = bxbsVar2.n;
        if (dfuoVar != null) {
            dfuoVar.a = null;
        }
        bwux bwuxVar = bxbsVar2.j;
        if (bwuxVar != null) {
            dfua dfuaVar = bwuxVar.b;
            if (dfuaVar != null) {
                synchronized (dfuaVar.b) {
                    Renderer renderer = dfuaVar.a;
                    if (renderer != null) {
                        renderer.a();
                        dfuaVar.a = null;
                    }
                }
                bwuxVar.b = null;
            }
            dftz dftzVar = bwuxVar.c;
            if (dftzVar != null) {
                synchronized (dftzVar.b) {
                    IconRenderer iconRenderer = dftzVar.a;
                    if (iconRenderer != null) {
                        iconRenderer.a();
                        dftzVar.a = null;
                    }
                }
                bwuxVar.c = null;
            }
        }
        bwuw bwuwVar = this.a.i;
        if (bwuwVar != null) {
            SchedulingService schedulingService = bwuwVar.e;
            if (schedulingService != null) {
                schedulingService.delete();
            }
            TextService textService = bwuwVar.c;
            if (textService != null) {
                textService.delete();
            }
            TileService tileService = bwuwVar.d;
            if (tileService != null) {
                tileService.delete();
            }
            IconService iconService = bwuwVar.b;
            if (iconService != null) {
                iconService.delete();
            }
            bwuwVar.delete();
            bwuwVar.e = null;
            bwuwVar.c = null;
            bwuwVar.d = null;
            bwuwVar.b = null;
        }
    }
}

package defpackage;

import com.google.geo.imagery.viewer.api.IconRenderer;
import com.google.geo.imagery.viewer.api.IconRendererSwigJNI;
import com.google.geo.imagery.viewer.api.Renderer;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bwux  reason: default package */
/* loaded from: classes4.dex */
public final class bwux implements bnst {
    public final dfum a;
    @dzsi
    public dfua b;
    @dzsi
    public dftz c;
    private final dfrr d;
    private final Runnable e;
    private final dbsz<dftp> f;
    @dzsi
    private dftp g = null;
    private final AtomicInteger h = new AtomicInteger(10);

    public bwux(bwuw bwuwVar, dfrr dfrrVar, dfum dfumVar, Runnable runnable, dbsz<dftp> dbszVar, boolean z) {
        this.d = dfrrVar;
        this.a = dfumVar;
        this.e = runnable;
        this.f = dbszVar;
        this.b = dfua.a(bwuwVar, z);
        this.c = dftz.a(bwuwVar);
    }

    public final void a() {
        b(1);
    }

    public final void b(int i) {
        this.h.addAndGet(Math.max(i - this.h.get(), 0));
    }

    @Override // defpackage.bnst
    public final void e(int i, int i2) {
        this.d.d(i, i2);
        a();
    }

    @Override // defpackage.bnst
    public final boolean f() {
        byte[] bArr;
        dftp d;
        int andDecrement = this.h.getAndDecrement();
        if (andDecrement < 0) {
            this.h.compareAndSet(andDecrement, 0);
        }
        this.e.run();
        dfua dfuaVar = this.b;
        dftz dftzVar = this.c;
        dhjx dhjxVar = this.d.e;
        if (dfuaVar != null && andDecrement > 0) {
            dftn a = this.a.a();
            synchronized (dfuaVar.b) {
                Renderer renderer = dfuaVar.a;
                bArr = null;
                d = renderer == null ? null : renderer.d(dhjxVar, a);
            }
            if (d != null) {
                boolean z = d.c;
                dftp dftpVar = this.g;
                if (z && (dftpVar == null || dftpVar.b != d.b || dftpVar.a != d.a)) {
                    this.g = d;
                    this.f.NU(d);
                }
                if (d.d) {
                    a();
                }
                if (z) {
                    if (dftzVar == null) {
                        return true;
                    }
                    synchronized (dftzVar.b) {
                        IconRenderer iconRenderer = dftzVar.a;
                        if (iconRenderer == null) {
                            return true;
                        }
                        long j = iconRenderer.a;
                        if (dhjxVar != null) {
                            bArr = dhjxVar.bS();
                        }
                        IconRendererSwigJNI.IconRenderer_render(j, iconRenderer, bArr);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bnst
    public final void g() {
    }

    @Override // defpackage.bnst
    public final void h() {
    }

    @Override // defpackage.bnst
    public final void d() {
        dfua dfuaVar = this.b;
        if (dfuaVar != null) {
            synchronized (dfuaVar.b) {
                Renderer renderer = dfuaVar.a;
                if (renderer == null) {
                    this.b = null;
                } else {
                    renderer.c();
                }
            }
        }
        dftz dftzVar = this.c;
        if (dftzVar != null) {
            synchronized (dftzVar.b) {
                IconRenderer iconRenderer = dftzVar.a;
                if (iconRenderer == null) {
                    this.c = null;
                } else {
                    IconRendererSwigJNI.IconRenderer_onSurfaceCreated(iconRenderer.a, iconRenderer);
                }
            }
        }
    }
}

package defpackage;

import com.google.geo.imagery.viewer.api.IconHandle;
import com.google.geo.imagery.viewer.api.IconRenderer;
import com.google.geo.imagery.viewer.api.IconRendererSwigJNI;
import com.google.geo.imagery.viewer.api.PlatformContext;
/* compiled from: PG */
/* renamed from: dftz  reason: default package */
/* loaded from: classes6.dex */
public final class dftz {
    @dzsi
    public IconRenderer a;
    public final Object b = new Object();

    protected dftz(IconRenderer iconRenderer) {
        this.a = iconRenderer;
    }

    public static synchronized dftz a(PlatformContext platformContext) {
        dftz dftzVar;
        synchronized (dftz.class) {
            long IconRenderer_createRenderer = IconRendererSwigJNI.IconRenderer_createRenderer(PlatformContext.getCPtr(platformContext), platformContext);
            dftzVar = new dftz(IconRenderer_createRenderer == 0 ? null : new IconRenderer(IconRenderer_createRenderer));
        }
        return dftzVar;
    }

    public final void b(IconHandle iconHandle, dfss dfssVar) {
        synchronized (this.b) {
            IconRenderer iconRenderer = this.a;
            if (iconRenderer != null) {
                IconRendererSwigJNI.IconRenderer_updateIcon(iconRenderer.a, iconRenderer, IconHandle.a(iconHandle), iconHandle, dfssVar == null ? null : dfssVar.bS());
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.a == null;
        }
        return z;
    }

    @dzsi
    public final IconHandle d(long j) {
        synchronized (this.b) {
            IconRenderer iconRenderer = this.a;
            if (iconRenderer == null) {
                return null;
            }
            return new IconHandle(IconRendererSwigJNI.IconRenderer_addIcon__SWIG_1(iconRenderer.a, iconRenderer, dcyn.a, dcyn.a, dcyn.a, j));
        }
    }
}

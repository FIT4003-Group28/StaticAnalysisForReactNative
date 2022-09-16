package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
/* compiled from: PG */
/* renamed from: mby  reason: default package */
/* loaded from: classes3.dex */
public final class mby extends mcp implements ynl {
    private final fyy d;

    public mby(ScrollSelectionController scrollSelectionController, fyy fyyVar, mbw mbwVar, yni yniVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, zah zahVar, RecyclerView recyclerView, ajsf ajsfVar, ajqm ajqmVar, fgz fgzVar) {
        super(scrollSelectionController, fyyVar, mbwVar, yniVar, inlinePlaybackLifecycleController, zahVar, recyclerView, ajsfVar, ajqmVar, fgzVar);
        this.d = fyyVar;
    }

    @Override // defpackage.mcp, defpackage.fyq
    public final void b() {
    }

    @Override // defpackage.mcp, defpackage.fyq
    public final void c(boolean z) {
        super.c(z);
        this.d.n(false);
    }

    @Override // defpackage.mcp, defpackage.ger
    public final int j() {
        return 0;
    }

    @Override // defpackage.mcp, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == mby.class) {
            if (i == -1) {
                return new Class[]{isw.class};
            }
            if (i == 0) {
                m((isw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return mix.f(this, obj, i);
    }
}

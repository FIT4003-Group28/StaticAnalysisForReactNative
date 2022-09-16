package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
/* compiled from: PG */
/* renamed from: lse  reason: default package */
/* loaded from: classes3.dex */
public final class lse {
    static final String a = String.valueOf(lse.class.getName()).concat(".PRESENT_CONTEXT_KEY");
    public RecyclerView b;
    public ajrt c;
    public String d;
    public lsl e;
    private ya f;
    private xy g;

    public static lse c(ajrs ajrsVar) {
        Object c = ajrsVar != null ? ajrsVar.c(a) : null;
        if (c instanceof lse) {
            return (lse) c;
        }
        return null;
    }

    public final xy a() {
        if (this.g == null) {
            this.g = new lsd(this);
        }
        return this.g;
    }

    public final ya b() {
        if (this.f == null) {
            this.f = new lsc(this);
        }
        return this.f;
    }

    public final void d() {
        ((ScrollToTopLinearLayoutManager) this.b.n).c = true;
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: lko  reason: default package */
/* loaded from: classes3.dex */
public final class lko extends ajsl {
    private final FrameLayout a;
    private final ajsa b;
    private final ViewGroup c;
    private ajru d;

    public lko(Context context, ajsa ajsaVar, ViewGroup viewGroup) {
        this.b = ajsaVar;
        this.c = viewGroup;
        this.a = new FrameLayout(context);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        this.a.removeAllViews();
        lkz a = lkz.a((aurg) obj);
        ajru h = akel.h(this.b, a, this.c);
        this.d = h;
        if (h != null) {
            h.oK(ajrsVar, a);
            if (this.d.a() == null) {
                return;
            }
            this.a.addView(this.d.a());
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aurg) obj).p.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajru ajruVar = this.d;
        if (ajruVar != null) {
            ajruVar.qZ(ajsaVar);
            this.a.removeAllViews();
        }
    }
}

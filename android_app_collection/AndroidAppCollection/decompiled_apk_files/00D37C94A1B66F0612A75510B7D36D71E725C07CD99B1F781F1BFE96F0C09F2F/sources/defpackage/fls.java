package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: fls  reason: default package */
/* loaded from: classes3.dex */
public final class fls extends ajsl {
    private final ajrx a;
    private final ViewGroup b;
    private final ajsa c;
    private final FrameLayout.LayoutParams d;
    private ajru e;

    public fls(Context context, gem gemVar, ajsa ajsaVar) {
        this.a = gemVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.c = ajsaVar;
        gemVar.c(frameLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.d = layoutParams;
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.a).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        Object flqVar;
        atfa atfaVar = (atfa) obj;
        atfb atfbVar = atfaVar.g;
        if (atfbVar == null) {
            atfbVar = atfb.a;
        }
        int aI = akel.aI(atfbVar.c);
        if (aI == 0) {
            aI = 1;
        }
        int i = aI - 1;
        if (i == 2) {
            flqVar = new flq(atfaVar);
        } else if (i == 4) {
            flqVar = new flo(atfaVar);
        } else {
            flqVar = new flp(atfaVar);
        }
        ajru h = akel.h(this.c, flqVar, null);
        this.e = h;
        if (h == null) {
            return;
        }
        akel.n(h.a(), this.e, this.c.c(flqVar));
        this.e.oK(ajrsVar, flqVar);
        View a = this.e.a();
        this.b.removeAllViews();
        this.b.addView(a);
        this.a.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atfa) obj).i.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.removeAllViews();
        ajsaVar.b(this.e.a());
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: emd  reason: default package */
/* loaded from: classes3.dex */
public final class emd extends ajsl {
    public final Context a;
    public final ajmy b;
    public final gem c;
    public final ajrq d;
    public final ajyc e;
    public final fmh f;
    public final fnz g;
    private final FrameLayout h;
    private ajru i;
    private ajru j;

    public emd(Context context, ajmy ajmyVar, gem gemVar, ajrq ajrqVar, ajyc ajycVar, fmh fmhVar, fnz fnzVar) {
        this.a = context;
        ajmyVar.getClass();
        this.b = ajmyVar;
        this.d = ajrqVar;
        this.e = ajycVar;
        this.f = fmhVar;
        this.g = fnzVar;
        this.c = gemVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        ajru ajruVar;
        arej arejVar = (arej) obj;
        if (hqs.q(ajrsVar)) {
            if (this.j == null) {
                this.j = new emb(this);
            }
            ajruVar = this.j;
        } else {
            if (this.i == null) {
                this.i = new emc(this);
            }
            ajruVar = this.i;
        }
        if (this.h != ajruVar.a().getParent()) {
            this.h.removeAllViews();
            this.h.addView(ajruVar.a());
        }
        ajruVar.oK(ajrsVar, arejVar);
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arej) obj).m.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}

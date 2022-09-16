package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: kzk  reason: default package */
/* loaded from: classes3.dex */
public final class kzk extends ajsl {
    private final ajxz a;
    private final ajmy b;
    private final aafo c;
    private final ajyc d;
    private final Context e;
    private final ajrx f;
    private final FrameLayout g;
    private ajru h;
    private ajru i;

    public kzk(Context context, ajmy ajmyVar, aafo aafoVar, gem gemVar, ajyc ajycVar, ajxz ajxzVar) {
        this.e = context;
        this.f = gemVar;
        this.b = ajmyVar;
        this.c = aafoVar;
        this.d = ajycVar;
        this.a = ajxzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.f).b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        ajru ajruVar;
        awdi awdiVar = (awdi) obj;
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        ajrsVar2.b = awdiVar.n.I();
        this.g.removeAllViews();
        int T = awwc.T(awdiVar.k);
        if (T == 0) {
            T = 1;
        }
        if (T - 1 != 2) {
            if (this.h == null) {
                this.h = new kzj(this.e, this.b, this.c, new ajsn(), this.a);
            }
            ajruVar = this.h;
        } else {
            if (this.i == null) {
                this.i = new kzi(this.e, this.b, this.c, new ajsn(), this.d, this.a);
            }
            ajruVar = this.i;
        }
        ajruVar.oK(ajrsVar, awdiVar);
        this.g.addView(ajruVar.a());
        this.f.e(ajrsVar2);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awdi) obj).n.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajru ajruVar = this.h;
        if (ajruVar != null) {
            ajruVar.qZ(ajsaVar);
        }
        ajru ajruVar2 = this.i;
        if (ajruVar2 != null) {
            ajruVar2.qZ(ajsaVar);
        }
    }
}

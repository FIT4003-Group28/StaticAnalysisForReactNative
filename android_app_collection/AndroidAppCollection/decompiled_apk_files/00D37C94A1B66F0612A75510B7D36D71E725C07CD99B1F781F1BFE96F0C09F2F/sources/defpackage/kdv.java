package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kdv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kdv implements View.OnClickListener {
    public final /* synthetic */ kdy a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdv(kdy kdyVar, int i) {
        this.b = i;
        this.a = kdyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xfl f;
        xgo xgoVar;
        if (this.b != 0) {
            xig xigVar = this.a.k;
            xigVar.getClass();
            xigVar.d();
            return;
        }
        xig xigVar2 = this.a.k;
        if (xigVar2 == null || (f = ((xfm) xigVar2).f()) == null || (xgoVar = ((wmh) f).e) == null) {
            return;
        }
        xgoVar.e();
    }
}

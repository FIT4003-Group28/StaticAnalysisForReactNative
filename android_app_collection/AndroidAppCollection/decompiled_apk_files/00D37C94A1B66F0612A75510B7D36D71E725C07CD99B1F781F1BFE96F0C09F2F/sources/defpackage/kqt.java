package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kqt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kqt implements View.OnClickListener {
    public final /* synthetic */ kre a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqt(kre kreVar, int i) {
        this.b = i;
        this.a = kreVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.y.performClick();
            return;
        }
        kre kreVar = this.a;
        kreVar.d.onClick(view);
        frd frdVar = new frd();
        frdVar.z(kreVar.t);
        bno.b(kreVar.f, frdVar);
        kreVar.g();
    }
}

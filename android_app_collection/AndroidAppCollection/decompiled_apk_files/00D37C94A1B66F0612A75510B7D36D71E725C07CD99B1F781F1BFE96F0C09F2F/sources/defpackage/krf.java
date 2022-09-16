package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: krf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class krf implements View.OnClickListener {
    public final /* synthetic */ krp a;
    private final /* synthetic */ int b;

    public /* synthetic */ krf(krp krpVar, int i) {
        this.b = i;
        this.a = krpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.y.performClick();
        } else if (i == 1) {
            this.a.x.performClick();
        } else {
            krp krpVar = this.a;
            krpVar.d.onClick(view);
            frd frdVar = new frd();
            frdVar.z(krpVar.s);
            bno.b(krpVar.f, frdVar);
            krpVar.g();
        }
    }
}

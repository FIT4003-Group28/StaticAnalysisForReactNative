package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: khh  reason: default package */
/* loaded from: classes3.dex */
final class khh implements View.OnClickListener {
    final /* synthetic */ khk a;
    private final /* synthetic */ int b;

    public khh(khk khkVar) {
        this.a = khkVar;
    }

    public khh(khk khkVar, int i) {
        this.b = i;
        this.a = khkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ((ahso) this.a.e.get()).e();
        } else if (i == 1) {
            khk khkVar = this.a;
            khkVar.o.removeCallbacks(khkVar.f);
            this.a.kT();
        } else {
            khk khkVar2 = this.a;
            khkVar2.o.removeCallbacks(khkVar2.f);
            this.a.kT();
        }
    }
}

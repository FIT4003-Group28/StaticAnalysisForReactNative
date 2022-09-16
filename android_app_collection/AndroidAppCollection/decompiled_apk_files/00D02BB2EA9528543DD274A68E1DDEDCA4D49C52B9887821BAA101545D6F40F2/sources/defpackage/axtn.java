package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axtn  reason: default package */
/* loaded from: classes3.dex */
public final class axtn implements View.OnClickListener {
    final dvvi a;
    final axwu b;
    final baap c;
    final /* synthetic */ axtp d;

    public axtn(axtp axtpVar, dvvi dvviVar, axwu axwuVar, baap baapVar) {
        this.d = axtpVar;
        this.a = dvviVar;
        this.b = axwuVar;
        this.c = baapVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.i.i(cjtd.a(dtyd.cS));
        this.b.F(true);
        axtp axtpVar = this.d;
        dvvi dvviVar = this.a;
        String b = axtpVar.c.b();
        baap baapVar = this.c;
        int i = baaq.c;
        dsqp dsqpVar = (dsqp) dvviVar.cu(5);
        dsqpVar.bC(dvviVar);
        axtpVar.D(baaq.d((dvvh) dsqpVar, b, baapVar));
    }
}

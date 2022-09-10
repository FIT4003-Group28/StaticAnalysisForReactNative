package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: asvl  reason: default package */
/* loaded from: classes2.dex */
final class asvl implements View.OnClickListener {
    final /* synthetic */ asvq a;

    public asvl(asvq asvqVar) {
        this.a = asvqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.h()) {
            asvq asvqVar = this.a;
            asvqVar.d.setVisibility(4);
            if (!asvqVar.a.isStarted()) {
                asvqVar.e();
                asvqVar.c.cancel();
                asvqVar.b.cancel();
                asvqVar.a.start();
            }
            asvq asvqVar2 = this.a;
            cjqg.r(asvqVar2.m, asvqVar2.d);
        }
    }
}

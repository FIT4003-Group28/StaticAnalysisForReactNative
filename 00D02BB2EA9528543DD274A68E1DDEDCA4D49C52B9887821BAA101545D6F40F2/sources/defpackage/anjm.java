package defpackage;

import android.content.DialogInterface;
import java.util.List;
/* compiled from: PG */
/* renamed from: anjm  reason: default package */
/* loaded from: classes2.dex */
final class anjm implements DialogInterface.OnClickListener {
    final /* synthetic */ List a;
    final /* synthetic */ anjn b;

    public anjm(anjn anjnVar, List list) {
        this.b = anjnVar;
        this.a = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dvjz dvjzVar = (dvjz) this.a.get(i);
        this.b.a.al(bvjk.dH, dvjzVar);
        qx qxVar = new qx(this.b.c);
        qxVar.j("Active wifi scan experiment");
        qxVar.f(anjn.g(dvjzVar));
        qxVar.h("Dismiss", null);
        qxVar.c();
    }
}

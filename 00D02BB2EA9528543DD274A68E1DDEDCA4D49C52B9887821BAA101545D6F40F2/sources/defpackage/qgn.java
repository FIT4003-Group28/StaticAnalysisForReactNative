package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qgn  reason: default package */
/* loaded from: classes7.dex */
public final class qgn {
    final /* synthetic */ vwm a;
    final /* synthetic */ qgo b;

    public qgn(qgo qgoVar, vwm vwmVar) {
        this.b = qgoVar;
        this.a = vwmVar;
    }

    public final void a(qhq qhqVar, qhq qhqVar2) {
        ArrayList arrayList = new ArrayList(this.b.a);
        ArrayList arrayList2 = new ArrayList(this.b.b);
        if (this.a == vwm.PICK_UP) {
            arrayList.remove(qhqVar);
        } else {
            arrayList2.remove(qhqVar2);
        }
        this.b.c(qhqVar, arrayList, qhqVar2, arrayList2);
    }
}

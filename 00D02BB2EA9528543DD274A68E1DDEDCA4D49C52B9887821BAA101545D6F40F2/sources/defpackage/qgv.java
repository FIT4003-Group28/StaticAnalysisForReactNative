package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qgv  reason: default package */
/* loaded from: classes7.dex */
public final class qgv {
    final /* synthetic */ qgw a;

    public qgv(qgw qgwVar) {
        this.a = qgwVar;
    }

    public final void a(qhu qhuVar) {
        ArrayList arrayList = new ArrayList(this.a.d);
        arrayList.remove(qhuVar);
        this.a.c(qhuVar, arrayList);
    }
}

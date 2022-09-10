package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cplm  reason: default package */
/* loaded from: classes5.dex */
final class cplm implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ cplo d;

    public cplm(cplo cploVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.d = cploVar;
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.c(this.a, this.b, this.c, null, 0, 3, false);
        this.d.f();
        this.d.a(true);
    }
}

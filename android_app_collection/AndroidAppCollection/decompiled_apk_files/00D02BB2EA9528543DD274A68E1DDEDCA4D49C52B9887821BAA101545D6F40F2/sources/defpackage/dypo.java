package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypo  reason: default package */
/* loaded from: classes6.dex */
public final class dypo implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dypz b;

    public dypo(dypz dypzVar, dyjb dyjbVar) {
        this.b = dypzVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList(this.b.l);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dysm) arrayList.get(i)).f(this.a);
        }
    }
}

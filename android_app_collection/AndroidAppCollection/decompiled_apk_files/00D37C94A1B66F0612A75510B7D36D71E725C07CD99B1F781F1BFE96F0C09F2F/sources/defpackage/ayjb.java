package defpackage;

import java.util.LinkedHashSet;
/* compiled from: PG */
/* renamed from: ayjb  reason: default package */
/* loaded from: classes2.dex */
final class ayjb implements Runnable {
    final /* synthetic */ ayjd a;
    final /* synthetic */ ayje b;

    public ayjb(ayje ayjeVar, ayjd ayjdVar) {
        this.b = ayjeVar;
        this.a = ayjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.get() == ayji.g) {
            ayji ayjiVar = this.b.c;
            if (ayjiVar.w == null) {
                ayjiVar.w = new LinkedHashSet();
                ayji ayjiVar2 = this.b.c;
                ayjiVar2.Q.c(ayjiVar2.x, true);
            }
            this.b.c.w.add(this.a);
            return;
        }
        this.a.j();
    }
}

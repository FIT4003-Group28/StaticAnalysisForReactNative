package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cgdl  reason: default package */
/* loaded from: classes4.dex */
final class cgdl implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ cgdv b;

    public cgdl(cgdv cgdvVar, List list) {
        this.b = cgdvVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.aj.clear();
        for (dwyg dwygVar : this.a) {
            this.b.aj.put(dwygVar.b, dwygVar);
        }
        this.b.bz();
    }
}

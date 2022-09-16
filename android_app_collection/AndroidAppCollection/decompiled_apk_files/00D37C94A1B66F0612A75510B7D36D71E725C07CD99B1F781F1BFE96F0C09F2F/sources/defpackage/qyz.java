package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: qyz  reason: default package */
/* loaded from: classes4.dex */
final class qyz implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ qzb b;
    final /* synthetic */ qzb c;

    public qyz(qzb qzbVar, long j, qzb qzbVar2) {
        this.c = qzbVar;
        this.a = j;
        this.b = qzbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qzi qziVar = this.c.f;
        qziVar.getClass();
        long j = this.a;
        StringBuilder sb = new StringBuilder(52);
        sb.append("getResults snapshot timeout: ");
        sb.append(j);
        sb.append(" ms");
        qzh qzhVar = new qzh(qziVar, sb.toString(), this.c.e);
        String a = qzhVar.a(new HashMap());
        qzhVar.b();
        this.b.a(a);
    }
}

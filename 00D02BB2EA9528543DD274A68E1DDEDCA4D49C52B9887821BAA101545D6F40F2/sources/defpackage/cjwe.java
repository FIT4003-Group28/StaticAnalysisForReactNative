package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cjwe  reason: default package */
/* loaded from: classes.dex */
public final class cjwe {
    public final cqat a;
    public final dzsj<duxm> b;
    public final cjvv c;
    public final cjwb d = new cjwb();

    public cjwe(cqat cqatVar, dzsj<duxm> dzsjVar, cjvv cjvvVar) {
        this.a = cqatVar;
        this.b = dzsjVar;
        this.c = cjvvVar;
    }

    public final void a(bvrp<Long, Long, dcdc<cjvu>> bvrpVar) {
        bvrj.UI_THREAD.d();
        int i = this.b.a().d;
        dcdc<cjvu> a = bvrpVar.a(Long.valueOf(this.a.b() - TimeUnit.MINUTES.toMillis(this.b.a().c)), Long.valueOf(i));
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            cjvu cjvuVar = a.get(i2);
            this.d.a(cjvuVar.a(), cjvuVar.b());
        }
        a.size();
    }
}

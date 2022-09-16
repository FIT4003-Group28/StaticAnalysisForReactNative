package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: zpa  reason: default package */
/* loaded from: classes4.dex */
public final class zpa {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ArrayList b = new ArrayList();
    public zoz c;

    public final void a(String str) {
        awzp a = awzq.a();
        a.copyOnWrite();
        awzq.c((awzq) a.instance, str);
        axao a2 = axat.a();
        a2.copyOnWrite();
        ((axat) a2.instance).r((awzq) a.mo39build());
        this.a.add((axat) a2.mo39build());
    }

    public final void b(axbm axbmVar) {
        axao a = axat.a();
        a.copyOnWrite();
        ((axat) a.instance).v(axbmVar);
        a.toString();
        this.a.add((axat) a.mo39build());
    }

    public final void c(long j, long j2, double d, axbs axbsVar) {
        aopa createBuilder = axct.a.createBuilder();
        createBuilder.copyOnWrite();
        axct axctVar = (axct) createBuilder.instance;
        axctVar.c = 1;
        axctVar.b = 1;
        aopa createBuilder2 = axcu.a.createBuilder();
        createBuilder2.copyOnWrite();
        axcu axcuVar = (axcu) createBuilder2.instance;
        axcuVar.b = 1;
        axcuVar.c = Double.valueOf(d);
        axbr b = axbt.b();
        b.copyOnWrite();
        axbt.f((axbt) b.instance, j);
        b.copyOnWrite();
        axbt.h((axbt) b.instance, j2);
        b.copyOnWrite();
        axbt.g((axbt) b.instance, (axct) createBuilder.mo39build());
        b.copyOnWrite();
        axbt.i((axbt) b.instance, (axcu) createBuilder2.mo39build());
        b.copyOnWrite();
        axbt.j((axbt) b.instance, axbsVar);
        axao a = axat.a();
        a.copyOnWrite();
        ((axat) a.instance).y((axbt) b.mo39build());
        this.a.add((axat) a.mo39build());
    }
}

package defpackage;

import android.app.Activity;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: suz  reason: default package */
/* loaded from: classes7.dex */
public final class suz implements sut {
    private final ConcurrentHashMap<amve, sus> a = new ConcurrentHashMap<>();
    private final svc b;

    public suz(svc svcVar) {
        this.b = svcVar;
    }

    @Override // defpackage.sut
    public final sus a(tlv tlvVar, amve amveVar) {
        ConcurrentHashMap<amve, sus> concurrentHashMap = this.a;
        svc svcVar = this.b;
        Activity activity = (Activity) ((dxjd) svcVar.a).a;
        svc.a(activity, 1);
        Executor a = svcVar.b.a();
        svc.a(a, 2);
        btpc a2 = svcVar.c.a();
        svc.a(a2, 3);
        dxio a3 = ((dxjh) svcVar.d).a();
        svc.a(a3, 4);
        dbsg<arkb> a4 = svcVar.e.a();
        svc.a(a4, 5);
        byyp a5 = svcVar.f.a();
        svc.a(a5, 6);
        suu a6 = svcVar.g.a();
        svc.a(a6, 7);
        svc.a(tlvVar, 8);
        svc.a(amveVar, 9);
        concurrentHashMap.putIfAbsent(amveVar, new svb(activity, a, a2, a3, a4, a5, a6, tlvVar, amveVar));
        return this.a.get(amveVar);
    }
}

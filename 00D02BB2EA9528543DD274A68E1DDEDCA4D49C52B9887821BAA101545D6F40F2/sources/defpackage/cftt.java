package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cftt  reason: default package */
/* loaded from: classes4.dex */
public class cftt {
    public final dxio<ahjq> a;
    public final Executor b;
    public final cfui c;
    public final arag d;
    public final AtomicBoolean e = new AtomicBoolean();

    public cftt(dxio<ahjq> dxioVar, Executor executor, cfuj cfujVar, arag aragVar) {
        this.a = dxioVar;
        this.b = executor;
        axru a = cfujVar.a.a();
        cfuj.a(a, 1);
        axrx a2 = cfujVar.b.a();
        cfuj.a(a2, 2);
        this.c = new cfui(a, a2, (String[]) cfuj.a(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 3));
        this.d = aragVar;
    }
}

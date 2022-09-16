package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: do  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0001do {
    final /* synthetic */ acv a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ ach c;
    final /* synthetic */ abw d;
    final /* synthetic */ dp e;

    public C0001do() {
    }

    public C0001do(dp dpVar, acv acvVar, AtomicReference atomicReference, ach achVar, abw abwVar) {
        this.e = dpVar;
        this.a = acvVar;
        this.b = atomicReference;
        this.c = achVar;
        this.d = abwVar;
    }

    public final void a() {
        dp dpVar = this.e;
        this.b.set(((acd) this.a.a(null)).b("fragment_" + dpVar.l + "_rq#" + dpVar.ac.getAndIncrement(), this.e, this.c, this.d));
    }
}

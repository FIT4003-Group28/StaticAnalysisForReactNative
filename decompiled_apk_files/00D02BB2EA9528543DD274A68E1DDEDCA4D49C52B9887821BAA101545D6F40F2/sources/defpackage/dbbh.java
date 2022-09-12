package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dbbh  reason: default package */
/* loaded from: classes5.dex */
final class dbbh implements Runnable {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ dbbi b;

    public dbbh(dbbi dbbiVar, AtomicBoolean atomicBoolean) {
        this.b = dbbiVar;
        this.a = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.getAndSet(true)) {
            dbbi dbbiVar = this.b;
            dbbk.g(dbbiVar.a, dbbiVar.c);
        }
    }
}

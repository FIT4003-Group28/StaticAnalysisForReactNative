package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: duij  reason: default package */
/* loaded from: classes6.dex */
final class duij implements Callable<duir> {
    final /* synthetic */ duim a;

    public duij(duim duimVar) {
        this.a = duimVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ duir call() {
        duir duirVar;
        try {
            duim duimVar = this.a;
            duirVar = new duir(duimVar.a == null ? duimVar.c() : duimVar.b(true));
        } catch (duiq e) {
            duirVar = new duir(e);
        } catch (Throwable th) {
            duirVar = new duir(new duiq(duip.UNKNOWN, th));
        }
        synchronized (this.a) {
        }
        return duirVar;
    }
}

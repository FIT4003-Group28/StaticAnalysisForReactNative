package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azka  reason: default package */
/* loaded from: classes3.dex */
final class azka implements Callable<baad> {
    final /* synthetic */ String a;
    final /* synthetic */ azkc b;

    public azka(azkc azkcVar, String str) {
        this.b = azkcVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    @dzsi
    public final /* bridge */ /* synthetic */ baad call() {
        dbsg<azxi> c = this.b.c.a().c(this.a);
        if (!c.a()) {
            c = this.b.c.a().d(this.a);
        }
        if (c.a()) {
            azzu aq = azzu.aq(c.b());
            this.b.t(aq);
            return aq;
        }
        return null;
    }
}

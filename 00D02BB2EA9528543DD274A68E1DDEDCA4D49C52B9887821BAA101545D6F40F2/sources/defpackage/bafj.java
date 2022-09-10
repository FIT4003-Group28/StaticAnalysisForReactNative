package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bafj  reason: default package */
/* loaded from: classes3.dex */
final class bafj implements ayfi {
    final /* synthetic */ Runnable a;
    final /* synthetic */ List b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ bafk d;

    public bafj(bafk bafkVar, Runnable runnable, List list, Runnable runnable2) {
        this.d = bafkVar;
        this.a = runnable;
        this.b = list;
        this.c = runnable2;
    }

    @Override // defpackage.ayfi
    public final void e(ayfk ayfkVar) {
    }

    @Override // defpackage.ayfi
    public final void f(ayfk ayfkVar) {
        this.a.run();
        bafk bafkVar = this.d;
        bafkVar.d.f(bafkVar.a(this.b));
    }

    @Override // defpackage.ayfi
    public final void g(ayfk ayfkVar) {
        this.c.run();
    }
}

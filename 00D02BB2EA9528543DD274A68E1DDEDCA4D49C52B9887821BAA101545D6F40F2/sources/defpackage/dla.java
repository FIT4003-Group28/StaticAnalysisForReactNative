package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dla  reason: default package */
/* loaded from: classes6.dex */
final class dla implements akzt {
    final /* synthetic */ dld a;

    public dla(dld dldVar) {
        this.a = dldVar;
    }

    @Override // defpackage.akzt
    public final void a() {
    }

    @Override // defpackage.akzt
    public final void b() {
        this.a.a();
        synchronized (this.a.k) {
            dld dldVar = this.a;
            dldVar.t = dldVar.g.scheduleAtFixedRate(new dlc(dldVar), 0L, 50L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.akzt
    public final void c() {
        this.a.c();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ajez  reason: default package */
/* loaded from: classes2.dex */
public final class ajez implements degu<dwdi> {
    final /* synthetic */ deig a;
    final /* synthetic */ btzc b;

    public ajez(deig deigVar, btzc btzcVar) {
        this.a = deigVar;
        this.b = btzcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            this.b.a();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dwdi dwdiVar) {
    }
}

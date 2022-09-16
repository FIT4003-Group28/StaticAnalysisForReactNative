package defpackage;
/* compiled from: PG */
/* renamed from: bxec  reason: default package */
/* loaded from: classes4.dex */
public final class bxec {
    public boolean a;
    final /* synthetic */ bxef b;
    @dzsi
    private final bxdt c;

    public bxec(@dzsi bxef bxefVar, bxdt bxdtVar) {
        this.b = bxefVar;
        this.c = bxdtVar;
    }

    public final void a(@dzsi dvvw dvvwVar, @dzsi bttq bttqVar) {
        bxdt bxdtVar;
        synchronized (this.b) {
            if (!this.a && (bxdtVar = this.c) != null) {
                if (bttqVar == null && dvvwVar != null) {
                    bxdtVar.b(dvvwVar);
                    this.b.b(this.c, false);
                } else {
                    bxef.d(bxdtVar);
                }
            }
        }
    }
}

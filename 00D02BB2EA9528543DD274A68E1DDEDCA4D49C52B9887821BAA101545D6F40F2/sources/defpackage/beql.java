package defpackage;
/* compiled from: PG */
/* renamed from: beql  reason: default package */
/* loaded from: classes3.dex */
public final class beql implements beqm {
    final /* synthetic */ ccln a;
    final /* synthetic */ ilo b;
    final /* synthetic */ beqn c;

    public beql(beqn beqnVar, ccln cclnVar, ilo iloVar) {
        this.c = beqnVar;
        this.a = cclnVar;
        this.b = iloVar;
    }

    @Override // defpackage.beqm
    public final void a(@dzsi baad baadVar) {
        if (baadVar != null && baadVar.e(this.c.c(baadVar, this.a, this.b))) {
            this.c.e(baadVar);
        }
    }
}

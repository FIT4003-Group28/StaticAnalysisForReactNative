package defpackage;
/* compiled from: PG */
/* renamed from: adxh  reason: default package */
/* loaded from: classes.dex */
public final class adxh implements amqo {
    final /* synthetic */ aadd a;
    final /* synthetic */ aeab b;

    public adxh(aadd aaddVar, aeab aeabVar) {
        this.a = aaddVar;
        this.b = aeabVar;
    }

    @Override // defpackage.amqo
    /* renamed from: a */
    public final synchronized pde get() {
        atdy atdyVar = this.a.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        aqwr aqwrVar = atdyVar.c;
        if (aqwrVar == null) {
            aqwrVar = aqwr.a;
        }
        if (aqwrVar.c) {
            return null;
        }
        return this.b.get();
    }
}

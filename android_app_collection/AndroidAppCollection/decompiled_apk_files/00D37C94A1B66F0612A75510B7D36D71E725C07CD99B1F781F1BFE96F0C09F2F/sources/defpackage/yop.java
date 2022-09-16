package defpackage;
/* compiled from: PG */
/* renamed from: yop  reason: default package */
/* loaded from: classes4.dex */
public final class yop implements apy {
    public final l a;

    public yop(yon yonVar) {
        apt aptVar;
        l lVar = new l(this);
        this.a = lVar;
        yonVar.a.c(new yoo(this));
        Boolean bool = yonVar.a.b.b;
        if (bool == null || !bool.booleanValue()) {
            aptVar = apt.CREATED;
        } else {
            aptVar = apt.RESUMED;
        }
        lVar.f(aptVar);
    }

    @Override // defpackage.apy
    public final apu getLifecycle() {
        return this.a;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: apnd  reason: default package */
/* loaded from: classes2.dex */
final class apnd implements cmkf {
    @dzsi
    private final cmls a;
    private final cmkf b;

    public apnd(@dzsi cmls cmlsVar, cmkf cmkfVar) {
        this.a = cmlsVar;
        this.b = cmkfVar;
    }

    @Override // defpackage.cmkf
    public final cmkg a() {
        cmls cmlsVar = this.a;
        if (cmlsVar == null) {
            return ((cmkp) this.b).a();
        }
        return new cmlv(cmlsVar, ((cmkp) this.b).a(), new cmku(), new cmlu(this.a));
    }
}

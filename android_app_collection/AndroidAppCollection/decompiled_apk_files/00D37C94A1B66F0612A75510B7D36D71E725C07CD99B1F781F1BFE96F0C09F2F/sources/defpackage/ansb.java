package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ansb  reason: default package */
/* loaded from: classes.dex */
public final class ansb extends anmr {
    public ansb() {
        super(anqn.class, new ansa(annc.class));
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ aoqu b(aoob aoobVar) {
        return (anqn) aopi.parseFrom(anqn.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmr
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    @Override // defpackage.anmr
    public final /* bridge */ /* synthetic */ void f(aoqu aoquVar) {
        anqn anqnVar = (anqn) aoquVar;
        anus.d(anqnVar.b);
        anql anqlVar = anqnVar.c;
        if (anqlVar == null) {
            anqlVar = anql.a;
        }
        answ.a(anqlVar);
    }

    @Override // defpackage.anmr
    public final int g() {
        return 2;
    }

    @Override // defpackage.anmr
    public final int h() {
        return 5;
    }
}

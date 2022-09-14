package defpackage;
/* compiled from: PG */
/* renamed from: jwb  reason: default package */
/* loaded from: classes7.dex */
final class jwb implements jwh<jyo> {
    final /* synthetic */ jwf a;

    public jwb(jwf jwfVar) {
        this.a = jwfVar;
    }

    @Override // defpackage.jwh
    public final void a(int i, dcdc<jyo> dcdcVar) {
        jwf jwfVar = this.a;
        if (jwfVar.o && !jwfVar.n) {
            jwfVar.n = true;
            jwfVar.p -= 3;
        }
        jwfVar.m = dcdcVar;
        jwfVar.l(i);
        jwfVar.f.l();
    }
}

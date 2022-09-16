package defpackage;
/* compiled from: PG */
/* renamed from: aymy  reason: default package */
/* loaded from: classes2.dex */
public final class aymy extends ayna {
    public aymy(axye axyeVar, axyd axydVar) {
        super(axyeVar, axydVar);
    }

    @Override // defpackage.ayna
    public final /* bridge */ /* synthetic */ ayna a(axye axyeVar, axyd axydVar) {
        return new aymy(axyeVar, axydVar);
    }

    public final ankt b(aofy aofyVar) {
        axye axyeVar = this.a;
        ayax ayaxVar = aoex.f;
        if (ayaxVar == null) {
            synchronized (aoex.class) {
                ayaxVar = aoex.f;
                if (ayaxVar == null) {
                    ayau a = ayax.a();
                    a.c = ayaw.UNARY;
                    a.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "StartLinkingSession");
                    a.b();
                    a.a = aymw.b(aofy.a);
                    a.b = aymw.b(aoft.a);
                    ayaxVar = a.a();
                    aoex.f = ayaxVar;
                }
            }
        }
        return aynh.a(axyeVar.a(ayaxVar, this.b), aofyVar);
    }
}

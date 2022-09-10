package defpackage;
/* compiled from: PG */
/* renamed from: amrn  reason: default package */
/* loaded from: classes2.dex */
public final class amrn implements amri {
    private final amsb a;

    public amrn(amsb amsbVar) {
        this.a = amsbVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        amrh amrhVar = amrkVar.f;
        amsb amsbVar = this.a;
        return (!amrhVar.e.containsKey(amsbVar) || amrhVar.e.get(amsbVar).intValue() <= 0) ? 0.0f : 1.0f;
    }
}

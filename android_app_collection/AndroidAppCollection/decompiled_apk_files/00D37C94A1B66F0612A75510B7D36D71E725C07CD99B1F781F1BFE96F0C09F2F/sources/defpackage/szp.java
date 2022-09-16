package defpackage;
/* compiled from: PG */
/* renamed from: szp  reason: default package */
/* loaded from: classes4.dex */
public final class szp implements tct {
    public final tdb a;
    public final axnm b;
    public final boolean c;

    public szp(tdb tdbVar, axnm axnmVar, ampq ampqVar) {
        this.a = tdbVar;
        this.b = axnmVar;
        this.c = ((Boolean) ampqVar.e(false)).booleanValue();
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awnk.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        awnk awnkVar = (awnk) obj;
        return ayos.D(awnkVar).c(new szo(this, awnkVar, tcsVar));
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: jwa  reason: default package */
/* loaded from: classes3.dex */
public final class jwa implements feb {
    private static final feb b = new jvz();
    public azqb a;

    private final feb c() {
        fed fedVar;
        azqb azqbVar = this.a;
        return (azqbVar == null || (fedVar = ((jvo) azqbVar).get()) == null) ? b : fedVar;
    }

    @Override // defpackage.feb
    public final void a() {
        c().a();
    }

    @Override // defpackage.feb
    public final void b() {
        c().b();
    }

    @Override // defpackage.feb
    public final void h() {
        c().h();
    }
}

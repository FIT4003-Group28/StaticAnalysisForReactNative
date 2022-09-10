package defpackage;
/* compiled from: PG */
/* renamed from: bzgl  reason: default package */
/* loaded from: classes4.dex */
public class bzgl {
    public final btvo a;
    public final bvjj b;
    public final ania c;
    private final ahjq d;
    private final vwv e;
    private final dzsj<byyp> f;
    private final akfa g;
    private final qbv h;

    public bzgl(btvo btvoVar, ahjq ahjqVar, bvjj bvjjVar, vwv vwvVar, dzsj<byyp> dzsjVar, akfa akfaVar, ania aniaVar, qbv qbvVar) {
        this.a = btvoVar;
        this.d = ahjqVar;
        this.b = bvjjVar;
        this.e = vwvVar;
        this.f = dzsjVar;
        this.g = akfaVar;
        this.c = aniaVar;
        this.h = qbvVar;
    }

    public final boolean a() {
        return this.a.getTransitTrackingParameters().s;
    }

    public final boolean b() {
        return this.a.getTransitTrackingParameters().v;
    }

    public final boolean c() {
        if (this.a.getTransitTrackingParameters().b) {
            dkof dkofVar = this.a.getLocationSharingParameters().q;
            if (dkofVar == null) {
                dkofVar = dkof.s;
            }
            return !dkofVar.f && this.g.c();
        }
        return false;
    }

    public final boolean d() {
        return this.a.getTransitTrackingParameters().c;
    }

    public final boolean e(@dzsi amub amubVar) {
        return g() && f(amubVar) && !h(amubVar);
    }

    public final boolean f(@dzsi amub amubVar) {
        return zba.f(amubVar, this.d, this.b, this.e);
    }

    public final boolean g() {
        return this.a.getTransitTrackingParameters().a && !this.h.a();
    }

    public final boolean h(@dzsi amub amubVar) {
        return amubVar != null && this.f.a().c().a(amubVar);
    }
}

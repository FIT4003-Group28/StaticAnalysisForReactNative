package defpackage;
/* compiled from: PG */
/* renamed from: uhy  reason: default package */
/* loaded from: classes7.dex */
public class uhy implements uhd {
    private final uhc a;
    @dzsi
    private uha b;

    public uhy(uhc uhcVar, @dzsi uha uhaVar) {
        this.a = uhcVar;
        this.b = uhaVar;
    }

    @Override // defpackage.uhd
    public uhc a() {
        return this.a;
    }

    @Override // defpackage.uhd
    @dzsi
    public uha b() {
        return this.b;
    }

    public void c(@dzsi uha uhaVar) {
        this.b = uhaVar;
        cqkx.p(this);
    }
}

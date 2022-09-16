package defpackage;
/* compiled from: PG */
/* renamed from: bwsl  reason: default package */
/* loaded from: classes4.dex */
final class bwsl implements Comparable<bwsl> {
    public final bwvi a;
    private final dzsl b;

    public bwsl(bwvi bwviVar, dzsl dzslVar) {
        this.a = bwviVar;
        this.b = dzslVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(bwsl bwslVar) {
        bwsl bwslVar2 = bwslVar;
        return dbzx.b.f(this.b.a, bwslVar2.b.a).f(this.b.b, bwslVar2.b.b).i();
    }
}

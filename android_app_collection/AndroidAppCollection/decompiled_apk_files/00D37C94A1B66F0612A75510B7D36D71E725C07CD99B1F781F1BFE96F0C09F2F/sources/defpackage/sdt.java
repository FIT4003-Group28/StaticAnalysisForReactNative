package defpackage;
/* compiled from: PG */
/* renamed from: sdt  reason: default package */
/* loaded from: classes4.dex */
final class sdt implements Iterable {
    final /* synthetic */ sdv a;
    private final sek b;

    public sdt(sdv sdvVar, sek sekVar) {
        this.a = sdvVar;
        this.b = sekVar;
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public final sdu iterator() {
        sdu sduVar = new sdu(this.a, ((Double) this.b.a).longValue(), ((Double) this.b.b).longValue());
        sduVar.b(1);
        return sduVar;
    }
}

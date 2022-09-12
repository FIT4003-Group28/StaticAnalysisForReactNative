package defpackage;
/* compiled from: PG */
/* renamed from: cdyj  reason: default package */
/* loaded from: classes4.dex */
final class cdyj extends dzvy implements dzve<Integer, Integer> {
    final /* synthetic */ cdyk a;

    public cdyj(cdyk cdykVar) {
        this.a = cdykVar;
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ Integer a(Integer num) {
        return Integer.valueOf(b(num.intValue()));
    }

    public final int b(int i) {
        cdyk cdykVar = this.a;
        return (i * cdykVar.a) / cdykVar.b;
    }
}

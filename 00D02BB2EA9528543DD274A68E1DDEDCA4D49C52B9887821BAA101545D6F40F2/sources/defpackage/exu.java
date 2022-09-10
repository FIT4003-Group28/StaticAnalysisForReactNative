package defpackage;
/* compiled from: PG */
/* renamed from: exu  reason: default package */
/* loaded from: classes6.dex */
final class exu<T> implements dzsj<T> {
    final /* synthetic */ exv a;
    private final int b;

    public exu(exv exvVar, int i) {
        this.a = exvVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            exv exvVar = this.a;
            return (T) new ahzh(exvVar.a.eW.hw(), exvVar.a.eW.es(), exvVar.b());
        }
        exv exvVar2 = this.a;
        return (T) new ahzd(exvVar2.a.eW.hw(), exvVar2.a.eW.es(), exvVar2.b());
    }
}

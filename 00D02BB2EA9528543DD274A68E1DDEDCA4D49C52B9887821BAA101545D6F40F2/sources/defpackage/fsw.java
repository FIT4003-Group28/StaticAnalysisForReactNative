package defpackage;
/* compiled from: PG */
/* renamed from: fsw  reason: default package */
/* loaded from: classes6.dex */
final class fsw<T> implements dzsj<T> {
    final /* synthetic */ fsx a;
    private final int b;

    public fsw(fsx fsxVar, int i) {
        this.a = fsxVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) new cjee();
        }
        fsx fsxVar = this.a;
        dzsj dzsjVar = fsxVar.a;
        if (dzsjVar == null) {
            dzsjVar = new fsw(fsxVar, 1);
            fsxVar.a = dzsjVar;
        }
        return (T) new cjec(dzsjVar);
    }
}

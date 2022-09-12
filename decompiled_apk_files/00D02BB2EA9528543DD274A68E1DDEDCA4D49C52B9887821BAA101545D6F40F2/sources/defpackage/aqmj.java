package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqmj  reason: default package */
/* loaded from: classes2.dex */
public final class aqmj implements degu<Boolean> {
    final /* synthetic */ btlu a;
    final /* synthetic */ aqmk b;

    public aqmj(aqmk aqmkVar, btlu btluVar) {
        this.b = aqmkVar;
        this.a = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.b.a.T(bvjk.iy, this.a, false);
            this.b.b.a().d();
        }
    }
}

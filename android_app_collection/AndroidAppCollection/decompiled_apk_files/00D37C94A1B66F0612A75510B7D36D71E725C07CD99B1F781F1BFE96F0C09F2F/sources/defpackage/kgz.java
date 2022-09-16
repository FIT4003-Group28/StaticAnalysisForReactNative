package defpackage;
/* compiled from: PG */
/* renamed from: kgz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kgz implements fqt {
    public final /* synthetic */ khd a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgz(khd khdVar, int i) {
        this.b = i;
        this.a = khdVar;
    }

    @Override // defpackage.fqt
    public final void a(boolean z) {
        if (this.b != 0) {
            khd khdVar = this.a;
            if (khdVar.e == z) {
                return;
            }
            khdVar.e = z;
            khdVar.a();
            return;
        }
        khd khdVar2 = this.a;
        if (khdVar2.f == z) {
            return;
        }
        khdVar2.f = z;
        khdVar2.a();
    }
}

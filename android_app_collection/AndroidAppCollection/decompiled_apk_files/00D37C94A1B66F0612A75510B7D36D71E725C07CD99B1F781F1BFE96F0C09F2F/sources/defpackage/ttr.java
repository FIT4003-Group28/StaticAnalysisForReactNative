package defpackage;
/* compiled from: PG */
/* renamed from: ttr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttr implements ampg {
    public final /* synthetic */ tuk a;
    private final /* synthetic */ int b;

    public /* synthetic */ ttr(tuk tukVar, int i) {
        this.b = i;
        this.a = tukVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            tuk tukVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                tukVar.b.g(1036);
            }
            return null;
        }
        tuk tukVar2 = this.a;
        if (!((Boolean) obj).booleanValue()) {
            tukVar2.b.g(1036);
        }
        return null;
    }
}

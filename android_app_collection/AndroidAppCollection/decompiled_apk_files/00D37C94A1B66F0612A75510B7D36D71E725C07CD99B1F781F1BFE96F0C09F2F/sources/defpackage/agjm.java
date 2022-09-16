package defpackage;
/* compiled from: PG */
/* renamed from: agjm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agjm implements ampg {
    public final /* synthetic */ agjz a;
    private final /* synthetic */ int b;

    public /* synthetic */ agjm(agjz agjzVar) {
        this.a = agjzVar;
    }

    public /* synthetic */ agjm(agjz agjzVar, int i) {
        this.b = i;
        this.a = agjzVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            Void r2 = (Void) obj;
            return ((aglj) this.a.k.get()).s();
        }
        Void r22 = (Void) obj;
        return ((aglj) this.a.k.get()).r();
    }
}

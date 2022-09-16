package defpackage;
/* compiled from: PG */
/* renamed from: uzv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uzv implements azqb {
    public final /* synthetic */ axnm a;
    private final /* synthetic */ int b;

    public /* synthetic */ uzv(axnm axnmVar, int i) {
        this.b = i;
        this.a = axnmVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        if (this.b == 0) {
            uzq uzqVar = (uzq) this.a.get();
            return 10;
        }
        return (aktk) this.a.get();
    }
}

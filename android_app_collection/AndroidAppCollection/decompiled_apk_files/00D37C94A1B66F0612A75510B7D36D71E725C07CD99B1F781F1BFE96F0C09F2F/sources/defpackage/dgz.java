package defpackage;
/* compiled from: PG */
/* renamed from: dgz  reason: default package */
/* loaded from: classes3.dex */
public final class dgz {
    public final dle a;
    private dik b;
    private final cyv c;

    public dgz() {
    }

    public final synchronized void a(dik dikVar) {
        if (this.b != dikVar) {
            this.b = dikVar;
            cyv cyvVar = this.c;
            int i = dii.M;
            if (cyvVar.f != null) {
                cyvVar.g(new ddk(0, dikVar), "updateState:RecyclerCollectionComponent.updateLoadingState");
            }
        }
    }

    public dgz(cyv cyvVar, dle dleVar) {
        this.b = dik.LOADING;
        this.c = cyvVar;
        this.a = dleVar;
    }
}

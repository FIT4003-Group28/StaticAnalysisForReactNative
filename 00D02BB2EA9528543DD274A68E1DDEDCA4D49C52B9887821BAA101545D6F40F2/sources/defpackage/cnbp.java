package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cnbp  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cnbp implements dbsz {
    static final dbsz a = new cnbp();

    private cnbp() {
    }

    @Override // defpackage.dbsz
    public final void NU(Object obj) {
        cnik cnikVar = (cnik) obj;
        if (cmwk.a("CAR.SENSOR", 3)) {
            int i = cnjc.a;
        }
        synchronized (cnikVar.b) {
            cnikVar.b.clear();
            cnikVar.a = null;
        }
    }
}

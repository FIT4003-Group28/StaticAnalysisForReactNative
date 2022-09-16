package defpackage;
/* compiled from: PG */
/* renamed from: san  reason: default package */
/* loaded from: classes4.dex */
final class san extends shp {
    final /* synthetic */ saq a;

    public san(saq saqVar) {
        this.a = saqVar;
    }

    @Override // defpackage.shp
    public final boolean b() {
        if (this.a.h != sap.DESCRIBE || !this.a.i.contains(sap.EXPLORE)) {
            return false;
        }
        this.a.e(sap.EXPLORE);
        return true;
    }
}

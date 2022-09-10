package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzuq  reason: default package */
/* loaded from: classes4.dex */
public final class bzuq extends bzvs {
    public dbsg<Integer> a;
    public dbsg<String> b;

    public bzuq() {
        this.a = dbpy.a;
        this.b = dbpy.a;
    }

    public bzuq(bzvt bzvtVar) {
        this.a = dbpy.a;
        this.b = dbpy.a;
        bzur bzurVar = (bzur) bzvtVar;
        this.a = bzurVar.a;
        this.b = bzurVar.b;
    }

    @Override // defpackage.bzvs
    public final bzvt a() {
        return new bzur(this.a, this.b);
    }

    @Override // defpackage.bzvs
    public final void b(dbsg<Integer> dbsgVar) {
        this.a = dbsgVar;
    }
}

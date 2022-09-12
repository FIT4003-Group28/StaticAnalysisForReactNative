package defpackage;
/* compiled from: PG */
/* renamed from: dbvb  reason: default package */
/* loaded from: classes5.dex */
final class dbvb extends dbyr<dbwv> {
    final /* synthetic */ dbvc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbvb(dbvc dbvcVar, dbwv dbwvVar) {
        super(dbwvVar);
        this.a = dbvcVar;
    }

    @Override // defpackage.dbyr
    protected final /* bridge */ /* synthetic */ dbwv a(dbwv dbwvVar) {
        dbwv h = dbwvVar.h();
        if (h == this.a.a) {
            return null;
        }
        return h;
    }
}

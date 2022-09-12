package defpackage;
/* compiled from: PG */
/* renamed from: dbwr  reason: default package */
/* loaded from: classes5.dex */
final class dbwr extends dbyr<dbwv> {
    final /* synthetic */ dbws a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbwr(dbws dbwsVar, dbwv dbwvVar) {
        super(dbwvVar);
        this.a = dbwsVar;
    }

    @Override // defpackage.dbyr
    protected final /* bridge */ /* synthetic */ dbwv a(dbwv dbwvVar) {
        dbwv n = dbwvVar.n();
        if (n == this.a.a) {
            return null;
        }
        return n;
    }
}

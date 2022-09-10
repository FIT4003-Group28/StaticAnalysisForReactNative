package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypr  reason: default package */
/* loaded from: classes6.dex */
public final class dypr extends dyom {
    public final dyle a;
    private final dymc b;

    public dypr(dymc dymcVar, dyle dyleVar) {
        this.b = dymcVar;
        this.a = dyleVar;
    }

    @Override // defpackage.dyom
    protected final dymc a() {
        return this.b;
    }

    @Override // defpackage.dyom, defpackage.dylv
    public final dyls d(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        return new dypq(this, this.b.d(dyibVar, dyhwVar, dyetVar));
    }
}

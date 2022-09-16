package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbp  reason: default package */
/* loaded from: classes3.dex */
public final class dbp {
    public dbq a;
    public czi b;

    public dbp(dbq dbqVar, czi cziVar) {
        this.a = dbqVar;
        this.b = cziVar;
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        czi cziVar = this.b;
        boolean z = cziVar != null && !czu.y() && cziVar.g;
        dbq dbqVar = this.a;
        return dbqVar != null && dbqVar.w && z;
    }
}

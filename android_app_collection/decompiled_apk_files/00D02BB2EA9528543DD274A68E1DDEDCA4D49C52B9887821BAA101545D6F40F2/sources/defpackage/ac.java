package defpackage;
/* compiled from: PG */
/* renamed from: ac  reason: default package */
/* loaded from: classes2.dex */
final class ac<T> extends z<T> {
    private final String g;
    private final ad h;

    public ac(ad adVar, String str) {
        this.g = str;
        this.h = adVar;
    }

    @Override // defpackage.z, defpackage.v
    public final void g(T t) {
        ad adVar = this.h;
        if (adVar != null) {
            adVar.a.put(this.g, t);
        }
        super.g(t);
    }

    public ac(ad adVar, String str, T t) {
        super(t);
        this.g = str;
        this.h = adVar;
    }
}

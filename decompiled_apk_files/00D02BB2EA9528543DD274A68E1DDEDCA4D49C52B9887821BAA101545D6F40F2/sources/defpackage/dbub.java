package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbub  reason: default package */
/* loaded from: classes.dex */
public final class dbub<T> implements dbty<T> {
    volatile dbty<T> a;
    volatile boolean b;
    T c;

    public dbub(dbty<T> dbtyVar) {
        dbsk.s(dbtyVar);
        this.a = dbtyVar;
    }

    @Override // defpackage.dbty
    public final T a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T a = this.a.a();
                    this.c = a;
                    this.b = true;
                    this.a = null;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}

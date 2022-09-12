package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbza  reason: default package */
/* loaded from: classes5.dex */
public final class dbza<F, T> extends dclu<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final dbrn<F, ? extends T> a;
    final dclu<T> b;

    public dbza(dbrn<F, ? extends T> dbrnVar, dclu<T> dcluVar) {
        dbsk.s(dbrnVar);
        this.a = dbrnVar;
        this.b = dcluVar;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(F f, F f2) {
        return this.b.compare(this.a.a(f), this.a.a(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbza) {
            dbza dbzaVar = (dbza) obj;
            if (this.a.equals(dbzaVar.a) && this.b.equals(dbzaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}

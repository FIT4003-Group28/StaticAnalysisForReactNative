package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: baiq  reason: default package */
/* loaded from: classes2.dex */
public abstract class baiq implements Comparable, Serializable, baih {
    private static final long serialVersionUID = 9386874258972L;
    public volatile int g;

    /* JADX INFO: Access modifiers changed from: protected */
    public baiq(int i) {
        this.g = i;
    }

    @Override // defpackage.baih
    public final int a(bahx bahxVar) {
        throw null;
    }

    @Override // defpackage.baih
    public final int b(int i) {
        if (i == 0) {
            return this.g;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // defpackage.baih
    public final int c() {
        return 1;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        baiq baiqVar = (baiq) obj;
        if (baiqVar.getClass() == getClass()) {
            int i = baiqVar.g;
            int i2 = this.g;
            if (i2 > i) {
                return 1;
            }
            return i2 < i ? -1 : 0;
        }
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(baiqVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" cannot be compared to ");
        sb.append(valueOf2);
        throw new ClassCastException(sb.toString());
    }

    @Override // defpackage.baih
    public final bahx d(int i) {
        if (i == 0) {
            return f();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public abstract baie e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baih)) {
            return false;
        }
        baih baihVar = (baih) obj;
        return baihVar.e() == e() && baihVar.b(0) == this.g;
    }

    public abstract bahx f();

    public final int hashCode() {
        return ((this.g + 459) * 27) + f().hashCode();
    }
}

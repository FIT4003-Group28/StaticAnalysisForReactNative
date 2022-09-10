package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqgu  reason: default package */
/* loaded from: classes.dex */
public final class cqgu<T extends cqkp> extends cqix<T> {
    public final T a;
    private final cqiw<T> b;
    private final boolean c;

    public cqgu(cqiw<T> cqiwVar, T t, boolean z) {
        if (cqiwVar != null) {
            this.b = cqiwVar;
            if (t != null) {
                this.a = t;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null viewModel");
        }
        throw new NullPointerException("Null layout");
    }

    @Override // defpackage.cqix
    public final cqiw<T> a() {
        return this.b;
    }

    @Override // defpackage.cqix
    public final T b() {
        return this.a;
    }

    @Override // defpackage.cqix
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqix) {
            cqix cqixVar = (cqix) obj;
            if (this.b.equals(cqixVar.a()) && this.a.equals(cqixVar.b()) && this.c == cqixVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("LayoutItem{layout=");
        sb.append(valueOf);
        sb.append(", viewModel=");
        sb.append(valueOf2);
        sb.append(", enabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

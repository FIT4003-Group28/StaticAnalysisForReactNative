package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: spt  reason: default package */
/* loaded from: classes4.dex */
public final class spt {
    public final Context a;
    public final ampq b;
    public final boolean c;
    private final ampq d;

    public spt() {
    }

    public spt(Context context, ampq ampqVar, ampq ampqVar2, boolean z) {
        this.a = context;
        this.d = ampqVar;
        this.b = ampqVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spt) {
            spt sptVar = (spt) obj;
            if (this.a.equals(sptVar.a) && this.d.equals(sptVar.d) && this.b.equals(sptVar.b) && this.c == sptVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.b);
        boolean z = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CollectionBasisContext{context=");
        sb.append(valueOf);
        sb.append(", accountNames=");
        sb.append(valueOf2);
        sb.append(", stacktrace=");
        sb.append(valueOf3);
        sb.append(", googlerOverridesCheckbox=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

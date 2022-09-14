package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: clfd  reason: default package */
/* loaded from: classes5.dex */
final class clfd extends clfi {
    private final Context a;
    private final clig b;
    private final clig c;
    private final String d;

    public clfd(Context context, clig cligVar, clig cligVar2, String str) {
        if (context != null) {
            this.a = context;
            this.b = cligVar;
            this.c = cligVar2;
            if (str != null) {
                this.d = str;
                return;
            }
            throw new NullPointerException("Null backendName");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // defpackage.clfi
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.clfi
    public final clig b() {
        return this.b;
    }

    @Override // defpackage.clfi
    public final clig c() {
        return this.c;
    }

    @Override // defpackage.clfi
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clfi) {
            clfi clfiVar = (clfi) obj;
            if (this.a.equals(clfiVar.a()) && this.b.equals(clfiVar.b()) && this.c.equals(clfiVar.c()) && this.d.equals(clfiVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + str.length());
        sb.append("CreationContext{applicationContext=");
        sb.append(valueOf);
        sb.append(", wallClock=");
        sb.append(valueOf2);
        sb.append(", monotonicClock=");
        sb.append(valueOf3);
        sb.append(", backendName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bh  reason: default package */
/* loaded from: classes2.dex */
final class bh implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final ba b;
    public final be c;
    public final be d;

    public bh(String str, ba baVar, be beVar, be beVar2) {
        this.a = str;
        this.b = baVar;
        this.c = beVar;
        this.d = beVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String concat;
        String str = this.a;
        String obj = this.b.toString();
        be beVar = this.c;
        String str2 = "";
        if (beVar == null) {
            concat = str2;
        } else {
            String valueOf = String.valueOf(beVar.toString());
            concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        }
        be beVar2 = this.d;
        if (beVar2 != null) {
            String valueOf2 = String.valueOf(beVar2.toString());
            str2 = valueOf2.length() != 0 ? " ".concat(valueOf2) : new String(" ");
        }
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(obj).length() + String.valueOf(concat).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(concat);
        sb.append(str2);
        return sb.toString();
    }
}

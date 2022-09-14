package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dc  reason: default package */
/* loaded from: classes5.dex */
public final class dc implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final cv b;
    public final cz c;
    public final cz d;

    public dc(String str, cv cvVar, cz czVar, cz czVar2) {
        this.a = str;
        this.b = cvVar;
        this.c = czVar;
        this.d = czVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String concat;
        String str = this.a;
        String obj = this.b.toString();
        cz czVar = this.c;
        String str2 = "";
        if (czVar == null) {
            concat = str2;
        } else {
            String valueOf = String.valueOf(czVar.toString());
            concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        }
        cz czVar2 = this.d;
        if (czVar2 != null) {
            String valueOf2 = String.valueOf(czVar2.toString());
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

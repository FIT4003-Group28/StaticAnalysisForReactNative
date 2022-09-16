package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jbi  reason: default package */
/* loaded from: classes3.dex */
final class jbi {
    private final String a;
    private final jbh b;

    public jbi(jbh jbhVar, String str) {
        zgh.m(str);
        this.a = str;
        this.b = jbhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jbi)) {
            return false;
        }
        jbi jbiVar = (jbi) obj;
        return akzj.f(this.a, jbiVar.a) && akzj.f(this.b, jbiVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.b == jbh.PLAYLIST ? "PLAYLIST" : "VIDEO";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}

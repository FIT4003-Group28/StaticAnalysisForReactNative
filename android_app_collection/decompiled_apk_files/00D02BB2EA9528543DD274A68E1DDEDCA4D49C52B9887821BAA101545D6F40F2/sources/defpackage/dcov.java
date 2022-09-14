package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dcov  reason: default package */
/* loaded from: classes5.dex */
abstract class dcov<R, C, V> implements dcot<R, C, V> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcot) {
            dcot dcotVar = (dcot) obj;
            if (dbsd.a(a(), dcotVar.a()) && dbsd.a(b(), dcotVar.b()) && dbsd.a(c(), dcotVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c()});
    }

    public final String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(b());
        String valueOf3 = String.valueOf(c());
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(")=");
        sb.append(valueOf3);
        return sb.toString();
    }
}

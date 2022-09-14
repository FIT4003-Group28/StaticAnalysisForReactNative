package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: debp  reason: default package */
/* loaded from: classes6.dex */
public final class debp implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final boolean b;
    private final int c;

    public debp(String str, int i, boolean z) {
        this.a = str;
        this.c = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof debp) {
            debp debpVar = (debp) obj;
            if (dbsd.a(this.a, debpVar.a) && this.c == debpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.a);
            sb.append(']');
        } else {
            sb.append(this.a);
        }
        if (this.c >= 0) {
            sb.append(':');
            sb.append(this.c);
        }
        return sb.toString();
    }
}

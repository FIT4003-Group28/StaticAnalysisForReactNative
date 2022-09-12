package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: dujc  reason: default package */
/* loaded from: classes6.dex */
public final class dujc {
    public final String a;
    private final String b;

    public dujc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dujc) {
            dujc dujcVar = (dujc) obj;
            if (Objects.equals(this.a, dujcVar.a) && Objects.equals(this.b, dujcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 37) + Objects.hashCode(this.b);
    }

    public final String toString() {
        return "[packageName=" + this.a + ",libraryName=" + this.b + "]";
    }
}

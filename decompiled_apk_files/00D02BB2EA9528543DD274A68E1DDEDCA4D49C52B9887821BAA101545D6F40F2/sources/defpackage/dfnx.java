package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: dfnx  reason: default package */
/* loaded from: classes6.dex */
public final class dfnx {
    public int a = 0;
    public int b = 0;
    private final int c = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfnx)) {
            return false;
        }
        dfnx dfnxVar = (dfnx) obj;
        if (dfnxVar.a != this.a || dfnxVar.b != this.b) {
            return false;
        }
        int i = dfnxVar.c;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), 0);
    }
}

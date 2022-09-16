package defpackage;
/* compiled from: PG */
/* renamed from: ambr  reason: default package */
/* loaded from: classes2.dex */
public final class ambr {
    public final aksj a;
    public final int b;
    public final long c;

    public ambr(aksj aksjVar, int i, long j) {
        this.a = aksjVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ambr) {
            ambr ambrVar = (ambr) obj;
            if (ambrVar.a.equals(this.a) && ambrVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }
}

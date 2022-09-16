package defpackage;
/* compiled from: PG */
/* renamed from: cxy  reason: default package */
/* loaded from: classes3.dex */
public final class cxy {
    int a;
    int b;
    int c;
    int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cxy cxyVar = (cxy) obj;
        return this.c == cxyVar.c && this.b == cxyVar.b && this.d == cxyVar.d && this.a == cxyVar.a;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}

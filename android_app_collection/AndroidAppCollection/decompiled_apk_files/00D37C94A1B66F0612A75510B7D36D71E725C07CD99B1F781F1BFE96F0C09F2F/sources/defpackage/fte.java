package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: fte  reason: default package */
/* loaded from: classes3.dex */
public final class fte {
    public final Optional a;
    public final boolean b;
    public final Optional c;

    public fte() {
    }

    public fte(Optional optional, boolean z, Optional optional2) {
        this.a = optional;
        this.b = z;
        this.c = optional2;
    }

    public static ftd a() {
        ftd ftdVar = new ftd(null);
        ftdVar.a = Optional.empty();
        ftdVar.b(true);
        ftdVar.b = Optional.empty();
        return ftdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fte) {
            fte fteVar = (fte) obj;
            if (this.a.equals(fteVar.a) && this.b == fteVar.b && this.c.equals(fteVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length());
        sb.append("BottomBarModel{pivotBarStyle=");
        sb.append(valueOf);
        sb.append(", shouldShowPivotBar=");
        sb.append(z);
        sb.append(", navigationBarStyle=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

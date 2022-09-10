package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: alcl  reason: default package */
/* loaded from: classes2.dex */
public final class alcl extends aldt {
    private final amub a;
    private final Rect b;

    public alcl(amub amubVar, Rect rect) {
        if (amubVar != null) {
            this.a = amubVar;
            this.b = rect;
            return;
        }
        throw new NullPointerException("Null route");
    }

    @Override // defpackage.aldt
    public final amub a() {
        return this.a;
    }

    @Override // defpackage.aldt
    public final Rect b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aldt) {
            aldt aldtVar = (aldt) obj;
            if (this.a.equals(aldtVar.a()) && this.b.equals(aldtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("RouteAndBounds{route=");
        sb.append(valueOf);
        sb.append(", bounds=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

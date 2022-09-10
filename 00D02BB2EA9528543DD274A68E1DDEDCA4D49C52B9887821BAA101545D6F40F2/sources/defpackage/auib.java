package defpackage;
/* compiled from: PG */
/* renamed from: auib  reason: default package */
/* loaded from: classes2.dex */
final class auib extends auil {
    private final ddda a;
    private final ddcu b;

    public auib(ddda dddaVar, ddcu ddcuVar) {
        if (dddaVar != null) {
            this.a = dddaVar;
            if (ddcuVar != null) {
                this.b = ddcuVar;
                return;
            }
            throw new NullPointerException("Null geoDataElementType");
        }
        throw new NullPointerException("Null geoRequestType");
    }

    @Override // defpackage.auil
    public final ddda a() {
        return this.a;
    }

    @Override // defpackage.auil
    public final ddcu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auil) {
            auil auilVar = (auil) obj;
            if (this.a.equals(auilVar.a()) && this.b.equals(auilVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76 + String.valueOf(valueOf2).length());
        sb.append("ClientGeneratedNotificationLoggingInfo{geoRequestType=");
        sb.append(valueOf);
        sb.append(", geoDataElementType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

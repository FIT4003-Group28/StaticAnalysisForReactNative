package defpackage;
/* compiled from: PG */
/* renamed from: appq  reason: default package */
/* loaded from: classes2.dex */
public final class appq extends appu {
    private final dbsg<Long> a;
    private final boolean b;

    public appq(dbsg<Long> dbsgVar, boolean z) {
        this.a = dbsgVar;
        this.b = z;
    }

    @Override // defpackage.appu
    public final dbsg<Long> a() {
        return this.a;
    }

    @Override // defpackage.appu
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof appu) {
            appu appuVar = (appu) obj;
            if (this.a.equals(appuVar.a()) && this.b == appuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("VideoEditOption{videoEndTimeInMillis=");
        sb.append(valueOf);
        sb.append(", shouldMuteAudio=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: apps  reason: default package */
/* loaded from: classes2.dex */
final class apps extends appw {
    private final dbsg<Long> a;
    private final int b;

    public apps(int i, dbsg<Long> dbsgVar) {
        this.b = i;
        this.a = dbsgVar;
    }

    @Override // defpackage.appw
    public final dbsg<Long> a() {
        return this.a;
    }

    @Override // defpackage.appw
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof appw)) {
            return false;
        }
        appw appwVar = (appw) obj;
        int i = this.b;
        int b = appwVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a.equals(appwVar.a());
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? "null" : "FAILURE" : "SUCCESS";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 55 + String.valueOf(valueOf).length());
        sb.append("VideoEditResult{status=");
        sb.append(str);
        sb.append(", clippedVideoDurationInMillis=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

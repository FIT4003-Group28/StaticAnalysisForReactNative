package defpackage;
/* compiled from: PG */
/* renamed from: ctph  reason: default package */
/* loaded from: classes5.dex */
final class ctph extends ctqi {
    private final boolean a;
    private final int b;

    public ctph(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.ctqi
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ctqi
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqi) {
            ctqi ctqiVar = (ctqi) obj;
            if (this.a == ctqiVar.a() && this.b == ctqiVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(97);
        sb.append("CloudBootstrapDownloadConversationResult{isSuccessful=");
        sb.append(z);
        sb.append(", conversationsDownloaded=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

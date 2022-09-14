package defpackage;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcr  reason: default package */
/* loaded from: classes5.dex */
public final class dcr extends dck {
    private final File a;
    private final int b;

    public dcr(int i, File file) {
        this.b = i;
        this.a = file;
    }

    @Override // defpackage.dck
    public final File a() {
        return this.a;
    }

    @Override // defpackage.dck
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dck) {
            dck dckVar = (dck) obj;
            if (this.b == dckVar.c() && this.a.equals(dckVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b != 1 ? "FAILED" : "COMPLETED";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 34 + String.valueOf(valueOf).length());
        sb.append("DownloadStatus{statusCode=");
        sb.append(str);
        sb.append(", file=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

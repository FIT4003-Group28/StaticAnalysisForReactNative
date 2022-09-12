package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: daiu  reason: default package */
/* loaded from: classes5.dex */
final class daiu extends dajl {
    private final File a;
    private final String b;

    public daiu(File file, String str) {
        if (file != null) {
            this.a = file;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    @Override // defpackage.dajl
    public final File a() {
        return this.a;
    }

    @Override // defpackage.dajl
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dajl) {
            dajl dajlVar = (dajl) obj;
            if (this.a.equals(dajlVar.a()) && this.b.equals(dajlVar.b())) {
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
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

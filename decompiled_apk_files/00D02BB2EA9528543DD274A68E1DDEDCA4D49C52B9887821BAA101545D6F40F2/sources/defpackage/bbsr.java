package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bbsr  reason: default package */
/* loaded from: classes3.dex */
public final class bbsr extends bbuf {
    private final List<bbtm> a;
    private final String b;

    public bbsr(List<bbtm> list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.bbuf
    public final List<bbtm> a() {
        return this.a;
    }

    @Override // defpackage.bbuf
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbuf) {
            bbuf bbufVar = (bbuf) obj;
            if (this.a.equals(bbufVar.a()) && this.b.equals(bbufVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(str).length());
        sb.append("PhotoPickResult{photoMetadata=");
        sb.append(valueOf);
        sb.append(", photosLabel=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

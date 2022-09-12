package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_EdgeKeyInfo  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_EdgeKeyInfo extends EdgeKeyInfo {
    public final String a;
    public final duej b;

    public C$AutoValue_EdgeKeyInfo(String str, duej duejVar) {
        if (str != null) {
            this.a = str;
            if (duejVar != null) {
                this.b = duejVar;
                return;
            }
            throw new NullPointerException("Null containerType");
        }
        throw new NullPointerException("Null containerId");
    }

    @Override // com.google.android.libraries.social.populous.core.EdgeKeyInfo
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.EdgeKeyInfo
    public final duej b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EdgeKeyInfo) {
            EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) obj;
            if (this.a.equals(edgeKeyInfo.a()) && this.b.equals(edgeKeyInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 41 + String.valueOf(valueOf).length());
        sb.append("EdgeKeyInfo{containerId=");
        sb.append(str);
        sb.append(", containerType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

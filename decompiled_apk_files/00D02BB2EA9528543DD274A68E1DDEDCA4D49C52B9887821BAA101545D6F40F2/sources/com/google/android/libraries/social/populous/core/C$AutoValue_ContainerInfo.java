package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_ContainerInfo  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ContainerInfo extends ContainerInfo {
    public final duej a;
    public final String b;
    public final boolean c;

    public C$AutoValue_ContainerInfo(duej duejVar, String str, boolean z) {
        if (duejVar != null) {
            this.a = duejVar;
            if (str != null) {
                this.b = str;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null encodedContainerId");
        }
        throw new NullPointerException("Null containerType");
    }

    @Override // com.google.android.libraries.social.populous.core.ContainerInfo
    public final duej a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.ContainerInfo
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.ContainerInfo
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContainerInfo) {
            ContainerInfo containerInfo = (ContainerInfo) obj;
            if (this.a.equals(containerInfo.a()) && this.b.equals(containerInfo.b()) && this.c == containerInfo.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75 + str.length());
        sb.append("ContainerInfo{containerType=");
        sb.append(valueOf);
        sb.append(", encodedContainerId=");
        sb.append(str);
        sb.append(", fromVerifiedField=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

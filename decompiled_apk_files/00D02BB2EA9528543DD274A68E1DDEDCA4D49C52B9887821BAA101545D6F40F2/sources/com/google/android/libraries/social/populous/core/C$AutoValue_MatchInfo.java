package com.google.android.libraries.social.populous.core;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_MatchInfo  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_MatchInfo extends MatchInfo {
    public final int a;
    public final int b;

    public C$AutoValue_MatchInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.libraries.social.populous.core.MatchInfo
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.MatchInfo
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchInfo) {
            MatchInfo matchInfo = (MatchInfo) obj;
            if (this.a == matchInfo.a() && this.b == matchInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(53);
        sb.append("MatchInfo{startIndex=");
        sb.append(i);
        sb.append(", length=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

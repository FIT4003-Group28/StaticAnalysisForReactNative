package com.google.android.apps.gmm.ugc.intent;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.ugc.intent.$AutoValue_ReviewIntent_MinimalPlacemark  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ReviewIntent_MinimalPlacemark extends ReviewIntent$MinimalPlacemark {
    public final String a;
    public final String b;
    public final boolean c;

    public C$AutoValue_ReviewIntent_MinimalPlacemark(String str, String str2, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null placeName");
        }
        throw new NullPointerException("Null featureIdString");
    }

    @Override // com.google.android.apps.gmm.ugc.intent.ReviewIntent$MinimalPlacemark
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.ugc.intent.ReviewIntent$MinimalPlacemark
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.ugc.intent.ReviewIntent$MinimalPlacemark
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewIntent$MinimalPlacemark) {
            ReviewIntent$MinimalPlacemark reviewIntent$MinimalPlacemark = (ReviewIntent$MinimalPlacemark) obj;
            if (this.a.equals(reviewIntent$MinimalPlacemark.a()) && this.b.equals(reviewIntent$MinimalPlacemark.b()) && this.c == reviewIntent$MinimalPlacemark.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 71 + str2.length());
        sb.append("MinimalPlacemark{featureIdString=");
        sb.append(str);
        sb.append(", placeName=");
        sb.append(str2);
        sb.append(", visitDateRequired=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

package com.google.android.apps.gmm.ugc.clientnotification.review;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.ugc.clientnotification.review.$AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams extends ReviewAtAPlaceNotificationAdapter$AdapterParams {
    public final long a;
    public final String b;
    public final String c;
    public final dbsg<String> d;
    public final dbsg<String> e;
    public final dbsg<String> f;
    public final dbsg<bzvt> g;
    public final dbsg<bzvt> h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final dbsg<byte[]> m;
    public final dbsg<byte[]> n;
    public final boolean o;

    public C$AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams(long j, String str, String str2, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<bzvt> dbsgVar4, dbsg<bzvt> dbsgVar5, boolean z, boolean z2, boolean z3, int i, dbsg<byte[]> dbsgVar6, dbsg<byte[]> dbsgVar7, boolean z4) {
        this.a = j;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (dbsgVar != null) {
                    this.d = dbsgVar;
                    if (dbsgVar2 != null) {
                        this.e = dbsgVar2;
                        if (dbsgVar3 != null) {
                            this.f = dbsgVar3;
                            if (dbsgVar4 != null) {
                                this.g = dbsgVar4;
                                if (dbsgVar5 != null) {
                                    this.h = dbsgVar5;
                                    this.i = z;
                                    this.j = z2;
                                    this.k = z3;
                                    this.l = i;
                                    if (dbsgVar6 != null) {
                                        this.m = dbsgVar6;
                                        if (dbsgVar7 != null) {
                                            this.n = dbsgVar7;
                                            this.o = z4;
                                            return;
                                        }
                                        throw new NullPointerException("Null genericNotificationClientDataByteArray");
                                    }
                                    throw new NullPointerException("Null notificationTextByteArray");
                                }
                                throw new NullPointerException("Null modifiedReview");
                            }
                            throw new NullPointerException("Null initialReview");
                        }
                        throw new NullPointerException("Null writeReviewHintText");
                    }
                    throw new NullPointerException("Null accountName");
                }
                throw new NullPointerException("Null obfuscatedGaiaId");
            }
            throw new NullPointerException("Null placeName");
        }
        throw new NullPointerException("Null featureIdString");
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewAtAPlaceNotificationAdapter$AdapterParams) {
            ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams = (ReviewAtAPlaceNotificationAdapter$AdapterParams) obj;
            if (this.a == reviewAtAPlaceNotificationAdapter$AdapterParams.a() && this.b.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.b()) && this.c.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.c()) && this.d.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.d()) && this.e.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.e()) && this.f.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.f()) && this.g.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.g()) && this.h.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.h()) && this.i == reviewAtAPlaceNotificationAdapter$AdapterParams.i() && this.j == reviewAtAPlaceNotificationAdapter$AdapterParams.j() && this.k == reviewAtAPlaceNotificationAdapter$AdapterParams.k() && this.l == reviewAtAPlaceNotificationAdapter$AdapterParams.l() && this.m.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.m()) && this.n.equals(reviewAtAPlaceNotificationAdapter$AdapterParams.n()) && this.o == reviewAtAPlaceNotificationAdapter$AdapterParams.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<String> f() {
        return this.f;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<bzvt> g() {
        return this.g;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<bzvt> h() {
        return this.h;
    }

    public final int hashCode() {
        long j = this.a;
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        if (true == this.o) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final boolean i() {
        return this.i;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final boolean j() {
        return this.j;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final boolean k() {
        return this.k;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final int l() {
        return this.l;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<byte[]> m() {
        return this.m;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final dbsg<byte[]> n() {
        return this.n;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final boolean o() {
        return this.o;
    }

    @Override // com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams
    public final bzuy p() {
        return new bzum(this);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        int i = this.l;
        String valueOf6 = String.valueOf(this.m);
        String valueOf7 = String.valueOf(this.n);
        boolean z4 = this.o;
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 402 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("AdapterParams{notificationShownTimestamp=");
        sb.append(j);
        sb.append(", featureIdString=");
        sb.append(str);
        sb.append(", placeName=");
        sb.append(str2);
        sb.append(", obfuscatedGaiaId=");
        sb.append(valueOf);
        sb.append(", accountName=");
        sb.append(valueOf2);
        sb.append(", writeReviewHintText=");
        sb.append(valueOf3);
        sb.append(", initialReview=");
        sb.append(valueOf4);
        sb.append(", modifiedReview=");
        sb.append(valueOf5);
        sb.append(", hasLargeIconBeenSavedToBitmapCache=");
        sb.append(z);
        sb.append(", isAlreadyShowingLockScreenFeedback=");
        sb.append(z2);
        sb.append(", isDining=");
        sb.append(z3);
        sb.append(", notificationId=");
        sb.append(i);
        sb.append(", notificationTextByteArray=");
        sb.append(valueOf6);
        sb.append(", genericNotificationClientDataByteArray=");
        sb.append(valueOf7);
        sb.append(", visitDateRequired=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}

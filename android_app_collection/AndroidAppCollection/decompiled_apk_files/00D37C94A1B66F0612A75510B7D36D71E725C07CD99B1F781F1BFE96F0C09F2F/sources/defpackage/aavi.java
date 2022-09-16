package defpackage;
/* compiled from: PG */
/* renamed from: aavi  reason: default package */
/* loaded from: classes.dex */
public final class aavi {
    public final String a;
    public final amuk b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final arif i;
    public final amuk j;
    public final aufp k;

    public aavi() {
    }

    public aavi(String str, amuk amukVar, String str2, Long l, String str3, String str4, String str5, String str6, arif arifVar, amuk amukVar2, aufp aufpVar) {
        this.a = str;
        this.b = amukVar;
        this.c = str2;
        this.d = l;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = arifVar;
        this.j = amukVar2;
        this.k = aufpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aavi) {
            aavi aaviVar = (aavi) obj;
            String str = this.a;
            if (str != null ? str.equals(aaviVar.a) : aaviVar.a == null) {
                amuk amukVar = this.b;
                if (amukVar != null ? amxp.v(amukVar, aaviVar.b) : aaviVar.b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(aaviVar.c) : aaviVar.c == null) {
                        Long l = this.d;
                        if (l != null ? l.equals(aaviVar.d) : aaviVar.d == null) {
                            String str3 = this.e;
                            if (str3 != null ? str3.equals(aaviVar.e) : aaviVar.e == null) {
                                String str4 = this.f;
                                if (str4 != null ? str4.equals(aaviVar.f) : aaviVar.f == null) {
                                    String str5 = this.g;
                                    if (str5 != null ? str5.equals(aaviVar.g) : aaviVar.g == null) {
                                        String str6 = this.h;
                                        if (str6 != null ? str6.equals(aaviVar.h) : aaviVar.h == null) {
                                            arif arifVar = this.i;
                                            if (arifVar != null ? arifVar.equals(aaviVar.i) : aaviVar.i == null) {
                                                amuk amukVar2 = this.j;
                                                if (amukVar2 != null ? amxp.v(amukVar2, aaviVar.j) : aaviVar.j == null) {
                                                    aufp aufpVar = this.k;
                                                    aufp aufpVar2 = aaviVar.k;
                                                    if (aufpVar != null ? aufpVar.equals(aufpVar2) : aufpVar2 == null) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        amuk amukVar = this.b;
        int hashCode2 = (hashCode ^ (amukVar == null ? 0 : amukVar.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.d;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.g;
        int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.h;
        int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        arif arifVar = this.i;
        int hashCode9 = (hashCode8 ^ (arifVar == null ? 0 : arifVar.hashCode())) * 1000003;
        amuk amukVar2 = this.j;
        int hashCode10 = (hashCode9 ^ (amukVar2 == null ? 0 : amukVar2.hashCode())) * 1000003;
        aufp aufpVar = this.k;
        if (aufpVar != null) {
            i = aufpVar.hashCode();
        }
        return hashCode10 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        int length8 = String.valueOf(str6).length();
        int length9 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 220 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PostCreationData{contentText=");
        sb.append(str);
        sb.append(", pollOptions=");
        sb.append(valueOf);
        sb.append(", accessRestrictions=");
        sb.append(str2);
        sb.append(", scheduledPublishTimeSec=");
        sb.append(valueOf2);
        sb.append(", videoId=");
        sb.append(str3);
        sb.append(", lightweightVideoId=");
        sb.append(str4);
        sb.append(", imageEncryptedBlobId=");
        sb.append(str5);
        sb.append(", imageSourceVideoId=");
        sb.append(str6);
        sb.append(", imagePreviewCoordinates=");
        sb.append(valueOf3);
        sb.append(", images=");
        sb.append(valueOf4);
        sb.append(", postCreationData=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}

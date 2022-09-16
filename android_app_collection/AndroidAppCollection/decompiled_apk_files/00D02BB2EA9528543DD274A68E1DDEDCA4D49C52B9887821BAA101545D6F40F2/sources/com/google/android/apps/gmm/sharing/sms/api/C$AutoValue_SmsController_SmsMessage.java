package com.google.android.apps.gmm.sharing.sms.api;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.sharing.sms.api.$AutoValue_SmsController_SmsMessage  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_SmsController_SmsMessage extends SmsController$SmsMessage {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public C$AutoValue_SmsController_SmsMessage(String str, String str2, String str3, String str4, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null messageContents");
        }
        throw new NullPointerException("Null messageRecipient");
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SmsController$SmsMessage) {
            SmsController$SmsMessage smsController$SmsMessage = (SmsController$SmsMessage) obj;
            if (this.a.equals(smsController$SmsMessage.a()) && this.b.equals(smsController$SmsMessage.b()) && ((str = this.c) != null ? str.equals(smsController$SmsMessage.c()) : smsController$SmsMessage.c() == null) && ((str2 = this.d) != null ? str2.equals(smsController$SmsMessage.d()) : smsController$SmsMessage.d() == null) && this.e == smsController$SmsMessage.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 97 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("SmsMessage{messageRecipient=");
        sb.append(str);
        sb.append(", messageContents=");
        sb.append(str2);
        sb.append(", subject=");
        sb.append(str3);
        sb.append(", imageUrl=");
        sb.append(str4);
        sb.append(", allowFallbackToIntent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

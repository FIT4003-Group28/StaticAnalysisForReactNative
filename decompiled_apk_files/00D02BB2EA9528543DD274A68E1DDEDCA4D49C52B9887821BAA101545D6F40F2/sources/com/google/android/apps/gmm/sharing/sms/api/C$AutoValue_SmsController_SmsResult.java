package com.google.android.apps.gmm.sharing.sms.api;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.sharing.sms.api.$AutoValue_SmsController_SmsResult  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_SmsController_SmsResult extends SmsController$SmsResult {
    public final SmsController$SmsMessage a;
    public final int b;
    public final dbsg<Integer> c;

    public C$AutoValue_SmsController_SmsResult(SmsController$SmsMessage smsController$SmsMessage, int i, dbsg<Integer> dbsgVar) {
        if (smsController$SmsMessage != null) {
            this.a = smsController$SmsMessage;
            this.b = i;
            if (dbsgVar != null) {
                this.c = dbsgVar;
                return;
            }
            throw new NullPointerException("Null nativeSendResult");
        }
        throw new NullPointerException("Null message");
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult
    public final SmsController$SmsMessage a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsResult
    public final dbsg<Integer> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SmsController$SmsResult) {
            SmsController$SmsResult smsController$SmsResult = (SmsController$SmsResult) obj;
            if (this.a.equals(smsController$SmsResult.a()) && this.b == smsController$SmsResult.b() && this.c.equals(smsController$SmsResult.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58 + String.valueOf(valueOf2).length());
        sb.append("SmsResult{message=");
        sb.append(valueOf);
        sb.append(", result=");
        sb.append(i);
        sb.append(", nativeSendResult=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

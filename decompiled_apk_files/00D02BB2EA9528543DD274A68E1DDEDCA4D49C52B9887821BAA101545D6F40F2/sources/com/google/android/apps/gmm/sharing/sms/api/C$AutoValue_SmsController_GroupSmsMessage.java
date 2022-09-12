package com.google.android.apps.gmm.sharing.sms.api;

import com.google.android.filament.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.sharing.sms.api.$AutoValue_SmsController_GroupSmsMessage  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_SmsController_GroupSmsMessage extends SmsController$GroupSmsMessage {
    public final List<String> a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public C$AutoValue_SmsController_GroupSmsMessage(List<String> list, String str, String str2, String str3, boolean z) {
        if (list != null) {
            this.a = list;
            if (str != null) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null messageContents");
        }
        throw new NullPointerException("Null messageRecipients");
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage
    public final List<String> a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.sharing.sms.api.SmsController$GroupSmsMessage
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SmsController$GroupSmsMessage) {
            SmsController$GroupSmsMessage smsController$GroupSmsMessage = (SmsController$GroupSmsMessage) obj;
            if (this.a.equals(smsController$GroupSmsMessage.a()) && this.b.equals(smsController$GroupSmsMessage.b()) && ((str = this.c) != null ? str.equals(smsController$GroupSmsMessage.c()) : smsController$GroupSmsMessage.c() == null) && ((str2 = this.d) != null ? str2.equals(smsController$GroupSmsMessage.d()) : smsController$GroupSmsMessage.d() == null) && this.e == smsController$GroupSmsMessage.e()) {
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
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + length2 + length3 + String.valueOf(str3).length());
        sb.append("GroupSmsMessage{messageRecipients=");
        sb.append(valueOf);
        sb.append(", messageContents=");
        sb.append(str);
        sb.append(", subject=");
        sb.append(str2);
        sb.append(", imageUrl=");
        sb.append(str3);
        sb.append(", allowFallbackToIntent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

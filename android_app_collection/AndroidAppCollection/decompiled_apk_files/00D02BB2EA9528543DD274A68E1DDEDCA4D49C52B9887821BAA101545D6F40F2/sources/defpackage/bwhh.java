package defpackage;

import com.google.android.apps.gmm.sharing.sms.api.AutoValue_SmsController_SmsMessage;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
/* compiled from: PG */
/* renamed from: bwhh  reason: default package */
/* loaded from: classes4.dex */
public final class bwhh extends bwhp {
    public String a;
    public String b;
    private String c;
    private String d;
    private Boolean e;

    @Override // defpackage.bwhp
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.bwhp
    public final void c(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null messageContents");
    }

    @Override // defpackage.bwhp
    public final void d(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null messageRecipient");
    }

    @Override // defpackage.bwhp
    public final SmsController$SmsMessage a() {
        String str = this.c == null ? " messageRecipient" : "";
        if (this.d == null) {
            str = str.concat(" messageContents");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" allowFallbackToIntent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_SmsController_SmsMessage(this.c, this.d, this.a, this.b, this.e.booleanValue());
    }
}

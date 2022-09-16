package defpackage;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel;
/* compiled from: PG */
/* renamed from: cxrg  reason: default package */
/* loaded from: classes5.dex */
public final class cxrg {
    public String a;
    public String b;
    public int c;
    public String d;

    public final ManualChannel a(Context context) {
        dbsk.s(this.b);
        if (cxqz.a(this.b)) {
            this.c = 1;
        } else {
            this.c = PhoneNumberUtils.formatNumberToE164(this.b, cxqz.f(context)) != null ? 2 : 0;
        }
        this.d = cxrc.f(this.b);
        return new ManualChannel(this);
    }
}

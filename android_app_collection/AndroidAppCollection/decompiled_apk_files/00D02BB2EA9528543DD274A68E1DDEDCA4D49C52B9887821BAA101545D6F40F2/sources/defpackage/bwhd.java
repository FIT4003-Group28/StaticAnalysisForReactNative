package defpackage;

import android.telephony.PhoneNumberUtils;
/* renamed from: bwhd  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwhd implements dbrn {
    static final dbrn a = new bwhd();

    private bwhd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return PhoneNumberUtils.stripSeparators((String) obj);
    }
}

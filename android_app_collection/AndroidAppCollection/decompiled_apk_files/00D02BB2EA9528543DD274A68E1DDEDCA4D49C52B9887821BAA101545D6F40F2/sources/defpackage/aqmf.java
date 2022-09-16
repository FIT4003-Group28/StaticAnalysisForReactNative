package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: aqmf  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqmf implements cqjb {
    static final cqjb a = new aqmf();

    private aqmf() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = aqmg.a;
        return context.getString(R.string.MESSAGING_INBOX_NO_MESSAGES_DESCRIPTION, context.getString(R.string.LOCAL_CLICK_TO_CHAT_ACTION_MESSAGE));
    }
}

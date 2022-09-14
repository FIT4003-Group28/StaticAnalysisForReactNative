package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: cicm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cicm implements cqjb {
    static final cqjb a = new cicm();

    private cicm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        String string = context.getString(R.string.PLACE_MENU_DISMISS_PLACE);
        String e = ((cict) cqkpVar).e();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(e).length());
        sb.append(string);
        sb.append(" ");
        sb.append(e);
        return sb.toString();
    }
}

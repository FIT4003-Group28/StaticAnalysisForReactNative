package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qvt  reason: default package */
/* loaded from: classes7.dex */
public abstract class qvt {
    public static qvt a(Context context) {
        return new qvv(context.getText(R.string.COMMUTE_TO_HOME_TITLE), context.getText(R.string.COMMUTE_HUB_DIRECTION_SWITCHER_HOME_ITEM), context.getText(R.string.COMMUTE_HUB_DIRECTION_SWITCHER_ADD_HOME_ITEM), context.getText(R.string.COMMUTE_EDIT_HOME_BUTTON_DESCRIPTION), cjtd.a(dtxl.ak), cjtd.a(dtxl.at), cjtd.a(dtxl.ap), cjtd.a(dtxl.ar));
    }

    public static qvt b(Context context) {
        return new qvv(context.getText(R.string.COMMUTE_TO_WORK_TITLE), context.getText(R.string.COMMUTE_HUB_DIRECTION_SWITCHER_WORK_ITEM), context.getText(R.string.COMMUTE_HUB_DIRECTION_SWITCHER_ADD_WORK_ITEM), context.getText(R.string.COMMUTE_EDIT_WORK_BUTTON_DESCRIPTION), cjtd.a(dtxl.ak), cjtd.a(dtxl.au), cjtd.a(dtxl.aq), cjtd.a(dtxl.as));
    }

    public static qvt c(Context context, @dzsi CharSequence charSequence) {
        String string;
        if (TextUtils.isEmpty(charSequence)) {
            string = context.getString(R.string.COMMUTE_PLACEHOLDER_TITLE);
        } else {
            string = context.getString(R.string.COMMUTE_TO_OTHER_TITLE, charSequence);
        }
        return new qvv(string, "", "", "", cjtd.a(dtxl.ax), null, null, null);
    }

    public abstract CharSequence d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    @dzsi
    public abstract cjtd h();

    @dzsi
    public abstract cjtd i();

    @dzsi
    public abstract cjtd j();

    @dzsi
    public abstract cjtd k();
}

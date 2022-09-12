package defpackage;

import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: cmzz  reason: default package */
/* loaded from: classes.dex */
public final class cmzz {
    public static final cmzz a = new cmzz();

    private cmzz() {
    }

    public static final String a(View view) {
        String simpleName = view.getClass().getSimpleName();
        dbrz j = dbrz.e(", ").j();
        String str = null;
        String str2 = true != view.isShown() ? null : "shown";
        String str3 = true != view.isFocusable() ? null : "focusable";
        Object[] objArr = new Object[3];
        objArr[0] = true != view.hasFocus() ? null : "hasFocus";
        objArr[1] = true != view.isFocused() ? null : "focused";
        if (true == view.hasWindowFocus()) {
            str = "hasWindowFocus";
        }
        objArr[2] = str;
        String i = j.i(str2, str3, objArr);
        try {
            return String.format("%s (%s) [%s]", view.getResources().getResourceEntryName(view.getId()), simpleName, i);
        } catch (Resources.NotFoundException unused) {
            return String.format("%s [%s]", simpleName, i);
        }
    }
}

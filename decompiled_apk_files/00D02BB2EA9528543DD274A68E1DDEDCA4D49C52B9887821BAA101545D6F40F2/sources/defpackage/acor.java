package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: acor  reason: default package */
/* loaded from: classes2.dex */
public final class acor {
    public static final WeakHashMap<View, PopupWindow> a = new WeakHashMap<>();

    public static cqiw<acpa> a() {
        return d(null, aclq.a(), aclq.c());
    }

    public static cqiw<acpa> b(cqtc cqtcVar, cqrp cqrpVar) {
        return d(null, cqtcVar, cqrpVar);
    }

    public static cqiw<acpa> c(ddho ddhoVar) {
        return d(ddhoVar, aclq.a(), aclq.c());
    }

    public static cqiw<acpa> d(ddho ddhoVar, cqtc cqtcVar, cqrp cqrpVar) {
        return new acom(new Object[]{ddhoVar, cqtcVar, cqrpVar}, cqtcVar, cqrpVar, ddhoVar);
    }

    public static cqmt<acpa> e() {
        return new acop();
    }

    public static void f(View view) {
        PopupWindow remove = a.remove(view);
        if (remove != null) {
            remove.dismiss();
        }
    }
}

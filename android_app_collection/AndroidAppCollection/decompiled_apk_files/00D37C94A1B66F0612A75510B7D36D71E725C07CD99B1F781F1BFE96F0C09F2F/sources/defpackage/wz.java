package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: wz  reason: default package */
/* loaded from: classes4.dex */
public final class wz extends ww implements wx {
    public static Method a;
    public wx b;

    static {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
    }

    public wz(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.ww
    public final vv p(Context context, boolean z) {
        wy wyVar = new wy(context, z);
        wyVar.e = this;
        return wyVar;
    }
}

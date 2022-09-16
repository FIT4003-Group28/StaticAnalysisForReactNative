package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: aat  reason: default package */
/* loaded from: classes2.dex */
public final class aat extends aaq implements aar {
    public static Method a;
    public aar b;

    static {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
    }

    public aat(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.aar
    public final void a(vf vfVar, MenuItem menuItem) {
        aar aarVar = this.b;
        if (aarVar != null) {
            aarVar.a(vfVar, menuItem);
        }
    }

    @Override // defpackage.aar
    public final void b(vf vfVar, MenuItem menuItem) {
        aar aarVar = this.b;
        if (aarVar != null) {
            aarVar.b(vfVar, menuItem);
        }
    }

    @Override // defpackage.aaq
    public final zh w(Context context, boolean z) {
        aas aasVar = new aas(context, z);
        aasVar.setHoverListener(this);
        return aasVar;
    }
}

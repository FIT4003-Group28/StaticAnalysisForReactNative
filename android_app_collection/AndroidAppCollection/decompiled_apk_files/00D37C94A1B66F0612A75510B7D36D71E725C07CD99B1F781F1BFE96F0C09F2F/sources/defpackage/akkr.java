package defpackage;

import android.widget.PopupWindow;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akkr  reason: default package */
/* loaded from: classes.dex */
public final class akkr implements PopupWindow.OnDismissListener {
    private final Set a;

    public akkr(aafo aafoVar) {
        aafoVar.getClass();
        this.a = new HashSet();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.add(null);
    }
}

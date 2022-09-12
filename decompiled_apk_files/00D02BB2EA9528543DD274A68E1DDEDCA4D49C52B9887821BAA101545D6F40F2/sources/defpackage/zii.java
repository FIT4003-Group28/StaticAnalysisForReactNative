package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zii  reason: default package */
/* loaded from: classes7.dex */
public final class zii implements Runnable {
    final /* synthetic */ zik a;

    public zii(zik zikVar) {
        this.a = zikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.b, (int) R.string.CREATE_DIRECTIONS_SHORTCUT_DISMISS_TOAST, 1).show();
        Runnable runnable = this.a.j;
        if (runnable == null) {
            bvoo.h("createDismissRunnable() - dismissCallback was null.", new Object[0]);
        } else {
            runnable.run();
        }
    }
}

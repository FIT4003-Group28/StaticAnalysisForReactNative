package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aggb  reason: default package */
/* loaded from: classes.dex */
public final class aggb {
    public final Context a;
    public final ajxz b;
    public final akbk c;
    public final Executor d;
    public final Executor e;
    public PopupWindow f;
    public boolean g;

    public aggb(Context context, ajxz ajxzVar, akbk akbkVar, Executor executor, Executor executor2) {
        this.a = context;
        this.b = ajxzVar;
        this.c = akbkVar;
        this.d = executor;
        this.e = executor2;
    }

    public final void a() {
        PopupWindow popupWindow = this.f;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f = null;
        }
        this.g = false;
    }

    public final void b(View view, boolean z) {
        if (z) {
            view.setBackgroundColor(zhn.d(this.a, R.attr.ytGeneralBackgroundB));
        } else {
            view.setBackgroundColor(zhn.d(this.a, R.attr.ytBrandBackgroundSolid));
        }
    }
}

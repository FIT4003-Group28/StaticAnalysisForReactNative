package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: xno  reason: default package */
/* loaded from: classes4.dex */
public final class xno {
    public final int[] a;
    private final Handler b;

    public xno(Handler handler) {
        handler.getClass();
        this.b = handler;
        this.a = new int[2];
    }

    public final void a(String str, int i, View view) {
        akfl a;
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                a = null;
            } else {
                akfy akfyVar = new akfy(view);
                akfyVar.a = 1;
                akfyVar.b();
                akfyVar.c = str;
                akfyVar.h = i;
                akfyVar.i = true;
                a = akfyVar.a();
            }
            if (a == null) {
                return;
            }
            a.h();
            a.c(new akkz(a, 1));
            this.b.postDelayed(new akla(a, 1), 5000L);
            a.d();
            view.getLocationOnScreen(this.a);
            view.getViewTreeObserver().addOnPreDrawListener(new xnn(this, a, view));
        }
    }
}

package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
/* compiled from: PG */
/* renamed from: ziq  reason: default package */
/* loaded from: classes7.dex */
public class ziq {
    private final gga a;
    private final cqkj b;
    private final zrj c;

    public ziq(gga ggaVar, cqkj cqkjVar, zrj zrjVar) {
        this.a = ggaVar;
        this.b = cqkjVar;
        this.c = zrjVar;
    }

    public final Dialog a(dqvj dqvjVar, dwao dwaoVar, zrz zrzVar) {
        zri m = zri.m(this.c, dqvjVar, dwaoVar, zrzVar);
        cqkf e = this.b.e(new uts());
        e.e(m);
        Dialog dialog = new Dialog(this.a, 16974129);
        dialog.setContentView(e.c());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        return dialog;
    }
}

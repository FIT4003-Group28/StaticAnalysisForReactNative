package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hxt  reason: default package */
/* loaded from: classes3.dex */
public final class hxt implements cfa {
    public final AlertDialog a;
    final /* synthetic */ hxu b;

    public hxt(hxu hxuVar, AlertDialog alertDialog) {
        this.b = hxuVar;
        this.a = alertDialog;
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        Void r2 = (Void) obj;
        hxu hxuVar = this.b;
        if (hxuVar.c.a) {
            return;
        }
        ((Activity) hxuVar.a).runOnUiThread(new Runnable() { // from class: hxs
            @Override // java.lang.Runnable
            public final void run() {
                hxt hxtVar = hxt.this;
                hxtVar.a.dismiss();
                hxu hxuVar2 = hxtVar.b;
                zag.q(hxuVar2.a, true != hxuVar2.c.b ? R.string.download_reel_item_saved : R.string.download_reel_item_error, 1);
            }
        });
    }
}

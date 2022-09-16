package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xux  reason: default package */
/* loaded from: classes4.dex */
public final class xux {
    final /* synthetic */ xya a;
    final /* synthetic */ xuy b;

    public xux(xuy xuyVar, xya xyaVar) {
        this.b = xuyVar;
        this.a = xyaVar;
    }

    public final void a(String str) {
        xuz xuzVar = this.b.a;
        xuzVar.aL = str;
        xuzVar.aL();
        this.a.b();
    }

    public final void b() {
        xuz xuzVar = this.b.a;
        if (xuzVar.aK == null) {
            xuzVar.aM = null;
            xuzVar.aL();
            this.a.b();
            Toast.makeText(this.b.a.mJ(), (int) R.string.backstage_post_attach_video_failed, 1).show();
        }
    }
}

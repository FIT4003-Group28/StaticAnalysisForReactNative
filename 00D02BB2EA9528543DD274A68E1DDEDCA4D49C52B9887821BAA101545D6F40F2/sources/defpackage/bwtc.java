package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwtc  reason: default package */
/* loaded from: classes4.dex */
final class bwtc implements Runnable {
    final /* synthetic */ bwtg a;

    public bwtc(bwtg bwtgVar) {
        this.a = bwtgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.H() != null) {
            bxbs bxbsVar = this.a.a.ay;
            if (bxbsVar != null) {
                dfrh dfrhVar = bxbsVar.l;
                if (dfrhVar != null) {
                    bxbsVar.x = (dfrhVar.a() != null) | bxbsVar.x;
                }
                if (bxbsVar.x) {
                    return;
                }
            }
            if (this.a.a.D() || !this.a.a.S()) {
                return;
            }
            Toast.makeText(this.a.a.H().getApplicationContext(), (int) R.string.STREETVIEW_NOT_AVAILABLE, 0).show();
            this.a.a.Q().e();
        }
    }
}

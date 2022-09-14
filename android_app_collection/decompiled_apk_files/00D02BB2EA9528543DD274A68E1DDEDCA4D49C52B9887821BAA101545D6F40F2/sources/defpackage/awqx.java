package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awqx  reason: default package */
/* loaded from: classes3.dex */
public final class awqx implements Runnable {
    final /* synthetic */ awqy a;

    public awqx(awqy awqyVar) {
        this.a = awqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            awqy awqyVar = this.a;
            if (awqyVar.b) {
                return;
            }
            GmmLocation gmmLocation = awqyVar.c;
            if (gmmLocation != null) {
                awtn k = awtn.l(gmmLocation.B(), this.a.e.d.b()).k();
                this.a.e.k(k);
                awqy awqyVar2 = this.a;
                if (awqyVar2.a) {
                    awqyVar2.e.m(k, false);
                }
            } else {
                Toast.makeText(awqyVar.e.b, (int) R.string.FAILED_TO_SAVE_PARKING, 1).show();
            }
        }
    }
}

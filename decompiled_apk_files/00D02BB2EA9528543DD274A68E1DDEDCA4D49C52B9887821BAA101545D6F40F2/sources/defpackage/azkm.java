package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azkm  reason: default package */
/* loaded from: classes3.dex */
final class azkm {
    final /* synthetic */ azko a;

    public azkm(azko azkoVar) {
        this.a = azkoVar;
    }

    public final void a() {
        int i = azko.e;
        Toast.makeText(this.a.J(), this.a.Rp(R.string.MY_PLACES_DELETE_SERVICE_UNAVAILABLE), 0).show();
        this.a.b.cancel();
    }
}

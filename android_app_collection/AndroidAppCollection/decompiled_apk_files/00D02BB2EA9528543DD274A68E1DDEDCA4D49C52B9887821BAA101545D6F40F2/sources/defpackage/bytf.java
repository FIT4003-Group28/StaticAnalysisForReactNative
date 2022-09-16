package defpackage;

import android.app.Application;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bytf  reason: default package */
/* loaded from: classes4.dex */
final class bytf implements Runnable {
    final /* synthetic */ bytg a;

    public bytf(bytg bytgVar) {
        this.a = bytgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Application application = this.a.a;
        Toast.makeText(application, application.getResources().getString(R.string.TRANSIT_STATION_THANK_YOU_FOR_FEEDBACK), 1).show();
    }
}

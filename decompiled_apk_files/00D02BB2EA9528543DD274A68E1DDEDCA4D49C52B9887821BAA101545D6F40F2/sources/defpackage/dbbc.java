package defpackage;

import android.os.Bundle;
import com.google.ar.core.ArCoreApk;
/* compiled from: PG */
/* renamed from: dbbc  reason: default package */
/* loaded from: classes5.dex */
final class dbbc extends daid {
    final /* synthetic */ dbbd a;

    public dbbc(dbbd dbbdVar) {
        this.a = dbbdVar;
    }

    @Override // defpackage.daie
    public final void b(Bundle bundle) {
    }

    @Override // defpackage.daie
    public final void c(Bundle bundle) {
        int i = bundle.getInt("error.code", -100);
        if (i == -5) {
            this.a.b.onResult(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i == -3) {
            this.a.b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i == 0) {
            this.a.b.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("requestInfo returned: ");
            sb.append(i);
            sb.toString();
            this.a.b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}

package defpackage;

import android.content.Context;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rdj  reason: default package */
/* loaded from: classes4.dex */
public final class rdj {
    public final rdb a;
    public final Executor b;
    public final rdk c;

    public rdj(Context context, Executor executor) {
        rdk rdkVar = new rdk(context.getApplicationContext());
        rdp rdpVar = new rdp(context);
        this.c = rdkVar;
        this.a = rdpVar;
        this.b = executor;
    }

    public static rde a(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        int i = 1;
        if (gmsDeviceComplianceResponse == null) {
            i = 3;
        } else if (true == gmsDeviceComplianceResponse.b) {
            i = 4;
        }
        return new rde(i);
    }
}

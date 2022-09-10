package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.TelemetryData;
/* compiled from: PG */
/* renamed from: cnxd  reason: default package */
/* loaded from: classes5.dex */
public final class cnxd extends cnof<cnwk> implements cnwj {
    public static final /* synthetic */ int a = 0;
    private static final cnoa<cnxe> k;
    private static final cnnp<cnxe, cnwk> l;
    private static final Api<cnwk> m;

    static {
        cnoa<cnxe> cnoaVar = new cnoa<>();
        k = cnoaVar;
        cnxc cnxcVar = new cnxc();
        l = cnxcVar;
        m = new Api<>("ClientTelemetry.API", cnxcVar, cnoaVar);
    }

    public cnxd(Context context, cnwk cnwkVar) {
        super(context, m, cnwkVar, cnoe.a);
    }

    @Override // defpackage.cnwj
    public final void a(final TelemetryData telemetryData) {
        cntc builder = cntd.builder();
        builder.b = new Feature[]{cnlj.a};
        builder.c();
        builder.a = new cnsr(telemetryData) { // from class: cnxb
            private final TelemetryData a;

            {
                this.a = telemetryData;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = this.a;
                int i = cnxd.a;
                ((cnwx) ((cnxe) obj).L()).e(telemetryData2);
                ((cpct) obj2).a(null);
            }
        };
        e(builder.a());
    }
}

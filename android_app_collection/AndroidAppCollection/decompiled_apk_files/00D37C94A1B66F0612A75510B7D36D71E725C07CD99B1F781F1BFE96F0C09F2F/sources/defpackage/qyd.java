package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
/* compiled from: PG */
/* renamed from: qyd  reason: default package */
/* loaded from: classes4.dex */
public final class qyd extends qst implements qxx {
    public static final /* synthetic */ int a = 0;
    private static final qso b;
    private static final twx c;
    private static final tzc d;

    static {
        twx twxVar = new twx();
        c = twxVar;
        qyc qycVar = new qyc();
        d = qycVar;
        b = new qso("ClientTelemetry.API", qycVar, twxVar, null, null, null);
    }

    public qyd(Context context, qxy qxyVar) {
        super(context, b, qxyVar, qss.a);
    }

    @Override // defpackage.qxx
    public final void a(final TelemetryData telemetryData) {
        qvx b2 = qvy.b();
        b2.b = new Feature[]{qqq.a};
        b2.b();
        b2.a = new qvo() { // from class: qyb
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = qyd.a;
                qya qyaVar = (qya) ((qye) obj).D();
                Parcel pv = qyaVar.pv();
                dve.g(pv, telemetryData2);
                qyaVar.py(1, pv);
                ((rvh) obj2).b(null);
            }
        };
        r(b2.a());
    }
}

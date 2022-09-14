package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.LocationServices;
/* compiled from: PG */
/* renamed from: cojh  reason: default package */
/* loaded from: classes5.dex */
public final class cojh extends cnof<cnnv> {
    public cojh(Context context) {
        super(context, LocationServices.API, (cnnx) null, cnoe.a);
    }

    public final cpcq<Void> a(final long j, final PendingIntent pendingIntent) {
        cntc builder = cntd.builder();
        builder.a = new cnsr(j, pendingIntent) { // from class: cojf
            private final long a;
            private final PendingIntent b;

            {
                this.a = j;
                this.b = pendingIntent;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                ((conr) obj).Q(this.a, this.b);
                ((cpct) obj2).a(null);
            }
        };
        builder.c = 2401;
        return d(builder.a());
    }

    public final cpcq<Void> b(final PendingIntent pendingIntent) {
        cntc builder = cntd.builder();
        builder.a = new cnsr(pendingIntent) { // from class: cojg
            private final PendingIntent a;

            {
                this.a = pendingIntent;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                ((conr) obj).R(this.a);
                ((cpct) obj2).a(null);
            }
        };
        builder.c = 2402;
        return d(builder.a());
    }
}

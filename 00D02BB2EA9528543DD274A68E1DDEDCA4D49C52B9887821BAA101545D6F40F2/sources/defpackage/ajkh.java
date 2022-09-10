package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import com.google.android.gms.location.LocationServices;
/* compiled from: PG */
/* renamed from: ajkh  reason: default package */
/* loaded from: classes2.dex */
public final class ajkh {
    public final cqat a;
    public final cokf b;
    public final ajzn c;
    public final bvrb d;
    public final ckcw e;

    public ajkh(Application application, cqat cqatVar, ajzn ajznVar, bvrb bvrbVar, ckcw ckcwVar) {
        this.a = cqatVar;
        this.b = LocationServices.getFusedLocationProviderClient(application);
        this.c = ajznVar;
        this.d = bvrbVar;
        this.e = ckcwVar;
    }

    public final void a(final PendingIntent pendingIntent) {
        cokf cokfVar = this.b;
        cntc builder = cntd.builder();
        builder.a = new cnsr(pendingIntent) { // from class: cojx
            private final PendingIntent a;

            {
                this.a = pendingIntent;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                ((conr) obj).X(this.a, new cokd((cpct) obj2));
            }
        };
        builder.c = 2418;
        cokfVar.d(builder.a());
    }
}

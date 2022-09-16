package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.internal.LocationRequestInternal;
/* compiled from: PG */
/* renamed from: cokf  reason: default package */
/* loaded from: classes5.dex */
public class cokf extends cnof<cnnv> {
    public cokf(Activity activity) {
        super(activity, LocationServices.API, new cnoz());
    }

    public final cpcq<LocationAvailability> a() {
        cntc builder = cntd.builder();
        builder.a = coju.a;
        builder.c = 2416;
        return c(builder.a());
    }

    public final cpcq<Void> b(LocationRequest locationRequest, cola colaVar, Looper looper) {
        return k(LocationRequestInternal.a(locationRequest), colaVar, looper, null, 2436);
    }

    public final cpcq<Void> k(final LocationRequestInternal locationRequestInternal, final cola colaVar, Looper looper, final cokc cokcVar, int i) {
        final cnsd<L> a = cnse.a(colaVar, core.a(looper), cola.class.getSimpleName());
        final cojz cojzVar = new cojz(this, a);
        cnsr<A, cpct<Void>> cnsrVar = new cnsr(this, cojzVar, colaVar, cokcVar, locationRequestInternal, a) { // from class: cojv
            private final cokf a;
            private final coke b;
            private final cola c;
            private final cokc d;
            private final LocationRequestInternal e;
            private final cnsd f;

            {
                this.a = this;
                this.b = cojzVar;
                this.c = colaVar;
                this.d = cokcVar;
                this.e = locationRequestInternal;
                this.f = a;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                cokf cokfVar = this.a;
                coke cokeVar = this.b;
                cola colaVar2 = this.c;
                cokc cokcVar2 = this.d;
                LocationRequestInternal locationRequestInternal2 = this.e;
                cnsd<cola> cnsdVar = this.f;
                cokb cokbVar = new cokb((cpct) obj2, new cojq(cokfVar, cokeVar, colaVar2, cokcVar2));
                locationRequestInternal2.k = cokfVar.c;
                ((conr) obj).U(locationRequestInternal2, cnsdVar, cokbVar);
            }
        };
        cnsp a2 = cnsq.a();
        a2.a = cnsrVar;
        a2.b = cojzVar;
        a2.c = a;
        a2.d = i;
        return f(a2.a());
    }

    public final void l(cola colaVar) {
        cntf.d(g(cnse.b(colaVar, cola.class.getSimpleName())));
    }

    public final void m(LocationRequest locationRequest, final PendingIntent pendingIntent) {
        final LocationRequestInternal a = LocationRequestInternal.a(locationRequest);
        cntc builder = cntd.builder();
        builder.a = new cnsr(this, a, pendingIntent) { // from class: cojw
            private final cokf a;
            private final LocationRequestInternal b;
            private final PendingIntent c;

            {
                this.a = this;
                this.b = a;
                this.c = pendingIntent;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                cokf cokfVar = this.a;
                LocationRequestInternal locationRequestInternal = this.b;
                PendingIntent pendingIntent2 = this.c;
                cokd cokdVar = new cokd((cpct) obj2);
                locationRequestInternal.k = cokfVar.c;
                ((conr) obj).W(locationRequestInternal, pendingIntent2, cokdVar);
            }
        };
        builder.c = 2417;
        d(builder.a());
    }

    public cokf(Context context) {
        super(context, LocationServices.API, (cnnx) null, new cnoz());
    }
}

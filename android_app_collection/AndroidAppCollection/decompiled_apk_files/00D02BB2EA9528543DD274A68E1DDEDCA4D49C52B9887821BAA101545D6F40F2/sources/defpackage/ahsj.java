package defpackage;

import com.google.android.apps.gmm.car.api.CarAccelerometerEvent;
import com.google.android.apps.gmm.location.rawlocationevents.HardBrakeEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: ahsj  reason: default package */
/* loaded from: classes2.dex */
public final class ahsj<T> extends btrh<T> {
    private final int d;

    public ahsj(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ahsi ahsiVar = (ahsi) this.a;
            ahsk ahskVar = ahsiVar.b;
            long f = ahsiVar.c.f();
            float f2 = ((ahsd) obj).b;
            ahlu ahluVar = ahskVar.e;
            if (f >= ahluVar.p + ahluVar.d()) {
                ahluVar.p = f;
                ahluVar.o.add(ahlv.c(f, new float[]{f2}));
            }
            ahskVar.b();
        } else if (i != 1) {
            ahsi ahsiVar2 = (ahsi) this.a;
            GmmLocation a = ((amqo) obj).a();
            if (a == null || Float.isNaN(a.w())) {
                return;
            }
            ahsk ahskVar2 = ahsiVar2.b;
            long f3 = ahsiVar2.c.f();
            float w = a.w();
            ahlu ahluVar2 = ahskVar2.e;
            if (f3 < ahluVar2.n + ahluVar2.d()) {
                return;
            }
            ahluVar2.n = f3;
            ahluVar2.m.add(ahlv.c(f3, new float[]{w}));
        } else {
            ahsi ahsiVar3 = (ahsi) this.a;
            CarAccelerometerEvent carAccelerometerEvent = (CarAccelerometerEvent) obj;
            ahsk ahskVar3 = ahsiVar3.b;
            long f4 = ahsiVar3.c.f();
            float[] fArr = {carAccelerometerEvent.getX(), carAccelerometerEvent.getY(), carAccelerometerEvent.getZ()};
            ahlu ahluVar3 = ahskVar3.e;
            ahluVar3.l.a(fArr);
            HardBrakeEvent hardBrakeEvent = null;
            if (f4 >= ahluVar3.i + ahluVar3.d()) {
                ahlv c = ahlv.c(f4, ahluVar3.l.b());
                ahluVar3.h.add(c);
                ahluVar3.j = c;
                ahluVar3.i = f4;
                if (c.d() > ahluVar3.d) {
                    ahluVar3.d = c.d();
                    ahluVar3.e = ((ahls) c).a;
                }
                if (ahluVar3.f()) {
                    if (ahluVar3.g()) {
                        hardBrakeEvent = ahluVar3.a();
                    }
                    ahluVar3.e();
                }
                ahluVar3.l.c();
            }
            if (hardBrakeEvent != null) {
                ahskVar3.a(hardBrakeEvent);
            }
            ahskVar3.b();
        }
    }
}

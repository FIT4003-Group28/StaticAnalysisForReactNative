package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.CarSensorEvent;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cnih  reason: default package */
/* loaded from: classes5.dex */
final class cnih extends cojb {
    final /* synthetic */ cnik a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnih(cnik cnikVar, Looper looper) {
        super(looper);
        this.a = cnikVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            synchronized (this.a.b) {
                CarSensorEvent carSensorEvent = (CarSensorEvent) message.obj;
                cnij cnijVar = this.a.b.get(carSensorEvent.b);
                if (cnijVar != null) {
                    Iterator<cmwu> it = cnijVar.a.iterator();
                    while (it.hasNext()) {
                        it.next().b(carSensorEvent.b, carSensorEvent.c, carSensorEvent.d, carSensorEvent.e);
                    }
                }
            }
        }
    }
}

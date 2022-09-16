package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abux  reason: default package */
/* loaded from: classes.dex */
public final class abux implements abwy {
    public static final long a = TimeUnit.SECONDS.toNanos(60);
    public final Context b;
    public boolean d;
    public long e;
    public abxx o;
    public final Handler c = new Handler(Looper.getMainLooper());
    int f = -1;
    int g = -1;
    public final Runnable h = new qvl(8);
    public final Runnable i = new abuu(this, 1);
    public final Runnable j = new abuu(this);
    public final Runnable k = new abuu(this, 2);
    public final Runnable l = new qvl(9);
    public final BroadcastReceiver m = new abuv(this);
    public final BroadcastReceiver n = new abuw(this);

    public abux(Context context) {
        this.b = context;
    }

    @Override // defpackage.abwy
    public final void a(Object obj) {
        if (this.d && (obj instanceof astn)) {
            astn astnVar = (astn) obj;
            int i = this.f;
            astnVar.copyOnWrite();
            asto astoVar = (asto) astnVar.instance;
            asto astoVar2 = asto.a;
            astoVar.b |= 16;
            astoVar.f = i;
            int i2 = this.g;
            if (i2 == 2) {
                astnVar.copyOnWrite();
                asto astoVar3 = (asto) astnVar.instance;
                astoVar3.e = 1;
                astoVar3.b |= 8;
            } else if (i2 == 3) {
                astnVar.copyOnWrite();
                asto astoVar4 = (asto) astnVar.instance;
                astoVar4.e = 2;
                astoVar4.b |= 8;
            } else if (i2 == 4) {
                astnVar.copyOnWrite();
                asto astoVar5 = (asto) astnVar.instance;
                astoVar5.e = 4;
                astoVar5.b |= 8;
            } else if (i2 == 5) {
                astnVar.copyOnWrite();
                asto astoVar6 = (asto) astnVar.instance;
                astoVar6.e = 3;
                astoVar6.b |= 8;
            } else {
                astnVar.copyOnWrite();
                asto astoVar7 = (asto) astnVar.instance;
                astoVar7.e = 0;
                astoVar7.b |= 8;
            }
        }
    }
}

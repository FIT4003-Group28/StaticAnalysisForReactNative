package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qys  reason: default package */
/* loaded from: classes4.dex */
public final class qys {
    private final qzc a;

    public qys(Context context) {
        vbt.g(context);
        this.a = new qzc(context);
    }

    public final void a(String str, Map map, qyu qyuVar) {
        qzc qzcVar = this.a;
        qyx qyxVar = new qyx(qzcVar, str, map, qyuVar);
        long a = qyxVar.e.a();
        qzcVar.b.postAtTime(new qyy(qzcVar, qyxVar, a), qyxVar, a + SystemClock.uptimeMillis());
        qzi qziVar = qzcVar.a;
        qyxVar.f.c(amod.QUEUE_REQUEST, qzn.COARSE);
        qziVar.a.offer(qyxVar);
        qziVar.c.post(qziVar);
    }
}

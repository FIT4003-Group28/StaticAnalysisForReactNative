package defpackage;

import android.os.SystemClock;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qyx  reason: default package */
/* loaded from: classes4.dex */
public final class qyx extends qze {
    final /* synthetic */ Map a;
    final /* synthetic */ qyu b;
    final /* synthetic */ qzc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyx(qzc qzcVar, String str, Map map, qyu qyuVar) {
        super(str);
        this.c = qzcVar;
        this.a = map;
        this.b = qyuVar;
    }

    @Override // defpackage.qze
    protected final void a(qyt qytVar) {
        if (axrd.b()) {
            this.c.a(this);
            qzc qzcVar = this.c;
            qzb qzbVar = new qzb(qytVar, qzcVar.b, this.a, this.e, this.f, qzcVar.a, this.b);
            long a = qzbVar.d.a();
            qzbVar.b.postAtTime(new qyz(qzbVar, a, qzbVar), qzbVar, a + SystemClock.uptimeMillis());
            String a2 = qzbVar.a.a(qzbVar.c);
            qzbVar.a.b();
            qzbVar.b.removeCallbacksAndMessages(qzbVar);
            qzbVar.a(a2);
            return;
        }
        String a3 = qytVar.a(this.a);
        qytVar.b();
        this.c.b.post(new qyw(this, a3));
        this.c.a(this);
    }
}

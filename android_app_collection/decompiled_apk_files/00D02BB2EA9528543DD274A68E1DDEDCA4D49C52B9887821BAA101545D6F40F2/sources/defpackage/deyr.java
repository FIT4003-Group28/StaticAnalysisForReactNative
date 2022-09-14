package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: deyr  reason: default package */
/* loaded from: classes6.dex */
public final class deyr extends dyfx<deyr> {
    public final Context a;
    public final dysf c;
    public final dysx<ScheduledExecutorService> d = dyvh.c(dyow.m);
    @dzsi
    public final k b = null;
    public deyz e = deyy.a();

    private deyr(dexo dexoVar, Context context, @dzsi k kVar) {
        this.a = context;
        dysf dysfVar = new dysf(dexoVar, dexoVar.a.getPackageName(), new deyp(this));
        this.c = dysfVar;
        i(dyfu.a());
        h(new dyfj(new dyfi[0]));
        dysfVar.v = false;
        dysfVar.u = false;
        j(1L, TimeUnit.MINUTES);
    }

    public static synchronized deyr a(Application application, dexo dexoVar) {
        deyr deyrVar;
        synchronized (deyr.class) {
            deyrVar = new deyr(dexoVar, application, null);
        }
        return deyrVar;
    }

    @Override // defpackage.dyfx
    protected final dyhj<?> b() {
        return this.c;
    }
}

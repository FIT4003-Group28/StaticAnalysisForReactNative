package c.e.a.a.i.w;

import c.e.a.a.i.m;
import c.e.a.a.i.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f3742f = Logger.getLogger(r.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final s f3743a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3744b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f3745c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.i.w.j.c f3746d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.a.a.i.x.b f3747e;

    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, s sVar, c.e.a.a.i.w.j.c cVar, c.e.a.a.i.x.b bVar) {
        this.f3744b = executor;
        this.f3745c = eVar;
        this.f3743a = sVar;
        this.f3746d = cVar;
        this.f3747e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(c cVar, m mVar, c.e.a.a.i.h hVar) {
        cVar.f3746d.a(mVar, hVar);
        cVar.f3743a.a(mVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(c cVar, m mVar, c.e.a.a.h hVar, c.e.a.a.i.h hVar2) {
        try {
            com.google.android.datatransport.runtime.backends.m a2 = cVar.f3745c.a(mVar.a());
            if (a2 != null) {
                cVar.f3747e.a(b.a(cVar, mVar, a2.a(hVar2)));
                hVar.a(null);
                return;
            }
            String format = String.format("Transport backend '%s' is not registered", mVar.a());
            f3742f.warning(format);
            hVar.a(new IllegalArgumentException(format));
        } catch (Exception e2) {
            Logger logger = f3742f;
            logger.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    @Override // c.e.a.a.i.w.e
    public void a(m mVar, c.e.a.a.i.h hVar, c.e.a.a.h hVar2) {
        this.f3744b.execute(a.a(this, mVar, hVar2, hVar));
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: cwrb  reason: default package */
/* loaded from: classes.dex */
public final class cwrb {
    final cwre a;

    public cwrb(Context context) {
        cwre cwreVar = new cwre();
        this.a = cwreVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(cwreVar.a);
        application.registerComponentCallbacks(cwreVar.a);
    }

    public final void a(cwra cwraVar) {
        cwre cwreVar = this.a;
        dbsk.s(cwraVar);
        cwreVar.a.a.add(cwraVar);
    }

    public final void b(cwra cwraVar) {
        cwre cwreVar = this.a;
        dbsk.s(cwraVar);
        cwreVar.a.a.remove(cwraVar);
    }
}

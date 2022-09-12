package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cwmb  reason: default package */
/* loaded from: classes5.dex */
public final class cwmb {
    public Context a;
    public ExecutorService b;
    public csqo e;
    public czif f;
    public czkq g;
    public cwlt c = null;
    public final cnmq d = cnmq.a;
    public final cqat h = new cqaz();
    public final dbty<ThreadFactory> i = dbud.a(cwlx.a);
    public final dbty<cwkn> j = dbud.a(new dbty(this) { // from class: cwly
        private final cwmb a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cwmb cwmbVar = this.a;
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(cwmbVar.i.a());
            czna cznaVar = new czna(cwmbVar.a, "STREAMZ_ONEGOOGLE_ANDROID");
            Context context = cwmbVar.a;
            return cwkn.a(newSingleThreadScheduledExecutor, cznaVar, context instanceof Application ? (Application) context : null);
        }
    });
}

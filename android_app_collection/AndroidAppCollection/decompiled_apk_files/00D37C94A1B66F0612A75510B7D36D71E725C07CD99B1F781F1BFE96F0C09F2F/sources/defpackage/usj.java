package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: usj  reason: default package */
/* loaded from: classes4.dex */
public final class usj {
    public final vpl a;
    public final amqo b = aqxo.i(new usi(this, 1));
    public final amqo c = aqxo.i(new usi(this));
    public final amqo d = aqxo.i(new usi(this, 2));
    public final amqo e = aqxo.i(new usi(this, 3));
    private final vpj f;

    public usj(ScheduledExecutorService scheduledExecutorService, vpm vpmVar, Application application) {
        vpl c = vpl.c("youtube_parent_tools_android");
        this.a = c;
        vpj vpjVar = c.a;
        if (vpjVar == null) {
            this.f = vpq.a(vpmVar, scheduledExecutorService, c, application);
            return;
        }
        this.f = vpjVar;
        ((vpq) vpjVar).b = vpmVar;
    }
}

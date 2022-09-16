package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: tso  reason: default package */
/* loaded from: classes4.dex */
public final class tso implements amqo {
    final /* synthetic */ Executor a;
    final /* synthetic */ tqe b;
    final /* synthetic */ axnm c;
    final /* synthetic */ Context d;
    final /* synthetic */ ampq e;
    final /* synthetic */ vjb f;

    public tso(Executor executor, tqe tqeVar, axnm axnmVar, Context context, ampq ampqVar, vjb vjbVar) {
        this.a = executor;
        this.b = tqeVar;
        this.c = axnmVar;
        this.d = context;
        this.e = ampqVar;
        this.f = vjbVar;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        Executor executor = this.a;
        this.b.g();
        tsn tsnVar = new tsn(executor);
        CronetEngine cronetEngine = (CronetEngine) this.c.get();
        cronetEngine.getClass();
        ubt ubtVar = new ubt(new ubg(new ubf(cronetEngine)), this.d, tsnVar);
        ubtVar.g((ubr) ((ampv) this.e).a);
        return new tsl(this.d, ubtVar, this.f);
    }
}

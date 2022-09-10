package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: amqu  reason: default package */
/* loaded from: classes2.dex */
public final class amqu {
    public static final dcqe a = dcqe.c("amqu");
    public final cqat b;
    public final ckcw c;
    public final Application d;
    public final bvrb e;
    @dzsi
    public gfq g;
    public final Application.ActivityLifecycleCallbacks h = new amqt(this);
    public final Map<Integer, amqs> f = new ConcurrentHashMap();
    public final Map<Integer, amqq> i = new ConcurrentHashMap();

    public amqu(cqat cqatVar, ckcw ckcwVar, Context context, bvrb bvrbVar) {
        this.b = cqatVar;
        this.c = ckcwVar;
        this.d = (Application) context;
        this.e = bvrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.g = null;
        this.i.clear();
    }
}

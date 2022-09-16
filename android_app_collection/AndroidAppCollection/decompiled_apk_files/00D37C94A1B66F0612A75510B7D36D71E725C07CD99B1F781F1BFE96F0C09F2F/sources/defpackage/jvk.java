package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jvk  reason: default package */
/* loaded from: classes3.dex */
public final class jvk {
    public final jve a;
    public final ConcurrentMap b = new ConcurrentHashMap();
    private final Context c;
    private final wal d;

    public jvk(jve jveVar, Context context, wal walVar) {
        this.a = jveVar;
        this.c = context;
        this.d = walVar;
    }

    public final String a() {
        String str = this.d.a().b;
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public final void b() {
        vbt.e(this.c);
    }

    public final void c(String str) {
        rve b;
        qst qstVar = this.a.get();
        if (qrr.d.h(qstVar.w, 12451000) == 0) {
            qvx b2 = qvy.b();
            b2.a = new rte(str);
            b = qstVar.s(b2.a());
        } else {
            b = rwd.b(new qsp(new Status(16)));
        }
        b.r(new jvj(this, str));
        b.n(new aczc(1));
    }

    public final void d() {
        c(a());
    }

    public final void e() {
        this.c.registerReceiver(new jvg(this), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
    }

    public final void f(Executor executor) {
        executor.execute(new jvf(this, 1));
    }

    public final void g(Executor executor) {
        executor.execute(new jvf(this));
    }
}

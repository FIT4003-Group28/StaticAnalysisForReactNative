package defpackage;

import android.net.NetworkInfo;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cfqm  reason: default package */
/* loaded from: classes4.dex */
final class cfqm extends z<Boolean> {
    private final AtomicBoolean g;

    public cfqm() {
        super(false);
        this.g = new AtomicBoolean(false);
    }

    public final void m(NetworkInfo networkInfo) {
        boolean booleanValue = ((Boolean) dbsg.j(networkInfo).h(cfql.a).c(false)).booleanValue();
        if (this.g.compareAndSet(!booleanValue, booleanValue)) {
            super.g(Boolean.valueOf(booleanValue));
        }
    }
}

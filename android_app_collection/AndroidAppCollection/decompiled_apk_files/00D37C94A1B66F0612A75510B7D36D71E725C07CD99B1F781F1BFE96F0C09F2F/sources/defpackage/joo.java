package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: joo  reason: default package */
/* loaded from: classes3.dex */
public final class joo {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public final jol b;
    public final Handler c;
    public final Map d = new HashMap();
    public jon e;

    public joo(jol jolVar, Handler handler) {
        this.b = jolVar;
        this.c = handler;
    }
}

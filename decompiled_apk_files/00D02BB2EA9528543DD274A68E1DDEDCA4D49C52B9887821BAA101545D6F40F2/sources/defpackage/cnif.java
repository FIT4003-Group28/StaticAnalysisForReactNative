package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cnif  reason: default package */
/* loaded from: classes5.dex */
public final class cnif {
    public final cnie a;
    public final Handler b;
    public volatile kfd c;
    public final cmxu d;
    private final Handler.Callback e;

    public cnif(cmxu cmxuVar, Looper looper) {
        cnid cnidVar = new cnid(this);
        this.e = cnidVar;
        this.b = new cojb(looper, cnidVar);
        this.d = cmxuVar;
        this.a = new cnie(this);
    }
}

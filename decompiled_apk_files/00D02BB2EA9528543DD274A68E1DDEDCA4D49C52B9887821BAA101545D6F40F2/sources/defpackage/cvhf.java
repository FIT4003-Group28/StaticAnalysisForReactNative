package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cvhf  reason: default package */
/* loaded from: classes.dex */
public final class cvhf extends cvgx<cvhg> {
    @dzsi
    private final cvhd b;

    public cvhf() {
        this(new cvhe(Process.myUid()), null);
    }

    @Override // defpackage.cvgx
    /* renamed from: d */
    public final synchronized cvhg c() {
        this.b.j();
        this.b.i();
        return new cvhg();
    }

    public cvhf(cvhd cvhdVar, @dzsi ThreadFactory threadFactory) {
        super(threadFactory, 2000);
        this.b = cvhdVar;
    }
}

package defpackage;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dlh  reason: default package */
/* loaded from: classes6.dex */
public final class dlh {
    private final dbsg<dlq> a;
    private final Executor b;

    static {
        NativeHelper.a();
    }

    public dlh(dbsg<dlq> dbsgVar, Executor executor) {
        this.b = executor;
        this.a = dbsgVar;
    }

    public final dflr a(dflc dflcVar, Executor executor) {
        dbsk.l(true);
        return new dflr(((dlq) ((dbsu) this.a).a).a.a(), ((dlq) ((dbsu) this.a).a).b.h(dlg.a), executor, this.b, dflcVar);
    }
}

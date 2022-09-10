package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxtx  reason: default package */
/* loaded from: classes5.dex */
final class cxtx implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ cxrb b;
    final /* synthetic */ Stopwatch c;
    final /* synthetic */ cxua d;

    public cxtx(cxua cxuaVar, List list, cxrb cxrbVar, Stopwatch stopwatch) {
        this.d = cxuaVar;
        this.a = list;
        this.b = cxrbVar;
        this.c = stopwatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxuo cxuoVar = this.d.d;
        cxuoVar.j = this.a;
        cxuoVar.s();
        this.d.e();
        cxua cxuaVar = this.d;
        cxrb cxrbVar = this.b;
        cxuaVar.c.post(new cxtz(cxuaVar, this.c, this.a.size(), cxrbVar));
    }
}

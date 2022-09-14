package defpackage;

import com.google.android.apps.gmm.locationsharing.settings.StopThenStartLifecycleObserver;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajqf  reason: default package */
/* loaded from: classes2.dex */
public final class ajqf<V> implements Callable<dyzr> {
    final /* synthetic */ ajqg a;
    final /* synthetic */ gga b;

    public ajqf(ajqg ajqgVar, gga ggaVar) {
        this.a = ajqgVar;
        this.b = ggaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ dyzr call() {
        dzgl h = dzgl.h();
        gga ggaVar = this.b;
        ggaVar.g.a(new StopThenStartLifecycleObserver(ggaVar, new ajqe(this, h)));
        return h;
    }
}

package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rpj  reason: default package */
/* loaded from: classes4.dex */
public final class rpj implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rpn b;

    public rpj(rpn rpnVar, AppMetadata appMetadata) {
        this.b = rpnVar;
        this.a = appMetadata;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        rpn rpnVar = this.b;
        String str = this.a.a;
        qnm.b(str);
        if (!rpnVar.h(str).h() || !rjq.b(this.a.v).h()) {
            this.b.aG().k.a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.b.c(this.a).n();
    }
}

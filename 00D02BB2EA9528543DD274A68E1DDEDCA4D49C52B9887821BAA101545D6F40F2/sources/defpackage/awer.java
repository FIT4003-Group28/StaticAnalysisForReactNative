package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awer  reason: default package */
/* loaded from: classes3.dex */
final class awer implements degu<awhc> {
    final /* synthetic */ awet a;

    public awer(awet awetVar) {
        this.a = awetVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        awet awetVar = this.a;
        if (!awetVar.d.aD || (th instanceof CancellationException)) {
            return;
        }
        Executor executor = awetVar.e;
        Activity activity = awetVar.a;
        cjxu.h(executor, activity, activity.getString(R.string.UNKNOWN_ERROR));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(awhc awhcVar) {
        awet awetVar = this.a;
        awetVar.p = awhcVar;
        if (awet.u(awetVar.p)) {
            this.a.o();
        }
        awet awetVar2 = this.a;
        if (awetVar2.d.aD) {
            cqkx.p(awetVar2);
        }
    }
}

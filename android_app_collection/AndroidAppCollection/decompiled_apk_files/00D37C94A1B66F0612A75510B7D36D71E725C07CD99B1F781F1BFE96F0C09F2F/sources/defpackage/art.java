package defpackage;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
/* compiled from: PG */
/* renamed from: art  reason: default package */
/* loaded from: classes2.dex */
final class art implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ ResultReceiver c;
    final /* synthetic */ aru d;
    final /* synthetic */ arv e;

    public art(aru aruVar, arv arvVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.d = aruVar;
        this.e = arvVar;
        this.a = str;
        this.b = bundle;
        this.c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((ara) this.d.a.c.get(this.e.a())) == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.a + ", extras=" + this.b);
            return;
        }
        String str = this.a;
        Bundle bundle = this.b;
        ResultReceiver resultReceiver = this.c;
        arm armVar = new arm(str);
        if (armVar.f || armVar.g) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + armVar.e);
        }
        armVar.g = true;
        resultReceiver.b(-1, null);
        if (armVar.c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}

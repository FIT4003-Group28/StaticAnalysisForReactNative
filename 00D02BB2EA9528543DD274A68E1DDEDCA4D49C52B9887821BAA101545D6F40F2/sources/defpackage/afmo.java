package defpackage;

import com.google.android.apps.gmm.streetview.model.UserOrientation;
/* compiled from: PG */
/* renamed from: afmo  reason: default package */
/* loaded from: classes2.dex */
public final class afmo implements Runnable {
    final /* synthetic */ dggg a;
    final /* synthetic */ akqq b;
    final /* synthetic */ UserOrientation c;
    final /* synthetic */ afmq d;

    public afmo(afmq afmqVar, dggg dgggVar, akqq akqqVar, UserOrientation userOrientation) {
        this.d = afmqVar;
        this.a = dgggVar;
        this.b = akqqVar;
        this.c = userOrientation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a().o(null, this.a, this.b, this.c);
    }
}

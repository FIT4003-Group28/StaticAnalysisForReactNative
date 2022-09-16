package defpackage;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
/* compiled from: PG */
/* renamed from: cpgy  reason: default package */
/* loaded from: classes5.dex */
final class cpgy implements Runnable {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ cphf b;

    public cpgy(cphf cphfVar, MessageEventParcelable messageEventParcelable) {
        this.b = cphfVar;
        this.a = messageEventParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
    }
}

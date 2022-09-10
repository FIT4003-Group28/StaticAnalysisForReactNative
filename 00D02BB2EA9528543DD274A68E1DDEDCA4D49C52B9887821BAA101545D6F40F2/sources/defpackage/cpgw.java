package defpackage;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;
/* compiled from: PG */
/* renamed from: cpgw  reason: default package */
/* loaded from: classes5.dex */
final class cpgw implements Runnable {
    final /* synthetic */ ChannelEventParcelable a;
    final /* synthetic */ cphf b;

    public cpgw(cphf cphfVar, ChannelEventParcelable channelEventParcelable) {
        this.b = cphfVar;
        this.a = channelEventParcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.a);
        this.a.a(this.b.a.g);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
/* compiled from: PG */
/* renamed from: ll  reason: default package */
/* loaded from: classes7.dex */
final class ll {
    public final Bundle a;
    private final Messenger b;

    public ll(IBinder iBinder, Bundle bundle) {
        this.b = new Messenger(iBinder);
        this.a = bundle;
    }

    public final void a(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.b.send(obtain);
    }
}

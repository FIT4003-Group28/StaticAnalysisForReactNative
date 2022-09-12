package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asm  reason: default package */
/* loaded from: classes2.dex */
public final class asm implements IBinder.DeathRecipient {
    public final Messenger a;
    public final asp b;
    public int e;
    public int f;
    final /* synthetic */ ast h;
    private final Messenger i;
    public int c = 1;
    public int d = 1;
    public final SparseArray<arf> g = new SparseArray<>();

    public asm(ast astVar, Messenger messenger) {
        this.h = astVar;
        this.a = messenger;
        asp aspVar = new asp(this);
        this.b = aspVar;
        this.i = new Messenger(aspVar);
    }

    public final void a(int i) {
        int i2 = this.c;
        this.c = i2 + 1;
        g(4, i2, i, null, null);
    }

    public final void b(int i) {
        int i2 = this.c;
        this.c = i2 + 1;
        g(5, i2, i, null, null);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.h.b.post(new asl(this));
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(6, i3, i, null, bundle);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(7, i3, i, null, bundle);
    }

    public final void e(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(8, i3, i, null, bundle);
    }

    public final void f(aqo aqoVar) {
        int i = this.c;
        this.c = i + 1;
        g(10, i, 0, aqoVar != null ? aqoVar.a : null, null);
    }

    public final boolean g(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.i;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }
}

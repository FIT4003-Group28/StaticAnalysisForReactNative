package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bho  reason: default package */
/* loaded from: classes2.dex */
public final class bho implements IBinder.DeathRecipient {
    public final Messenger a;
    public final bhq b;
    public int e;
    public int f;
    final /* synthetic */ bhu h;
    private final Messenger i;
    public int c = 1;
    public int d = 1;
    public final SparseArray g = new SparseArray();

    public bho(bhu bhuVar, Messenger messenger) {
        this.h = bhuVar;
        this.a = messenger;
        bhq bhqVar = new bhq(this);
        this.b = bhqVar;
        this.i = new Messenger(bhqVar);
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
        this.h.o.post(new bhn(this));
    }

    public final void c(bgb bgbVar) {
        int i = this.c;
        this.c = i + 1;
        g(10, i, 0, bgbVar != null ? bgbVar.a : null, null);
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
        bundle.putInt("unselectReason", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(6, i3, i, null, bundle);
    }

    public final void f(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(8, i3, i, null, bundle);
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
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }
}

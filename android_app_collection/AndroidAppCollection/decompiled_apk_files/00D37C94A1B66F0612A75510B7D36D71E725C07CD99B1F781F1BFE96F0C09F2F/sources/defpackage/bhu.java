package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhu  reason: default package */
/* loaded from: classes2.dex */
public final class bhu extends bgk implements ServiceConnection {
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public bho d;
    public boolean m;
    public bhv n;
    final amfd o;
    private boolean p;

    public bhu(Context context, ComponentName componentName) {
        super(context, new bgi(componentName));
        this.b = new ArrayList();
        this.a = componentName;
        this.o = new amfd();
    }

    private final bgj r(String str, String str2) {
        bgm bgmVar = this.k;
        if (bgmVar != null) {
            List list = bgmVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((bga) list.get(i)).n().equals(str)) {
                    bht bhtVar = new bht(this, str, str2);
                    this.b.add(bhtVar);
                    if (this.m) {
                        bhtVar.e(this.d);
                    }
                    p();
                    return bhtVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.bgk
    public final void d(bgb bgbVar) {
        if (this.m) {
            this.d.c(bgbVar);
        }
        p();
    }

    public final bhp e(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bhp bhpVar = (bhp) arrayList.get(i2);
            i2++;
            if (bhpVar.d() == i) {
                return bhpVar;
            }
        }
        return null;
    }

    public final void f() {
        if (!this.p) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.a);
            try {
                this.p = this.e.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
            } catch (SecurityException unused) {
            }
        }
    }

    @Override // defpackage.bgk
    public final bgg jI(String str) {
        if (str != null) {
            bgm bgmVar = this.k;
            bhs bhsVar = null;
            if (bgmVar != null) {
                List list = bgmVar.a;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((bga) list.get(i)).n().equals(str)) {
                        bhsVar = new bhs(this, str);
                        this.b.add(bhsVar);
                        if (this.m) {
                            bhsVar.e(this.d);
                        }
                        p();
                    } else {
                        i++;
                    }
                }
            }
            return bhsVar;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final void k() {
        if (this.d != null) {
            jL(null);
            this.m = false;
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((bhp) this.b.get(i)).f();
            }
            bho bhoVar = this.d;
            bhoVar.g(2, 0, 0, null, null);
            bhoVar.b.a.clear();
            bhoVar.a.getBinder().unlinkToDeath(bhoVar, 0);
            bhoVar.h.o.post(new bhn(bhoVar, 1));
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(bho bhoVar, bgm bgmVar) {
        if (this.d == bhoVar) {
            jL(bgmVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(bhp bhpVar) {
        this.b.remove(bhpVar);
        bhpVar.f();
        p();
    }

    public final void n() {
        if (!this.c) {
            this.c = true;
            p();
        }
    }

    public final void o() {
        if (this.p) {
            this.p = false;
            k();
            try {
                this.e.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.p) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        bho bhoVar = new bho(this, messenger);
                        int i = bhoVar.c;
                        bhoVar.c = i + 1;
                        bhoVar.f = i;
                        if (!bhoVar.g(1, i, 4, null, null)) {
                            return;
                        }
                        try {
                            bhoVar.a.getBinder().linkToDeath(bhoVar, 0);
                            this.d = bhoVar;
                            return;
                        } catch (RemoteException unused) {
                            bhoVar.binderDied();
                            return;
                        }
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k();
    }

    public final void p() {
        if (q()) {
            f();
        } else {
            o();
        }
    }

    public final boolean q() {
        if (this.c) {
            return this.i != null || !this.b.isEmpty();
        }
        return false;
    }

    public final String toString() {
        return "Service connection " + this.a.flattenToShortString();
    }

    @Override // defpackage.bgk
    public final bgj b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return r(str, null);
    }

    @Override // defpackage.bgk
    public final bgj jJ(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new IllegalArgumentException("routeGroupId cannot be null");
            }
            return r(str, str2);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
}

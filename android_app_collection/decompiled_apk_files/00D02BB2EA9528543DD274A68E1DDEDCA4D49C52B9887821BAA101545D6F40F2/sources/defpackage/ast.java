package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ast  reason: default package */
/* loaded from: classes2.dex */
public final class ast extends aqy implements ServiceConnection {
    public final ComponentName a;
    final aso b;
    public final ArrayList<asn> c;
    public boolean d;
    public asm m;
    public boolean n;
    public asu o;
    private boolean p;

    public ast(Context context, ComponentName componentName) {
        super(context, new aqw(componentName));
        this.c = new ArrayList<>();
        this.a = componentName;
        this.b = new aso();
    }

    private final aqx q(String str, String str2) {
        ara araVar = this.k;
        if (araVar != null) {
            List<aqn> list = araVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).a().equals(str)) {
                    ass assVar = new ass(this, str, str2);
                    this.c.add(assVar);
                    if (this.n) {
                        assVar.e(this.m);
                    }
                    f();
                    return assVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.aqy
    public final aqu Nf(String str) {
        if (str != null) {
            ara araVar = this.k;
            asr asrVar = null;
            if (araVar != null) {
                List<aqn> list = araVar.a;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (list.get(i).a().equals(str)) {
                        asrVar = new asr(this, str);
                        this.c.add(asrVar);
                        if (this.n) {
                            asrVar.e(this.m);
                        }
                        f();
                    } else {
                        i++;
                    }
                }
            }
            return asrVar;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // defpackage.aqy
    public final void a(aqo aqoVar) {
        if (this.n) {
            this.m.f(aqoVar);
        }
        f();
    }

    public final void e() {
        if (!this.d) {
            this.d = true;
            f();
        }
    }

    public final void f() {
        if (j()) {
            k();
        } else {
            l();
        }
    }

    public final boolean j() {
        if (this.d) {
            return this.i != null || !this.c.isEmpty();
        }
        return false;
    }

    public final void k() {
        if (!this.p) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.a);
            try {
                this.p = this.e.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
            } catch (SecurityException unused) {
            }
        }
    }

    public final void l() {
        if (this.p) {
            this.p = false;
            o();
            try {
                this.e.unbindService(this);
            } catch (IllegalArgumentException unused) {
                String str = this + ": unbindService failed";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(asm asmVar, ara araVar) {
        if (this.m == asmVar) {
            Nd(araVar);
        }
    }

    public final asn n(int i) {
        ArrayList<asn> arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            asn asnVar = arrayList.get(i2);
            i2++;
            if (asnVar.d() == i) {
                return asnVar;
            }
        }
        return null;
    }

    public final void o() {
        if (this.m != null) {
            Nd(null);
            this.n = false;
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                this.c.get(i).f();
            }
            asm asmVar = this.m;
            asmVar.g(2, 0, 0, null, null);
            asmVar.b.a.clear();
            asmVar.a.getBinder().unlinkToDeath(asmVar, 0);
            asmVar.h.b.post(new ask(asmVar));
            this.m = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.p) {
            o();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        asm asmVar = new asm(this, messenger);
                        int i = asmVar.c;
                        asmVar.c = i + 1;
                        asmVar.f = i;
                        if (!asmVar.g(1, i, 4, null, null)) {
                            return;
                        }
                        try {
                            asmVar.a.getBinder().linkToDeath(asmVar, 0);
                            this.m = asmVar;
                            return;
                        } catch (RemoteException unused) {
                            asmVar.binderDied();
                            return;
                        }
                    }
                } catch (NullPointerException unused2) {
                }
            }
            String str = this + ": Service returned invalid messenger binder";
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(asn asnVar) {
        this.c.remove(asnVar);
        asnVar.f();
        f();
    }

    public final String toString() {
        return "Service connection " + this.a.flattenToShortString();
    }

    @Override // defpackage.aqy
    public final aqx b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        return q(str, null);
    }

    @Override // defpackage.aqy
    public final aqx Ne(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new IllegalArgumentException("routeGroupId cannot be null");
            }
            return q(str, str2);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
}

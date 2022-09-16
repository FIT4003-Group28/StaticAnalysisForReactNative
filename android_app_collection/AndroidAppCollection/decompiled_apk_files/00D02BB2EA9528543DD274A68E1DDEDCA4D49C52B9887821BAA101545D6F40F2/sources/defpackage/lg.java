package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: lg  reason: default package */
/* loaded from: classes7.dex */
class lg implements lf, lj, ld {
    final Context a;
    protected final MediaBrowser b;
    protected final Bundle c;
    protected int e;
    protected ll f;
    protected Messenger g;
    private MediaSessionCompat$Token i;
    protected final lb d = new lb(this);
    private final aif<String, lm> h = new aif<>();

    public lg(Context context, ComponentName componentName, le leVar, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = new Bundle(bundle);
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        leVar.b = this;
        this.b = new MediaBrowser(context, componentName, leVar.a, bundle2);
    }

    @Override // defpackage.ld
    public final void a() {
        lx lxVar;
        try {
            Bundle extras = this.b.getExtras();
            if (extras == null) {
                return;
            }
            this.e = extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                this.f = new ll(binder, this.c);
                Messenger messenger = new Messenger(this.d);
                this.g = messenger;
                this.d.a(messenger);
                try {
                    ll llVar = this.f;
                    Context context = this.a;
                    Messenger messenger2 = this.g;
                    Bundle bundle = new Bundle();
                    bundle.putString("data_package_name", context.getPackageName());
                    bundle.putInt("data_calling_pid", Process.myPid());
                    bundle.putBundle("data_root_hints", llVar.a);
                    llVar.a(6, bundle, messenger2);
                } catch (RemoteException unused) {
                }
            }
            IBinder binder2 = extras.getBinder("extra_session_binder");
            if (binder2 == null) {
                lxVar = null;
            } else {
                IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof lx)) {
                    lxVar = new lx(binder2);
                } else {
                    lxVar = (lx) queryLocalInterface;
                }
            }
            if (lxVar == null) {
                return;
            }
            this.i = MediaSessionCompat$Token.a(this.b.getSessionToken(), lxVar);
        } catch (IllegalStateException unused2) {
        }
    }

    @Override // defpackage.ld
    public final void b() {
        this.f = null;
        this.g = null;
        this.i = null;
        this.d.a(null);
    }

    @Override // defpackage.lf
    public final void c() {
        this.b.connect();
    }

    @Override // defpackage.lf
    public final void d() {
        Messenger messenger;
        ll llVar = this.f;
        if (llVar != null && (messenger = this.g) != null) {
            try {
                llVar.a(7, null, messenger);
            } catch (RemoteException unused) {
            }
        }
        this.b.disconnect();
    }

    @Override // defpackage.lf
    public final String e() {
        return this.b.getRoot();
    }

    @Override // defpackage.lf
    public final MediaSessionCompat$Token f() {
        if (this.i == null) {
            this.i = MediaSessionCompat$Token.a(this.b.getSessionToken(), null);
        }
        return this.i;
    }

    @Override // defpackage.lf
    public void g(String str, lp lpVar) {
        lm lmVar = this.h.get(str);
        if (lmVar == null) {
            lmVar = new lm();
            this.h.put(str, lmVar);
        }
        lpVar.c = new WeakReference<>(lmVar);
        int i = 0;
        while (true) {
            if (i < lmVar.b.size()) {
                if (apw.a(lmVar.b.get(i), null)) {
                    lmVar.a.set(i, lpVar);
                    break;
                }
                i++;
            } else {
                lmVar.a.add(lpVar);
                lmVar.b.add(null);
                break;
            }
        }
        ll llVar = this.f;
        if (llVar != null) {
            try {
                IBinder iBinder = lpVar.b;
                Messenger messenger = this.g;
                Bundle bundle = new Bundle();
                bundle.putString("data_media_item_id", str);
                bundle.putBinder("data_callback_token", iBinder);
                bundle.putBundle("data_options", null);
                llVar.a(3, bundle, messenger);
                return;
            } catch (RemoteException unused) {
                String str2 = "Remote error subscribing media item: " + str;
                return;
            }
        }
        this.b.subscribe(str, lpVar.a);
    }

    @Override // defpackage.lj
    public final void h() {
    }

    @Override // defpackage.lj
    public final void i(Messenger messenger, String str, List<MediaBrowserCompat$MediaItem> list, Bundle bundle) {
        lm lmVar;
        lp lpVar;
        if (this.g == messenger && (lmVar = this.h.get(str)) != null) {
            int i = 0;
            while (true) {
                if (i >= lmVar.b.size()) {
                    lpVar = null;
                    break;
                } else if (apw.a(lmVar.b.get(i), bundle)) {
                    lpVar = lmVar.a.get(i);
                    break;
                } else {
                    i++;
                }
            }
            if (lpVar == null || bundle != null) {
                return;
            }
            if (list == null) {
                lpVar.b();
            } else {
                lpVar.a(list);
            }
        }
    }

    @Override // defpackage.lj
    public final void j() {
    }
}

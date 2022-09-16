package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: arq  reason: default package */
/* loaded from: classes2.dex */
final class arq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ aru d;
    final /* synthetic */ arv e;
    private final /* synthetic */ int f;

    public arq(aru aruVar, arv arvVar, int i, String str, int i2) {
        this.d = aruVar;
        this.e = arvVar;
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public arq(aru aruVar, arv arvVar, String str, int i, int i2, int i3) {
        this.f = i3;
        this.d = aruVar;
        this.e = arvVar;
        this.b = str;
        this.c = i;
        this.a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ara araVar = null;
        if (this.f == 0) {
            IBinder a = this.e.a();
            this.d.a.c.remove(a);
            Iterator it = this.d.a.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ara araVar2 = (ara) it.next();
                if (araVar2.c == this.a) {
                    if (TextUtils.isEmpty(this.b) || this.c <= 0) {
                        araVar = new ara(this.d.a, araVar2.a, araVar2.b, araVar2.c, this.e);
                    }
                    it.remove();
                }
            }
            if (araVar == null) {
                araVar = new ara(this.d.a, this.b, this.c, this.a, this.e);
            }
            this.d.a.c.put(a, araVar);
            try {
                a.linkToDeath(araVar, 0);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "IBinder is already dead.");
                return;
            }
        }
        IBinder a2 = this.e.a();
        this.d.a.c.remove(a2);
        ara araVar3 = new ara(this.d.a, this.b, this.c, this.a, this.e);
        araVar3.g = this.d.a.e(this.b);
        if (araVar3.g == null) {
            getClass().getName();
            try {
                this.e.b(2, null);
                return;
            } catch (RemoteException unused2) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.b);
                return;
            }
        }
        try {
            this.d.a.c.put(a2, araVar3);
            a2.linkToDeath(araVar3, 0);
            MediaSessionCompat$Token mediaSessionCompat$Token = this.d.a.e;
            if (mediaSessionCompat$Token == null) {
                return;
            }
            arv arvVar = this.e;
            ynv ynvVar = araVar3.g;
            String str = ynvVar.a;
            Bundle bundle = ynvVar.b;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", "__EMPTY_ROOT__");
            bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
            bundle2.putBundle("data_root_hints", bundle);
            arvVar.b(1, bundle2);
        } catch (RemoteException unused3) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.b);
            this.d.a.c.remove(a2);
        }
    }
}

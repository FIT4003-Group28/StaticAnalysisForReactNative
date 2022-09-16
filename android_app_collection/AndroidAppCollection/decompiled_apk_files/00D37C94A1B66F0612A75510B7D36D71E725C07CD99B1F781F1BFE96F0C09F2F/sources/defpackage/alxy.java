package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentServiceFactoryService;
import com.google.android.youtube.api.service.YouTubeService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxy  reason: default package */
/* loaded from: classes.dex */
public final class alxy extends alyt implements IBinder.DeathRecipient, ooo, oqh {
    public static final amvn a = amvn.v("com.examples.youtubeapidemo", "com.examples.youtubeapidemo.materialdesign", "com.google.android.googlequicksearchbox", "com.google.android.apps.magazines", "com.google.android.play.games");
    public final Context b;
    public final Handler c;
    public final String d;
    private final oqi e;
    private volatile ooh f;
    private volatile ApiPlayerFactoryService g;
    private volatile EmbedFragmentServiceFactoryService h;
    private ypz i;
    private volatile alyc j;

    static {
        amvn.w("com.examples.youtubeapidemo", "com.examples.youtubeapidemo.materialdesign", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstand_internal", "com.google.android.apps.newsstand_staging", "com.google.android.apps.newsstanddev", new String[0]);
    }

    public alxy(Context context, oqi oqiVar, String str, alyc alycVar, ord ordVar, byte[] bArr, byte[] bArr2) {
        this.b = context;
        alycVar.getClass();
        this.j = alycVar;
        this.c = new Handler(context.getMainLooper());
        oqiVar.getClass();
        this.e = oqiVar;
        this.d = str;
        ordVar.getClass();
    }

    private final void i() {
        if (this.f == null || this.g == null || this.h == null) {
            throw new IllegalStateException("YouTubeServiceEntity not initialized");
        }
    }

    @Override // defpackage.ooo
    public final void a(final ooh oohVar) {
        this.f = oohVar;
        this.i = new yqc(this.b, new azqb() { // from class: alxx
            @Override // defpackage.azqb
            public final Object get() {
                ooh oohVar2 = ooh.this;
                amvn amvnVar = alxy.a;
                return ((oon) oohVar2).f.p();
            }
        }, ((oon) oohVar).f.s());
        this.g = new ApiPlayerFactoryService(this.b, this.c, this.e, oohVar);
        this.h = new EmbedFragmentServiceFactoryService(this.c, this.e, oohVar);
        alyc alycVar = this.j;
        if (alycVar != null) {
            try {
                alycVar.a.linkToDeath(this, 0);
                alycVar.a("SUCCESS", this);
            } catch (RemoteException unused) {
            }
        }
        this.e.a(this);
    }

    @Override // defpackage.ooo
    public final void b(Exception exc) {
        this.f = null;
        zep.d("Error creating ApiEnvironment", exc);
        if (this.j != null) {
            YouTubeService.a(this.j, oon.l(exc));
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        g();
    }

    @Override // defpackage.oqh
    public final void c() {
        f();
    }

    @Override // defpackage.alyu
    public final IBinder d() {
        i();
        ApiPlayerFactoryService apiPlayerFactoryService = this.g;
        apiPlayerFactoryService.asBinder();
        return apiPlayerFactoryService;
    }

    @Override // defpackage.alyu
    public final IBinder e() {
        i();
        EmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = this.h;
        embedFragmentServiceFactoryService.asBinder();
        return embedFragmentServiceFactoryService;
    }

    public final void f() {
        ypz ypzVar = this.i;
        if (ypzVar != null) {
            yqc yqcVar = (yqc) ypzVar;
            yqcVar.a.unregisterReceiver((BroadcastReceiver) ypzVar);
            yqcVar.b.b(yqcVar.c);
            yqcVar.b.b(yqcVar.d);
            this.i = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        this.g = null;
        this.h = null;
        if (this.j != null) {
            this.j.a.unlinkToDeath(this, 0);
            this.j = null;
        }
        this.e.b(this);
        System.gc();
    }

    @Override // defpackage.alyu
    public final void g() {
        this.c.post(new Runnable() { // from class: alxw
            @Override // java.lang.Runnable
            public final void run() {
                alxy.this.f();
            }
        });
    }

    @Override // defpackage.alyu
    public final alys h(alyq alyqVar) {
        i();
        return new alyr(this.c, ((oon) this.f).f.A(), this.f.h(), ((oon) this.f).f.q(), alyqVar);
    }
}

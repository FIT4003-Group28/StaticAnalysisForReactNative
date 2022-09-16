package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;
/* compiled from: PG */
/* renamed from: adhv  reason: default package */
/* loaded from: classes.dex */
public final class adhv {
    public static final /* synthetic */ int c = 0;
    private static final String d = zep.a("MDX.RemoteStarter");
    public boolean a;
    public boolean b;
    private final Context e;
    private final azqb f;
    private boolean i;
    private boolean j;
    private final ServiceConnection k = new adhs();
    private final adnz l = new adht(this);
    private final adny m = new adhu(this);
    private final Handler g = new Handler();
    private final Runnable h = new Runnable() { // from class: adhr
        @Override // java.lang.Runnable
        public final void run() {
            adhv.this.d();
        }
    };

    public adhv(Context context, azqb azqbVar) {
        this.e = context;
        this.f = azqbVar;
    }

    public final void a() {
        if (this.j) {
            return;
        }
        adoa adoaVar = (adoa) this.f.get();
        adoaVar.h(this.l);
        adoaVar.g(this.m);
        this.j = true;
    }

    public final void b() {
        c(0L);
    }

    public final void c(long j) {
        this.g.removeCallbacks(this.h);
        Intent intent = new Intent(this.e, RemotePlaybackControlsService.class);
        if (this.a || this.b) {
            if (this.i) {
                return;
            }
            boolean bindService = this.e.bindService(intent, this.k, 1);
            this.i = bindService;
            if (bindService) {
                return;
            }
            zep.c(d, "failed binding to remote playback control service");
        } else if (!this.i) {
        } else {
            if (j > 0) {
                this.g.postDelayed(this.h, j);
            } else {
                d();
            }
        }
    }

    public final void d() {
        this.e.unbindService(this.k);
        this.i = false;
    }
}

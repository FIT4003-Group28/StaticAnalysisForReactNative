package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gdk  reason: default package */
/* loaded from: classes3.dex */
public final class gdk {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private final Context b;
    private final azqb c;
    private final NotificationManager d;
    private final Handler e;
    private final Runnable f = new Runnable() { // from class: gdj
        @Override // java.lang.Runnable
        public final void run() {
            gdk.this.b();
        }
    };

    public gdk(Context context, azqb azqbVar, Handler handler) {
        this.b = context;
        this.c = azqbVar;
        this.d = (NotificationManager) context.getSystemService("notification");
        this.e = handler;
    }

    public final void a(ajbf ajbfVar, String str, int i) {
        if (gdo.d(ajbfVar) && ((gdh) this.c.get()).b() == 3) {
            Resources resources = this.b.getResources();
            Context context = this.b;
            PlayerResponseModel c = ajbfVar.c();
            aijl d = PlaybackStartDescriptor.d();
            String B = c.B();
            if (str == null) {
                str = "";
            }
            d.a = aikb.f(B, str, i, (float) TimeUnit.MILLISECONDS.toSeconds(ajbfVar.b()));
            WatchDescriptor watchDescriptor = new WatchDescriptor(d.a());
            watchDescriptor.h();
            PendingIntent activity = PendingIntent.getActivity(context, 0, etk.d(context).putExtra("watch", watchDescriptor).putExtra("playback_start_flag", 3), zgd.M() | 134217728);
            String string = resources.getString(R.string.disabled_pip_video_notification);
            fi fiVar = new fi(this.b);
            fiVar.k(ajbfVar.c().A());
            fh fhVar = new fh();
            fhVar.c(string);
            fiVar.s(fhVar);
            fiVar.r(2131232804);
            fiVar.z = zhn.j(this.b, R.attr.ytStaticBrandRed).orElse(resources.getColor(R.color.yt_youtube_red));
            fiVar.o(false);
            fiVar.g(true);
            fiVar.x = "status";
            fiVar.A = 1;
            fiVar.k = 0;
            fiVar.g = activity;
            yhr.g(fiVar);
            this.d.notify(1008, fiVar.b());
            this.e.removeCallbacks(this.f);
            this.e.postDelayed(this.f, a);
        }
    }

    public final void b() {
        this.d.cancel(1008);
        this.e.removeCallbacks(this.f);
    }
}

package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: jjn  reason: default package */
/* loaded from: classes3.dex */
public final class jjn extends agrl {
    public final Resources a;
    public final ahdf b;
    public agik c;
    private final Context d;
    private final azqb e;
    private final agro f;
    private final azqb g;
    private final jjo h;
    private final yrj i;
    private final HashMap j;
    private final jjp k;
    private final alj l;
    private final IntentFilter m;

    public jjn(Context context, snc sncVar, agro agroVar, azqb azqbVar, agrm agrmVar, azqb azqbVar2, jjo jjoVar, yrj yrjVar, jjp jjpVar, azqb azqbVar3, ahdf ahdfVar) {
        super(sncVar, azqbVar, agrmVar, ahdfVar);
        this.d = context;
        this.e = azqbVar2;
        this.h = jjoVar;
        this.i = yrjVar;
        this.a = context.getResources();
        this.b = ahdfVar;
        this.j = new HashMap();
        this.f = agroVar;
        this.g = azqbVar;
        this.k = jjpVar;
        IntentFilter intentFilter = new IntentFilter();
        this.m = intentFilter;
        intentFilter.addAction("com.google.android.youtube.action.offline_notification_cancel_transfer");
        context.registerReceiver(new jjl(this, azqbVar3), intentFilter);
        this.l = alj.a();
    }

    private final fi E(String str, boolean z, boolean z2) {
        String G = z ? G(str, z2) : str;
        if (this.j.containsKey(G)) {
            return (fi) this.j.get(G);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.d.getApplicationContext(), G.hashCode(), new Intent("com.google.android.youtube.action.offline_notification_cancel_transfer").putExtra(true != z ? "video_id" : "playlist_id", str).putExtra("is_sync", z2), zgd.M() | 134217728);
        fi a = this.f.a();
        a.z = zhn.j(this.d, R.attr.ytStaticBrandRed).orElse(this.a.getColor(R.color.yt_youtube_red));
        a.A = 1;
        a.e(2131231366, this.a.getString(R.string.notification_cancel_transfer), broadcast);
        this.j.put(G, a);
        return a;
    }

    private final fi F() {
        fi a = this.f.a();
        a.w(System.currentTimeMillis());
        a.z = zhn.j(this.d, R.attr.ytStaticBrandRed).orElse(this.a.getColor(R.color.yt_youtube_red));
        a.A = 1;
        return a;
    }

    private static String G(String str, boolean z) {
        return z ? "sync:".concat(str) : str;
    }

    private final void H(fi fiVar, agqg agqgVar, int i) {
        String string;
        int i2;
        if (agqgVar.g) {
            string = this.d.getString(R.string.notification_playlist_error);
            i2 = 2131231703;
        } else {
            string = this.d.getString(i);
            i2 = 2131231705;
        }
        agqf agqfVar = agqgVar.a;
        String str = agqfVar.a;
        fiVar.k(agqfVar.b);
        fiVar.j(string);
        fiVar.i(null);
        fiVar.r(i2);
        fiVar.q(0, 0, false);
        fiVar.o(false);
        fiVar.g(true);
        fiVar.g = PendingIntent.getActivity(this.d, str.hashCode(), this.h.a(str), zgd.M() | 1073741824);
    }

    private final void I(agqv agqvVar) {
        String string;
        int i;
        String m = agqvVar.m();
        if (agqvVar.u()) {
            string = agqvVar.l(agqvVar.i(), this.d);
            i = 2131231703;
        } else {
            string = this.d.getString(R.string.notification_video_download_completed);
            i = 2131231705;
        }
        fi F = F();
        F.j(string);
        F.k(agqvVar.o(this.d));
        F.i(null);
        F.r(i);
        F.q(0, 0, false);
        F.o(false);
        F.g(true);
        F.g = PendingIntent.getActivity(this.d, m.hashCode(), this.h.b(), zgd.M() | 1073741824);
        J(F, m, 1, agqvVar.g());
    }

    private final void J(fi fiVar, String str, int i, Uri uri) {
        if (!this.b.b()) {
            f(fiVar.b(), str, i);
        }
        if (uri == null) {
            f(fiVar.b(), str, i);
        }
        if (uri == null) {
            return;
        }
        ((ajmy) this.e.get()).l(uri, new jjm(this, fiVar, str, i));
    }

    public static String b(long j) {
        if (j < 1048576) {
            Locale locale = Locale.getDefault();
            double d = j;
            Double.isNaN(d);
            return String.format(locale, "%.1f", Double.valueOf(d / 1048576.0d));
        }
        return Long.toString(zew.Q(j));
    }

    @Override // defpackage.agrn
    public final Notification a() {
        jjp jjpVar = this.k;
        jjpVar.a.d(acuo.a(28631), null, null);
        jjpVar.a.n(new acte(acuo.b(113353)));
        fi F = F();
        F.k(this.d.getString(R.string.offline_fallback_notification));
        F.r(2131231706);
        F.q(0, 0, false);
        F.o(false);
        F.g(false);
        return F.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agrl
    public final synchronized void c(String str) {
        super.c(str);
        this.j.remove(G(str, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agrl
    public final synchronized void d(String str) {
        super.d(str);
        this.j.remove(G(str, true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agrl
    public final synchronized void e(String str) {
        super.e(str);
        this.j.remove(str);
    }

    public final void f(Notification notification, String str, int i) {
        if (i == 0) {
            y(str, notification);
        } else if (i == 1) {
            x(str, notification);
        } else if (i == 2) {
            t(str, notification);
        } else if (i == 3) {
            s(str, notification);
        } else if (i == 7) {
            v(str, notification);
        } else if (i == 8) {
            u(str, notification);
        } else if (i != 9) {
        } else {
            w(str, notification);
        }
    }

    @Override // defpackage.agrn
    public final void g(String str) {
        if (this.j.containsKey(str)) {
            ((fi) this.j.get(str)).w(System.currentTimeMillis());
        }
    }

    @Override // defpackage.agrn
    public final void h(agik agikVar) {
        this.c = agikVar;
    }

    @Override // defpackage.agrl
    protected final void i(agqg agqgVar) {
        fi F = F();
        H(F, agqgVar, R.string.notification_playlist_completed);
        agqf agqfVar = agqgVar.a;
        J(F, agqfVar.a, 3, agqfVar.a());
    }

    @Override // defpackage.agrl
    protected final void j(agqg agqgVar) {
        String quantityString;
        boolean z;
        boolean z2;
        String d = agqgVar.d();
        fi E = E(d, true, false);
        String d2 = agqgVar.d();
        int c = agqgVar.c();
        int a = agqgVar.a();
        int i = agqgVar.e;
        if (!this.i.o()) {
            quantityString = this.d.getString(R.string.offline_waiting_for_network);
            z = false;
            z2 = true;
        } else {
            quantityString = this.a.getQuantityString(R.plurals.notification_playlist_progress_size, c, Integer.valueOf(a), Integer.valueOf(c));
            z = true;
            z2 = false;
        }
        E.k(agqgVar.a.b);
        E.i(this.d.getString(R.string.percent, Integer.valueOf(i)));
        E.j(quantityString);
        E.r(2131231706);
        E.q(100, i, false);
        E.o(z);
        E.g(z2);
        E.p();
        E.g = PendingIntent.getActivity(this.d, 0, this.h.a(d2), zgd.M() | 134217728);
        J(E, d, 2, agqgVar.a.a());
    }

    @Override // defpackage.agrl
    protected final void k(agqg agqgVar) {
        fi F = F();
        H(F, agqgVar, R.string.notification_playlist_sync_completed);
        agqf agqfVar = agqgVar.a;
        J(F, agqfVar.a, 8, agqfVar.a());
    }

    @Override // defpackage.agrl
    protected final void l(agqg agqgVar) {
        String quantityString;
        boolean z;
        boolean z2;
        String d = agqgVar.d();
        fi E = E(d, true, true);
        String d2 = agqgVar.d();
        int c = agqgVar.c();
        int a = agqgVar.a();
        int i = agqgVar.f;
        int i2 = agqgVar.b;
        if (!this.i.o()) {
            quantityString = this.d.getString(R.string.offline_waiting_for_network);
            z = false;
            z2 = true;
        } else {
            int i3 = c - i2;
            quantityString = this.a.getQuantityString(R.plurals.notification_playlist_progress_size, i3, Integer.valueOf(a - i2), Integer.valueOf(i3));
            z = true;
            z2 = false;
        }
        String valueOf = String.valueOf(this.d.getString(R.string.offline_sync_notification));
        String valueOf2 = String.valueOf(quantityString);
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        E.k(agqgVar.a.b);
        E.i(this.d.getString(R.string.percent, Integer.valueOf(i)));
        E.j(concat);
        E.r(2131231706);
        E.q(100, i, false);
        E.o(z);
        E.g(z2);
        E.g = PendingIntent.getActivity(this.d, 0, this.h.a(d2), zgd.M() | 134217728);
        J(E, d, 7, agqgVar.a.a());
    }

    @Override // defpackage.agrl
    protected final void m(agqv agqvVar) {
        I(agqvVar);
    }

    @Override // defpackage.agrl
    protected final void n(agqv agqvVar) {
        I(agqvVar);
    }

    @Override // defpackage.agrl
    protected final void o(agqv agqvVar) {
        boolean z;
        String m = agqvVar.m();
        long e = agqvVar.e();
        long d = agqvVar.d();
        int i = d <= 0 ? 0 : (int) ((100 * e) / d);
        boolean z2 = true;
        String string = this.d.getString(R.string.percent, Integer.valueOf(i));
        String string2 = this.d.getString(R.string.notification_progress_size, this.l.b(b(e)), this.l.b(b(d)));
        fi E = E(m, false, false);
        E.i(string);
        E.j(string2);
        E.q(100, i, false);
        fi E2 = E(m, false, false);
        agqp i2 = agqvVar.i();
        if (!this.i.o()) {
            E2.j(this.d.getString(R.string.offline_waiting_for_network));
        } else if (i2 == agqp.TRANSFER_PENDING_WIFI) {
            E2.j(this.d.getString(R.string.offline_waiting_for_wifi));
        } else if (i2 == agqp.TRANSFER_PENDING_TOOTHFAIRY) {
            E2.j(this.d.getString(R.string.offline_waiting_for_discount));
        } else {
            z = false;
            E2.k(agqvVar.o(this.d));
            E2.r(2131231706);
            E2.o(z2);
            E2.g(z);
            E2.p();
            E2.g = PendingIntent.getActivity(this.d, m.hashCode(), this.h.b(), zgd.M() | 134217728);
            J(E2, m, 0, agqvVar.g());
        }
        z = true;
        z2 = false;
        E2.k(agqvVar.o(this.d));
        E2.r(2131231706);
        E2.o(z2);
        E2.g(z);
        E2.p();
        E2.g = PendingIntent.getActivity(this.d, m.hashCode(), this.h.b(), zgd.M() | 134217728);
        J(E2, m, 0, agqvVar.g());
    }

    @Override // defpackage.agrl
    protected final void p(agqv agqvVar, boolean z) {
        if (!z) {
            return;
        }
        fi F = F();
        F.k(this.d.getString(R.string.offline_renew_title));
        F.j(this.d.getString(R.string.offline_renew));
        F.r(2131231706);
        F.o(true);
        F.g(false);
        F.g = PendingIntent.getActivity(this.d, agqvVar.m().hashCode(), this.h.b(), zgd.M() | 134217728);
        f(F.b(), "14", 9);
    }

    @Override // defpackage.agrl
    protected final void q(agqv agqvVar) {
        boolean contains = ((agrf) this.g.get()).a().k().g(agqvVar.m()).contains(jod.a);
        if (!contains || Build.VERSION.SDK_INT >= 28) {
            fi F = F();
            F.k(this.d.getString(true != contains ? R.string.offline_thumbnail_updating_notification : R.string.notification_download_recs_refreshing));
            F.r(2131231706);
            F.q(0, 0, false);
            F.o(true);
            F.g(false);
            F.g = PendingIntent.getActivity(this.d, agqvVar.m().hashCode(), this.h.b(), zgd.M() | 134217728);
            D(F.b());
            if (contains) {
                jjp jjpVar = this.k;
                jjpVar.a.d(acuo.a(28631), null, null);
                jjpVar.a.n(new acte(acuo.b(113352)));
                return;
            }
            jjp jjpVar2 = this.k;
            jjpVar2.a.d(acuo.a(28631), null, null);
            jjpVar2.a.n(new acte(acuo.b(113354)));
        }
    }
}

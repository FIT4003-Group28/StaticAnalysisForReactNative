package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class y {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        Bundle A;
        int B;
        int C;
        Notification D;
        RemoteViews E;
        RemoteViews F;
        RemoteViews G;
        String H;
        int I;
        String J;
        long K;
        int L;
        Notification M;
        @Deprecated
        public ArrayList<String> N;

        /* renamed from: a  reason: collision with root package name */
        public Context f336a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f337b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f338c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f339d;
        PendingIntent e;
        PendingIntent f;
        RemoteViews g;
        Bitmap h;
        CharSequence i;
        int j;
        int k;
        boolean l;
        boolean m;
        d n;
        CharSequence o;
        CharSequence[] p;
        int q;
        int r;
        boolean s;
        String t;
        boolean u;
        String v;
        boolean w;
        boolean x;
        boolean y;
        String z;

        public c(Context context, String str) {
            this.f337b = new ArrayList<>();
            this.l = true;
            this.w = false;
            this.B = 0;
            this.C = 0;
            this.I = 0;
            this.L = 0;
            this.M = new Notification();
            this.f336a = context;
            this.H = str;
            this.M.when = System.currentTimeMillis();
            this.M.audioStreamType = -1;
            this.k = 0;
            this.N = new ArrayList<>();
        }

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c a(long j) {
            this.M.when = j;
            return this;
        }

        public c a(int i) {
            this.M.icon = i;
            return this;
        }

        public c a(CharSequence charSequence) {
            this.f338c = d(charSequence);
            return this;
        }

        public c b(CharSequence charSequence) {
            this.f339d = d(charSequence);
            return this;
        }

        public c a(PendingIntent pendingIntent) {
            this.e = pendingIntent;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.M.tickerText = d(charSequence);
            return this;
        }

        public c a(Uri uri) {
            this.M.sound = uri;
            this.M.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.M.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public c a(boolean z) {
            a(8, z);
            return this;
        }

        public c b(boolean z) {
            a(16, z);
            return this;
        }

        public c c(boolean z) {
            this.w = z;
            return this;
        }

        private void a(int i, boolean z) {
            if (z) {
                Notification notification = this.M;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.M;
            notification2.flags = (~i) & notification2.flags;
        }

        public c b(int i) {
            this.k = i;
            return this;
        }

        public c a(String str) {
            this.t = str;
            return this;
        }

        public c a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f337b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public c a(d dVar) {
            if (this.n != dVar) {
                this.n = dVar;
                if (this.n != null) {
                    this.n.a(this);
                }
            }
            return this;
        }

        public c c(int i) {
            this.B = i;
            return this;
        }

        public c b(String str) {
            this.H = str;
            return this;
        }

        public Notification a() {
            return new z(this).b();
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        protected c f340a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f341b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f342c;

        /* renamed from: d  reason: collision with root package name */
        boolean f343d = false;

        public void a(Bundle bundle) {
        }

        public void a(x xVar) {
        }

        public RemoteViews b(x xVar) {
            return null;
        }

        public RemoteViews c(x xVar) {
            return null;
        }

        public RemoteViews d(x xVar) {
            return null;
        }

        public void a(c cVar) {
            if (this.f340a != cVar) {
                this.f340a = cVar;
                if (this.f340a == null) {
                    return;
                }
                this.f340a.a(this);
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b extends d {
        private CharSequence e;

        public b a(CharSequence charSequence) {
            this.e = c.d(charSequence);
            return this;
        }

        @Override // android.support.v4.app.y.d
        public void a(x xVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(xVar.a()).setBigContentTitle(this.f341b).bigText(this.e);
                if (!this.f343d) {
                    return;
                }
                bigText.setSummaryText(this.f342c);
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f332a;

        /* renamed from: b  reason: collision with root package name */
        public int f333b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f334c;

        /* renamed from: d  reason: collision with root package name */
        public PendingIntent f335d;
        private final ad[] e;
        private final ad[] f;
        private boolean g;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true);
        }

        a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ad[] adVarArr, ad[] adVarArr2, boolean z) {
            this.f333b = i;
            this.f334c = c.d(charSequence);
            this.f335d = pendingIntent;
            this.f332a = bundle == null ? new Bundle() : bundle;
            this.e = adVarArr;
            this.f = adVarArr2;
            this.g = z;
        }

        public int a() {
            return this.f333b;
        }

        public CharSequence b() {
            return this.f334c;
        }

        public PendingIntent c() {
            return this.f335d;
        }

        public Bundle d() {
            return this.f332a;
        }

        public boolean e() {
            return this.g;
        }

        public ad[] f() {
            return this.e;
        }

        public ad[] g() {
            return this.f;
        }
    }

    public static Bundle a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        return aa.a(notification);
    }
}

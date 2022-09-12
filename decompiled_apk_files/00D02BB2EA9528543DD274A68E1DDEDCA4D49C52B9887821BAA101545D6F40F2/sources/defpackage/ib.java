package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ib  reason: default package */
/* loaded from: classes.dex */
public final class ib {
    Bundle A;
    public int B;
    public int C;
    public Notification D;
    public RemoteViews E;
    public RemoteViews F;
    public String G;
    public int H;
    boolean I;
    Notification J;
    @Deprecated
    public ArrayList<String> K;
    public Context a;
    public ArrayList<hy> b;
    public ArrayList<akj> c;
    ArrayList<hy> d;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    Bitmap h;
    CharSequence i;
    public int j;
    public int k;
    public boolean l;
    boolean m;
    ih n;
    CharSequence o;
    public CharSequence[] p;
    int q;
    int r;
    boolean s;
    public String t;
    public boolean u;
    public String v;
    public boolean w;
    boolean x;
    boolean y;
    public String z;

    @Deprecated
    public ib(Context context) {
        this(context, null);
    }

    private final void A(int i, boolean z) {
        if (z) {
            Notification notification = this.J;
            notification.flags = i | notification.flags;
            return;
        }
        Notification notification2 = this.J;
        notification2.flags = (i ^ (-1)) & notification2.flags;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Bundle a() {
        if (this.A == null) {
            this.A = new Bundle();
        }
        return this.A;
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        RemoteViews o;
        RemoteViews m;
        ii iiVar = new ii(this);
        ih ihVar = iiVar.b.n;
        if (ihVar != null) {
            ihVar.b(iiVar);
        }
        RemoteViews n = ihVar != null ? ihVar.n() : null;
        if (Build.VERSION.SDK_INT >= 26) {
            build = iiVar.a.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            build = iiVar.a.build();
            if (iiVar.f != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && iiVar.f == 2) {
                    ii.a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && iiVar.f == 1) {
                    ii.a(build);
                }
            }
        } else {
            iiVar.a.setExtras(iiVar.e);
            build = iiVar.a.build();
            RemoteViews remoteViews = iiVar.c;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = iiVar.d;
            if (remoteViews2 != null) {
                build.bigContentView = remoteViews2;
            }
            if (iiVar.f != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && iiVar.f == 2) {
                    ii.a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && iiVar.f == 1) {
                    ii.a(build);
                }
            }
        }
        if (n != null) {
            build.contentView = n;
        } else {
            RemoteViews remoteViews3 = iiVar.b.E;
            if (remoteViews3 != null) {
                build.contentView = remoteViews3;
            }
        }
        if (ihVar != null && (m = ihVar.m()) != null) {
            build.bigContentView = m;
        }
        if (ihVar != null && (o = iiVar.b.n.o()) != null) {
            build.headsUpContentView = o;
        }
        if (ihVar != null && (bundle = build.extras) != null) {
            ihVar.c(bundle);
        }
        return build;
    }

    public final long d() {
        if (this.l) {
            return this.J.when;
        }
        return 0L;
    }

    public final void e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new hy(i == 0 ? null : IconCompat.b(null, "", i), charSequence, pendingIntent, new Bundle(), null, true, true));
    }

    public final void f(hy hyVar) {
        this.b.add(hyVar);
    }

    public final void g(id idVar) {
        idVar.a(this);
    }

    public final void h(boolean z) {
        A(16, z);
    }

    public final void i() {
        this.x = true;
        this.y = true;
    }

    public final void j(RemoteViews remoteViews) {
        this.J.contentView = remoteViews;
    }

    public final void k(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void l(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void m(int i) {
        this.J.defaults = i;
        if ((i & 4) != 0) {
            this.J.flags |= 1;
        }
    }

    public final void n(PendingIntent pendingIntent) {
        this.J.deleteIntent = pendingIntent;
    }

    public final void o(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d = dimensionPixelSize;
                double max = Math.max(1, bitmap.getWidth());
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double d3 = dimensionPixelSize2;
                double max2 = Math.max(1, bitmap.getHeight());
                Double.isNaN(d3);
                Double.isNaN(max2);
                double min = Math.min(d2, d3 / max2);
                double width = bitmap.getWidth();
                Double.isNaN(width);
                double height = bitmap.getHeight();
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
        }
        this.h = bitmap;
    }

    public final void p(int i, int i2, int i3) {
        this.J.ledARGB = i;
        this.J.ledOnMS = i2;
        this.J.ledOffMS = i3;
        int i4 = 0;
        if (this.J.ledOnMS != 0 && this.J.ledOffMS != 0) {
            i4 = 1;
        }
        Notification notification = this.J;
        notification.flags = i4 | (notification.flags & (-2));
    }

    public final void q(boolean z) {
        A(2, z);
    }

    public final void r(boolean z) {
        A(8, z);
    }

    public final void s(int i, int i2, boolean z) {
        this.q = i;
        this.r = i2;
        this.s = z;
    }

    public final void t(int i) {
        this.J.icon = i;
    }

    public final void u(Uri uri) {
        this.J.sound = uri;
        this.J.audioStreamType = -1;
        this.J.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void v(ih ihVar) {
        if (this.n != ihVar) {
            this.n = ihVar;
            if (ihVar == null || ihVar.d == this) {
                return;
            }
            ihVar.d = this;
            ib ibVar = ihVar.d;
            if (ibVar == null) {
                return;
            }
            ibVar.v(ihVar);
        }
    }

    public final void w(CharSequence charSequence) {
        this.o = c(charSequence);
    }

    public final void x(CharSequence charSequence) {
        this.J.tickerText = c(charSequence);
    }

    public final void y(long[] jArr) {
        this.J.vibrate = jArr;
    }

    public final void z(long j) {
        this.J.when = j;
    }

    public ib(Context context, String str) {
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.l = true;
        this.w = false;
        this.B = 0;
        this.C = 0;
        this.H = 0;
        Notification notification = new Notification();
        this.J = notification;
        this.a = context;
        this.G = str;
        notification.when = System.currentTimeMillis();
        this.J.audioStreamType = -1;
        this.k = 0;
        this.K = new ArrayList<>();
        this.I = true;
    }
}

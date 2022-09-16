package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f1506a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f1507b;

        /* renamed from: c  reason: collision with root package name */
        private final l[] f1508c;

        /* renamed from: d  reason: collision with root package name */
        private final l[] f1509d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1510e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1511f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1512g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f1513h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        /* renamed from: androidx.core.app.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f1514a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f1515b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f1516c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f1517d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f1518e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<l> f1519f;

            /* renamed from: g  reason: collision with root package name */
            private int f1520g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f1521h;
            private boolean i;

            public C0048a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.a(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            private C0048a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, boolean z, int i, boolean z2, boolean z3) {
                this.f1517d = true;
                this.f1521h = true;
                this.f1514a = iconCompat;
                this.f1515b = e.e(charSequence);
                this.f1516c = pendingIntent;
                this.f1518e = bundle;
                this.f1519f = lVarArr == null ? null : new ArrayList<>(Arrays.asList(lVarArr));
                this.f1517d = z;
                this.f1520g = i;
                this.f1521h = z2;
                this.i = z3;
            }

            private void b() {
                if (this.i && this.f1516c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<l> arrayList3 = this.f1519f;
                if (arrayList3 != null) {
                    Iterator<l> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        l next = it.next();
                        if (next.h()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                l[] lVarArr = null;
                l[] lVarArr2 = arrayList.isEmpty() ? null : (l[]) arrayList.toArray(new l[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    lVarArr = (l[]) arrayList2.toArray(new l[arrayList2.size()]);
                }
                return new a(this.f1514a, this.f1515b, this.f1516c, this.f1518e, lVarArr, lVarArr2, this.f1517d, this.f1520g, this.f1521h, this.i);
            }
        }

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.a(null, "", i) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, l[] lVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f1511f = true;
            this.f1507b = iconCompat;
            if (iconCompat != null && iconCompat.c() == 2) {
                this.i = iconCompat.a();
            }
            this.j = e.e(charSequence);
            this.k = pendingIntent;
            this.f1506a = bundle == null ? new Bundle() : bundle;
            this.f1508c = lVarArr;
            this.f1509d = lVarArr2;
            this.f1510e = z;
            this.f1512g = i;
            this.f1511f = z2;
            this.f1513h = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.f1510e;
        }

        public l[] c() {
            return this.f1509d;
        }

        public Bundle d() {
            return this.f1506a;
        }

        public IconCompat e() {
            int i;
            if (this.f1507b == null && (i = this.i) != 0) {
                this.f1507b = IconCompat.a(null, "", i);
            }
            return this.f1507b;
        }

        public l[] f() {
            return this.f1508c;
        }

        public int g() {
            return this.f1512g;
        }

        public boolean h() {
            return this.f1511f;
        }

        public CharSequence i() {
            return this.j;
        }

        public boolean j() {
            return this.f1513h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f1522e;

        /* renamed from: f  reason: collision with root package name */
        private Bitmap f1523f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1524g;

        public b a(Bitmap bitmap) {
            this.f1523f = bitmap;
            this.f1524g = true;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f1535b = e.e(charSequence);
            return this;
        }

        @Override // androidx.core.app.g.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (this.f1524g) {
                bundle.putParcelable("android.largeIcon.big", this.f1523f);
            }
            bundle.putParcelable("android.picture", this.f1522e);
        }

        @Override // androidx.core.app.g.f
        public void a(androidx.core.app.f fVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(fVar.a()).setBigContentTitle(this.f1535b).bigPicture(this.f1522e);
                if (this.f1524g) {
                    bigPicture.bigLargeIcon(this.f1523f);
                }
                if (!this.f1537d) {
                    return;
                }
                bigPicture.setSummaryText(this.f1536c);
            }
        }

        public b b(Bitmap bitmap) {
            this.f1522e = bitmap;
            return this;
        }

        public b b(CharSequence charSequence) {
            this.f1536c = e.e(charSequence);
            this.f1537d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1525e;

        public c a(CharSequence charSequence) {
            this.f1525e = e.e(charSequence);
            return this;
        }

        @Override // androidx.core.app.g.f
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.bigText", this.f1525e);
        }

        @Override // androidx.core.app.g.f
        public void a(androidx.core.app.f fVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(fVar.a()).setBigContentTitle(this.f1535b).bigText(this.f1525e);
                if (!this.f1537d) {
                    return;
                }
                bigText.setSummaryText(this.f1536c);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            if (dVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            dVar.a();
            throw null;
        }

        public boolean a() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        a.g.e.d N;
        long O;
        int P;
        boolean Q;
        d R;
        Notification S;
        boolean T;
        Icon U;
        @Deprecated
        public ArrayList<String> V;

        /* renamed from: a  reason: collision with root package name */
        public Context f1526a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1527b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<k> f1528c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f1529d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1530e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f1531f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f1532g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f1533h;
        RemoteViews i;
        Bitmap j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        f p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f1527b = new ArrayList<>();
            this.f1528c = new ArrayList<>();
            this.f1529d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.S = new Notification();
            this.f1526a = context;
            this.K = str;
            this.S.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        private void a(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.S;
                i2 = i | notification.flags;
            } else {
                notification = this.S;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        private Bitmap b(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1526a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.g.b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.g.b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Notification a() {
            return new h(this).b();
        }

        public e a(int i) {
            this.E = i;
            return this;
        }

        public e a(int i, int i2, int i3) {
            Notification notification = this.S;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (notification.ledOnMS == 0 || notification.ledOffMS == 0) ? 0 : 1;
            Notification notification2 = this.S;
            notification2.flags = i4 | (notification2.flags & (-2));
            return this;
        }

        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1527b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public e a(long j) {
            this.S.when = j;
            return this;
        }

        public e a(PendingIntent pendingIntent) {
            this.f1532g = pendingIntent;
            return this;
        }

        public e a(Bitmap bitmap) {
            this.j = b(bitmap);
            return this;
        }

        public e a(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e a(a aVar) {
            if (aVar != null) {
                this.f1527b.add(aVar);
            }
            return this;
        }

        public e a(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                f fVar2 = this.p;
                if (fVar2 != null) {
                    fVar2.a(this);
                }
            }
            return this;
        }

        public e a(CharSequence charSequence) {
            this.f1531f = e(charSequence);
            return this;
        }

        public e a(String str) {
            this.C = str;
            return this;
        }

        public e a(boolean z) {
            a(16, z);
            return this;
        }

        public e a(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public Bundle b() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e b(int i) {
            Notification notification = this.S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e b(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public e b(CharSequence charSequence) {
            this.f1530e = e(charSequence);
            return this;
        }

        public e b(String str) {
            this.K = str;
            return this;
        }

        public e b(boolean z) {
            this.x = z;
            return this;
        }

        public e c(int i) {
            this.l = i;
            return this;
        }

        public e c(CharSequence charSequence) {
            this.q = e(charSequence);
            return this;
        }

        public e c(String str) {
            this.w = str;
            return this;
        }

        public e c(boolean z) {
            this.z = z;
            return this;
        }

        public e d(int i) {
            this.m = i;
            return this;
        }

        public e d(CharSequence charSequence) {
            this.S.tickerText = e(charSequence);
            return this;
        }

        public e d(String str) {
            this.M = str;
            return this;
        }

        public e d(boolean z) {
            a(2, z);
            return this;
        }

        public e e(int i) {
            this.S.icon = i;
            return this;
        }

        public e e(boolean z) {
            a(8, z);
            return this;
        }

        public e f(int i) {
            this.F = i;
            return this;
        }

        public e f(boolean z) {
            this.n = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected e f1534a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1535b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1536c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1537d = false;

        public void a(Bundle bundle) {
            if (this.f1537d) {
                bundle.putCharSequence("android.summaryText", this.f1536c);
            }
            CharSequence charSequence = this.f1535b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", getClass().getName());
        }

        public abstract void a(androidx.core.app.f fVar);

        public void a(e eVar) {
            if (this.f1534a != eVar) {
                this.f1534a = eVar;
                e eVar2 = this.f1534a;
                if (eVar2 == null) {
                    return;
                }
                eVar2.a(this);
            }
        }

        public RemoteViews b(androidx.core.app.f fVar) {
            return null;
        }

        public RemoteViews c(androidx.core.app.f fVar) {
            return null;
        }

        public RemoteViews d(androidx.core.app.f fVar) {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i < 16) {
            return null;
        }
        return i.a(notification);
    }
}

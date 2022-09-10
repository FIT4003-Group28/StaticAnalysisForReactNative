package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: culw  reason: default package */
/* loaded from: classes5.dex */
public final class culw implements culd {
    public static final /* synthetic */ int j = 0;
    private static final View.OnClickListener k = culj.a;
    private static final Handler l = new Handler(Looper.getMainLooper());
    private static final dehp m = cstu.b().a;
    public final cule a;
    public final ctyy b;
    public final cuiv c;
    public final qx d;
    public View.OnClickListener e;
    public Runnable f;
    public boolean g;
    public Activity h;
    public cuss<dbsg<cugu>> i;
    private final String n;
    private final ConversationId o;
    private final csuk p;
    private final csuf q;
    private final List<MenuItem> r = new ArrayList();
    private int s;
    private int t;
    private int u;
    private int v;

    public culw(final Activity activity, cule culeVar, ctyy ctyyVar, String str, ConversationId conversationId, csuk csukVar, cuiv cuivVar, csuf csufVar) {
        this.a = culeVar;
        this.h = activity;
        this.b = ctyyVar;
        this.n = str;
        this.o = conversationId;
        this.p = csukVar;
        this.c = cuivVar;
        this.q = csufVar;
        qx qxVar = new qx(activity, 2132018255);
        this.d = qxVar;
        qxVar.i(R.string.lightbox_delete_dialog_title);
        qxVar.o(R.string.lightbox_delete_dialog_positive_button_text, new DialogInterface.OnClickListener(this) { // from class: culk
            private final culw a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.f.run();
                dialogInterface.dismiss();
            }
        });
        qxVar.l(R.string.lightbox_delete_dialog_negative_button_text, cull.a);
        this.g = false;
        this.e = k;
        this.f = new Runnable(activity) { // from class: culf
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Activity activity2 = this.a;
                int i = culw.j;
                if (activity2 == null) {
                    return;
                }
                Toast.makeText(activity2, (int) R.string.lightbox_delete_failure_toast, 0).show();
            }
        };
    }

    public static void h(Runnable runnable) {
        l.post(runnable);
    }

    @Override // defpackage.cuvu
    public final void A() {
        f();
        for (MenuItem menuItem : this.r) {
            this.a.b(menuItem.getItemId());
        }
        cuss<dbsg<cugu>> cussVar = this.i;
        if (cussVar != null) {
            cussVar.g(new cusr(this) { // from class: culg
                private final culw a;

                {
                    this.a = this;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    this.a.d((dbsg) obj);
                }
            });
        }
        this.i = null;
    }

    @Override // defpackage.cuvu
    public final void B() {
        this.h = null;
    }

    @Override // defpackage.culd
    public final void a(View view) {
        this.e.onClick(view);
    }

    @Override // defpackage.culd
    public final void b() {
        this.a.c();
        g(this.a.d());
    }

    public final void c() {
        int i;
        int dimensionPixelSize;
        int i2;
        Activity activity = this.h;
        if (activity == null) {
            return;
        }
        Resources resources = activity.getResources();
        int i3 = resources.getConfiguration().orientation;
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : true;
        cule culeVar = this.a;
        boolean z2 = (culeVar instanceof View) && od.s((View) culeVar) == 0;
        if (Build.VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                return;
            }
            i = rootWindowInsets.getSystemWindowInsetTop();
            if (i3 == 2 && z) {
                if (z2) {
                    i2 = rootWindowInsets.getSystemWindowInsetLeft();
                } else {
                    i2 = rootWindowInsets.getSystemWindowInsetRight();
                }
                if (z2) {
                    dimensionPixelSize = rootWindowInsets.getSystemWindowInsetRight();
                } else {
                    dimensionPixelSize = rootWindowInsets.getSystemWindowInsetLeft();
                }
            }
            dimensionPixelSize = 0;
            i2 = 0;
        } else {
            int a = cuwg.a(activity, 24.0f);
            if (i3 != 2 || !z) {
                i = a;
                dimensionPixelSize = 0;
                i2 = 0;
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_width", "dimen", "android"));
                i2 = true != z2 ? dimensionPixelSize : 0;
                if (true != z2) {
                    dimensionPixelSize = 0;
                }
                i = a;
            }
        }
        this.a.h().setLayoutParams(new ajl(-1, activity.getResources().getDimensionPixelSize(R.dimen.lightbox_toolbar_height) + i));
        this.a.h().setPaddingRelative(i2, i, dimensionPixelSize, 0);
    }

    public final void d(dbsg<cugu> dbsgVar) {
        if (!dbsgVar.a()) {
            cstl.a("PhotoLightBPresenter");
            return;
        }
        Activity activity = this.h;
        if (activity == null) {
            return;
        }
        final cugu b = dbsgVar.b();
        this.a.setSubtitle(cuvy.a(activity, TimeUnit.MICROSECONDS.toMillis(b.d().longValue())));
        if (b.b().equals(this.b.b().e())) {
            this.a.setTitle(activity.getString(R.string.self_sender));
        } else {
            this.q.b(this.b, b.b()).k(new cusr(this) { // from class: culo
                private final culw a;

                {
                    this.a = this;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    culw culwVar = this.a;
                    dbsg<String> b2 = ((cufj) obj).b();
                    cule culeVar = culwVar.a;
                    culeVar.getClass();
                    cstn.a(b2, new mw(culeVar) { // from class: culi
                        private final cule a;

                        {
                            this.a = culeVar;
                        }

                        @Override // defpackage.mw
                        public final void a(Object obj2) {
                            this.a.setTitle((String) obj2);
                        }
                    });
                }
            });
        }
        dbsg<cukp> b2 = cuiq.b(b);
        if (b2.a()) {
            this.f = new Runnable(this, b) { // from class: culp
                private final culw a;
                private final cugu b;

                {
                    this.a = this;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dehn c;
                    final culw culwVar = this.a;
                    cugu cuguVar = this.b;
                    if (culwVar.g) {
                        return;
                    }
                    culwVar.g = true;
                    cuiv cuivVar = culwVar.c;
                    ctyy ctyyVar = culwVar.b;
                    dbsg<cukp> b3 = cuiq.b(cuguVar);
                    if (!b3.a()) {
                        c = deha.a(false);
                    } else {
                        cukp b4 = b3.b();
                        String b5 = b4.b();
                        if (b5 == null) {
                            c = deha.a(false);
                        } else {
                            cujn cujnVar = (cujn) cuivVar;
                            if (!cujnVar.j(b5)) {
                                c = deha.a(false);
                            } else {
                                c = cujnVar.g.c(new Callable(cujnVar, b5, b4, ctyyVar, cuguVar) { // from class: cujd
                                    private final cujn a;
                                    private final String b;
                                    private final cukp c;
                                    private final ctyy d;
                                    private final cugu e;

                                    {
                                        this.a = cujnVar;
                                        this.b = b5;
                                        this.c = b4;
                                        this.d = ctyyVar;
                                        this.e = cuguVar;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        cujn cujnVar2 = this.a;
                                        String str = this.b;
                                        cukp cukpVar = this.c;
                                        ctyy ctyyVar2 = this.d;
                                        cugu cuguVar2 = this.e;
                                        try {
                                            boolean delete = new File(Uri.parse(str).getPath()).delete();
                                            if (delete) {
                                                cuko h = cukpVar.h();
                                                h.d(null);
                                                h.b(0);
                                                h.g(dbpy.a);
                                                cukp a = h.a();
                                                cusm a2 = cujnVar2.f.a(ctyyVar2);
                                                cugi n = cuguVar2.n();
                                                cugk c2 = cugl.c();
                                                ((cudv) c2).a = "photos";
                                                c2.b(cuiq.a(a).b());
                                                n.s(c2.a());
                                                a2.f(n.a());
                                            } else {
                                                if (str.length() == 0) {
                                                    new String("Failed to delete photo: ");
                                                }
                                                cstl.a("PhotosMsgController");
                                            }
                                            return Boolean.valueOf(delete);
                                        } catch (SecurityException unused) {
                                            if (str.length() == 0) {
                                                new String("Tried to delete file without access: ");
                                            }
                                            cstl.a("PhotosMsgController");
                                            return false;
                                        }
                                    }
                                });
                            }
                        }
                    }
                    deew.h(c, new dbrn(culwVar) { // from class: culq
                        private final culw a;

                        {
                            this.a = culwVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            culw.h(new Runnable(this.a, (Boolean) obj) { // from class: culh
                                private final culw a;
                                private final Boolean b;

                                {
                                    this.a = r1;
                                    this.b = r2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    culw culwVar2 = this.a;
                                    Boolean bool = this.b;
                                    Activity activity2 = culwVar2.h;
                                    if (activity2 == null) {
                                        return;
                                    }
                                    if (Boolean.TRUE.equals(bool)) {
                                        Toast.makeText(activity2, (int) R.string.lightbox_delete_confirmation_toast, 0).show();
                                        activity2.onBackPressed();
                                        return;
                                    }
                                    Toast.makeText(activity2, (int) R.string.lightbox_delete_failure_toast, 0).show();
                                }
                            });
                            return null;
                        }
                    }, dege.a);
                }
            };
            cukp b3 = b2.b();
            int g = b3.g();
            if (g == 0) {
                if (this.g) {
                    return;
                }
                e(b);
                return;
            } else if (g == 1) {
                final String b4 = b3.b();
                if (b4 == null) {
                    e(b);
                    return;
                } else {
                    m.a(new Runnable(this, b, b4) { // from class: culr
                        private final culw a;
                        private final cugu b;
                        private final String c;

                        {
                            this.a = this;
                            this.b = b;
                            this.c = b4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final dbsg dbsgVar2;
                            final culw culwVar = this.a;
                            cugu cuguVar = this.b;
                            Uri parse = Uri.parse(this.c);
                            Activity activity2 = culwVar.h;
                            if (activity2 == null) {
                                return;
                            }
                            File file = new File(parse.getPath());
                            if (!file.exists()) {
                                culwVar.e(cuguVar);
                                return;
                            }
                            try {
                                dbsgVar2 = dbsg.i(MediaStore.Images.Media.getBitmap(activity2.getContentResolver(), Uri.fromFile(file)));
                            } catch (IOException unused) {
                                cstl.a("UiUtils");
                                dbsgVar2 = dbpy.a;
                            }
                            if (!dbsgVar2.a()) {
                                return;
                            }
                            culw.h(new Runnable(culwVar, dbsgVar2) { // from class: culs
                                private final culw a;
                                private final dbsg b;

                                {
                                    this.a = culwVar;
                                    this.b = dbsgVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    culw culwVar2 = this.a;
                                    dbsg dbsgVar3 = this.b;
                                    culwVar2.a.g();
                                    culwVar2.a.a((Bitmap) dbsgVar3.b());
                                }
                            });
                        }
                    });
                    return;
                }
            } else if (g == 2) {
                this.a.f();
                return;
            } else {
                int g2 = b3.g();
                StringBuilder sb = new StringBuilder(50);
                sb.append("Unrecognized PhotoData.DownloadStatus: ");
                sb.append(g2);
                sb.toString();
                cstl.a("PhotoLightBPresenter");
                return;
            }
        }
        cstl.a("PhotoLightBPresenter");
    }

    public final void e(final cugu cuguVar) {
        dehn h;
        this.a.e();
        cuiv cuivVar = this.c;
        final ctyy ctyyVar = this.b;
        dbsg<cukp> b = cuiq.b(cuguVar);
        if (!b.a()) {
            cstl.a("PhotosMsgController");
            h = deha.b(new IOException("Cannot download non-photo message"));
        } else {
            final cukp b2 = b.b();
            if (b2.a() == null) {
                cstl.a("PhotosMsgController");
                h = deha.b(new IOException("Cannot download an image without a media ID"));
            } else if (b2.g() == 2) {
                cstl.a("PhotosMsgController");
                h = deha.b(new IOException("Cannot download an image marked as DOWNLOAD_PERMANENT_FAILURE"));
            } else {
                final cujn cujnVar = (cujn) cuivVar;
                dehn c = cujnVar.g.c(new Callable(cujnVar) { // from class: cujk
                    private final cujn a;

                    {
                        this.a = cujnVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.a.d();
                        return null;
                    }
                });
                String str = cujnVar.d;
                String str2 = File.separator;
                String str3 = File.separator;
                String l2 = cujn.l(cuguVar.a());
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str3).length() + String.valueOf(l2).length());
                sb.append(str);
                sb.append(str2);
                sb.append("tmp");
                sb.append(str3);
                sb.append(l2);
                final String sb2 = sb.toString();
                dehn g = deew.g(c, new defg(cujnVar, b2, ctyyVar, cuguVar, sb2) { // from class: cujl
                    private final cujn a;
                    private final cukp b;
                    private final ctyy c;
                    private final cugu d;
                    private final String e;

                    {
                        this.a = cujnVar;
                        this.b = b2;
                        this.c = ctyyVar;
                        this.d = cuguVar;
                        this.e = sb2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        cujn cujnVar2 = this.a;
                        cukp cukpVar = this.b;
                        ctyy ctyyVar2 = this.c;
                        cugu cuguVar2 = this.d;
                        String str4 = this.e;
                        Void r10 = (Void) obj;
                        if (cukpVar.b() != null) {
                            try {
                                InputStream k2 = cujnVar2.k(Uri.parse(cukpVar.b()));
                                if (k2 != null) {
                                    k2.close();
                                }
                                cujs b3 = cujt.b();
                                b3.b(cukpVar.b());
                                return deha.a(b3.a());
                            } catch (IOException unused) {
                            }
                        }
                        cuka cukaVar = cujnVar2.c;
                        cukn a = cukpVar.a();
                        ctmm c2 = ctmn.c();
                        ((ctmh) c2).a = "LighterPhotoScottyDownload";
                        c2.b(ctmr.c);
                        return cukaVar.a(ctyyVar2, a, cuguVar2, str4, c2.a(), 18);
                    }
                }, cujnVar.g);
                deha.q(g, new cujm(cujnVar, b2, cuguVar, ctyyVar), cujnVar.g);
                h = deew.h(g, new dbrn(cujnVar, sb2, cuguVar, b2, ctyyVar) { // from class: cuiz
                    private final cujn a;
                    private final String b;
                    private final cugu c;
                    private final cukp d;
                    private final ctyy e;

                    {
                        this.a = cujnVar;
                        this.b = sb2;
                        this.c = cuguVar;
                        this.d = b2;
                        this.e = ctyyVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        cujn cujnVar2 = this.a;
                        String str4 = this.b;
                        cugu cuguVar2 = this.c;
                        cukp cukpVar = this.d;
                        ctyy ctyyVar2 = this.e;
                        cujt cujtVar = (cujt) obj;
                        ConversationId c2 = cuguVar2.c();
                        File file = new File(str4);
                        cujnVar2.e().mkdirs();
                        String absolutePath = cujnVar2.e().getAbsolutePath();
                        String str5 = File.separator;
                        String f = cujn.f(c2.a());
                        String h2 = cujn.h(c2);
                        String name = file.getName();
                        int length3 = String.valueOf(absolutePath).length();
                        int length4 = String.valueOf(str5).length();
                        int length5 = String.valueOf(f).length();
                        StringBuilder sb3 = new StringBuilder(length3 + 1 + length4 + length5 + String.valueOf(h2).length() + String.valueOf(name).length());
                        sb3.append(absolutePath);
                        sb3.append(str5);
                        sb3.append(f);
                        sb3.append(h2);
                        sb3.append("_");
                        sb3.append(name);
                        File file2 = new File(sb3.toString());
                        file.renameTo(file2);
                        String absolutePath2 = file2.getAbsolutePath();
                        dbsg<byte[]> c3 = cukpVar.c();
                        if (!c3.a()) {
                            byte[] a = cuix.a(cujnVar2.b, cujnVar2.j, Uri.fromFile(new File(absolutePath2)), cswe.a(cujnVar2.b).aj.f().intValue(), cswe.a(cujnVar2.b).ak.f().intValue(), cswe.a(cujnVar2.b).ai.f().intValue(), cswe.a(cujnVar2.b).ad.f().intValue());
                            if (a == null) {
                                cstl.a("PhotosMsgController");
                            } else {
                                c3 = dbsg.i(a);
                            }
                        }
                        cuko h3 = cukpVar.h();
                        h3.d(Uri.fromFile(new File(absolutePath2)).toString());
                        h3.b(1);
                        h3.g(c3);
                        cukp a2 = h3.a();
                        cugi n = cuguVar2.n();
                        cugk c4 = cugl.c();
                        ((cudv) c4).a = "photos";
                        c4.b(cuiq.a(a2).b());
                        n.s(c4.a());
                        cugu a3 = n.a();
                        cujnVar2.f.a(ctyyVar2).f(a3);
                        return a3;
                    }
                }, cujnVar.g);
            }
        }
        deha.q(h, new culv(this), dege.a);
    }

    public final void f() {
        Activity activity = this.h;
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(this.v);
        window.setNavigationBarColor(this.t);
        window.setStatusBarColor(this.s);
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        window.setNavigationBarDividerColor(this.u);
    }

    public final void g(boolean z) {
        Activity activity = this.h;
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.setNavigationBarColor(akm.c(this.h, R.color.lightbox_toolbar_color));
        window.setStatusBarColor(0);
        if (Build.VERSION.SDK_INT >= 28) {
            window.setNavigationBarDividerColor(0);
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility() | 1792;
        if (Build.VERSION.SDK_INT >= 26) {
            systemUiVisibility &= -17;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            systemUiVisibility &= -8193;
        }
        int i = systemUiVisibility | 2048;
        if (z) {
            decorView.setSystemUiVisibility(i & (-7));
        } else {
            decorView.setSystemUiVisibility(i | 6);
        }
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.a.setPresenter(this);
        this.a.e();
        csuk csukVar = this.p;
        ctyy ctyyVar = this.b;
        cuss<dbsg<cugu>> q = ((ctct) csukVar).H(ctyyVar).q(this.n, this.o);
        this.i = q;
        q.q(new cusr(this) { // from class: culm
            private final culw a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.d((dbsg) obj);
            }
        });
        Activity activity = this.h;
        if (activity != null) {
            this.r.add(this.a.i(activity.getString(R.string.lightbox_menu_item_title_delete), activity.getDrawable(2131232600), new MenuItem.OnMenuItemClickListener(this) { // from class: culn
                private final culw a;

                {
                    this.a = this;
                }

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.a.d.c();
                    return true;
                }
            }));
        }
        Activity activity2 = this.h;
        if (activity2 != null) {
            Window window = activity2.getWindow();
            Activity activity3 = this.h;
            if (activity3 != null) {
                Window window2 = activity3.getWindow();
                this.v = window2.getDecorView().getSystemUiVisibility();
                this.t = window2.getNavigationBarColor();
                this.s = window2.getStatusBarColor();
                if (Build.VERSION.SDK_INT >= 28) {
                    this.u = window2.getNavigationBarDividerColor();
                }
            }
            window.getDecorView().addOnAttachStateChangeListener(new cult(this));
        }
        c();
        g(this.a.d());
    }
}

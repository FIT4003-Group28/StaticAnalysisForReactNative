package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: amfd  reason: default package */
/* loaded from: classes.dex */
public final class amfd implements amfi {
    public static final /* synthetic */ int r = 0;
    private static final String s = "amfd";
    public final Context a;
    public final dxio<ckcw> b;
    public final cqat c;
    public final dxio<btmv> d;
    public final Executor e;
    public final Executor f;
    public final dbty<btnc<String, amfu>> g;
    public final dbty<btnc<String, SoftReference<amfu>>> h;
    public final dxio<amcf> j;
    public final dbty<Boolean> k;
    public final dxio<btmg> l;
    public final dxio<amfg> m;
    volatile amcg n;
    private final btzp<dxai, dxam> u;
    private final dzsj<akwu> v;
    private final dzsj<Integer> w;
    private final dbty<Boolean> x;
    private static final long y = TimeUnit.DAYS.toMillis(1);
    static final long p = TimeUnit.SECONDS.toMillis(10);
    private boolean t = false;
    public final dbty<bsa> i = dbud.a(new amep(this));
    public final btni q = new ameq(this);
    public final CountDownLatch o = new CountDownLatch(1);

    static {
        Pattern.compile("https?://paint\\.sandbox\\.google\\.com/.*");
    }

    public amfd(Context context, btzp<dxai, dxam> btzpVar, cqat cqatVar, dxio<btmv> dxioVar, dzsj<akwu> dzsjVar, Executor executor, Executor executor2, dxio<amfg> dxioVar2, dxio<ckcw> dxioVar3, dxio<amcf> dxioVar4, dbty<btnc<String, amfu>> dbtyVar, dbty<btnc<String, SoftReference<amfu>>> dbtyVar2, dzsj<Integer> dzsjVar2, dbty<Boolean> dbtyVar3, dbty<Boolean> dbtyVar4, dxio<btmg> dxioVar5) {
        this.a = context;
        this.u = btzpVar;
        this.c = cqatVar;
        this.d = dxioVar;
        this.v = dzsjVar;
        this.e = executor;
        this.f = executor2;
        this.g = dbtyVar;
        this.h = dbtyVar2;
        this.w = dzsjVar2;
        this.m = dxioVar2;
        this.b = dxioVar3;
        this.j = dxioVar4;
        this.x = dbtyVar3;
        this.k = dbtyVar4;
        this.l = dxioVar5;
    }

    public static int l(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return ckio.a(1);
            }
            return (i2 == 2 || i2 == 3) ? ckio.a(3) : i2 != 4 ? ckio.a(4) : ckio.a(2);
        }
        throw null;
    }

    private final brw<Bitmap> n(ckqk ckqkVar, ckql ckqlVar) {
        amey ameyVar = new amey(this, ckqkVar);
        brw<Bitmap> g = this.i.a().g();
        g.k(ameyVar);
        return g.e(o(ckqlVar, null));
    }

    private final chw o(ckql ckqlVar, Drawable drawable) {
        cdi cdiVar;
        int i;
        int i2;
        boolean z = false;
        if (this.w.a().intValue() == 0 || (ckqlVar != null && !ckqlVar.a)) {
            z = true;
        }
        if (ckqlVar == null || ckqlVar.e) {
            cdiVar = cdi.b;
        } else {
            cdiVar = cdi.a;
        }
        chw q = new chw().v(cdiVar).q(z);
        if (ckqlVar != null && (i = ckqlVar.c) != 0 && (i2 = ckqlVar.d) != 0) {
            q.r(i, i2);
        }
        if (ckqlVar != null && ckqlVar.f) {
            q.y(cdi.d, new ccu());
        }
        if (ckqlVar != null && ckqlVar.g) {
            q = q.t(cdl.d, true);
        }
        if (drawable != null) {
            q.o(drawable);
        }
        if (this.x.a().booleanValue()) {
            btk btkVar = btk.PREFER_RGB_565;
            cjn.b(btkVar);
            return q.t(cdl.a, btkVar).t(cfp.a, btkVar);
        }
        return q;
    }

    private final amfu p(String str, boolean z) {
        amfu a;
        if (z) {
            synchronized (this.h) {
                SoftReference<amfu> a2 = this.h.a().a(str);
                a = a2 != null ? a2.get() : null;
                if (a == null) {
                    ((ckcm) this.b.a().a(ckip.N)).a(false);
                    a = new amfu(str);
                    a.c = false;
                    this.h.a().Pz(str, new SoftReference<>(a));
                } else {
                    ((ckcm) this.b.a().a(ckip.N)).a(true);
                }
            }
        } else {
            synchronized (this.g) {
                a = this.g.a().a(str);
                if (a == null && this.n != null) {
                    a = this.n.a(str);
                }
                if (a == null) {
                    ((ckcm) this.b.a().a(ckip.N)).a(false);
                    amfu amfuVar = new amfu(str);
                    amfuVar.c = true;
                    a = amfuVar;
                } else {
                    ((ckcm) this.b.a().a(ckip.N)).a(true);
                }
                this.g.a().Pz(str, a);
            }
        }
        return a;
    }

    @Override // defpackage.amfi
    public final amfu a(String str, String str2, amfq amfqVar) {
        return b(str, str2, amfqVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: all -> 0x00de, TryCatch #2 {, blocks: (B:15:0x0028, B:17:0x002e, B:19:0x0042, B:24:0x004c, B:26:0x0052, B:29:0x005a, B:31:0x0060, B:33:0x0085, B:34:0x008a, B:36:0x009a, B:37:0x00a3, B:39:0x00a9, B:41:0x00af, B:42:0x00b4, B:43:0x00bf, B:45:0x00d3, B:47:0x00d9, B:48:0x00dc), top: B:55:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[Catch: all -> 0x00de, TryCatch #2 {, blocks: (B:15:0x0028, B:17:0x002e, B:19:0x0042, B:24:0x004c, B:26:0x0052, B:29:0x005a, B:31:0x0060, B:33:0x0085, B:34:0x008a, B:36:0x009a, B:37:0x00a3, B:39:0x00a9, B:41:0x00af, B:42:0x00b4, B:43:0x00bf, B:45:0x00d3, B:47:0x00d9, B:48:0x00dc), top: B:55:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[Catch: all -> 0x00de, TryCatch #2 {, blocks: (B:15:0x0028, B:17:0x002e, B:19:0x0042, B:24:0x004c, B:26:0x0052, B:29:0x005a, B:31:0x0060, B:33:0x0085, B:34:0x008a, B:36:0x009a, B:37:0x00a3, B:39:0x00a9, B:41:0x00af, B:42:0x00b4, B:43:0x00bf, B:45:0x00d3, B:47:0x00d9, B:48:0x00dc), top: B:55:0x0028 }] */
    @Override // defpackage.amfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amfu b(java.lang.String r12, java.lang.String r13, defpackage.amfq r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amfd.b(java.lang.String, java.lang.String, amfq, boolean):amfu");
    }

    @Override // defpackage.ckqm
    public final void c(String str, ckqk ckqkVar, ckql ckqlVar, String str2, ImageView imageView, Drawable drawable, int i, boolean z) {
        ameu ameuVar = new ameu(this, ckqkVar, imageView.getContext());
        amev amevVar = new amev(imageView, ckqkVar);
        brw<Drawable> h = this.i.a().h();
        h.k(ameuVar);
        h.j(amfv.a(str));
        if (i > 0) {
            cin cinVar = new cin(i);
            cinVar.b = z;
            cev cevVar = new cev();
            cio cioVar = new cio(cinVar.a, cinVar.b);
            cjn.b(cioVar);
            cevVar.a = cioVar;
            cjn.b(cevVar);
            h.b = cevVar;
        }
        h.e(o(ckqlVar, drawable)).i(amevVar);
    }

    @Override // defpackage.ckqm
    public final chr<Bitmap> d(String str, ckqk ckqkVar, ckql ckqlVar) {
        brw<Bitmap> n = n(ckqkVar, ckqlVar);
        n.j(amfv.a(str));
        return n.c();
    }

    @Override // defpackage.ckqm
    public final void e(View view) {
        dbty<bsa> dbtyVar = this.i;
        if (dbtyVar != null) {
            dbtyVar.a().k(view);
        }
        ((ImageView) view).setImageDrawable(null);
    }

    @Override // defpackage.ckqm
    public final void f(cij<?> cijVar) {
        dbty<bsa> dbtyVar = this.i;
        if (dbtyVar != null) {
            dbtyVar.a().l(cijVar);
        }
    }

    @Override // defpackage.ckqm
    public final void g(ViewGroup viewGroup) {
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ImageView) {
                    e(childAt);
                } else if (childAt instanceof ViewGroup) {
                    g((ViewGroup) childAt);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
        if (r0 <= 8.0f) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0210  */
    @Override // defpackage.amfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amfu h(java.lang.String r20, java.lang.String r21, defpackage.amfq r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amfd.h(java.lang.String, java.lang.String, amfq):amfu");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:? -> B:32:0x00f4). Please submit an issue!!! */
    @Override // defpackage.amfi
    public final amfu i(String[] strArr, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String str, float f, int i2, int i3, String str2, amfq amfqVar) {
        int length;
        ameo ameoVar;
        amfu h;
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = strArr.length;
            if (i4 >= length) {
                break;
            }
            sb.append("&name=");
            sb.append(strArr[i4]);
            sb.append("&highlight=");
            sb.append(iArr[i4]);
            sb.append("&filter=");
            sb.append(iArr2[i4]);
            sb.append("&xOffset=");
            sb.append(iArr3[i4]);
            sb.append("&yOffset=");
            sb.append(iArr4[i4]);
            String str3 = strArr[i4];
            if (str3 != null && !str3.isEmpty()) {
                i5++;
            }
            i4++;
        }
        sb.append("&scale=");
        sb.append(i);
        sb.append("&text=");
        sb.append(str);
        sb.append("&size=");
        sb.append(f);
        sb.append("&color=");
        sb.append(i2);
        sb.append("&textAttributes=");
        sb.append(i3);
        amfu p2 = p(sb.toString(), false);
        if (p2.a() || p2.d()) {
            if (p2.d()) {
                p2.n(amfqVar);
            }
            return p2;
        }
        p2.e(true);
        ameo ameoVar2 = r7;
        ameo ameoVar3 = new ameo(this, p2, i5, length, this.c, strArr, str, f, i2, i3, iArr, iArr2, iArr3, iArr4);
        int i6 = 0;
        while (i6 < strArr.length) {
            if (strArr[i6].isEmpty()) {
                ameoVar = ameoVar2;
            } else {
                ameoVar = ameoVar2;
                synchronized (ameoVar) {
                    try {
                        try {
                            h = h(strArr[i6], str2, ameoVar);
                            ameoVar.k[i6] = h;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (h.a()) {
                    ameoVar.a(h);
                }
            }
            i6++;
            ameoVar2 = ameoVar;
        }
        if (p2.d()) {
            p2.n(amfqVar);
        }
        return p2;
    }

    @Override // defpackage.amfi
    public final void j(String str, amfu amfuVar) {
        this.g.a().Pz(str, amfuVar);
    }

    @Override // defpackage.amfi
    public final synchronized void k() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.f.execute(new Runnable(this) { // from class: amen
            private final amfd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amfd amfdVar = this.a;
                bvrj.BACKGROUND_THREADPOOL.c();
                amfdVar.g.a();
                amfdVar.h.a();
                btni btniVar = amfdVar.q;
                dbsk.s(btniVar);
                amfdVar.d.a().a(btniVar, "ResourceManager");
                amfdVar.i.a();
                amcg a = amfdVar.j.a().a(amfdVar.c);
                if (a != null) {
                    amfdVar.n = a;
                }
                amfdVar.o.countDown();
            }
        });
    }

    @Override // defpackage.ckqm
    public final void m(String str, ckqk ckqkVar, bue<Bitmap> bueVar) {
        brw<Bitmap> n = n(ckqkVar, null);
        n.j(amfv.a(str));
        n.B(bueVar).c();
    }
}

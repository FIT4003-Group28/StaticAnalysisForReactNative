package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: apqr  reason: default package */
/* loaded from: classes2.dex */
public final class apqr extends FrameLayout implements apnl, apqb {
    public static final cqkv a = new apqu();
    private boolean A;
    private boolean B;
    private boolean C;
    private long D;
    private long E;
    @dzsi
    private apnk F;
    final TextView b;
    final WebImageView c;
    public dxio<apnh> d;
    public dxio<apqa> e;
    public amfi f;
    public bvrb g;
    @dzsi
    public String h;
    @dzsi
    public String i;
    @dzsi
    public apnj j;
    @dzsi
    public Float k;
    @dzsi
    public Float l;
    @dzsi
    public Float m;
    public apqp n;
    @dzsi
    public amfu o;
    @dzsi
    public apqq p;
    @dzsi
    public clot q;
    public long r;
    public boolean s;
    final apqv t;
    @dzsi
    private Long u;
    private final dbty<clus> v;
    private final apqn w;
    private final Handler x;
    private boolean y;
    private boolean z;

    public apqr(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> j(cqmp<T>... cqmpVarArr) {
        return new cqmh(apqr.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> k(cqlc<T, String> cqlcVar) {
        return cqjv.g(apqt.VIDEO_URL, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> l(cqlc<T, String> cqlcVar) {
        return cqjv.g(apqt.VIDEO_THUMBNAIL_URL, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> m(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(apqt.VIDEO_PLAY, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> n(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(apqt.VIDEO_SOUND, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> o(Boolean bool) {
        return cqjv.i(apqt.VIDEO_DEBUG, bool, a);
    }

    public static <T extends cqkp> cqnf<T> p(cqlc<T, apnj> cqlcVar) {
        return cqjv.g(apqt.VIDEO_EVENT_LISTENER, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> q(@dzsi apqp apqpVar) {
        return cqjv.i(apqt.VIDEO_SCALING_MODE, apqpVar, a);
    }

    public static <T extends cqkp> cqnf<T> r(cqlc<T, apnk> cqlcVar) {
        return cqjv.g(apqt.VIDEO_PLAYBACK_CONTROLLER, cqlcVar, a);
    }

    @dzsi
    private final Float s() {
        Float f = this.k;
        if (f == null || f.floatValue() == 0.0f) {
            Float f2 = this.l;
            if (f2 != null && f2.floatValue() != 0.0f) {
                return this.l;
            }
            Float f3 = this.m;
            if (f3 != null && f3.floatValue() != 0.0f) {
                return this.m;
            }
            return null;
        }
        return this.k;
    }

    private final boolean t() {
        if (!this.z || this.h == null || !this.B) {
            return false;
        }
        apqq apqqVar = this.p;
        return apqqVar == null || apqqVar.b != Long.MIN_VALUE;
    }

    private final void u(clot clotVar) {
        float f = true != this.A ? 0.0f : 1.0f;
        if (f != clotVar.q) {
            clotVar.t();
            float D = cmny.D(f, 0.0f, 1.0f);
            if (clotVar.q == D) {
                return;
            }
            clotVar.q = D;
            clotVar.q();
            Iterator<clre> it = clotVar.e.iterator();
            while (it.hasNext()) {
                it.next().J(D);
            }
        }
    }

    @Override // defpackage.apnl
    public final long a() {
        clot clotVar = this.q;
        if (clotVar != null) {
            this.D = clotVar.h();
        }
        return this.D;
    }

    @Override // defpackage.apnl
    public final long b() {
        clot clotVar = this.q;
        if (clotVar != null) {
            this.E = clotVar.i();
        }
        return this.E;
    }

    @Override // defpackage.apnl
    public final void c(long j) {
        this.p = null;
        clot clotVar = this.q;
        if (clotVar != null) {
            clotVar.a(j);
        } else {
            e();
        }
    }

    public final void d() {
        this.x.removeMessages(0);
        this.x.sendEmptyMessage(0);
    }

    public final void e() {
        Bitmap h;
        boolean t = t();
        int i = 0;
        this.b.setText(String.format("URL: %s\nwantsToPlay: %s", this.h, Boolean.valueOf(t)));
        this.b.setVisibility(true != this.y ? 8 : 0);
        clot clotVar = this.q;
        if (t && !this.C) {
            String str = this.h;
            dbuh.d(str);
            if (clotVar == null) {
                this.d.a().a(this);
            } else {
                this.s = false;
                Uri parse = Uri.parse(str);
                cmfd cmfdVar = new cmfd(this.e.a().a(), this.v.a());
                clnj clnjVar = new clnj();
                clnjVar.b = parse;
                clno a2 = clnjVar.a();
                cmmn.f(a2.b);
                clnn clnnVar = a2.b;
                Object obj = clnnVar.h;
                String str2 = clnnVar.f;
                cmkf cmkfVar = cmfdVar.a;
                clus clusVar = cmfdVar.b;
                cmmn.f(clnnVar);
                clnl clnlVar = a2.b.c;
                cmej cmfeVar = new cmfe(a2, cmkfVar, clusVar, cltu.a, cmfdVar.c);
                Long l = this.u;
                if (l != null) {
                    cmfeVar = new cmdp(cmfeVar, l.longValue() * 1000);
                }
                apqp apqpVar = this.n;
                apqp apqpVar2 = apqp.SHRINK_CONTAINER;
                int intValue = apqpVar.d.intValue();
                clotVar.t();
                clotVar.o = intValue;
                clotVar.u(2, 4, Integer.valueOf(intValue));
                apqq apqqVar = this.p;
                if (apqqVar != null) {
                    clotVar.a(apqqVar.b);
                }
                clotVar.t();
                List singletonList = Collections.singletonList(cmfeVar);
                clotVar.t();
                clmt clmtVar = clotVar.c;
                int size = singletonList.size();
                for (int i2 = 0; i2 < singletonList.size(); i2++) {
                    cmej cmejVar = (cmej) singletonList.get(i2);
                    cmmn.f(cmejVar);
                    if ((cmejVar instanceof cmfu) && size > 1) {
                        throw new IllegalArgumentException();
                    }
                }
                clmtVar.o();
                clmtVar.i();
                clmtVar.j++;
                if (!clmtVar.g.isEmpty()) {
                    clmtVar.v(clmtVar.g.size());
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < singletonList.size(); i3++) {
                    clny clnyVar = new clny((cmej) singletonList.get(i3), clmtVar.h);
                    arrayList.add(clnyVar);
                    clmtVar.g.add(i3, new clms(clnyVar.b, clnyVar.a.d));
                }
                clmtVar.q = clmtVar.q.b(arrayList.size());
                clpb q = clmtVar.q();
                if (!q.t() && ((clok) q).a <= 0) {
                    throw new clnh();
                }
                cloc r = clmtVar.r(clmtVar.n, q, clmtVar.s(q, 0, -9223372036854775807L));
                int i4 = r.e;
                if (i4 != 1) {
                    i4 = (q.t() || ((clok) q).a <= 0) ? 4 : 2;
                }
                cloc d = r.d(i4);
                clmtVar.d.d.b(17, new clmw(arrayList, clmtVar.q, 0, cllt.b(-9223372036854775807L))).sendToTarget();
                clmtVar.p(d, false, 4, 0, 1, false);
                clotVar.t();
                boolean f = clotVar.f();
                int d2 = clotVar.l.d(f);
                clotVar.r(f, d2, clot.w(f, d2));
                clmt clmtVar2 = clotVar.c;
                cloc clocVar = clmtVar2.n;
                if (clocVar.e == 1) {
                    cloc e = clocVar.e(null);
                    cloc d3 = e.d(true != e.b.t() ? 2 : 4);
                    clmtVar2.j++;
                    clmtVar2.d.d.a(0).sendToTarget();
                    clmtVar2.p(d3, false, 4, 1, 1, false);
                }
                clotVar.b(this.t.a);
                apqn apqnVar = this.w;
                cmmn.f(apqnVar);
                clqv clqvVar = clotVar.k;
                cmmn.f(apqnVar);
                clqvVar.a.a(apqnVar);
                u(clotVar);
                clotVar.e(true);
                this.C = true;
            }
        } else if (clotVar != null) {
            if (t) {
                u(clotVar);
            } else {
                clotVar.k.a.b(this.w);
                clotVar.x();
                if (this.p == null) {
                    f(clotVar.i());
                }
                clotVar.b(null);
                apnj apnjVar = this.j;
                if (apnjVar != null) {
                    apnjVar.a(false, 5);
                }
                this.s = false;
                this.C = false;
                this.d.a().b(clotVar);
                this.q = null;
            }
        }
        WebImageView webImageView = this.c;
        apqp apqpVar3 = this.n;
        apqp apqpVar4 = apqp.SHRINK_CONTAINER;
        webImageView.setScaleType(apqpVar3.e);
        apqq apqqVar2 = this.p;
        if (apqqVar2 == null || (h = apqqVar2.a) == null) {
            amfu amfuVar = this.o;
            h = (amfuVar == null || !amfuVar.a() || this.o.h() == null) ? null : this.o.h();
        }
        if (h != null) {
            this.c.setImageBitmap(h);
            this.c.setBackgroundColor(0);
        } else {
            this.c.setImageBitmap(null);
            this.c.setBackgroundColor(-16777216);
        }
        WebImageView webImageView2 = this.c;
        if (true == this.s) {
            i = 4;
        }
        webImageView2.setVisibility(i);
    }

    public final void f(long j) {
        this.p = new apqq(this.t.a.getBitmap(), j);
        this.s = false;
        d();
    }

    public final void g(amfu amfuVar) {
        Bitmap h = amfuVar.h();
        if (h != null) {
            final int width = h.getWidth();
            final int height = h.getHeight();
            if (width != 0 && height != 0) {
                h(new Runnable(this, width, height) { // from class: apqk
                    private final apqr a;
                    private final int b;
                    private final int c;

                    {
                        this.a = this;
                        this.b = width;
                        this.c = height;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l = Float.valueOf(this.b / this.c);
                    }
                });
            }
        }
        d();
    }

    public final void h(Runnable runnable) {
        Float s = s();
        runnable.run();
        if (!dbsd.a(s, s())) {
            this.g.b(new Runnable(this) { // from class: apql
                private final apqr a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.requestLayout();
                }
            }, bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.apqb
    public final boolean i(clot clotVar) {
        bvrj.UI_THREAD.c();
        if (!t() || this.q != null) {
            return false;
        }
        this.q = clotVar;
        d();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        this.B = true;
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.B = false;
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        Float s = s();
        apqp apqpVar = this.n;
        apqp apqpVar2 = apqp.SHRINK_CONTAINER;
        if (apqpVar.f.booleanValue() && s != null) {
            int size = View.MeasureSpec.getSize(i);
            float size2 = View.MeasureSpec.getSize(i2);
            float floatValue = s.floatValue() * size2;
            float floatValue2 = size / s.floatValue();
            if (floatValue2 < size2) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.round(floatValue2), View.MeasureSpec.getMode(i2));
            } else {
                i = View.MeasureSpec.makeMeasureSpec(Math.round(floatValue), View.MeasureSpec.getMode(i));
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // defpackage.apnl
    public void setPlayWhenReady(boolean z) {
        clot clotVar = this.q;
        if (clotVar == null) {
            return;
        }
        clotVar.e(z);
    }

    public void setVideoAspectRatioHint(@dzsi final Float f) {
        h(new Runnable(this, f) { // from class: apqi
            private final apqr a;
            private final Float b;

            {
                this.a = this;
                this.b = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m = this.b;
            }
        });
    }

    public void setVideoDebug(boolean z) {
        this.y = z;
        d();
    }

    public void setVideoEndPositionInMillis(@dzsi Long l) {
        this.u = l;
        d();
    }

    @Override // defpackage.apnl
    public void setVideoEventListener(@dzsi apnj apnjVar) {
        this.j = apnjVar;
        d();
    }

    public void setVideoFormatId(@dzsi Integer num) {
    }

    public void setVideoLoggingId(@dzsi String str) {
    }

    public void setVideoPlay(boolean z) {
        this.z = z;
        d();
    }

    public void setVideoPlaybackController(@dzsi apnk apnkVar) {
        apnk apnkVar2 = this.F;
        if (apnkVar2 != null) {
            apnkVar2.p(null);
        }
        this.F = apnkVar;
        if (apnkVar != null) {
            apnkVar.p(this);
        }
    }

    public void setVideoScalingMode(@dzsi apqp apqpVar) {
        if (apqpVar == null) {
            apqpVar = apqp.FILL;
        }
        this.n = apqpVar;
        d();
    }

    @Override // defpackage.apnl
    public void setVideoSound(boolean z) {
        this.A = z;
        d();
    }

    public void setVideoThumbnailUrl(@dzsi final String str) {
        h(new Runnable(this, str) { // from class: apqh
            private final apqr a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final apqr apqrVar = this.a;
                String str2 = this.b;
                if (!dbsd.a(str2, apqrVar.i)) {
                    apqrVar.l = null;
                }
                apqrVar.i = str2;
                String str3 = apqrVar.i;
                if (str3 == null) {
                    apqrVar.o = null;
                } else {
                    apqrVar.o = apqrVar.f.a(str3, String.valueOf(apqr.class.getSimpleName()).concat("#updateVideoThumbnailResource"), new amfq(apqrVar) { // from class: apqj
                        private final apqr a;

                        {
                            this.a = apqrVar;
                        }

                        @Override // defpackage.amfq
                        public final void a(amfu amfuVar) {
                            this.a.g(amfuVar);
                        }
                    });
                    if (apqrVar.o.a()) {
                        apqrVar.g(apqrVar.o);
                    }
                }
                apqrVar.d();
            }
        });
    }

    public void setVideoUrl(@dzsi final String str) {
        h(new Runnable(this, str) { // from class: apqg
            private final apqr a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apqr apqrVar = this.a;
                String str2 = this.b;
                if (!dbsd.a(str2, apqrVar.h)) {
                    apqrVar.k = null;
                    apqrVar.p = null;
                }
                apqrVar.h = str2;
                apqrVar.d();
            }
        });
    }

    @Override // android.view.View
    public final String toString() {
        int hashCode = hashCode();
        StringBuilder sb = new StringBuilder(21);
        sb.append("VideoView:");
        sb.append(hashCode);
        return sb.toString();
    }

    public apqr(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public apqr(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = null;
        this.y = false;
        this.z = false;
        this.A = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = apqp.FILL;
        this.o = null;
        this.q = null;
        this.C = false;
        this.s = false;
        ((apqs) bttc.a(apqs.class, this)).wW(this);
        this.h = null;
        this.z = false;
        apqv apqvVar = new apqv(context);
        this.t = apqvVar;
        WebImageView webImageView = new WebImageView(context);
        this.c = webImageView;
        webImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        webImageView.setVisibility(4);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        this.v = dbud.a(apqf.a);
        this.w = new apqn(this);
        this.x = new Handler(new apqo(this));
        addView(apqvVar.a);
        addView(webImageView);
        addView(textView);
        e();
    }
}

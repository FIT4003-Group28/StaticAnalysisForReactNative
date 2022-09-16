package c.a.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: c  reason: collision with root package name */
    private c.a.a.e f2240c;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<o> f2244g;

    /* renamed from: h  reason: collision with root package name */
    private c.a.a.u.b f2245h;
    private String i;
    private c.a.a.b j;
    private c.a.a.u.a k;
    c.a.a.a l;
    s m;
    private boolean n;
    private c.a.a.v.l.b o;
    private int p;
    private boolean q;
    private boolean r;

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f2239b = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.y.e f2241d = new c.a.a.y.e();

    /* renamed from: e  reason: collision with root package name */
    private float f2242e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2243f = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2246a;

        a(String str) {
            this.f2246a = str;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.d(this.f2246a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2249b;

        b(int i, int i2) {
            this.f2248a = i;
            this.f2249b = i2;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.a(this.f2248a, this.f2249b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2251a;

        c(int i) {
            this.f2251a = i;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.a(this.f2251a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f2253a;

        d(float f2) {
            this.f2253a = f2;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.c(this.f2253a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a.a.v.e f2255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f2256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a.a.z.c f2257c;

        e(c.a.a.v.e eVar, Object obj, c.a.a.z.c cVar) {
            this.f2255a = eVar;
            this.f2256b = obj;
            this.f2257c = cVar;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.a(this.f2255a, this.f2256b, this.f2257c);
        }
    }

    /* loaded from: classes.dex */
    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (g.this.o != null) {
                g.this.o.a(g.this.f2241d.f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.a.a.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062g implements o {
        C0062g() {
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements o {
        h() {
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2262a;

        i(int i) {
            this.f2262a = i;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.c(this.f2262a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f2264a;

        j(float f2) {
            this.f2264a = f2;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.b(this.f2264a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2266a;

        k(int i) {
            this.f2266a = i;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.b(this.f2266a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f2268a;

        l(float f2) {
            this.f2268a = f2;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.a(this.f2268a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2270a;

        m(String str) {
            this.f2270a = str;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.e(this.f2270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2272a;

        n(String str) {
            this.f2272a = str;
        }

        @Override // c.a.a.g.o
        public void a(c.a.a.e eVar) {
            g.this.c(this.f2272a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface o {
        void a(c.a.a.e eVar);
    }

    public g() {
        new HashSet();
        this.f2244g = new ArrayList<>();
        this.p = 255;
        this.r = false;
        this.f2241d.addUpdateListener(new f());
    }

    private void A() {
        if (this.f2240c == null) {
            return;
        }
        float n2 = n();
        setBounds(0, 0, (int) (this.f2240c.a().width() * n2), (int) (this.f2240c.a().height() * n2));
    }

    private float a(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f2240c.a().width(), canvas.getHeight() / this.f2240c.a().height());
    }

    private void w() {
        this.o = new c.a.a.v.l.b(this, c.a.a.x.s.a(this.f2240c), this.f2240c.i(), this.f2240c);
    }

    private Context x() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private c.a.a.u.a y() {
        if (getCallback() == null) {
            return null;
        }
        if (this.k == null) {
            this.k = new c.a.a.u.a(getCallback(), this.l);
        }
        return this.k;
    }

    private c.a.a.u.b z() {
        if (getCallback() == null) {
            return null;
        }
        c.a.a.u.b bVar = this.f2245h;
        if (bVar != null && !bVar.a(x())) {
            this.f2245h = null;
        }
        if (this.f2245h == null) {
            this.f2245h = new c.a.a.u.b(getCallback(), this.i, this.j, this.f2240c.h());
        }
        return this.f2245h;
    }

    public Bitmap a(String str) {
        c.a.a.u.b z = z();
        if (z != null) {
            return z.a(str);
        }
        return null;
    }

    public Typeface a(String str, String str2) {
        c.a.a.u.a y = y();
        if (y != null) {
            return y.a(str, str2);
        }
        return null;
    }

    public List<c.a.a.v.e> a(c.a.a.v.e eVar) {
        if (this.o == null) {
            c.a.a.y.d.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.o.a(eVar, 0, arrayList, new c.a.a.v.e(new String[0]));
        return arrayList;
    }

    public void a() {
        this.f2244g.clear();
        this.f2241d.cancel();
    }

    public void a(float f2) {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            this.f2244g.add(new l(f2));
        } else {
            b((int) c.a.a.y.g.c(eVar.l(), this.f2240c.e(), f2));
        }
    }

    public void a(int i2) {
        if (this.f2240c == null) {
            this.f2244g.add(new c(i2));
        } else {
            this.f2241d.a(i2);
        }
    }

    public void a(int i2, int i3) {
        if (this.f2240c == null) {
            this.f2244g.add(new b(i2, i3));
        } else {
            this.f2241d.a(i2, i3 + 0.99f);
        }
    }

    public void a(Animator.AnimatorListener animatorListener) {
        this.f2241d.addListener(animatorListener);
    }

    public void a(c.a.a.a aVar) {
        this.l = aVar;
        c.a.a.u.a aVar2 = this.k;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    public void a(c.a.a.b bVar) {
        this.j = bVar;
        c.a.a.u.b bVar2 = this.f2245h;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
    }

    public void a(s sVar) {
        this.m = sVar;
    }

    public <T> void a(c.a.a.v.e eVar, T t, c.a.a.z.c<T> cVar) {
        if (this.o == null) {
            this.f2244g.add(new e(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar.a() != null) {
            eVar.a().a(t, cVar);
        } else {
            List<c.a.a.v.e> a2 = a(eVar);
            for (int i2 = 0; i2 < a2.size(); i2++) {
                a2.get(i2).a().a(t, cVar);
            }
            z = true ^ a2.isEmpty();
        }
        if (!z) {
            return;
        }
        invalidateSelf();
        if (t != c.a.a.l.A) {
            return;
        }
        c(k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Boolean bool) {
        this.f2243f = bool.booleanValue();
    }

    public void a(boolean z) {
        if (this.n == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            c.a.a.y.d.b("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.n = z;
        if (this.f2240c == null) {
            return;
        }
        w();
    }

    public boolean a(c.a.a.e eVar) {
        if (this.f2240c == eVar) {
            return false;
        }
        this.r = false;
        b();
        this.f2240c = eVar;
        w();
        this.f2241d.a(eVar);
        c(this.f2241d.getAnimatedFraction());
        d(this.f2242e);
        A();
        Iterator it = new ArrayList(this.f2244g).iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(eVar);
            it.remove();
        }
        this.f2244g.clear();
        eVar.b(this.q);
        return true;
    }

    public void b() {
        if (this.f2241d.isRunning()) {
            this.f2241d.cancel();
        }
        this.f2240c = null;
        this.o = null;
        this.f2245h = null;
        this.f2241d.d();
        invalidateSelf();
    }

    public void b(float f2) {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            this.f2244g.add(new j(f2));
        } else {
            c((int) c.a.a.y.g.c(eVar.l(), this.f2240c.e(), f2));
        }
    }

    public void b(int i2) {
        if (this.f2240c == null) {
            this.f2244g.add(new k(i2));
        } else {
            this.f2241d.b(i2 + 0.99f);
        }
    }

    public void b(String str) {
        this.i = str;
    }

    public void b(boolean z) {
        this.q = z;
        c.a.a.e eVar = this.f2240c;
        if (eVar != null) {
            eVar.b(z);
        }
    }

    public void c(float f2) {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            this.f2244g.add(new d(f2));
        } else {
            this.f2241d.a(c.a.a.y.g.c(eVar.l(), this.f2240c.e(), f2));
        }
    }

    public void c(int i2) {
        if (this.f2240c == null) {
            this.f2244g.add(new i(i2));
        } else {
            this.f2241d.a(i2);
        }
    }

    public void c(String str) {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            this.f2244g.add(new n(str));
            return;
        }
        c.a.a.v.h b2 = eVar.b(str);
        if (b2 != null) {
            b((int) (b2.f2448b + b2.f2449c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public boolean c() {
        return this.n;
    }

    public void d() {
        this.f2244g.clear();
        this.f2241d.e();
    }

    public void d(float f2) {
        this.f2242e = f2;
        A();
    }

    public void d(int i2) {
        this.f2241d.setRepeatCount(i2);
    }

    public void d(String str) {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            this.f2244g.add(new a(str));
            return;
        }
        c.a.a.v.h b2 = eVar.b(str);
        if (b2 != null) {
            int i2 = (int) b2.f2448b;
            a(i2, ((int) b2.f2449c) + i2);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        this.r = false;
        c.a.a.c.a("Drawable#draw");
        if (this.o == null) {
            return;
        }
        float f3 = this.f2242e;
        float a2 = a(canvas);
        if (f3 > a2) {
            f2 = this.f2242e / a2;
        } else {
            a2 = f3;
            f2 = 1.0f;
        }
        int i2 = -1;
        if (f2 > 1.0f) {
            i2 = canvas.save();
            float width = this.f2240c.a().width() / 2.0f;
            float height = this.f2240c.a().height() / 2.0f;
            float f4 = width * a2;
            float f5 = height * a2;
            canvas.translate((n() * width) - f4, (n() * height) - f5);
            canvas.scale(f2, f2, f4, f5);
        }
        this.f2239b.reset();
        this.f2239b.preScale(a2, a2);
        this.o.a(canvas, this.f2239b, this.p);
        c.a.a.c.b("Drawable#draw");
        if (i2 <= 0) {
            return;
        }
        canvas.restoreToCount(i2);
    }

    public c.a.a.e e() {
        return this.f2240c;
    }

    public void e(float f2) {
        this.f2241d.c(f2);
    }

    public void e(int i2) {
        this.f2241d.setRepeatMode(i2);
    }

    public void e(String str) {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            this.f2244g.add(new m(str));
            return;
        }
        c.a.a.v.h b2 = eVar.b(str);
        if (b2 != null) {
            c((int) b2.f2448b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int f() {
        return (int) this.f2241d.g();
    }

    public String g() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            return -1;
        }
        return (int) (eVar.a().height() * n());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c.a.a.e eVar = this.f2240c;
        if (eVar == null) {
            return -1;
        }
        return (int) (eVar.a().width() * n());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f2241d.h();
    }

    public float i() {
        return this.f2241d.i();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.r) {
            return;
        }
        this.r = true;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return q();
    }

    public c.a.a.o j() {
        c.a.a.e eVar = this.f2240c;
        if (eVar != null) {
            return eVar.k();
        }
        return null;
    }

    public float k() {
        return this.f2241d.f();
    }

    public int l() {
        return this.f2241d.getRepeatCount();
    }

    public int m() {
        return this.f2241d.getRepeatMode();
    }

    public float n() {
        return this.f2242e;
    }

    public float o() {
        return this.f2241d.j();
    }

    public s p() {
        return this.m;
    }

    public boolean q() {
        return this.f2241d.isRunning();
    }

    public void r() {
        this.f2244g.clear();
        this.f2241d.k();
    }

    public void s() {
        if (this.o == null) {
            this.f2244g.add(new C0062g());
            return;
        }
        if (this.f2243f || l() == 0) {
            this.f2241d.l();
        }
        if (this.f2243f) {
            return;
        }
        a((int) (o() < 0.0f ? i() : h()));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.p = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c.a.a.y.d.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        s();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        d();
    }

    public void t() {
        if (this.o == null) {
            this.f2244g.add(new h());
        } else {
            this.f2241d.o();
        }
    }

    public void u() {
        this.f2241d.p();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean v() {
        return this.m == null && this.f2240c.b().b() > 0;
    }
}

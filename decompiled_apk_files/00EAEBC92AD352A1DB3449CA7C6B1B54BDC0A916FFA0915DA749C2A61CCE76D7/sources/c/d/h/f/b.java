package c.d.h.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import c.d.d.d.i;
import c.d.h.e.r;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public static final r.b r = r.b.f3074d;
    public static final r.b s = r.b.f3075e;

    /* renamed from: a  reason: collision with root package name */
    private Resources f3092a;

    /* renamed from: b  reason: collision with root package name */
    private int f3093b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f3094c;

    /* renamed from: d  reason: collision with root package name */
    private r.b f3095d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f3096e;

    /* renamed from: f  reason: collision with root package name */
    private r.b f3097f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f3098g;

    /* renamed from: h  reason: collision with root package name */
    private r.b f3099h;
    private Drawable i;
    private r.b j;
    private r.b k;
    private PointF l;
    private ColorFilter m;
    private Drawable n;
    private List<Drawable> o;
    private Drawable p;
    private d q;

    public b(Resources resources) {
        this.f3092a = resources;
        s();
    }

    public static b a(Resources resources) {
        return new b(resources);
    }

    private void s() {
        this.f3093b = 300;
        this.f3094c = null;
        r.b bVar = r;
        this.f3095d = bVar;
        this.f3096e = null;
        this.f3097f = bVar;
        this.f3098g = null;
        this.f3099h = bVar;
        this.i = null;
        this.j = bVar;
        this.k = s;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    private void t() {
        List<Drawable> list = this.o;
        if (list != null) {
            for (Drawable drawable : list) {
                i.a(drawable);
            }
        }
    }

    public a a() {
        t();
        return new a(this);
    }

    public b a(d dVar) {
        this.q = dVar;
        return this;
    }

    public ColorFilter b() {
        return this.m;
    }

    public PointF c() {
        return this.l;
    }

    public r.b d() {
        return this.k;
    }

    public Drawable e() {
        return this.n;
    }

    public int f() {
        return this.f3093b;
    }

    public Drawable g() {
        return this.f3098g;
    }

    public r.b h() {
        return this.f3099h;
    }

    public List<Drawable> i() {
        return this.o;
    }

    public Drawable j() {
        return this.f3094c;
    }

    public r.b k() {
        return this.f3095d;
    }

    public Drawable l() {
        return this.p;
    }

    public Drawable m() {
        return this.i;
    }

    public r.b n() {
        return this.j;
    }

    public Resources o() {
        return this.f3092a;
    }

    public Drawable p() {
        return this.f3096e;
    }

    public r.b q() {
        return this.f3097f;
    }

    public d r() {
        return this.q;
    }
}

package c.a.a.v.k;

import android.graphics.Paint;
import c.a.a.t.b.s;
import java.util.List;
/* loaded from: classes.dex */
public class p implements c.a.a.v.k.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2549a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.v.j.b f2550b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c.a.a.v.j.b> f2551c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.a f2552d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.v.j.d f2553e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.v.j.b f2554f;

    /* renamed from: g  reason: collision with root package name */
    private final b f2555g;

    /* renamed from: h  reason: collision with root package name */
    private final c f2556h;
    private final float i;
    private final boolean j;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2557a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2558b = new int[c.values().length];

        static {
            try {
                f2558b[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2558b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2558b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2557a = new int[b.values().length];
            try {
                f2557a[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2557a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2557a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap a() {
            int i = a.f2557a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join a() {
            int i = a.f2558b[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Paint.Join.MITER;
                }
                if (i == 3) {
                    return Paint.Join.ROUND;
                }
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public p(String str, c.a.a.v.j.b bVar, List<c.a.a.v.j.b> list, c.a.a.v.j.a aVar, c.a.a.v.j.d dVar, c.a.a.v.j.b bVar2, b bVar3, c cVar, float f2, boolean z) {
        this.f2549a = str;
        this.f2550b = bVar;
        this.f2551c = list;
        this.f2552d = aVar;
        this.f2553e = dVar;
        this.f2554f = bVar2;
        this.f2555g = bVar3;
        this.f2556h = cVar;
        this.i = f2;
        this.j = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new s(gVar, aVar, this);
    }

    public b a() {
        return this.f2555g;
    }

    public c.a.a.v.j.a b() {
        return this.f2552d;
    }

    public c.a.a.v.j.b c() {
        return this.f2550b;
    }

    public c d() {
        return this.f2556h;
    }

    public List<c.a.a.v.j.b> e() {
        return this.f2551c;
    }

    public float f() {
        return this.i;
    }

    public String g() {
        return this.f2549a;
    }

    public c.a.a.v.j.d h() {
        return this.f2553e;
    }

    public c.a.a.v.j.b i() {
        return this.f2554f;
    }

    public boolean j() {
        return this.j;
    }
}

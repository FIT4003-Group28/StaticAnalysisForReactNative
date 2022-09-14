package c.e.b.k.i;

import c.e.b.k.f;
import c.e.b.k.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class d implements c.e.b.k.h.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final c.e.b.k.d<Object> f4847e = c.e.b.k.i.a.a();

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f4848f = c.e.b.k.i.b.a();

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f4849g = c.a();

    /* renamed from: h  reason: collision with root package name */
    private static final b f4850h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, c.e.b.k.d<?>> f4851a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f4852b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private c.e.b.k.d<Object> f4853c = f4847e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4854d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.e.b.k.a {
        a() {
        }

        @Override // c.e.b.k.a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // c.e.b.k.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f4851a, d.this.f4852b, d.this.f4853c, d.this.f4854d);
            eVar.a(obj, false);
            eVar.a();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f4856a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

        static {
            f4856a.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // c.e.b.k.f
        public void a(Date date, g gVar) {
            gVar.mo166a(f4856a.format(date));
        }
    }

    public d() {
        a(String.class, f4848f);
        a(Boolean.class, f4849g);
        a(Date.class, f4850h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Object obj, c.e.b.k.e eVar) {
        throw new c.e.b.k.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public c.e.b.k.a a() {
        return new a();
    }

    @Override // c.e.b.k.h.b
    public /* bridge */ /* synthetic */ d a(Class cls, c.e.b.k.d dVar) {
        a2(cls, dVar);
        return this;
    }

    public d a(c.e.b.k.h.a aVar) {
        aVar.a(this);
        return this;
    }

    @Override // c.e.b.k.h.b
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public <T> d a2(Class<T> cls, c.e.b.k.d<? super T> dVar) {
        this.f4851a.put(cls, dVar);
        this.f4852b.remove(cls);
        return this;
    }

    public <T> d a(Class<T> cls, f<? super T> fVar) {
        this.f4852b.put(cls, fVar);
        this.f4851a.remove(cls);
        return this;
    }

    public d a(boolean z) {
        this.f4854d = z;
        return this;
    }
}

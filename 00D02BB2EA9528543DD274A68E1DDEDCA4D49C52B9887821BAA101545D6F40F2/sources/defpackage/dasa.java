package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dasa  reason: default package */
/* loaded from: classes5.dex */
public final class dasa extends daul {
    @daun(a = "Accept")
    private List<String> accept;
    @daun(a = "Accept-Encoding")
    private List<String> acceptEncoding;
    @daun(a = "Age")
    private List<Long> age;
    @daun(a = "WWW-Authenticate")
    public List<String> authenticate;
    @daun(a = "Authorization")
    public List<String> authorization;
    @daun(a = "Cache-Control")
    private List<String> cacheControl;
    @daun(a = "Content-Encoding")
    private List<String> contentEncoding;
    @daun(a = "Content-Length")
    private List<Long> contentLength;
    @daun(a = "Content-MD5")
    private List<String> contentMD5;
    @daun(a = "Content-Range")
    private List<String> contentRange;
    @daun(a = "Content-Type")
    public List<String> contentType;
    @daun(a = "Cookie")
    private List<String> cookie;
    @daun(a = "Date")
    private List<String> date;
    @daun(a = "ETag")
    private List<String> etag;
    @daun(a = "Expires")
    private List<String> expires;
    @daun(a = "If-Match")
    public List<String> ifMatch;
    @daun(a = "If-Modified-Since")
    public List<String> ifModifiedSince;
    @daun(a = "If-None-Match")
    public List<String> ifNoneMatch;
    @daun(a = "If-Range")
    public List<String> ifRange;
    @daun(a = "If-Unmodified-Since")
    public List<String> ifUnmodifiedSince;
    @daun(a = "Last-Modified")
    private List<String> lastModified;
    @daun(a = "Location")
    public List<String> location;
    @daun(a = "MIME-Version")
    private List<String> mimeVersion;
    @daun(a = "Range")
    private List<String> range;
    @daun(a = "Retry-After")
    private List<String> retryAfter;
    @daun(a = "User-Agent")
    public List<String> userAgent;

    public dasa() {
        super(EnumSet.of(dauk.a));
        this.acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    public static void e(Logger logger, StringBuilder sb, StringBuilder sb2, dasl daslVar, String str, Object obj) {
        String obj2;
        if (obj == null || daub.b(obj)) {
            return;
        }
        if (obj instanceof Enum) {
            obj2 = dauh.a((Enum) obj).c;
        } else {
            obj2 = obj.toString();
        }
        String str2 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : obj2;
        if (sb != null) {
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            sb.append(daux.a);
        }
        if (sb2 != null) {
            sb2.append(" -H '");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            sb2.append("'");
        }
        if (daslVar == null) {
            return;
        }
        daslVar.a(str, obj2);
    }

    public static final <T> List<T> f(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> T g(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static Object k(Type type, List<Type> list, String str) {
        return daub.h(daub.k(list, type), str);
    }

    @Override // defpackage.daul
    /* renamed from: b */
    public final dasa d() {
        return (dasa) super.clone();
    }

    public final void c(dasm dasmVar, StringBuilder sb) {
        clear();
        Class<?> cls = getClass();
        List asList = Arrays.asList(cls);
        daty b = daty.b(cls, true);
        datu datuVar = new datu(this);
        int g = dasmVar.g();
        for (int i = 0; i < g; i++) {
            String h = dasmVar.h(i);
            String i2 = dasmVar.i(i);
            if (sb != null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(h).length() + 2 + String.valueOf(i2).length());
                sb2.append(h);
                sb2.append(": ");
                sb2.append(i2);
                sb.append(sb2.toString());
                sb.append(daux.a);
            }
            dauh c = b.c(h);
            if (c != null) {
                Type k = daub.k(asList, c.c());
                if (dava.d(k)) {
                    Class<?> i3 = dava.i(asList, dava.e(k));
                    datuVar.b(c.b, i3, k(i3, asList, i2));
                } else if (dava.b(dava.i(asList, k), Iterable.class)) {
                    Collection<Object> collection = (Collection) c.e(this);
                    if (collection == null) {
                        collection = daub.i(k);
                        c.f(this, collection);
                    }
                    collection.add(k(k == Object.class ? null : dava.j(k), asList, i2));
                } else {
                    c.f(this, k(k, asList, i2));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(h);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    super.a(h, arrayList);
                }
                arrayList.add(i2);
            }
        }
        datuVar.a();
    }

    public final void h(String str, Object obj) {
        super.a(str, obj);
    }

    public final void i(String str) {
        this.authorization = f(str);
    }

    public final void j(String str) {
        this.userAgent = f(str);
    }
}

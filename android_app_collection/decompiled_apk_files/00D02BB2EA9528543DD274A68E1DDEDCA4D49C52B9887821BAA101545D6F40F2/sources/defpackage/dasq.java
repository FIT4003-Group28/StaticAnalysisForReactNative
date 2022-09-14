package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dasq  reason: default package */
/* loaded from: classes5.dex */
public final class dasq implements dauu {
    public static final String a;

    static {
        dasb dasbVar = new dasb("application/x-www-form-urlencoded");
        Charset charset = datw.a;
        dasbVar.f("charset", charset == null ? null : charset.name());
        a = dasbVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static void a(String str, Object obj) {
        try {
            StringReader stringReader = new StringReader(str);
            Class<?> cls = obj.getClass();
            daty a2 = daty.a(cls);
            List asList = Arrays.asList(cls);
            Object obj2 = true != daul.class.isAssignableFrom(cls) ? null : obj;
            ?? r2 = true != Map.class.isAssignableFrom(cls) ? 0 : obj;
            datu datuVar = new datu(obj);
            StringWriter stringWriter = new StringWriter();
            StringWriter stringWriter2 = new StringWriter();
            boolean z = true;
            while (true) {
                int read = stringReader.read();
                if (read == -1 || read == 38) {
                    String b = davc.b(stringWriter.toString());
                    if (b.length() != 0) {
                        String b2 = davc.b(stringWriter2.toString());
                        dauh c = a2.c(b);
                        if (c != null) {
                            Type k = daub.k(asList, c.c());
                            if (dava.d(k)) {
                                Class<?> i = dava.i(asList, dava.e(k));
                                datuVar.b(c.b, i, c(i, asList, b2));
                            } else if (dava.b(dava.i(asList, k), Iterable.class)) {
                                Collection<Object> collection = (Collection) c.e(obj);
                                if (collection == null) {
                                    collection = daub.i(k);
                                    c.f(obj, collection);
                                }
                                collection.add(c(k == Object.class ? null : dava.j(k), asList, b2));
                            } else {
                                c.f(obj, c(k, asList, b2));
                            }
                        } else if (r2 != 0) {
                            ArrayList arrayList = (ArrayList) r2.get(b);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (obj2 != null) {
                                    ((darw) obj2).h(b, arrayList);
                                } else {
                                    r2.put(b, arrayList);
                                }
                            }
                            arrayList.add(b2);
                        }
                    }
                    StringWriter stringWriter3 = new StringWriter();
                    StringWriter stringWriter4 = new StringWriter();
                    if (read == -1) {
                        datuVar.a();
                        return;
                    }
                    stringWriter2 = stringWriter4;
                    z = true;
                    stringWriter = stringWriter3;
                } else if (read == 61) {
                    if (!z) {
                        stringWriter2.write(read);
                    }
                    z = false;
                } else if (z) {
                    stringWriter.write(read);
                } else {
                    stringWriter2.write(read);
                }
            }
        } catch (IOException e) {
            throw dbue.d(e);
        }
    }

    private static Object c(Type type, List<Type> list, String str) {
        return daub.h(daub.k(list, type), str);
    }

    @Override // defpackage.dauu
    public final <T> T b(InputStream inputStream, Charset charset, Class<T> cls) {
        throw null;
    }
}

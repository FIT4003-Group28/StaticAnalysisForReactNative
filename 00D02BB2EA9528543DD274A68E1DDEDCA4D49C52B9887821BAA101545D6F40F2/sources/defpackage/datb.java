package defpackage;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: datb  reason: default package */
/* loaded from: classes5.dex */
public final class datb implements dauu {
    public final dasy a;
    public final Set<String> b;

    public datb(data dataVar) {
        this.a = dataVar.a;
        this.b = new HashSet(dataVar.b);
    }

    public final Object a(InputStream inputStream, Type type) {
        datc f = this.a.f(inputStream);
        if (!this.b.isEmpty()) {
            try {
                dbsk.c((f.p(this.b) == null || f.d() == datg.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.b);
            } catch (Throwable th) {
                f.b();
                throw th;
            }
        }
        return f.q(type, true);
    }

    @Override // defpackage.dauu
    public final <T> T b(InputStream inputStream, Charset charset, Class<T> cls) {
        return (T) a(inputStream, cls);
    }
}

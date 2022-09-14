package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: qdf  reason: default package */
/* loaded from: classes7.dex */
public abstract class qdf {
    public abstract qdg a();

    public abstract void b(List<String> list);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract void g(int i);

    public final qdg h() {
        qdg i = i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException();
    }

    @dzsi
    public final qdg i() {
        qdg a = a();
        if (a.g() != null) {
            if (a.b() != null || a.a() != null) {
                return null;
            }
            return a;
        }
        return a;
    }

    public final void j(@dzsi String str) {
        if (str == null) {
            b(Collections.emptyList());
        } else {
            b(Collections.singletonList(str));
        }
    }
}

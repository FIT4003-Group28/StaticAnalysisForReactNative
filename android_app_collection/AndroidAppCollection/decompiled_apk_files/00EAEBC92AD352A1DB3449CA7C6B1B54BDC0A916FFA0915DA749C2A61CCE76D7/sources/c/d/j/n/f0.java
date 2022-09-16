package c.d.j.n;

import c.d.j.n.s;
import java.io.InputStream;
import java.util.Map;
/* loaded from: classes.dex */
public interface f0<FETCH_STATE extends s> {

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(InputStream inputStream, int i);

        void a(Throwable th);
    }

    /* renamed from: a */
    FETCH_STATE mo144a(k<c.d.j.k.d> kVar, k0 k0Var);

    void a(FETCH_STATE fetch_state, int i);

    void a(FETCH_STATE fetch_state, a aVar);

    boolean a(FETCH_STATE fetch_state);

    Map<String, String> b(FETCH_STATE fetch_state, int i);
}

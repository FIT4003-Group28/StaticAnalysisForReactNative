package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class p4 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile p4 f4339b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile p4 f4340c;

    /* renamed from: d  reason: collision with root package name */
    private static final p4 f4341d = new p4(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, b5.d<?, ?>> f4342a;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4343a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4344b;

        a(Object obj, int i) {
            this.f4343a = obj;
            this.f4344b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4343a == aVar.f4343a && this.f4344b == aVar.f4344b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f4343a) * 65535) + this.f4344b;
        }
    }

    p4() {
        this.f4342a = new HashMap();
    }

    private p4(boolean z) {
        this.f4342a = Collections.emptyMap();
    }

    public static p4 a() {
        p4 p4Var = f4339b;
        if (p4Var == null) {
            synchronized (p4.class) {
                p4Var = f4339b;
                if (p4Var == null) {
                    p4Var = f4341d;
                    f4339b = p4Var;
                }
            }
        }
        return p4Var;
    }

    public static p4 b() {
        p4 p4Var = f4340c;
        if (p4Var != null) {
            return p4Var;
        }
        synchronized (p4.class) {
            p4 p4Var2 = f4340c;
            if (p4Var2 != null) {
                return p4Var2;
            }
            p4 a2 = a5.a(p4.class);
            f4340c = a2;
            return a2;
        }
    }

    public final <ContainingType extends k6> b5.d<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (b5.d<ContainingType, ?>) this.f4342a.get(new a(containingtype, i));
    }
}

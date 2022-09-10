package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: clok  reason: default package */
/* loaded from: classes5.dex */
public final class clok extends cllj {
    public final int a;
    public final clpb[] b;
    private final int d;
    private final int[] e;
    private final int[] f;
    private final Object[] g;
    private final HashMap<Object, Integer> h;

    public clok(Collection collection, cmfn cmfnVar) {
        super(cmfnVar);
        int size = collection.size();
        this.e = new int[size];
        this.f = new int[size];
        this.b = new clpb[size];
        this.g = new Object[size];
        this.h = new HashMap<>();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            clnu clnuVar = (clnu) it.next();
            this.b[i3] = clnuVar.b();
            this.f[i3] = i;
            this.e[i3] = i2;
            i += this.b[i3].r();
            i2 += this.b[i3].s();
            this.g[i3] = clnuVar.a();
            this.h.put(this.g[i3], Integer.valueOf(i3));
            i3++;
        }
        this.a = i;
        this.d = i2;
    }

    @Override // defpackage.cllj
    protected final int k(int i) {
        return cmny.ae(this.e, i + 1);
    }

    @Override // defpackage.cllj
    protected final int l(int i) {
        return cmny.ae(this.f, i + 1);
    }

    @Override // defpackage.cllj
    protected final int m(Object obj) {
        Integer num = this.h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.cllj
    protected final clpb n(int i) {
        return this.b[i];
    }

    @Override // defpackage.cllj
    protected final int o(int i) {
        return this.e[i];
    }

    @Override // defpackage.cllj
    protected final int p(int i) {
        return this.f[i];
    }

    @Override // defpackage.cllj
    protected final Object q(int i) {
        return this.g[i];
    }

    @Override // defpackage.clpb
    public final int r() {
        return this.a;
    }

    @Override // defpackage.clpb
    public final int s() {
        return this.d;
    }
}

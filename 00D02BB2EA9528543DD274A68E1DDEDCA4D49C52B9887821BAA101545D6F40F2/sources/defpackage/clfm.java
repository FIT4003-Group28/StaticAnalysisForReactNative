package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clfm  reason: default package */
/* loaded from: classes5.dex */
public final class clfm {
    private final clfl a;
    private final clfj b;
    private final Map<String, clfo> c;

    public clfm(Context context, clfj clfjVar) {
        clfl clflVar = new clfl(context);
        this.c = new HashMap();
        this.a = clflVar;
        this.b = clfjVar;
    }

    public final synchronized clfo a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        clfe a = this.a.a(str);
        if (a == null) {
            return null;
        }
        clfj clfjVar = this.b;
        clfo create = a.create(new clfd(clfjVar.a, clfjVar.b, clfjVar.c, str));
        this.c.put(str, create);
        return create;
    }
}

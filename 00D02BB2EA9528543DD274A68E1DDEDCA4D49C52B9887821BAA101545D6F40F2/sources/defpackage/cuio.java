package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cuio  reason: default package */
/* loaded from: classes5.dex */
public final class cuio implements csss {
    private static WeakReference<cuio> c = new WeakReference<>(null);
    public final cukr a;
    private final String e;
    private cuka f;
    private final dcdc<Integer> d = dcdc.f(1);
    public cuiv b = null;

    private cuio(String str, cukr cukrVar) {
        this.e = str;
        this.a = cukrVar;
    }

    public static synchronized cuio c(String str, cukr cukrVar) {
        synchronized (cuio.class) {
            cuio cuioVar = c.get();
            if (cuioVar == null) {
                cuio cuioVar2 = new cuio(str, cukrVar);
                c = new WeakReference<>(cuioVar2);
                return cuioVar2;
            }
            return cuioVar;
        }
    }

    @Override // defpackage.csss
    public final dcdc<Integer> a() {
        return this.d;
    }

    @Override // defpackage.csss
    public final List<ctuk> b(ctss ctssVar, ctgc ctgcVar, Context context) {
        this.f = new cuka(ctssVar, context);
        this.b = new cujn(context, this.f, ctgcVar, this.e, this.a);
        return Arrays.asList(new cuip(this.b));
    }
}

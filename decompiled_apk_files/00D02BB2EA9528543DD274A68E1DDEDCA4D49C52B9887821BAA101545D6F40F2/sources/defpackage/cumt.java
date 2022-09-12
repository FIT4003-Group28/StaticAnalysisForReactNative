package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cumt  reason: default package */
/* loaded from: classes5.dex */
public final class cumt implements csss {
    private static WeakReference<cumt> b = new WeakReference<>(null);
    private final dcdc<Integer> c = dcdc.f(2);
    public cumw a = null;

    private cumt() {
    }

    public static synchronized cumt c() {
        synchronized (cumt.class) {
            cumt cumtVar = b.get();
            if (cumtVar == null) {
                cumt cumtVar2 = new cumt();
                b = new WeakReference<>(cumtVar2);
                return cumtVar2;
            }
            return cumtVar;
        }
    }

    @Override // defpackage.csss
    public final dcdc<Integer> a() {
        return this.c;
    }

    @Override // defpackage.csss
    public final List<ctuk> b(ctss ctssVar, ctgc ctgcVar, Context context) {
        this.a = new cumx();
        return Arrays.asList(new cumu(context));
    }
}

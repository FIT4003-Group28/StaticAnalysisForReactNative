package defpackage;

import dagger.internal.Factory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clfs  reason: default package */
/* loaded from: classes5.dex */
public final class clfs implements Factory<clge> {
    public static final clge b() {
        clig b = clih.b();
        clga clgaVar = new clga();
        clcv clcvVar = clcv.DEFAULT;
        clgb d = clgc.d();
        d.b(30000L);
        d.d();
        clgaVar.a(clcvVar, d.a());
        clcv clcvVar2 = clcv.HIGHEST;
        clgb d2 = clgc.d();
        d2.b(1000L);
        d2.d();
        clgaVar.a(clcvVar2, d2.a());
        clcv clcvVar3 = clcv.VERY_LOW;
        clgb d3 = clgc.d();
        d3.b(86400000L);
        d3.d();
        d3.c(Collections.unmodifiableSet(new HashSet(Arrays.asList(clgd.NETWORK_UNMETERED, clgd.DEVICE_IDLE))));
        clgaVar.a(clcvVar3, d3.a());
        clgaVar.a = b;
        if (clgaVar.a == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (clgaVar.b.keySet().size() >= clcv.values().length) {
            Map<clcv, clgc> map = clgaVar.b;
            clgaVar.b = new HashMap();
            return new clfv(clgaVar.a, map);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}

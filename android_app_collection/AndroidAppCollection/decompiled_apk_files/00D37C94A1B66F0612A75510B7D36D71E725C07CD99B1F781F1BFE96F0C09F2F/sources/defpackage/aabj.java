package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: aabj  reason: default package */
/* loaded from: classes.dex */
public final class aabj extends aabp {
    private final ampq a;
    private final ampq b;
    private final Map c;

    private aabj(atpl atplVar, atoo atooVar, Map map) {
        super(ampq.i(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        this.a = ampq.i(atplVar);
        this.b = ampq.i(atooVar);
        this.c = map == null ? amyc.b : map;
    }

    public static aabj a(atoo atooVar) {
        atooVar.getClass();
        return new aabj(null, atooVar, null);
    }

    public static aabj b(atpl atplVar) {
        atplVar.getClass();
        return new aabj(atplVar, null, null);
    }

    public static aabj c(atoo atooVar, Map map) {
        atooVar.getClass();
        return new aabj(null, atooVar, map);
    }

    public static aabj d(atpl atplVar, Map map) {
        atplVar.getClass();
        return new aabj(atplVar, null, map);
    }

    public ampq e() {
        return this.b;
    }

    public ampq f() {
        return this.a;
    }

    public Map g() {
        return this.c;
    }
}

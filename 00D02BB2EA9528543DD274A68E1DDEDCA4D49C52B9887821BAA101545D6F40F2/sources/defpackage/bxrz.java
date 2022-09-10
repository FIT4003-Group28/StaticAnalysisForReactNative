package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxrz  reason: default package */
/* loaded from: classes4.dex */
public final class bxrz implements bxty {
    public static final awwt a;
    public final awvy b;
    public final Executor c;
    public final dbsg<dxio<aeaa>> d;
    public final dxio<akox> e;

    static {
        awws u = awwt.u();
        u.t(dcdc.f("search_zero_suggest_ads"));
        u.e(awvv.E);
        a = u.a();
    }

    public bxrz(awvy awvyVar, dbsg<dxio<aeaa>> dbsgVar, dxio<akox> dxioVar, Executor executor) {
        this.e = dxioVar;
        this.b = awvyVar;
        this.c = executor;
        this.d = dbsgVar;
    }
}

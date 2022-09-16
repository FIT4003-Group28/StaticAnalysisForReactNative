package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brwz  reason: default package */
/* loaded from: classes.dex */
public final class brwz implements bzml {
    private final btvo a;
    private final bryi b;
    private final bvjj c;
    private final Activity d;
    private final cpv e;
    private final mw<bryd> f;

    public brwz(btvo btvoVar, bryi bryiVar, bvjj bvjjVar, Activity activity, cpv cpvVar, mw<bryd> mwVar) {
        this.a = btvoVar;
        this.b = bryiVar;
        this.c = bvjjVar;
        this.d = activity;
        this.e = cpvVar;
        this.f = mwVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSIT_NEW_FEED_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return !this.e.e(this.d) && !btpf.c(this.d).f;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!this.a.getEnableFeatureParameters().bo || this.c.m(bvjk.ib, false)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.VISIBLE) {
            return false;
        }
        if (this.a.getEnableFeatureParameters().bo) {
            mw<bryd> mwVar = this.f;
            bryi bryiVar = this.b;
            cqhn a = bryiVar.a.a();
            bryi.a(a, 1);
            dxio a2 = ((dxjh) bryiVar.b).a();
            bryi.a(a2, 2);
            mwVar.a(new bryh(a, a2));
            this.c.S(bvjk.ib, true);
        }
        return true;
    }
}

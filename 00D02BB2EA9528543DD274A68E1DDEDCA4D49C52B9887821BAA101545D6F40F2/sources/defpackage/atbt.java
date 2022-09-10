package defpackage;
/* compiled from: PG */
/* renamed from: atbt  reason: default package */
/* loaded from: classes2.dex */
public final class atbt implements bzml {
    private final atbs a;
    private final bzmm b;
    private final bvjj c;

    public atbt(atbs atbsVar, bzmm bzmmVar, bvjj bvjjVar) {
        this.a = atbsVar;
        this.b = bzmmVar;
        this.c = bvjjVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.PICTURE_IN_PICTURE_DISMISSAL;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.a.k;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.c.m(bvjk.iq, false)) {
            return bzmk.NONE;
        }
        if (this.b.d(dqkc.PICTURE_IN_PICTURE_DISMISSAL) < 3) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return true;
    }
}

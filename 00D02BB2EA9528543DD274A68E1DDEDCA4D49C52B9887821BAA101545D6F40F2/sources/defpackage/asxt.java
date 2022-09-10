package defpackage;
/* compiled from: PG */
/* renamed from: asxt  reason: default package */
/* loaded from: classes2.dex */
public final class asxt {
    public final cqkj a;
    public final asxu b;
    public final atab c = new asxp(this);
    public final dbty<cqkf<aszx>> d = dbud.a(new asxq(this));
    public final dbty<atad> e = dbud.a(new asxr(this));
    public final dbty<aefv> f = dbud.a(new asxs(this));
    public int g;
    public boolean h;

    public asxt(cqkj cqkjVar, asxu asxuVar) {
        this.a = cqkjVar;
        this.b = asxuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aefv a() {
        this.d.a().e(this.e.a());
        return this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return !this.e.a().b().isEmpty();
    }

    public final int c() {
        return (int) (bvsc.b(this.f.a()) * 0.3f);
    }
}

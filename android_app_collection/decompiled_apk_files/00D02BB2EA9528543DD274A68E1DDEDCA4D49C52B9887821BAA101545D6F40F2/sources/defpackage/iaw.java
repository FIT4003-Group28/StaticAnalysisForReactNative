package defpackage;
/* compiled from: PG */
/* renamed from: iaw  reason: default package */
/* loaded from: classes6.dex */
public class iaw extends iaa implements ias {
    public final dafw f;
    public final iar g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    private final cqqw l;
    private final hzv m;

    public iaw(cqhn cqhnVar, cjqy cjqyVar, int i, iar iarVar) {
        super(cqhnVar, cjqyVar, 0);
        this.f = new iat(this);
        this.l = new iau(this);
        this.m = new iav(this);
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = 0;
        this.g = iarVar;
    }

    @Override // defpackage.iaa, defpackage.hzw, defpackage.absq
    public hzv a() {
        return this.m;
    }

    @Override // defpackage.ias, defpackage.absq
    public cqqw c() {
        return this.l;
    }

    @Override // defpackage.ias, defpackage.absq
    public Integer d() {
        return Integer.valueOf(this.k);
    }

    public final void e(int i) {
        int b;
        if (i < 0 || i >= this.g.a() || (b = this.g.b(i)) == this.k) {
            return;
        }
        this.k = b;
        this.h = true;
        cqkx.p(this);
    }

    public iaw(cqhn cqhnVar, cjqy cjqyVar, iar iarVar) {
        this(cqhnVar, cjqyVar, 0, iarVar);
    }
}

package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aiwr  reason: default package */
/* loaded from: classes2.dex */
class aiwr implements aiyl {
    dcdc<aixu> a = dcdc.e();
    boolean b = true;
    boolean c = false;
    boolean d = false;
    Integer e = 80;
    @dzsi
    aixu f;
    public final cqhn g;
    private final dxio<ahwf> h;

    public aiwr(cqhn cqhnVar, dxio<ahwf> dxioVar) {
        this.g = cqhnVar;
        this.h = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.aiyl
    public List<aixu> b() {
        return this.a;
    }

    @Override // defpackage.aiyl
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.aiyl
    public Boolean d() {
        boolean z = false;
        if (!this.d && this.c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aiyl
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aiyl
    public Integer f() {
        return this.e;
    }

    @Override // defpackage.aiyl
    public cqkl g() {
        this.h.a().l();
        return cqkl.a;
    }

    @Override // defpackage.aiyl
    @dzsi
    public aixu h() {
        return this.f;
    }
}

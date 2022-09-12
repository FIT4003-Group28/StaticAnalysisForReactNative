package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bban  reason: default package */
/* loaded from: classes3.dex */
public abstract class bban implements bayl {
    final gga d;
    public boolean g;
    @dzsi
    public Runnable f = null;
    final List<bayj> e = new ArrayList();

    public bban(gga ggaVar) {
        this.d = ggaVar;
    }

    public void A(Boolean bool) {
        this.g = bool.booleanValue();
        cqkx.p(this);
    }

    @Override // defpackage.bayl
    public List<bayj> QI() {
        return this.e;
    }

    @Override // defpackage.bayl
    public List<bayf> QJ() {
        return new ArrayList();
    }

    @Override // defpackage.bayl
    @dzsi
    public baqh QK() {
        return null;
    }

    @Override // defpackage.bayl
    public Boolean d() {
        return false;
    }

    @Override // defpackage.bayl
    @dzsi
    public cqqw h() {
        return null;
    }

    @Override // defpackage.bayl
    public bayn i() {
        return new bazy();
    }

    @Override // defpackage.bayl
    @dzsi
    public jar m() {
        return null;
    }

    @Override // defpackage.bayl
    public Boolean o() {
        return Boolean.valueOf(this.f != null);
    }

    @Override // defpackage.bayl
    public Boolean p() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bayl
    public awz q() {
        return new awz(this) { // from class: bbam
            private final bban a;

            {
                this.a = this;
            }

            @Override // defpackage.awz
            public final void a() {
                bban bbanVar = this.a;
                if (bbanVar.f == null || bbanVar.g) {
                    return;
                }
                bbanVar.A(true);
                bbanVar.f.run();
            }
        };
    }

    @Override // defpackage.bayl
    @dzsi
    public cjtd r() {
        return null;
    }

    public void y() {
        this.e.clear();
    }

    public void z(@dzsi Runnable runnable) {
        this.f = runnable;
    }
}

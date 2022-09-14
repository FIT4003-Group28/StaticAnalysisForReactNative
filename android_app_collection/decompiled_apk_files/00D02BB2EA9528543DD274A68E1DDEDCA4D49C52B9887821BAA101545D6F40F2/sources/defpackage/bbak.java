package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bbak  reason: default package */
/* loaded from: classes3.dex */
public class bbak extends bban {
    public boolean a;
    private final bbai b;

    public bbak(gga ggaVar, bbai bbaiVar) {
        super(ggaVar);
        this.b = bbaiVar;
    }

    @Override // defpackage.bban, defpackage.bayl
    public Boolean d() {
        return Boolean.valueOf(this.a);
    }

    public void e(boolean z) {
        this.a = z;
    }

    public void f(List<dvdd> list) {
        for (dvdd dvddVar : list) {
            this.e.add(this.b.a(dvddVar));
        }
    }

    @Override // defpackage.bayl
    public baye n() {
        return new bbaj(this);
    }
}

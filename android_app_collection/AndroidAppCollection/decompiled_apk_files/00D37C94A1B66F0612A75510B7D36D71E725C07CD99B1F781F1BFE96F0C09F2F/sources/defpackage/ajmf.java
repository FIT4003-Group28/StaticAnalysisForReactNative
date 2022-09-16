package defpackage;
/* compiled from: PG */
/* renamed from: ajmf  reason: default package */
/* loaded from: classes.dex */
public class ajmf extends thz implements ajrt {
    public ajmf(int i, float f) {
        super(i, f);
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        tig tigVar = null;
        if (!this.j.isEmpty()) {
            if (this.h == 0 && this.i == 0) {
                super.e();
            }
            int b = super.b(i);
            if (b < this.j.size()) {
                thx thxVar = (thx) this.j.get(b);
                if (thxVar.a == i) {
                    tigVar = thxVar.c;
                }
            }
        }
        if (tigVar != null) {
            ajrsVar.f("PresenterPreparerContextDecoratorKey", tigVar);
        }
    }
}

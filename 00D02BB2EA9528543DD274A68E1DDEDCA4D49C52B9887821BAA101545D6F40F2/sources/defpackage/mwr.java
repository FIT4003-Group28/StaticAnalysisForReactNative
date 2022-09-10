package defpackage;
/* compiled from: PG */
/* renamed from: mwr  reason: default package */
/* loaded from: classes7.dex */
final class mwr implements kqo {
    final /* synthetic */ mwu a;

    public mwr(mwu mwuVar) {
        this.a = mwuVar;
    }

    @Override // defpackage.kqo
    public final boolean a(aryn arynVar) {
        if (arynVar instanceof aryr) {
            aryr aryrVar = (aryr) arynVar;
            int i = mwu.h;
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.f.size()) {
                    i2 = -1;
                    break;
                } else if (this.a.f.get(i2).b.equals(aryrVar)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.a.g.a(i2);
                return true;
            }
        }
        return false;
    }
}

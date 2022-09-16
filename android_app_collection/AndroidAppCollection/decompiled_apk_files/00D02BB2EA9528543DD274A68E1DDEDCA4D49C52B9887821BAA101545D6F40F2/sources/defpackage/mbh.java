package defpackage;
/* compiled from: PG */
/* renamed from: mbh  reason: default package */
/* loaded from: classes7.dex */
final class mbh implements kqo {
    final /* synthetic */ mbp a;

    public mbh(mbp mbpVar) {
        this.a = mbpVar;
    }

    @Override // defpackage.kqo
    public final boolean a(aryn arynVar) {
        if (arynVar instanceof aryr) {
            aryr aryrVar = (aryr) arynVar;
            int i = 0;
            while (true) {
                if (i >= this.a.x.d()) {
                    i = -1;
                    break;
                } else if (this.a.x.c(i).b().equals(aryrVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.a.E.a(i);
                return true;
            }
        }
        return false;
    }
}

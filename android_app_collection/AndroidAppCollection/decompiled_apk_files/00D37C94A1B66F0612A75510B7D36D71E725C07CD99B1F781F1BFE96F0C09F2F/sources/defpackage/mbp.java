package defpackage;
/* compiled from: PG */
/* renamed from: mbp  reason: default package */
/* loaded from: classes3.dex */
final class mbp extends ajsm {
    private int a;

    public mbp(int i) {
        f(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        if (i <= 0) {
            if (isEmpty()) {
                return;
            }
            clear();
        } else if (isEmpty()) {
            add(fju.a(i));
        } else {
            n(0, fju.a(i));
        }
    }

    @Override // defpackage.ajsm, defpackage.ajqm
    public final /* bridge */ /* synthetic */ void lT(ajql ajqlVar) {
        super.i(ajqlVar);
    }

    @Override // defpackage.ajsm, defpackage.ajqm
    public final /* bridge */ /* synthetic */ void pl(ajql ajqlVar) {
        super.j(ajqlVar);
    }
}

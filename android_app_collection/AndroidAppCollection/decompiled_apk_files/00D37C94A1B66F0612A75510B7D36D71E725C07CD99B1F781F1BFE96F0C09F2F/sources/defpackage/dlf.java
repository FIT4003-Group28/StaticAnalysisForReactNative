package defpackage;
/* compiled from: PG */
/* renamed from: dlf  reason: default package */
/* loaded from: classes3.dex */
final class dlf implements dlg {
    private final /* synthetic */ int c;

    public dlf() {
    }

    public dlf(int i) {
        this.c = i;
    }

    @Override // defpackage.dlg
    public final void a(int i, dkd dkdVar) {
        if (this.c == 0) {
            do {
                i--;
                if (i < 0) {
                    return;
                }
            } while (dkdVar.a(i));
            return;
        }
        for (int i2 = 0; i2 < i && dkdVar.a(i2); i2++) {
        }
    }
}

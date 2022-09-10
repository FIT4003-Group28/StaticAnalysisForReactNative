package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpaf  reason: default package */
/* loaded from: classes3.dex */
public final class bpaf implements cflk {
    final /* synthetic */ bpag a;

    public bpaf(bpag bpagVar) {
        this.a = bpagVar;
    }

    @Override // defpackage.cflk
    public final void a(dcdc<Long> dcdcVar) {
        bpag bpagVar = this.a;
        int i = bpagVar.h;
        if (i != 0) {
            if (i == 2) {
                bpagVar.a();
                return;
            } else if (i == 3) {
                bpagVar.f();
                return;
            } else if (i != 4) {
                return;
            } else {
                bpagVar.g();
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.cflk
    public final void y() {
        bpag bpagVar = this.a;
        int i = bpagVar.h;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                return;
            }
            bpagVar.l(6);
            return;
        }
        throw null;
    }
}

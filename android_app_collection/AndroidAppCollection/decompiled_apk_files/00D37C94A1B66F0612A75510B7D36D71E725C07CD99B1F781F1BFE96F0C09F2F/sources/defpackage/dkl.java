package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkl  reason: default package */
/* loaded from: classes3.dex */
public final class dkl implements dmn {
    final /* synthetic */ dlc a;

    public dkl(dlc dlcVar) {
        this.a = dlcVar;
    }

    @Override // defpackage.dmn
    public final void a(int i, int i2, int i3, int i4, int i5) {
        dlc dlcVar = this.a;
        dlcVar.u = i;
        dlcVar.v = i2;
        dlcVar.D.b = false;
        dlcVar.z();
        dlc dlcVar2 = this.a;
        int i6 = dlcVar2.w;
        if (i6 != -1) {
            int max = Math.max(i6, i2 - i);
            int i7 = (int) (max * dlcVar2.h);
            int min = Math.min(max + i + i7, dlcVar2.b.size() - 1);
            for (int max2 = Math.max(0, i - i7); max2 <= min; max2++) {
                ((diz) dlcVar2.b.get(max2)).t(max2, i, i2);
            }
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: evb  reason: default package */
/* loaded from: classes3.dex */
final class evb implements acvl {
    private final int a;

    public evb(int i) {
        this.a = i;
    }

    @Override // defpackage.acvl
    public final acvk a(acvp acvpVar) {
        int a = acvpVar.a().a();
        boolean t = acvpVar.e().t();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new evf(a, t);
            }
            if (i == 2) {
                return new evd(a, t);
            }
            if (i == 4) {
                return new evh(a, t);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append(i);
            sb.append(" type is not support");
            throw new IllegalStateException(sb.toString());
        }
        return new evj(a, t);
    }
}

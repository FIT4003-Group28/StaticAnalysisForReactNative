package defpackage;
/* compiled from: PG */
/* renamed from: dmtk  reason: default package */
/* loaded from: classes6.dex */
public final class dmtk extends dmvw {
    private final dmvo a = new dmvo();

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.c();
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 1) {
            return;
        }
        Q(this.p, i2, i3, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            dmvo dmvoVar = this.a;
            if (i < dmvoVar.b) {
                float b = dmvoVar.b(i);
                StringBuilder sb2 = new StringBuilder(24);
                sb2.append("values: ");
                sb2.append(b);
                sb2.append("\n");
                sb.append(sb2.toString());
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dmvy  reason: default package */
/* loaded from: classes6.dex */
public final class dmvy extends dmvw {
    private final dmvs a = new dmvs(0);
    private final dmvs b = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.b();
        this.b.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.a.a(i2);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.b.a(i2);
            return true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dmvs dmvsVar = this.a;
        if (dmvsVar.b) {
            String hexString = Long.toHexString(dmvsVar.a & 4294967295L);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 19);
            sb2.append("blur_color_rgb: 0x");
            sb2.append(hexString);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        dmvs dmvsVar2 = this.b;
        if (dmvsVar2.b) {
            String hexString2 = Long.toHexString(dmvsVar2.a & 4294967295L);
            StringBuilder sb3 = new StringBuilder(String.valueOf(hexString2).length() + 19);
            sb3.append("fill_color_rgb: 0x");
            sb3.append(hexString2);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
}

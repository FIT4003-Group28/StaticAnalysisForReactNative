package defpackage;
/* compiled from: PG */
/* renamed from: dmvg  reason: default package */
/* loaded from: classes6.dex */
public final class dmvg extends dmvw {
    private final dmvm a = new dmvm(1);
    private dmvy b = null;
    private final dmvs c = new dmvs(0);
    private final dmvs d = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        dmvy dmvyVar = this.b;
        if (dmvyVar != null) {
            dmvyVar.a();
        }
        this.c.b();
        this.d.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 2) {
            this.c.a(i2);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            this.d.a(i2);
            return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 1) {
            return;
        }
        this.a.e(0, i2, i3);
    }

    public final String toString() {
        dmvy dmvyVar;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (this.a.b(0)) {
            if (this.b == null) {
                this.b = new dmvy();
            }
            if (!this.a.b(0)) {
                this.b.a();
                dmvyVar = this.b;
            } else {
                this.b.R(this.p, this.a.c(0), this.a.d(0));
                dmvyVar = this.b;
            }
            String replace = dmvyVar.toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 27);
            sb2.append("water_gradient_style {\n  ");
            sb2.append(replace);
            sb2.append("}\n");
            sb.append(sb2.toString());
        }
        dmvs dmvsVar = this.c;
        if (dmvsVar.b) {
            int i = dmvsVar.a;
            StringBuilder sb3 = new StringBuilder(21);
            sb3.append("z_plane: ");
            sb3.append(i);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        dmvs dmvsVar2 = this.d;
        if (dmvsVar2.b) {
            if (dmvsVar2.a != 0) {
                z = true;
            }
            StringBuilder sb4 = new StringBuilder(11);
            sb4.append("off: ");
            sb4.append(z);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        return sb.toString();
    }
}

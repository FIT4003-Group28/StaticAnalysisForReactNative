package defpackage;
/* compiled from: PG */
/* renamed from: dmul  reason: default package */
/* loaded from: classes6.dex */
public final class dmul extends dmvw {
    private final dmvm a = new dmvm(6);
    private final dmvs b = new dmvs(0);
    private final dmvs c = new dmvs(0);
    private final dmvs d = new dmvs(0);
    private dmtk e = null;
    private dmtk f = null;
    private dmtk g = null;
    private dmtk h = null;
    private dmtk i = null;
    private dmtk j = null;

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        this.b.b();
        this.c.b();
        this.d.b();
        dmtk dmtkVar = this.e;
        if (dmtkVar != null) {
            dmtkVar.a();
        }
        dmtk dmtkVar2 = this.f;
        if (dmtkVar2 != null) {
            dmtkVar2.a();
        }
        dmtk dmtkVar3 = this.g;
        if (dmtkVar3 != null) {
            dmtkVar3.a();
        }
        dmtk dmtkVar4 = this.h;
        if (dmtkVar4 != null) {
            dmtkVar4.a();
        }
        dmtk dmtkVar5 = this.i;
        if (dmtkVar5 != null) {
            dmtkVar5.a();
        }
        dmtk dmtkVar6 = this.j;
        if (dmtkVar6 != null) {
            dmtkVar6.a();
        }
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.b.a(i2);
            return true;
        } else if (i == 2) {
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
        switch (i) {
            case 4:
                this.a.e(0, i2, i3);
                return;
            case 5:
                this.a.e(1, i2, i3);
                return;
            case 6:
                this.a.e(2, i2, i3);
                return;
            case 7:
                this.a.e(3, i2, i3);
                return;
            case 8:
                this.a.e(4, i2, i3);
                return;
            case 9:
                this.a.e(5, i2, i3);
                return;
            default:
                return;
        }
    }

    public final String toString() {
        dmtk dmtkVar;
        dmtk dmtkVar2;
        dmtk dmtkVar3;
        dmtk dmtkVar4;
        dmtk dmtkVar5;
        dmtk dmtkVar6;
        StringBuilder sb = new StringBuilder();
        dmvs dmvsVar = this.b;
        if (dmvsVar.b) {
            int i = dmvsVar.a;
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("duration_ms: ");
            sb2.append(i);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        dmvs dmvsVar2 = this.c;
        if (dmvsVar2.b) {
            float intBitsToFloat = Float.intBitsToFloat(dmvsVar2.a);
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("anchor_x: ");
            sb3.append(intBitsToFloat);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        dmvs dmvsVar3 = this.d;
        if (dmvsVar3.b) {
            float intBitsToFloat2 = Float.intBitsToFloat(dmvsVar3.a);
            StringBuilder sb4 = new StringBuilder(26);
            sb4.append("anchor_y: ");
            sb4.append(intBitsToFloat2);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (this.a.b(0)) {
            if (this.e == null) {
                this.e = new dmtk();
            }
            if (!this.a.b(0)) {
                this.e.a();
                dmtkVar6 = this.e;
            } else {
                this.e.R(this.p, this.a.c(0), this.a.d(0));
                dmtkVar6 = this.e;
            }
            String replace = dmtkVar6.toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(replace).length() + 15);
            sb5.append("offset_x {\n  ");
            sb5.append(replace);
            sb5.append("}\n");
            sb.append(sb5.toString());
        }
        if (this.a.b(1)) {
            if (this.f == null) {
                this.f = new dmtk();
            }
            if (!this.a.b(1)) {
                this.f.a();
                dmtkVar5 = this.f;
            } else {
                this.f.R(this.p, this.a.c(1), this.a.d(1));
                dmtkVar5 = this.f;
            }
            String replace2 = dmtkVar5.toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(replace2).length() + 15);
            sb6.append("offset_y {\n  ");
            sb6.append(replace2);
            sb6.append("}\n");
            sb.append(sb6.toString());
        }
        if (this.a.b(2)) {
            if (this.g == null) {
                this.g = new dmtk();
            }
            if (!this.a.b(2)) {
                this.g.a();
                dmtkVar4 = this.g;
            } else {
                this.g.R(this.p, this.a.c(2), this.a.d(2));
                dmtkVar4 = this.g;
            }
            String replace3 = dmtkVar4.toString().replace("\n", "\n  ");
            if (replace3.endsWith("  ")) {
                replace3 = replace3.substring(0, replace3.length() - 2);
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(replace3).length() + 14);
            sb7.append("scale_x {\n  ");
            sb7.append(replace3);
            sb7.append("}\n");
            sb.append(sb7.toString());
        }
        if (this.a.b(3)) {
            if (this.h == null) {
                this.h = new dmtk();
            }
            if (!this.a.b(3)) {
                this.h.a();
                dmtkVar3 = this.h;
            } else {
                this.h.R(this.p, this.a.c(3), this.a.d(3));
                dmtkVar3 = this.h;
            }
            String replace4 = dmtkVar3.toString().replace("\n", "\n  ");
            if (replace4.endsWith("  ")) {
                replace4 = replace4.substring(0, replace4.length() - 2);
            }
            StringBuilder sb8 = new StringBuilder(String.valueOf(replace4).length() + 14);
            sb8.append("scale_y {\n  ");
            sb8.append(replace4);
            sb8.append("}\n");
            sb.append(sb8.toString());
        }
        if (this.a.b(4)) {
            if (this.i == null) {
                this.i = new dmtk();
            }
            if (!this.a.b(4)) {
                this.i.a();
                dmtkVar2 = this.i;
            } else {
                this.i.R(this.p, this.a.c(4), this.a.d(4));
                dmtkVar2 = this.i;
            }
            String replace5 = dmtkVar2.toString().replace("\n", "\n  ");
            if (replace5.endsWith("  ")) {
                replace5 = replace5.substring(0, replace5.length() - 2);
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(replace5).length() + 15);
            sb9.append("rotation {\n  ");
            sb9.append(replace5);
            sb9.append("}\n");
            sb.append(sb9.toString());
        }
        if (this.a.b(5)) {
            if (this.j == null) {
                this.j = new dmtk();
            }
            if (!this.a.b(5)) {
                this.j.a();
                dmtkVar = this.j;
            } else {
                this.j.R(this.p, this.a.c(5), this.a.d(5));
                dmtkVar = this.j;
            }
            String replace6 = dmtkVar.toString().replace("\n", "\n  ");
            if (replace6.endsWith("  ")) {
                replace6 = replace6.substring(0, replace6.length() - 2);
            }
            StringBuilder sb10 = new StringBuilder(String.valueOf(replace6).length() + 14);
            sb10.append("opacity {\n  ");
            sb10.append(replace6);
            sb10.append("}\n");
            sb.append(sb10.toString());
        }
        return sb.toString();
    }
}

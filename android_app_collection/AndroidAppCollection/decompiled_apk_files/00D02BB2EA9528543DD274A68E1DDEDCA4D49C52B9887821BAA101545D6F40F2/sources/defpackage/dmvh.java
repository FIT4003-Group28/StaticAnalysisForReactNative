package defpackage;
/* compiled from: PG */
/* renamed from: dmvh  reason: default package */
/* loaded from: classes.dex */
public final class dmvh extends dmvw {
    private final dmvm a = new dmvm(3);
    private final dmvs b = new dmvs(0);
    private final dmvs c = new dmvs(0);
    private final dmvs d = new dmvs(0);
    private final dmvr e = new dmvr();
    private final dmvs f = new dmvs(0);
    private final dmvs g = new dmvs(0);
    private String h = null;
    private final dmvs i = new dmvs(0);
    private final dmvs j = new dmvs(0);
    private final dmvs k = new dmvs(0);
    private final dmvr l = new dmvr();
    private dmuf m = null;
    private dmuf s = null;
    private final dmvs t = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        this.b.b();
        this.c.b();
        this.d.b();
        this.e.c();
        this.f.b();
        this.g.b();
        this.h = null;
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.c();
        dmuf dmufVar = this.m;
        if (dmufVar != null) {
            dmufVar.a();
        }
        dmuf dmufVar2 = this.s;
        if (dmufVar2 != null) {
            dmufVar2.a();
        }
        this.t.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.b.a(i2);
            return true;
        } else if (i == 2) {
            this.d.a(i2);
            return true;
        } else if (i == 3) {
            this.e.a(i2);
            return true;
        } else if (i == 6) {
            this.f.a(i2);
            return true;
        } else if (i == 8) {
            this.g.a(O(i2));
            return true;
        } else if (i != 9) {
            switch (i) {
                case 12:
                    this.j.a(i2);
                    return true;
                case 13:
                    this.t.a(i2);
                    return true;
                case 14:
                    this.k.a(i2);
                    return true;
                case 15:
                    this.c.a(i2);
                    return true;
                default:
                    return false;
            }
        } else {
            this.i.a(i2);
            return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 4) {
            this.a.e(0, i2, i3);
        } else if (i == 5) {
            Q(this.p, i2, i3, this.l);
        } else if (i == 10) {
            this.a.e(1, i2, i3);
        } else if (i != 11) {
        } else {
            this.a.e(2, i2, i3);
        }
    }

    public final int d() {
        return this.b.a;
    }

    public final boolean e() {
        return this.b.b;
    }

    public final int f() {
        return this.c.a;
    }

    public final boolean g() {
        return this.c.b;
    }

    public final int h() {
        return this.d.a;
    }

    public final int k() {
        return this.e.b;
    }

    public final int l(int i) {
        return this.e.b(i);
    }

    public final int m() {
        return this.g.a;
    }

    public final String n() {
        if (this.h == null) {
            this.h = this.a.b(0) ? new String(this.p, this.a.c(0), this.a.d(0), n) : "";
        }
        return this.h;
    }

    public final boolean o() {
        return this.a.b(0);
    }

    public final dmuf p() {
        if (this.m == null) {
            this.m = new dmuf();
        }
        if (!this.a.b(1)) {
            this.m.a();
            return this.m;
        }
        this.m.R(this.p, this.a.c(1), this.a.d(1));
        return this.m;
    }

    public final boolean q() {
        return this.a.b(1);
    }

    public final dmuf r() {
        if (this.s == null) {
            this.s = new dmuf();
        }
        if (!this.a.b(2)) {
            this.s.a();
            return this.s;
        }
        this.s.R(this.p, this.a.c(2), this.a.d(2));
        return this.s;
    }

    public final boolean s() {
        return this.a.b(2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (e()) {
            String hexString = Long.toHexString(d() & 4294967295L);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 15);
            sb2.append("color_argb: 0x");
            sb2.append(hexString);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (g()) {
            String hexString2 = Long.toHexString(f() & 4294967295L);
            StringBuilder sb3 = new StringBuilder(String.valueOf(hexString2).length() + 19);
            sb3.append("end_color_argb: 0x");
            sb3.append(hexString2);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (this.d.b) {
            int h = h();
            StringBuilder sb4 = new StringBuilder(19);
            sb4.append("width: ");
            sb4.append(h);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        for (int i = 0; i < k(); i++) {
            int l = l(i);
            StringBuilder sb5 = new StringBuilder(18);
            sb5.append("dash: ");
            sb5.append(l);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        dmvs dmvsVar = this.f;
        if (dmvsVar.b) {
            int i2 = dmvsVar.a;
            StringBuilder sb6 = new StringBuilder(25);
            sb6.append("bevel_width: ");
            sb6.append(i2);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        if (this.g.b) {
            int m = m();
            StringBuilder sb7 = new StringBuilder(31);
            sb7.append("orthogonal_offset: ");
            sb7.append(m);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        if (o()) {
            String n = n();
            StringBuilder sb8 = new StringBuilder(String.valueOf(n).length() + 22);
            sb8.append("stamp_texture_url: \"");
            sb8.append(n);
            sb8.append("\"\n");
            sb.append(sb8.toString());
        }
        dmvs dmvsVar2 = this.i;
        if (dmvsVar2.b) {
            int i3 = dmvsVar2.a;
            StringBuilder sb9 = new StringBuilder(44);
            sb9.append("stamp_texture_url_prefix_index: ");
            sb9.append(i3);
            sb9.append("\n");
            sb.append(sb9.toString());
        }
        dmvs dmvsVar3 = this.j;
        if (dmvsVar3.b) {
            int i4 = dmvsVar3.a;
            StringBuilder sb10 = new StringBuilder(37);
            sb10.append("stamp_spacing_eighth_dp: ");
            sb10.append(i4);
            sb10.append("\n");
            sb.append(sb10.toString());
        }
        dmvs dmvsVar4 = this.k;
        if (dmvsVar4.b) {
            int i5 = dmvsVar4.a;
            StringBuilder sb11 = new StringBuilder(36);
            sb11.append("stamp_offset_eighth_dp: ");
            sb11.append(i5);
            sb11.append("\n");
            sb.append(sb11.toString());
        }
        int i6 = 0;
        while (true) {
            dmvr dmvrVar = this.l;
            if (i6 >= dmvrVar.b) {
                break;
            }
            String hexString3 = Long.toHexString(dmvrVar.b(i6) & 4294967295L);
            StringBuilder sb12 = new StringBuilder(String.valueOf(hexString3).length() + 25);
            sb12.append("stamp_channel_colors: 0x");
            sb12.append(hexString3);
            sb12.append("\n");
            sb.append(sb12.toString());
            i6++;
        }
        if (q()) {
            String replace = p().toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb13 = new StringBuilder(String.valueOf(replace).length() + 22);
            sb13.append("start_cap_style {\n  ");
            sb13.append(replace);
            sb13.append("}\n");
            sb.append(sb13.toString());
        }
        if (s()) {
            String replace2 = r().toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb14 = new StringBuilder(String.valueOf(replace2).length() + 20);
            sb14.append("end_cap_style {\n  ");
            sb14.append(replace2);
            sb14.append("}\n");
            sb.append(sb14.toString());
        }
        dmvs dmvsVar5 = this.t;
        if (dmvsVar5.b) {
            float intBitsToFloat = Float.intBitsToFloat(dmvsVar5.a);
            StringBuilder sb15 = new StringBuilder(36);
            sb15.append("animation_duration: ");
            sb15.append(intBitsToFloat);
            sb15.append("\n");
            sb.append(sb15.toString());
        }
        return sb.toString();
    }
}

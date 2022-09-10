package defpackage;
/* compiled from: PG */
/* renamed from: dmtj  reason: default package */
/* loaded from: classes6.dex */
public final class dmtj extends dmvw {
    private final dmvm a = new dmvm(1);
    private dmuk b = null;
    private final dmvs c = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        dmuk dmukVar = this.b;
        if (dmukVar != null) {
            dmukVar.a();
        }
        this.c.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i != 2) {
            return false;
        }
        this.c.a(i2);
        return true;
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 1) {
            return;
        }
        this.a.e(0, i2, i3);
    }

    public final String toString() {
        dmuk dmukVar;
        StringBuilder sb = new StringBuilder();
        if (this.a.b(0)) {
            if (this.b == null) {
                this.b = new dmuk();
            }
            if (!this.a.b(0)) {
                this.b.a();
                dmukVar = this.b;
            } else {
                this.b.R(this.p, this.a.c(0), this.a.d(0));
                dmukVar = this.b;
            }
            String replace = dmukVar.toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 21);
            sb2.append("icon_animation {\n  ");
            sb2.append(replace);
            sb2.append("}\n");
            sb.append(sb2.toString());
        }
        dmvs dmvsVar = this.c;
        if (dmvsVar.b) {
            int i = dmvsVar.a;
            StringBuilder sb3 = new StringBuilder(21);
            sb3.append("version: ");
            sb3.append(i);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
}

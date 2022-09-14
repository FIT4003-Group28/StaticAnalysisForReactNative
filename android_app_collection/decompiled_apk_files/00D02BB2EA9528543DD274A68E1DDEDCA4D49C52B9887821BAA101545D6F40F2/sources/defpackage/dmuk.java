package defpackage;
/* compiled from: PG */
/* renamed from: dmuk  reason: default package */
/* loaded from: classes6.dex */
public final class dmuk extends dmvw {
    public final dmvq a = new dmvq();
    private dmul d = null;
    public final dmvq b = new dmvq();
    private dmul e = null;
    public final dmvq c = new dmvq();
    private dmul f = null;

    public dmuk() {
        new dmuh(this);
        new dmui(this);
        new dmuj(this);
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        dmul dmulVar = this.d;
        if (dmulVar != null) {
            dmulVar.a();
        }
        this.b.a();
        dmul dmulVar2 = this.e;
        if (dmulVar2 != null) {
            dmulVar2.a();
        }
        this.c.a();
        dmul dmulVar3 = this.f;
        if (dmulVar3 != null) {
            dmulVar3.a();
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            this.a.f(i2, i3);
        } else if (i == 2) {
            this.b.f(i2, i3);
        } else if (i != 3) {
        } else {
            this.c.f(i2, i3);
        }
    }

    public final dmul d(int i) {
        if (this.d == null) {
            this.d = new dmul();
        }
        this.d.R(this.p, this.a.c(i), this.a.d(i));
        return this.d;
    }

    public final dmul e(int i) {
        if (this.e == null) {
            this.e = new dmul();
        }
        this.e.R(this.p, this.b.c(i), this.b.d(i));
        return this.e;
    }

    public final dmul f(int i) {
        if (this.f == null) {
            this.f = new dmul();
        }
        this.f.R(this.p, this.c.c(i), this.c.d(i));
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.b; i++) {
            String replace = d(i).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 20);
            sb2.append("animations_in {\n  ");
            sb2.append(replace);
            sb2.append("}\n");
            sb.append(sb2.toString());
        }
        for (int i2 = 0; i2 < this.b.b; i2++) {
            String replace2 = e(i2).toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(replace2).length() + 21);
            sb3.append("animations_out {\n  ");
            sb3.append(replace2);
            sb3.append("}\n");
            sb.append(sb3.toString());
        }
        for (int i3 = 0; i3 < this.c.b; i3++) {
            String replace3 = f(i3).toString().replace("\n", "\n  ");
            if (replace3.endsWith("  ")) {
                replace3 = replace3.substring(0, replace3.length() - 2);
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(replace3).length() + 30);
            sb4.append("animations_steady_state {\n  ");
            sb4.append(replace3);
            sb4.append("}\n");
            sb.append(sb4.toString());
        }
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: eanf  reason: default package */
/* loaded from: classes6.dex */
public final class eanf extends eamy {
    protected final eanf c;
    protected int d;
    protected int e;
    protected String f;
    protected eanf g = null;

    public eanf(eanf eanfVar, int i, int i2, int i3) {
        this.a = i;
        this.c = eanfVar;
        this.d = i2;
        this.e = i3;
        this.b = -1;
    }

    protected final void f(int i, int i2, int i3) {
        this.a = i;
        this.b = -1;
        this.d = i2;
        this.e = i3;
        this.f = null;
    }

    public final eanf g(int i, int i2) {
        eanf eanfVar = this.g;
        if (eanfVar == null) {
            eanf eanfVar2 = new eanf(this, 1, i, i2);
            this.g = eanfVar2;
            return eanfVar2;
        }
        eanfVar.f(1, i, i2);
        return eanfVar;
    }

    public final eanf h(int i, int i2) {
        eanf eanfVar = this.g;
        if (eanfVar == null) {
            eanf eanfVar2 = new eanf(this, 2, i, i2);
            this.g = eanfVar2;
            return eanfVar2;
        }
        eanfVar.f(2, i, i2);
        return eanfVar;
    }

    public final eamt i(Object obj) {
        return new eamt(obj, -1L, this.d, this.e);
    }

    public final boolean j() {
        int i = this.b + 1;
        this.b = i;
        return this.a != 0 && i > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            if (this.f != null) {
                sb.append('\"');
                String str = this.f;
                int[] iArr = eaoe.g;
                int length = iArr.length;
                int length2 = str.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt >= 128 || iArr[charAt] == 0) {
                        sb.append(charAt);
                    } else {
                        sb.append('\\');
                        int i3 = iArr[charAt];
                        if (i3 < 0) {
                            sb.append('u');
                            sb.append('0');
                            sb.append('0');
                            int i4 = -(i3 + 1);
                            sb.append(eaoe.a[i4 >> 4]);
                            sb.append(eaoe.a[i4 & 15]);
                        } else {
                            sb.append((char) i3);
                        }
                    }
                }
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(e());
            sb.append(']');
        }
        return sb.toString();
    }
}

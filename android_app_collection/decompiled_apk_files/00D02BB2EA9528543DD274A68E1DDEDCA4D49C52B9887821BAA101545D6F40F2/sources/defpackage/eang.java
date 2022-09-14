package defpackage;
/* compiled from: PG */
/* renamed from: eang  reason: default package */
/* loaded from: classes6.dex */
public final class eang extends eamy {
    protected final eang c;
    protected String d;
    protected eang e = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public eang(int i, eang eangVar) {
        this.a = i;
        this.c = eangVar;
        this.b = -1;
    }

    private final void j(int i) {
        this.a = i;
        this.b = -1;
        this.d = null;
    }

    public final eang f() {
        eang eangVar = this.e;
        if (eangVar == null) {
            eang eangVar2 = new eang(1, this);
            this.e = eangVar2;
            return eangVar2;
        }
        eangVar.j(1);
        return eangVar;
    }

    public final eang g() {
        eang eangVar = this.e;
        if (eangVar == null) {
            eang eangVar2 = new eang(2, this);
            this.e = eangVar2;
            return eangVar2;
        }
        eangVar.j(2);
        return eangVar;
    }

    public final int h(String str) {
        if (this.a == 2 && this.d == null) {
            this.d = str;
            return this.b < 0 ? 0 : 1;
        }
        return 4;
    }

    public final int i() {
        int i = this.a;
        if (i == 2) {
            if (this.d == null) {
                return 5;
            }
            this.d = null;
            this.b++;
            return 2;
        } else if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            return i2 < 0 ? 0 : 1;
        } else {
            int i3 = this.b + 1;
            this.b = i3;
            return i3 == 0 ? 0 : 3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i == 2) {
            sb.append('{');
            if (this.d != null) {
                sb.append('\"');
                sb.append(this.d);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (i == 1) {
            sb.append('[');
            sb.append(e());
            sb.append(']');
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}

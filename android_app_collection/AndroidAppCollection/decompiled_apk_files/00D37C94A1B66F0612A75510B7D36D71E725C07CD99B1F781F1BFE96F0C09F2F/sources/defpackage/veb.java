package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: veb  reason: default package */
/* loaded from: classes4.dex */
public final class veb implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean c;
    public boolean e;
    public boolean g;
    public int a = 0;
    public long b = 0;
    public String d = "";
    public boolean f = false;
    public int h = 1;
    public final String i = "";
    private final String j = "";

    public final boolean equals(Object obj) {
        veb vebVar;
        if (!(obj instanceof veb) || (vebVar = (veb) obj) == null) {
            return false;
        }
        if (this == vebVar) {
            return true;
        }
        return this.a == vebVar.a && this.b == vebVar.b && this.d.equals(vebVar.d) && this.f == vebVar.f && this.h == vebVar.h && this.i.equals(vebVar.i) && this.j.equals(vebVar.j);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a + 2173) * 53) + Long.valueOf(this.b).hashCode()) * 53) + this.d.hashCode()) * 53) + (true != this.f ? 1237 : 1231)) * 53) + this.h) * 53) + this.i.hashCode()) * 53) + 5) * 53) + this.j.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.e && this.f) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.g) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.h);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.d);
        }
        return sb.toString();
    }
}

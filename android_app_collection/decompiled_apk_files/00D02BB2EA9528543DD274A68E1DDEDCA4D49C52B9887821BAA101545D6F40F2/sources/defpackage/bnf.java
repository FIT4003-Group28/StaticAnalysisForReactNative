package defpackage;
/* compiled from: PG */
/* renamed from: bnf  reason: default package */
/* loaded from: classes3.dex */
public final class bnf implements bms {
    public final bmk a;
    public final boolean b;
    private final String c;
    private final int d;

    public bnf(String str, int i, bmk bmkVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = bmkVar;
        this.b = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bky(bjrVar, bnlVar, this);
    }

    public final String toString() {
        String str = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("ShapePath{name=");
        sb.append(str);
        sb.append(", index=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}

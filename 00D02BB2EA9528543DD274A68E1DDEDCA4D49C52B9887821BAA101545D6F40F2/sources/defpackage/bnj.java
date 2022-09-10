package defpackage;
/* compiled from: PG */
/* renamed from: bnj  reason: default package */
/* loaded from: classes3.dex */
public final class bnj implements bms {
    public final bme a;
    public final bme b;
    public final bme c;
    public final boolean d;
    public final int e;

    public bnj(int i, bme bmeVar, bme bmeVar2, bme bmeVar3, boolean z) {
        this.e = i;
        this.a = bmeVar;
        this.b = bmeVar2;
        this.c = bmeVar3;
        this.d = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bla(bnlVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Trim Path: {start: ");
        sb.append(valueOf);
        sb.append(", end: ");
        sb.append(valueOf2);
        sb.append(", offset: ");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

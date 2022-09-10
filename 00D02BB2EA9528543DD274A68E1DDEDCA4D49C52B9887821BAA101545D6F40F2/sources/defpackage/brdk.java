package defpackage;
/* compiled from: PG */
/* renamed from: brdk  reason: default package */
/* loaded from: classes4.dex */
final class brdk implements brcz {
    final /* synthetic */ brdl a;
    private final int b;
    private final brde c;

    public brdk(brdl brdlVar, brde brdeVar, int i) {
        this.a = brdlVar;
        this.c = brdeVar;
        this.b = i;
    }

    @Override // defpackage.brcz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.brcz
    public final String b() {
        brde brdeVar = this.c;
        int i = this.b;
        String str = (String) brdeVar.a.get(i);
        if (str == null) {
            StringBuilder sb = new StringBuilder(21);
            sb.append("Connector ");
            sb.append(i);
            return sb.toString();
        }
        return str;
    }

    @Override // defpackage.brcz
    public final String c() {
        String str = (String) this.c.b.get(this.b);
        return str == null ? "" : str;
    }

    @Override // defpackage.brcz
    public final boolean d() {
        brdl brdlVar = this.a;
        return brdlVar.d.get(this.b);
    }
}

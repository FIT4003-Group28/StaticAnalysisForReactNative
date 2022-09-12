package defpackage;
/* compiled from: PG */
/* renamed from: azno  reason: default package */
/* loaded from: classes3.dex */
public final class azno {
    public long a;
    @dzsi
    public String b;
    public long c;
    @dzsi
    public Long d;
    @dzsi
    public Integer e;
    @dzsi
    public Integer f;
    @dzsi
    public Long g;
    @dzsi
    public String h;
    private final azxl i;
    private final String j;
    private final aznl k;
    private final byte[] l;

    public azno(azxl azxlVar, String str, byte[] bArr, aznl aznlVar) {
        dbsk.s(azxlVar);
        this.i = azxlVar;
        dbsk.s(str);
        this.j = str;
        this.l = (byte[]) dbsk.s(bArr);
        dbsk.s(aznlVar);
        this.k = aznlVar;
    }

    public final aznp a() {
        return new aznp(this.i, this.j, this.a, this.c, this.k, this.l, this.b, this.d, this.e, this.f, this.g, this.h);
    }
}

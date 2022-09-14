package defpackage;
/* compiled from: PG */
/* renamed from: jys  reason: default package */
/* loaded from: classes7.dex */
public final class jys implements jym {
    private final boolean a;
    private final String b;
    private final bvqg<Integer> c;
    private final int d;
    @dzsi
    private final ddho e;

    public jys(boolean z, String str, bvqg<Integer> bvqgVar, int i, @dzsi ddho ddhoVar) {
        this.a = z;
        dbsk.s(str);
        this.b = str;
        this.c = bvqgVar;
        this.d = i;
        this.e = ddhoVar;
    }

    @Override // defpackage.jym
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.jym
    public String b() {
        return this.b;
    }

    @Override // defpackage.jym
    public cqkl c() {
        this.c.NU(Integer.valueOf(this.d));
        return cqkl.a;
    }

    @Override // defpackage.jym
    @dzsi
    public cjtd d() {
        ddho ddhoVar = this.e;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }
}

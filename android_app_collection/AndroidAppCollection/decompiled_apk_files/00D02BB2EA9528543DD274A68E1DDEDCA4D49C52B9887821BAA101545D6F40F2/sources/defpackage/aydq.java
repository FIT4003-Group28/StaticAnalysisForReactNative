package defpackage;
/* compiled from: PG */
/* renamed from: aydq  reason: default package */
/* loaded from: classes3.dex */
public class aydq implements aydf {
    private final int b;
    private final int c;
    private final aydh d;
    private boolean e;
    private final caxd f;

    public aydq(caxe caxeVar, int i, int i2, int i3, aydt aydtVar) {
        this.f = caxeVar;
        this.b = i;
        this.c = i2;
        this.d = aydtVar;
        this.e = i == i3;
    }

    @Override // defpackage.aydf
    public int a() {
        return this.c;
    }

    @Override // defpackage.aydf
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.aydf
    public void c(boolean z) {
        this.e = z;
    }

    @Override // defpackage.aydf
    public Integer d() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.aydf
    public cqkl e(cjqm cjqmVar) {
        this.d.i(cjqmVar, this.b);
        return cqkl.a;
    }

    @Override // defpackage.caxc
    public caxd f() {
        return this.f;
    }
}

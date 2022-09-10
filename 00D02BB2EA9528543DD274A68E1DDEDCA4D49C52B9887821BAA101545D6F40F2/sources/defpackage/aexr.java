package defpackage;
/* compiled from: PG */
/* renamed from: aexr  reason: default package */
/* loaded from: classes2.dex */
public class aexr implements aexo {
    final /* synthetic */ aexs a;
    private final boolean b;
    private final boolean c;
    private final Integer d;
    private final cjtd e;
    private final cqtd f;
    private final int g;

    public aexr(aexs aexsVar, boolean z, boolean z2, cqtd cqtdVar, int i, Integer num, cjtd cjtdVar) {
        this.a = aexsVar;
        this.b = z;
        this.c = z2;
        this.e = cjtdVar;
        this.g = i;
        this.f = cqtdVar;
        this.d = num;
    }

    @Override // defpackage.aexo
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.aexo
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aexo
    public cqkl c() {
        int i = this.g - 1;
        if (i != 1) {
            if (i == 2) {
                return this.a.x();
            }
            if (i != 3) {
                return this.a.w();
            }
            return this.a.v();
        }
        return this.a.u();
    }

    @Override // defpackage.aexo
    public cjtd d() {
        return this.e;
    }

    @Override // defpackage.aexo
    public cqtd e() {
        return this.f;
    }

    @Override // defpackage.aexo
    public Integer f() {
        return this.d;
    }

    @Override // defpackage.aexo
    public cqss g(boolean z) {
        return aexs.y(z, this.b);
    }
}

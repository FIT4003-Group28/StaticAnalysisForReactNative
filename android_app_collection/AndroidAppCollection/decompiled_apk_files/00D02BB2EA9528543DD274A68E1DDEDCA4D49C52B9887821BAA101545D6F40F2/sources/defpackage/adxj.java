package defpackage;
/* compiled from: PG */
/* renamed from: adxj  reason: default package */
/* loaded from: classes2.dex */
class adxj implements advm {
    final /* synthetic */ adxk a;
    private final dipk b;
    private final CharSequence c;
    private final CharSequence d;
    private final ilo e;
    private final cjtd f;

    public adxj(adxk adxkVar, dipk dipkVar, ilo iloVar, cjtd cjtdVar) {
        this.a = adxkVar;
        this.b = dipkVar;
        dipf dipfVar = dipkVar.h;
        this.c = dbrz.f(' ').g(dcbg.b((dipfVar == null ? dipf.b : dipfVar).a).s(adxi.a));
        this.e = iloVar;
        this.f = cjtdVar;
        this.d = dipkVar.g;
    }

    @Override // defpackage.advm
    @dzsi
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.advm
    @dzsi
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.advm
    @dzsi
    public advl c() {
        return null;
    }

    @Override // defpackage.advm
    public String d() {
        return this.b.j;
    }

    @Override // defpackage.advm
    public cqkl e() {
        this.a.a.a().a(this.e, jjn.EXPANDED, bege.UPDATES);
        return cqkl.a;
    }

    @Override // defpackage.advm
    public cjtd f() {
        return this.f;
    }
}

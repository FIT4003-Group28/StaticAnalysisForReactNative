package defpackage;
/* compiled from: PG */
/* renamed from: slt  reason: default package */
/* loaded from: classes4.dex */
public final class slt {
    public ampq a;
    public ampq b;
    public ampq c;
    public ampq d;
    private ampq e;
    private ampq f;
    private Integer g;
    private ampq h;

    public slt(slu sluVar) {
        this.a = amon.a;
        this.b = amon.a;
        this.c = amon.a;
        this.e = amon.a;
        this.f = amon.a;
        this.h = amon.a;
        this.d = amon.a;
        this.a = sluVar.a;
        this.b = sluVar.b;
        this.c = sluVar.c;
        this.e = sluVar.d;
        this.f = sluVar.e;
        this.g = Integer.valueOf(sluVar.f);
        this.h = sluVar.g;
        this.d = sluVar.h;
    }

    public slt(byte[] bArr) {
        this.a = amon.a;
        this.b = amon.a;
        this.c = amon.a;
        this.e = amon.a;
        this.f = amon.a;
        this.h = amon.a;
        this.d = amon.a;
    }

    public final slu a() {
        Integer num = this.g;
        if (num == null) {
            throw new IllegalStateException("Missing required properties: inputModality");
        }
        return new slu(this.a, this.b, this.c, this.e, this.f, num.intValue(), this.h, this.d);
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public slt() {
    }
}

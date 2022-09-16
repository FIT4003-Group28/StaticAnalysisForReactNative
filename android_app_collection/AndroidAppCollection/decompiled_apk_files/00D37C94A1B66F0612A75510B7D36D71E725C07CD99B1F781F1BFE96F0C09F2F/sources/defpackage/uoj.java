package defpackage;
/* compiled from: PG */
/* renamed from: uoj  reason: default package */
/* loaded from: classes4.dex */
public final class uoj {
    public ampq a;
    public ampq b;
    public Boolean c;
    private ampq d;
    private ampq e;
    private ampq f;
    private ampq g;

    public uoj(uok uokVar) {
        this.d = amon.a;
        this.e = amon.a;
        this.f = amon.a;
        this.a = amon.a;
        this.b = amon.a;
        this.g = amon.a;
        this.d = uokVar.a;
        this.e = uokVar.b;
        this.f = uokVar.c;
        this.a = uokVar.d;
        this.b = uokVar.e;
        this.g = uokVar.f;
        this.c = Boolean.valueOf(uokVar.g);
    }

    public uoj(byte[] bArr) {
        this.d = amon.a;
        this.e = amon.a;
        this.f = amon.a;
        this.a = amon.a;
        this.b = amon.a;
        this.g = amon.a;
    }

    public final uok a() {
        Boolean bool = this.c;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: supportAccountSwitching");
        }
        return new uok(this.d, this.e, this.f, this.a, this.b, this.g, bool.booleanValue());
    }

    public final void b(uog uogVar) {
        this.g = ampq.j(uogVar);
    }

    public uoj() {
    }
}

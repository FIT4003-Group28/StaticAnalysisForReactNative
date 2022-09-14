package defpackage;
/* compiled from: PG */
/* renamed from: aymz  reason: default package */
/* loaded from: classes3.dex */
public class aymz implements aymr {
    private final cqtd a;
    private final cqsn b;
    private final cqsn c;
    private final Boolean d;

    public aymz(int i, int i2, int i3, Boolean bool) {
        this.a = cqrt.f(i);
        this.b = cqrt.l(i2);
        this.c = cqrt.l(i3);
        this.d = bool;
    }

    @Override // defpackage.aymr
    public cqtd d() {
        return this.a;
    }

    @Override // defpackage.aymr
    public cqsn e() {
        return this.b;
    }

    @Override // defpackage.aymr
    public cqsn f() {
        return this.c;
    }

    @Override // defpackage.aymr
    public Boolean g() {
        return this.d;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bdbk  reason: default package */
/* loaded from: classes3.dex */
public class bdbk implements bczy {
    final boolean a;
    private final String b;

    public bdbk(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // defpackage.bczy
    public String b() {
        return this.b;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcvd(this.a), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.b;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bfkw  reason: default package */
/* loaded from: classes3.dex */
public class bfkw implements bfko {
    @dzsi
    private final bfkn a;
    @dzsi
    private final jbr b;
    private final boolean c;

    private bfkw(@dzsi bfkn bfknVar, @dzsi jbr jbrVar, boolean z) {
        this.a = bfknVar;
        this.b = jbrVar;
        this.c = z;
    }

    public bfkw(@dzsi jbr jbrVar, boolean z) {
        this(null, jbrVar, z);
    }

    @Override // defpackage.bfko
    @dzsi
    public jbt a() {
        return this.a;
    }

    @Override // defpackage.bfko
    @dzsi
    public jbt b() {
        return this.b;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bfij(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.b;
    }

    public bfkw(@dzsi bfkn bfknVar) {
        this(bfknVar, null, false);
    }

    @Override // defpackage.bfko
    public cqtd c() {
        if (this.a != null || this.c) {
            return ire.q();
        }
        return ibm.b();
    }
}

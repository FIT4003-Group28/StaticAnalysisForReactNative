package defpackage;
/* compiled from: PG */
/* renamed from: bdcr  reason: default package */
/* loaded from: classes3.dex */
public class bdcr implements bdam {
    private final bdar a;
    private final bdcl b;
    @dzsi
    private final jbt c;

    public bdcr(bdar bdarVar, bdcl bdclVar, @dzsi jbt jbtVar) {
        this.a = bdarVar;
        this.b = bdclVar;
        this.c = jbtVar;
    }

    @Override // defpackage.bdam
    public bdar a() {
        return this.a;
    }

    @Override // defpackage.bdam
    @dzsi
    public jbt b() {
        return this.c;
    }

    @Override // defpackage.bdam
    public bdaj c() {
        return this.b;
    }

    @Override // defpackage.bdam
    public cqkl d() {
        this.b.g();
        return cqkl.a;
    }
}

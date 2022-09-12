package defpackage;
/* compiled from: PG */
/* renamed from: cjsv  reason: default package */
/* loaded from: classes.dex */
public final class cjsv implements cjtg {
    private final ddho b;
    @dzsi
    private Integer c;

    public cjsv(ddho ddhoVar) {
        this.b = ddhoVar;
    }

    @Override // defpackage.cjtg
    public final ddho a() {
        return this.b;
    }

    @Override // defpackage.cjtg
    public final synchronized void b(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cjtg
    @dzsi
    public final synchronized Integer c() {
        return this.c;
    }

    @Override // defpackage.cjtg
    public final boolean d() {
        return cjtf.a(this);
    }
}

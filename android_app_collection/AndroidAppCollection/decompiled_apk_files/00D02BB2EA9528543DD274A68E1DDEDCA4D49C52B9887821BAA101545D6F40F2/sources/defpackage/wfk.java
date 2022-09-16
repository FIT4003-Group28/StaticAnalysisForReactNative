package defpackage;
/* compiled from: PG */
/* renamed from: wfk  reason: default package */
/* loaded from: classes7.dex */
public final class wfk implements wdw {
    private final wgd a;
    private final btvo b;

    public wfk(wgd wgdVar, btvo btvoVar) {
        this.a = wgdVar;
        this.b = btvoVar;
    }

    @Override // defpackage.wdw
    public final boolean a() {
        return this.a.a() && this.b.getPassiveAssistParameters().l();
    }

    @Override // defpackage.wdw
    public final boolean b() {
        a();
        return false;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bryg  reason: default package */
/* loaded from: classes4.dex */
public abstract class bryg implements bryd {
    protected boolean a = true;

    public bryg(cqhn cqhnVar) {
    }

    @Override // defpackage.bryd
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bryd
    public cqkl b() {
        this.a = false;
        cqkx.p(this);
        return cqkl.a;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ucr  reason: default package */
/* loaded from: classes7.dex */
public class ucr implements ubu {
    private final tjg a;
    private final ucm b;

    public ucr(cqhn cqhnVar, tjg tjgVar, ucm ucmVar) {
        this.a = tjgVar;
        this.b = ucmVar;
    }

    @Override // defpackage.ubu
    public tjg a() {
        return this.a;
    }

    @Override // defpackage.ubu
    public ubt b() {
        return this.b;
    }

    public void c(boolean z) {
        this.b.m(z);
        cqkx.p(this);
    }
}

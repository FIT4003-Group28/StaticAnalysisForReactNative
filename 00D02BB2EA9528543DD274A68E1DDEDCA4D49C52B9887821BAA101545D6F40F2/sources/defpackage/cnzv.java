package defpackage;
/* compiled from: PG */
/* renamed from: cnzv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnzv<T> extends cnzy {
    public final cnzt<T> b = new cnzt<>();
    public final /* synthetic */ cnzw c;

    public cnzv(cnzw cnzwVar) {
        this.c = cnzwVar;
    }

    public abstract T a(String str);

    public abstract T b(cnzr cnzrVar);

    @Override // defpackage.cnzy
    protected final void c(cnzr cnzrVar) {
        this.b.a(b(cnzrVar));
    }
}

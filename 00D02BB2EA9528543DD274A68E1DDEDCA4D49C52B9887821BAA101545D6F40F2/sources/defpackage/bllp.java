package defpackage;
/* compiled from: PG */
/* renamed from: bllp  reason: default package */
/* loaded from: classes3.dex */
public final class bllp<T> extends btrh<T> {
    private final int d;

    public bllp(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                bllm bllmVar = (bllm) this.a;
                blpj blpjVar = (blpj) obj;
                return;
            }
            bllm bllmVar2 = (bllm) this.a;
            bllmVar2.a.s(((ccih) obj).b(), true);
            cqkx.p(bllmVar2.a);
            return;
        }
        bllm bllmVar3 = (bllm) this.a;
        bqje bqjeVar = (bqje) obj;
        ilo c = bllmVar3.a.d.c();
        ilo c2 = bqjeVar.a.c();
        if (c == null || c2 == null || !c.ai().equals(c2.ai()) || bqjeVar.c != 5) {
            return;
        }
        bllmVar3.a.r(bqjeVar.a);
        cqkx.p(bllmVar3.a);
    }
}

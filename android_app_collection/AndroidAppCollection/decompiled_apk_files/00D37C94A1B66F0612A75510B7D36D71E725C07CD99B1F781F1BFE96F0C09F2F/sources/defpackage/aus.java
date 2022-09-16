package defpackage;
/* compiled from: PG */
/* renamed from: aus  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aus implements pwe {
    public final /* synthetic */ auz a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ aus(auz auzVar, boolean z) {
        this.a = auzVar;
        this.b = z;
    }

    public /* synthetic */ aus(auz auzVar, boolean z, int i) {
        this.c = i;
        this.a = auzVar;
        this.b = z;
    }

    @Override // defpackage.pwe
    public final void a(Object obj) {
        if (this.c == 0) {
            ((ava) obj).s(this.a, this.b);
            return;
        }
        ava avaVar = (ava) obj;
        avaVar.k(this.a, this.b);
        avaVar.P();
    }
}

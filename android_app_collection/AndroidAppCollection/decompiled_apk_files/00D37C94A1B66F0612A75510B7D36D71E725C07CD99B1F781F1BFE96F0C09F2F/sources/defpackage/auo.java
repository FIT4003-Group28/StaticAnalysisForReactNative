package defpackage;
/* compiled from: PG */
/* renamed from: auo  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class auo implements pwe {
    public final /* synthetic */ auz a;
    public final /* synthetic */ Exception b;
    private final /* synthetic */ int c;

    public /* synthetic */ auo(auz auzVar, Exception exc) {
        this.a = auzVar;
        this.b = exc;
    }

    public /* synthetic */ auo(auz auzVar, Exception exc, int i) {
        this.c = i;
        this.a = auzVar;
        this.b = exc;
    }

    @Override // defpackage.pwe
    public final void a(Object obj) {
        if (this.c == 0) {
            ((ava) obj).u(this.a, this.b);
            return;
        }
        ((ava) obj).h(this.a, this.b);
    }
}

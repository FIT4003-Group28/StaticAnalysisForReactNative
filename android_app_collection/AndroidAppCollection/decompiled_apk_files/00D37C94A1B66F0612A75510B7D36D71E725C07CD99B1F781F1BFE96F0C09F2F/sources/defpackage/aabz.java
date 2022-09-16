package defpackage;
/* compiled from: PG */
/* renamed from: aabz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aabz implements ayqb {
    public final /* synthetic */ aaca a;
    private final /* synthetic */ int b;

    public /* synthetic */ aabz(aaca aacaVar, int i) {
        this.b = i;
        this.a = aacaVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = 1;
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            this.a.a.a = 1;
            return;
        }
        aacb aacbVar = this.a.a;
        if (true == ((Boolean) obj).booleanValue()) {
            i = 2;
        }
        aacbVar.a = i;
    }
}

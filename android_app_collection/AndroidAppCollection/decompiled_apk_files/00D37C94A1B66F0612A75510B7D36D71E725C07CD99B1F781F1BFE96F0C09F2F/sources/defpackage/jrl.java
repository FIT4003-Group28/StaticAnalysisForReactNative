package defpackage;
/* compiled from: PG */
/* renamed from: jrl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jrl implements ayqb {
    public final /* synthetic */ jro a;
    private final /* synthetic */ int b;

    public /* synthetic */ jrl(jro jroVar, int i) {
        this.b = i;
        this.a = jroVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            jro jroVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                return;
            }
            jroVar.b();
            return;
        }
        jro jroVar2 = this.a;
        if (!((Boolean) obj).booleanValue()) {
            return;
        }
        jroVar2.b();
    }
}

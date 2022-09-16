package defpackage;
/* compiled from: PG */
/* renamed from: elc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class elc implements akbi {
    public final /* synthetic */ elf a;
    private final /* synthetic */ int b;

    public /* synthetic */ elc(elf elfVar, int i) {
        this.b = i;
        this.a = elfVar;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (this.b == 0) {
            this.a.g();
            return;
        }
        elf elfVar = this.a;
        elfVar.a.f();
        elfVar.g();
    }
}

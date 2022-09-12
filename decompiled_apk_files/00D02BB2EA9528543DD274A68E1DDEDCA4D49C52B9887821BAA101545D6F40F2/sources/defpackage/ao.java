package defpackage;

import defpackage.an;
/* compiled from: PG */
/* renamed from: ao  reason: default package */
/* loaded from: classes2.dex */
public final class ao<VM extends an> implements dzss<VM> {
    private VM a;
    private final dzwn<VM> b;
    private final dzut<aw> c;
    private final dzut<aq> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ao(dzwn<VM> dzwnVar, dzut<? extends aw> dzutVar, dzut<? extends aq> dzutVar2) {
        this.b = dzwnVar;
        this.c = dzutVar;
        this.d = dzutVar2;
    }

    @Override // defpackage.dzss
    public final /* bridge */ /* synthetic */ Object a() {
        VM vm = this.a;
        if (vm == null) {
            VM vm2 = (VM) new au(this.c.a(), this.d.a()).a(((dzvt) this.b).a);
            this.a = vm2;
            dzvx.b(vm2, "ViewModelProvider(store,…ed = it\n                }");
            return vm2;
        }
        return vm;
    }
}

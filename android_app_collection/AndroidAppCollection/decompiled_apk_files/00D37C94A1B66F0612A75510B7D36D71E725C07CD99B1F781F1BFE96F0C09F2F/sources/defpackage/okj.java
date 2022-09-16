package defpackage;

import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: okj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class okj implements Consumer {
    public final /* synthetic */ okq a;
    private final /* synthetic */ int b;

    public /* synthetic */ okj(okq okqVar) {
        this.a = okqVar;
    }

    public /* synthetic */ okj(okq okqVar, int i) {
        this.b = i;
        this.a = okqVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            okq okqVar = this.a;
            okqVar.a.c((apzg) obj, okqVar.o);
        } else if (i == 1) {
            okq okqVar2 = this.a;
            ftg ftgVar = ftg.ACTIVITY_DEFAULT;
            int ordinal = ((ftg) obj).ordinal();
            int i2 = 2132083275;
            if (ordinal != 0 && ordinal == 1) {
                i2 = 2132083274;
            }
            okqVar2.q.h(i2);
        } else if (i == 2) {
            okq okqVar3 = this.a;
            okqVar3.a.c((apzg) obj, okqVar3.o);
        } else if (i == 3) {
            this.a.b.A(((Integer) obj).intValue(), 0);
        } else {
            this.a.w(((Integer) obj).intValue());
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2 && i == 3) {
            return consumer.getClass();
        }
        return consumer.getClass();
    }
}

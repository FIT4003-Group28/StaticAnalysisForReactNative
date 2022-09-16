package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iyd  reason: default package */
/* loaded from: classes3.dex */
public final class iyd implements akev {
    private final /* synthetic */ int a;

    public iyd() {
    }

    public iyd(int i) {
        this.a = i;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            akff akffVar = (akff) obj;
            Optional.empty();
        } else if (i2 == 1) {
            akff akffVar2 = (akff) obj;
        } else {
            akfq akfqVar = (akfq) obj;
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        int i = this.a;
        if (i == 0) {
            Optional.of((akff) obj);
        } else if (i == 1) {
            akff akffVar = (akff) obj;
        } else {
            akfq akfqVar = (akfq) obj;
        }
    }
}

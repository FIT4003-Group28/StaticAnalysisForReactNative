package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amts  reason: default package */
/* loaded from: classes2.dex */
public final class amts {
    public final List<amuo> a;
    public int b = 0;
    @dzsi
    public dpec c = null;

    private amts(List<amuo> list) {
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amts d() {
        return new amts(dchl.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amuo a() {
        return (amuo) dcft.s(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amuo[] b() {
        return (amuo[]) this.a.toArray(new amuo[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = 0;
    }
}

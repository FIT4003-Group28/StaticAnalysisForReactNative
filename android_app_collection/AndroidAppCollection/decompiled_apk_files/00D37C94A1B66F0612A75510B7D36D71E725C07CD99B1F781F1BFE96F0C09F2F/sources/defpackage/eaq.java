package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: eaq  reason: default package */
/* loaded from: classes3.dex */
public final class eaq implements amgv, amjp, axom {
    private final dyo a;
    private final eaq b;

    public eaq() {
    }

    public eaq(dyo dyoVar) {
        this.b = this;
        this.a = dyoVar;
    }

    @Override // defpackage.amjp
    public final Set a() {
        return amyg.a;
    }

    @Override // defpackage.amgv
    public final dwn b() {
        return new dwn(this.a, this.b);
    }
}

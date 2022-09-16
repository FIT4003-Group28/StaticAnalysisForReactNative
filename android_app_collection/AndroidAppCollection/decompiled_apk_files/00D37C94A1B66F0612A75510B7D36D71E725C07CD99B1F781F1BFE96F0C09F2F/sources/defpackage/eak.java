package defpackage;
/* compiled from: PG */
/* renamed from: eak  reason: default package */
/* loaded from: classes3.dex */
public final class eak implements amgz, axom {
    private final dyo a;
    private final eaq b;
    private final eak c;

    public eak() {
    }

    public eak(dyo dyoVar, eaq eaqVar) {
        this.c = this;
        this.a = dyoVar;
        this.b = eaqVar;
    }

    @Override // defpackage.amgz
    public final dwl a() {
        return new dwl(this.a, this.b, this.c);
    }
}

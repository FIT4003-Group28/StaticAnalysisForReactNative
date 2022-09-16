package defpackage;
/* compiled from: PG */
/* renamed from: ahrq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahrq implements azqb {
    public final /* synthetic */ ahrs a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahrq(ahrs ahrsVar, int i) {
        this.b = i;
        this.a = ahrsVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        return i != 0 ? i != 1 ? this.a.c : this.a.b : this.a.f;
    }
}

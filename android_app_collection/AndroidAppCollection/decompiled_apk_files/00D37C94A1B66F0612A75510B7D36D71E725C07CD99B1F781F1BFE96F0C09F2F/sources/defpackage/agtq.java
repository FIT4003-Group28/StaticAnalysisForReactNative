package defpackage;
/* compiled from: PG */
/* renamed from: agtq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agtq implements ampg {
    public final /* synthetic */ agtr a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ agtq(agtr agtrVar, boolean z) {
        this.a = agtrVar;
        this.b = z;
    }

    public /* synthetic */ agtq(agtr agtrVar, boolean z, int i) {
        this.c = i;
        this.a = agtrVar;
        this.b = z;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.c == 0) {
            return this.a.e((aimb) obj, this.b);
        }
        return this.a.e((aimb) obj, this.b);
    }
}

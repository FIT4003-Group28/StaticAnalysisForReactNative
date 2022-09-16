package defpackage;
/* compiled from: PG */
/* renamed from: afgr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afgr implements ampt {
    public final /* synthetic */ afes a;
    private final /* synthetic */ int b;

    public /* synthetic */ afgr(afes afesVar, int i) {
        this.b = i;
        this.a = afesVar;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        if (this.b != 0) {
            return ((afes) obj).b() != this.a.b();
        }
        return ((afes) obj).a() < this.a.a();
    }
}

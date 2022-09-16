package defpackage;
/* compiled from: PG */
/* renamed from: aekl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aekl implements anir {
    public final /* synthetic */ aela a;
    private final /* synthetic */ int b;

    public /* synthetic */ aekl(aela aelaVar) {
        this.a = aelaVar;
    }

    public /* synthetic */ aekl(aela aelaVar, int i) {
        this.b = i;
        this.a = aelaVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            return this.a.b((arzc) obj);
        }
        return this.a.a((aekp) obj);
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: emv  reason: default package */
/* loaded from: classes6.dex */
public final class emv<T> implements dzsj<T> {
    final /* synthetic */ emw a;
    private final int b;

    public emv(emw emwVar, int i) {
        this.a = emwVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, aeso] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? (T) new aesg(this.a.b()) : (T) new aetl(this.a.b());
            }
            emw emwVar = this.a;
            T t = (T) emwVar.a;
            if (t != null) {
                return t;
            }
            ?? r1 = (T) new aeso(dxjc.c(emwVar.b.eW.at()));
            emwVar.a = r1;
            return r1;
        }
        return (T) new aeto(this.a.b());
    }
}

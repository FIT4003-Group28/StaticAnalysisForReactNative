package defpackage;
/* compiled from: PG */
/* renamed from: anoe  reason: default package */
/* loaded from: classes2.dex */
public class anoe implements anod {
    private final dcdc<annz> a;
    private final boolean b;

    public anoe(anry anryVar) {
        dccx F = dcdc.F();
        dcdc<dvay> G = anryVar.G();
        int size = G.size();
        for (int i = 0; i < size; i++) {
            F.g(new anoa(anryVar.ab(G.get(i))));
        }
        this.a = F.f();
        this.b = anryVar.ac();
    }

    @Override // defpackage.anod
    public dcdc<annz> a() {
        return this.a;
    }

    @Override // defpackage.anod
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }
}

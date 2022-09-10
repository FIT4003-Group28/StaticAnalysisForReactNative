package defpackage;
/* compiled from: PG */
/* renamed from: batn  reason: default package */
/* loaded from: classes.dex */
public class batn {
    public final btvo a;
    public final ania b;
    public final bvjj c;
    private final cqat d;

    public batn(cqat cqatVar, btvo btvoVar, ania aniaVar, bvjj bvjjVar) {
        this.d = cqatVar;
        this.a = btvoVar;
        this.b = aniaVar;
        this.c = bvjjVar;
    }

    public final boolean a(drki drkiVar) {
        eapg eapgVar = new eapg(this.d.b());
        dpoj dpojVar = drkiVar.e;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        if (!batk.p(dpojVar).B(eapgVar)) {
            dpoj dpojVar2 = drkiVar.f;
            if (dpojVar2 == null) {
                dpojVar2 = dpoj.e;
            }
            return !batk.p(dpojVar2).C(eapgVar);
        }
        return false;
    }
}

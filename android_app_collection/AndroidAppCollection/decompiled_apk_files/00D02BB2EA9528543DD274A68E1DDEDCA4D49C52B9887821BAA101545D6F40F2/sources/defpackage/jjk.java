package defpackage;
/* compiled from: PG */
/* renamed from: jjk  reason: default package */
/* loaded from: classes7.dex */
public final class jjk implements jkh {
    private final dcdc<jkh> a;

    public jjk(dcdc<jkh> dcdcVar) {
        this.a = dcdcVar;
    }

    public static jjk a(jkh... jkhVarArr) {
        return new jjk(dcdc.t(jkhVarArr));
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        dcdc<jkh> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).L(jkjVar, jjnVar, jjnVar2, jkgVar);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        dcdc<jkh> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).M(jkjVar, jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        dcdc<jkh> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).N(jkjVar, jjnVar);
        }
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        dcdc<jkh> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).P(jkjVar, jjnVar, f);
        }
    }
}

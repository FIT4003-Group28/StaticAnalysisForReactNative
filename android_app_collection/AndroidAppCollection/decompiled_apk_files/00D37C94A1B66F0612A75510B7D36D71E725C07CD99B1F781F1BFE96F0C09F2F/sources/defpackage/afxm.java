package defpackage;
/* compiled from: PG */
/* renamed from: afxm  reason: default package */
/* loaded from: classes.dex */
public final class afxm implements afxt {
    private final ort a;

    public afxm(ort ortVar) {
        this.a = ortVar;
    }

    @Override // defpackage.afxt
    public final boolean a(aswe asweVar) {
        for (Integer num : this.a.g) {
            if (num.intValue() == asweVar.g) {
                return true;
            }
        }
        return false;
    }
}

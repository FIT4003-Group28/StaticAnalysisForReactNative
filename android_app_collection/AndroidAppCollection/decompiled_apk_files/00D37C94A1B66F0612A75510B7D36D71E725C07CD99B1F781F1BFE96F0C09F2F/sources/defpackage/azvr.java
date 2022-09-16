package defpackage;
/* compiled from: PG */
/* renamed from: azvr  reason: default package */
/* loaded from: classes2.dex */
public final class azvr extends azvw implements azvo {
    private final boolean a;

    public azvr() {
        u(null);
        azuf t = t();
        azug azugVar = t instanceof azug ? (azug) t : null;
        boolean z = false;
        if (azugVar != null) {
            azvw e = azugVar.e();
            while (true) {
                if (e.ss()) {
                    z = true;
                    break;
                }
                azuf t2 = e.t();
                azug azugVar2 = t2 instanceof azug ? (azug) t2 : null;
                if (azugVar2 == null) {
                    break;
                }
                e = azugVar2.e();
            }
        }
        this.a = z;
    }

    @Override // defpackage.azvw
    public final boolean n() {
        return true;
    }

    @Override // defpackage.azvw
    public final boolean ss() {
        return this.a;
    }
}

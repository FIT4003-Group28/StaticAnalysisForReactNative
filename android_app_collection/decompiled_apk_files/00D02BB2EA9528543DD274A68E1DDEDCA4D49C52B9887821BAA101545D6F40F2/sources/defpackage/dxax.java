package defpackage;
/* compiled from: PG */
/* renamed from: dxax  reason: default package */
/* loaded from: classes6.dex */
final class dxax implements dsrd {
    static final dsrd a = new dxax();

    private dxax() {
    }

    @Override // defpackage.dsrd
    public final boolean a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            case 2:
            case 5:
            default:
                return false;
        }
    }
}

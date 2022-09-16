package defpackage;
/* compiled from: PG */
/* renamed from: dxbd  reason: default package */
/* loaded from: classes6.dex */
public final class dxbd implements dsrd {
    public static final dsrd a = new dxbd();

    private dxbd() {
    }

    @Override // defpackage.dsrd
    public final boolean a(int i) {
        if (i == 0 || i == 2 || i == 45 || i == 50 || i == 73 || i == 78 || i == 58 || i == 59) {
            return true;
        }
        switch (i) {
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return true;
            default:
                return false;
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dplb  reason: default package */
/* loaded from: classes6.dex */
public final class dplb implements dsrd {
    public static final dsrd a = new dplb();

    private dplb() {
    }

    @Override // defpackage.dsrd
    public final boolean a(int i) {
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return true;
            case 5:
            default:
                return false;
        }
    }
}

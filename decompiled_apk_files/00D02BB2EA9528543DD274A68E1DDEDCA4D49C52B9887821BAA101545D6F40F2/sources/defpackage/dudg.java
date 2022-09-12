package defpackage;
/* compiled from: PG */
/* renamed from: dudg  reason: default package */
/* loaded from: classes6.dex */
public final class dudg implements dsrd {
    public static final dsrd a = new dudg();

    private dudg() {
    }

    @Override // defpackage.dsrd
    public final boolean a(int i) {
        if (i != 100) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    return true;
                default:
                    switch (i) {
                        case 200:
                        case 201:
                        case 202:
                        case 203:
                            return true;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }
}

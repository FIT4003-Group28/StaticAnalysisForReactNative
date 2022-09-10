package defpackage;

import android.content.Context;
/* renamed from: akjn  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akjn implements cqjb {
    static final cqjb a = new akjn();

    private akjn() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        dqis h = ((aklh) cqkpVar).h();
        if (h == null) {
            h = dqis.UNKNOWN_ANCHOR;
        }
        switch (h.ordinal()) {
            case 1:
                i = 51;
                break;
            case 2:
                i = 53;
                break;
            case 3:
                i = 83;
                break;
            case 4:
                i = 85;
                break;
            case 5:
                i = 17;
                break;
            case 6:
            default:
                i = 49;
                break;
            case 7:
                i = 81;
                break;
            case 8:
                i = 19;
                break;
            case 9:
                i = 21;
                break;
        }
        return Integer.valueOf(i);
    }
}

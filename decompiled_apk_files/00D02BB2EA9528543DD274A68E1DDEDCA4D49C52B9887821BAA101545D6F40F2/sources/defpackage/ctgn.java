package defpackage;

import android.util.Pair;
/* renamed from: ctgn  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctgn implements dbrn {
    static final dbrn a = new ctgn();

    private ctgn() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        int i = ctim.h;
        if (pair == null) {
            return dcdc.e();
        }
        return (dcdc) pair.first;
    }
}

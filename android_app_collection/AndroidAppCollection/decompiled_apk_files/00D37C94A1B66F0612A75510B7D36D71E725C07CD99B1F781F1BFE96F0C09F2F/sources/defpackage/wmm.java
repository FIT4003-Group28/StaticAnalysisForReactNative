package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: wmm  reason: default package */
/* loaded from: classes4.dex */
public final class wmm extends ajbg {
    final /* synthetic */ wlj a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmm(long j, long j2, int i, wlj wljVar, String str) {
        super(j, j2, 2, i, null);
        this.a = wljVar;
        this.b = str;
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        wvg wvgVar = (wvg) this.a;
        xeh a = wvgVar.c.a(this.b);
        if (a == null) {
            return;
        }
        if (a.c.c() == apcd.SLOT_TYPE_PLAYER_BYTES && a.a == 8) {
            if (z || z3) {
                return;
            }
            if ((a.b instanceof xce) && !wvgVar.e.contains(a.c.a)) {
                return;
            }
            ((yni) wvgVar.b.get()).f(new aiki());
        }
        ((wvr) wvgVar.a.get()).q(Arrays.asList(a));
    }
}

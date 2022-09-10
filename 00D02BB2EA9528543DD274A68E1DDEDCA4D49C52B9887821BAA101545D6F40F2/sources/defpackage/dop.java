package defpackage;

import android.util.Base64;
/* renamed from: dop  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class dop implements dbrn {
    static final dbrn a = new dop();

    private dop() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return dcdn.k("Lighthouse Settings", Base64.encodeToString(((dsw) obj).bS(), 0));
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* renamed from: scx  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class scx implements dbrn {
    static final dbrn a = new scx();

    private scx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        sdv sdvVar = (sdv) obj;
        int c = sdvVar.c();
        if (c != 0) {
            int i = 2;
            if (c == 2) {
                i = 1;
            }
            ArrayList arrayList = new ArrayList(sdvVar.b());
            Collections.reverse(arrayList);
            return sdv.d(sdvVar.a(), i, arrayList);
        }
        throw null;
    }
}

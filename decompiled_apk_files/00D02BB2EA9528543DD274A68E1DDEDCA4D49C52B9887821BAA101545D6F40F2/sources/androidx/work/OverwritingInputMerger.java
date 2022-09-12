package androidx.work;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverwritingInputMerger extends bbr {
    @Override // defpackage.bbr
    public final bbp a(List<bbp> list) {
        bbo bboVar = new bbo();
        HashMap hashMap = new HashMap();
        for (bbp bbpVar : list) {
            hashMap.putAll(bbpVar.d());
        }
        bboVar.b(hashMap);
        return bboVar.a();
    }
}

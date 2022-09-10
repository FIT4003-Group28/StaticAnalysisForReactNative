package defpackage;

import com.google.ar.core.AugmentedFace;
import com.google.ar.core.Session;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbar  reason: default package */
/* loaded from: classes5.dex */
public final class dbar {
    final Map<Long, AugmentedFace> a = new dbaq();

    public final synchronized AugmentedFace a(long j, Session session) {
        Map<Long, AugmentedFace> map = this.a;
        Long valueOf = Long.valueOf(j);
        AugmentedFace augmentedFace = map.get(valueOf);
        if (augmentedFace == null) {
            AugmentedFace augmentedFace2 = new AugmentedFace(j, session);
            this.a.put(valueOf, augmentedFace2);
            return augmentedFace2;
        }
        return augmentedFace;
    }
}

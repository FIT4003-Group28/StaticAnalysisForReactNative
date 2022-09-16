package defpackage;

import java.util.Collections;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: dqj  reason: default package */
/* loaded from: classes3.dex */
public final class dqj {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int a(dpu dpuVar, dqy dqyVar, dqz dqzVar) {
        dqz a = dqyVar.a(dpuVar, Collections.singletonList(dqzVar));
        if (a instanceof dqr) {
            return dqt.f(a.h().doubleValue());
        }
        return -1;
    }
}

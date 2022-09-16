package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: drp  reason: default package */
/* loaded from: classes3.dex */
public final class drp extends drf {
    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        if (str == null || str.isEmpty() || !dpuVar.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        dqz d = dpuVar.d(str);
        if (!(d instanceof dqs)) {
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        return ((dqs) d).a(dpuVar, list);
    }
}

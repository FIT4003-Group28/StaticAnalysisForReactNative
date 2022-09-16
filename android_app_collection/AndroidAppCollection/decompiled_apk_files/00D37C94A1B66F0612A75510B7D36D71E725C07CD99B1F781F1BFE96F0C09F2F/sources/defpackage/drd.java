package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: drd  reason: default package */
/* loaded from: classes3.dex */
public final class drd implements dqz {
    @Override // defpackage.dqz
    public final dqz d() {
        return dqz.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof drd;
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        return false;
    }

    @Override // defpackage.dqz
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.dqz
    public final String i() {
        return "undefined";
    }

    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return null;
    }
}

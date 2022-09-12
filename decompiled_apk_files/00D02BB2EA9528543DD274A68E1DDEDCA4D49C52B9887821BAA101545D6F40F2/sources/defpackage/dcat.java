package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcat  reason: default package */
/* loaded from: classes5.dex */
public final class dcat extends dcau<Integer> implements Serializable {
    public static final dcat a = new dcat();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dcau
    public final /* bridge */ /* synthetic */ Integer a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.dcau
    public final /* bridge */ /* synthetic */ Integer b() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.dcau
    public final /* bridge */ /* synthetic */ Integer c(Integer num) {
        int intValue = num.intValue();
        if (intValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intValue - 1);
    }

    @Override // defpackage.dcau
    public final /* bridge */ /* synthetic */ Integer d(Integer num) {
        int intValue = num.intValue();
        if (intValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(intValue + 1);
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}

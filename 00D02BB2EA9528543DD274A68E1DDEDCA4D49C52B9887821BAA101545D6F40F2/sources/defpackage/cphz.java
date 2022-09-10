package defpackage;

import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cphz  reason: default package */
/* loaded from: classes5.dex */
public final class cphz extends cntp implements cntw {
    private final int d;

    public cphz(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final cpgl a() {
        return new cpid(this.a, this.b, this.d);
    }

    public final int b() {
        return I("event_type");
    }

    public final String toString() {
        String str = b() == 1 ? "changed" : b() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(a());
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(valueOf).length());
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}

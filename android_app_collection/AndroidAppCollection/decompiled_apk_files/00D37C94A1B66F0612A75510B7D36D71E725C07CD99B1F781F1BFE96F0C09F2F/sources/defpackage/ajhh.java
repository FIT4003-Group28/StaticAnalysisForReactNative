package defpackage;

import j$.util.Objects;
/* compiled from: PG */
/* renamed from: ajhh  reason: default package */
/* loaded from: classes.dex */
public final class ajhh {
    public final aqtb a;
    public final byte[] b;

    private ajhh(aqtb aqtbVar) {
        aqtbVar.getClass();
        this.a = aqtbVar;
        this.b = ajhm.a(aqtbVar);
    }

    public static ajhh a(aqtb aqtbVar) {
        return new ajhh(aqtbVar);
    }

    public final aqtc b() {
        aqtc aqtcVar = this.a.d;
        return aqtcVar == null ? aqtc.a : aqtcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajhh) {
            return Objects.equals(this.a, ((ajhh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

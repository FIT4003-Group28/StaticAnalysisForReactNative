package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cyor  reason: default package */
/* loaded from: classes5.dex */
public final class cyor {
    public static final cyor a = a().a();
    @dzsi
    public final Long b;
    @dzsi
    public final Long c;
    @dzsi
    public final Long d;
    @dzsi
    public final Integer e;
    @dzsi
    private final String f = null;

    public cyor(@dzsi Long l, @dzsi Long l2, @dzsi Long l3, @dzsi Integer num) {
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = num;
    }

    public static cyoq a() {
        return new cyoq();
    }

    public final cyoq b() {
        cyoq cyoqVar = new cyoq();
        cyoqVar.d = this.e;
        cyoqVar.a = this.b;
        cyoqVar.b = this.c;
        cyoqVar.c = this.d;
        return cyoqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyor) {
            cyor cyorVar = (cyor) obj;
            if (dbsd.a(this.b, cyorVar.b) && dbsd.a(this.c, cyorVar.c) && dbsd.a(this.d, cyorVar.d)) {
                String str = cyorVar.f;
                if (dbsd.a(null, null) && dbsd.a(this.e, cyorVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, null, this.e});
    }
}

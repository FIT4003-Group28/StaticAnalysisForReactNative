package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cuzy  reason: default package */
/* loaded from: classes5.dex */
public final class cuzy extends cvag {
    public cufp a;
    public Integer b;
    public dbsg<cugu> c = dbpy.a;
    public List<cufj> d;

    @Override // defpackage.cvag
    public final cvah a() {
        String str = this.a == null ? " conversation" : "";
        if (this.b == null) {
            str = str.concat(" unreadCount");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" participants");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuzz(this.a, this.b.intValue(), this.c, this.d);
    }
}

package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dylw  reason: default package */
/* loaded from: classes6.dex */
public final class dylw {
    public String a = "unknown-authority";
    public dyel b = dyel.b;
    @dzsi
    public String c;
    @dzsi
    public dyge d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof dylw)) {
            return false;
        }
        dylw dylwVar = (dylw) obj;
        return this.a.equals(dylwVar.a) && this.b.equals(dylwVar.b) && dbsd.a(this.c, dylwVar.c) && dbsd.a(this.d, dylwVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}

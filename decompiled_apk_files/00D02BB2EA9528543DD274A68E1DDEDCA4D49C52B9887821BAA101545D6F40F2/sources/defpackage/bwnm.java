package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bwnm  reason: default package */
/* loaded from: classes4.dex */
public class bwnm implements Serializable {
    @dzsi
    private final String a;
    @dzsi
    private final dvnp b;

    static {
        new bwnm(null, null);
    }

    public bwnm(@dzsi String str, @dzsi dvnp dvnpVar) {
        this.a = str;
        this.b = dvnpVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bwnm)) {
            return false;
        }
        bwnm bwnmVar = (bwnm) obj;
        return dbsd.a(this.a, bwnmVar.a) && dbsd.a(this.b, bwnmVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

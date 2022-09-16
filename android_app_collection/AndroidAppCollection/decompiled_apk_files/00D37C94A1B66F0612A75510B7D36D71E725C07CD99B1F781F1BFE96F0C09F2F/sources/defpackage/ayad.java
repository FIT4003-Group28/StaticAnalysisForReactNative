package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayad  reason: default package */
/* loaded from: classes2.dex */
public final class ayad {
    public final axyd a;
    public final ayat b;
    public final ayax c;

    public ayad() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayad ayadVar = (ayad) obj;
            if (akzj.f(this.a, ayadVar.a) && akzj.f(this.b, ayadVar.b) && akzj.f(this.c, ayadVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[method=");
        sb.append(valueOf);
        sb.append(" headers=");
        sb.append(valueOf2);
        sb.append(" callOptions=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }

    public ayad(ayax ayaxVar, ayat ayatVar, axyd axydVar) {
        ayaxVar.getClass();
        this.c = ayaxVar;
        this.b = ayatVar;
        axydVar.getClass();
        this.a = axydVar;
    }
}

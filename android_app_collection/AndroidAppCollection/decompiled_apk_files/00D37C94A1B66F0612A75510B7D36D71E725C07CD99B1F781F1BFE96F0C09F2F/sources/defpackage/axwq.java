package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: axwq  reason: default package */
/* loaded from: classes2.dex */
public final class axwq {
    public final aadd a;
    public final aacz b;

    public axwq(aacz aaczVar, aadd aaddVar) {
        this.b = aaczVar;
        this.a = aaddVar;
    }

    public final aotn a() {
        aoob aoobVar;
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45354182L)) {
            try {
                aoqp aoqpVar = aqxeVar.b;
                if (aoqpVar.containsKey(45354182L)) {
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45354182L);
                    if (aqxfVar.b == 5) {
                        aoobVar = (aoob) aqxfVar.c;
                    } else {
                        aoobVar = aoob.b;
                    }
                    return (aotn) aopi.parseFrom(aotn.a, aoobVar);
                }
                throw new IllegalArgumentException();
            } catch (aopx e) {
                String simpleName = getClass().getSimpleName();
                String valueOf = String.valueOf(e.getMessage());
                Log.e(simpleName, valueOf.length() != 0 ? "Unable to parse proto typed experiment flag: ".concat(valueOf) : new String("Unable to parse proto typed experiment flag: "));
            }
        }
        return aotn.a;
    }

    public final Boolean b() {
        aqxe aqxeVar = this.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45356732L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356732L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356732L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}

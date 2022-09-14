package defpackage;

import com.google.android.filament.R;
import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: eaom  reason: default package */
/* loaded from: classes6.dex */
public final class eaom implements Comparator<Object>, Serializable {
    private static final long serialVersionUID = -6097339773320178364L;
    private final eaop d;
    private final eaop e;
    private static final eaom b = new eaom(null, null);
    public static final eaom a = new eaom(eaop.h, null);
    private static final eaom c = new eaom(null, eaop.h);

    protected eaom(eaop eaopVar, eaop eaopVar2) {
        this.d = eaopVar;
        this.e = eaopVar2;
    }

    private Object readResolve() {
        eaop eaopVar = this.d;
        eaop eaopVar2 = this.e;
        return (eaopVar == null && eaopVar2 == null) ? b : (eaopVar == eaop.h && eaopVar2 == null) ? a : (eaopVar == null && eaopVar2 == eaop.h) ? c : new eaom(eaopVar, eaopVar2);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        easg b2 = easc.a().b(obj);
        eaok e = b2.e(obj);
        long a2 = b2.a(obj, e);
        easg b3 = easc.a().b(obj2);
        eaok e2 = b3.e(obj2);
        long a3 = b3.a(obj2, e2);
        eaop eaopVar = this.d;
        if (eaopVar != null) {
            a2 = eaopVar.c(e).F(a2);
            a3 = this.d.c(e2).F(a3);
        }
        eaop eaopVar2 = this.e;
        if (eaopVar2 != null) {
            a2 = eaopVar2.c(e).H(a2);
            a3 = this.e.c(e2).H(a3);
        }
        if (a2 < a3) {
            return -1;
        }
        return a2 > a3 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof eaom) {
            eaom eaomVar = (eaom) obj;
            eaop eaopVar = this.d;
            eaop eaopVar2 = eaomVar.d;
            if (eaopVar != eaopVar2 && (eaopVar == null || !eaopVar.equals(eaopVar2))) {
                return false;
            }
            eaop eaopVar3 = this.e;
            eaop eaopVar4 = eaomVar.e;
            if (eaopVar3 == eaopVar4) {
                return true;
            }
            return eaopVar3 != null && eaopVar3.equals(eaopVar4);
        }
        return false;
    }

    public final int hashCode() {
        eaop eaopVar = this.d;
        int i = 0;
        int hashCode = eaopVar == null ? 0 : eaopVar.hashCode();
        eaop eaopVar2 = this.e;
        if (eaopVar2 != null) {
            i = eaopVar2.hashCode();
        }
        return hashCode + (i * R.styleable.AppCompatTheme_windowFixedWidthMinor);
    }

    public final String toString() {
        eaop eaopVar = this.d;
        eaop eaopVar2 = this.e;
        String str = "";
        if (eaopVar == eaopVar2) {
            if (eaopVar != null) {
                str = eaopVar.z;
            }
            StringBuilder sb = new StringBuilder(str.length() + 20);
            sb.append("DateTimeComparator[");
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
        String str2 = eaopVar == null ? str : eaopVar.z;
        if (eaopVar2 != null) {
            str = eaopVar2.z;
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + 21 + str.length());
        sb2.append("DateTimeComparator[");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}

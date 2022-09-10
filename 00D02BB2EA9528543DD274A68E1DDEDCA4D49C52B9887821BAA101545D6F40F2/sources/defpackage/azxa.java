package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azxa  reason: default package */
/* loaded from: classes3.dex */
public final class azxa extends azwm<azxa> {
    private final bvrt<dofy> a;

    public azxa(azwz azwzVar) {
        super(azwzVar);
        this.a = bvrt.b(azwzVar.a);
    }

    public static String l(dofy dofyVar) {
        dndl dndlVar = dofyVar.b;
        if (dndlVar == null) {
            dndlVar = dndl.d;
        }
        dndr b = dndr.b(dndlVar.b);
        if (b == null) {
            b = dndr.UNKNOWN_ALIAS_TYPE;
        }
        int i = b.h;
        dndl dndlVar2 = dofyVar.b;
        if (dndlVar2 == null) {
            dndlVar2 = dndl.d;
        }
        String str = dndlVar2.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = g().ordinal();
        if (ordinal == 1) {
            dbsk.s(context);
            return context.getString(R.string.HOME_LOCATION);
        } else if (ordinal != 2) {
            return ordinal != 4 ? "" : k().d;
        } else {
            dbsk.s(context);
            return context.getString(R.string.WORK_LOCATION);
        }
    }

    public final dndr g() {
        dndl dndlVar = k().b;
        if (dndlVar == null) {
            dndlVar = dndl.d;
        }
        dndr b = dndr.b(dndlVar.b);
        return b == null ? dndr.UNKNOWN_ALIAS_TYPE : b;
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azxa> h() {
        return azxm.h;
    }

    @Override // defpackage.azwm
    public final azwh<azxa> i() {
        return new azwz(this);
    }

    public final String j() {
        return k().g;
    }

    public final dofy k() {
        return this.a.e((dssr) dofy.i.cu(7), dofy.i);
    }
}

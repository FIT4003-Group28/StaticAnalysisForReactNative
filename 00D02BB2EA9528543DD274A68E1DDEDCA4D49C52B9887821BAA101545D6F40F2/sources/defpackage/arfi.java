package defpackage;

import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: arfi  reason: default package */
/* loaded from: classes2.dex */
public final class arfi implements Serializable {
    @dzsi
    public final bttq a;
    public final dvcw b;

    public arfi(@dzsi bttq bttqVar, @dzsi dvcw dvcwVar) {
        this.a = bttqVar;
        this.b = dvcwVar == null ? dvcw.UNKNOWN : dvcwVar;
    }

    public static arfi a(@dzsi bttq bttqVar, @dzsi dvcx dvcxVar) {
        dvcw dvcwVar;
        if (dvcxVar != null) {
            dvcwVar = dvcw.b(dvcxVar.a);
            if (dvcwVar == null) {
                dvcwVar = dvcw.UNKNOWN;
            }
        } else {
            dvcwVar = dvcw.UNKNOWN;
        }
        return new arfi(bttqVar, dvcwVar);
    }

    final boolean b() {
        return this.b == dvcw.UNSUPPORTED;
    }

    public final boolean c() {
        int ordinal;
        if (this.b == dvcw.FAILURE) {
            return true;
        }
        bttq bttqVar = this.a;
        if (bttqVar != null && ((ordinal = bttqVar.ordinal()) == 4 || ordinal == 16)) {
            return true;
        }
        if (b() || d() || this.b == dvcw.NOT_FOUND || this.b == dvcw.BAD_REQUEST) {
            return false;
        }
        bttq bttqVar2 = this.a;
        return bttqVar2 == null || !bttqVar2.s;
    }

    final boolean d() {
        if (this.b == dvcw.NOT_AUTHORIZED) {
            return true;
        }
        bttq bttqVar = this.a;
        if (bttqVar == null) {
            return false;
        }
        int ordinal = bttqVar.ordinal();
        return ordinal == 8 || ordinal == 9;
    }

    @dzsi
    public final Integer e() {
        int ordinal;
        bttq bttqVar = this.a;
        if (bttqVar != null && ((ordinal = bttqVar.ordinal()) == 6 || ordinal == 7 || ordinal == 13 || ordinal == 14)) {
            return Integer.valueOf((int) R.string.MY_MAPS_ERROR_LOADING_MAP_MESSAGE_CONNECTIVITY);
        }
        if (d()) {
            return Integer.valueOf((int) R.string.MY_MAPS_ERROR_RELOADING_MAP_MESSAGE_AUTHENTICATION);
        }
        if (!b()) {
            return null;
        }
        return Integer.valueOf((int) R.string.MY_MAPS_ERROR_LOADING_MAP_MESSAGE_TOO_MANY_LAYERS);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arfi)) {
            return false;
        }
        arfi arfiVar = (arfi) obj;
        return dbsd.a(this.a, arfiVar.a) && dbsd.a(this.b, arfiVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: azva  reason: default package */
/* loaded from: classes.dex */
public class azva extends azwm<azva> {
    private static final Double n = Double.valueOf(0.15d);
    public final dndr a;
    public final Long b;
    public final akqi c;
    public final String d;
    @dzsi
    public final akqq e;
    @dzsi
    public final String f;
    @dzsi
    public final decq g;

    public azva(String str, long j, long j2, dndr dndrVar, Long l, akqi akqiVar, String str2, @dzsi akqq akqqVar, @dzsi String str3, @dzsi decq decqVar) {
        super(str, j, j2);
        this.a = dndrVar;
        this.c = !akqi.d(akqiVar) ? akqi.a : akqiVar;
        this.d = str2;
        this.e = akqqVar;
        if (dndrVar == dndr.NICKNAME && str3 == null) {
            throw new IllegalArgumentException("NICKNAME should not have a null nickname.");
        }
        this.b = l;
        this.f = str3;
        this.g = decqVar;
    }

    public static azva a(dndr dndrVar, Long l, akqi akqiVar, String str, @dzsi akqq akqqVar, @dzsi String str2, @dzsi decq decqVar) {
        return new azva("", 0L, 0L, dndrVar, l, akqiVar, str, akqqVar, str2, decqVar);
    }

    @dzsi
    public static azva g(Collection<azva> collection, dndr dndrVar) {
        for (azva azvaVar : collection) {
            if (azvaVar.a == dndrVar) {
                return azvaVar;
            }
        }
        return null;
    }

    @Override // defpackage.azwm
    public final akqi b() {
        return this.c;
    }

    @Override // defpackage.azwm
    public final String c() {
        return this.d;
    }

    @Override // defpackage.azwm
    @dzsi
    public final akqq d() {
        return this.e;
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1) {
            dbsk.s(context);
            return context.getString(R.string.HOME_LOCATION);
        } else if (ordinal == 2) {
            dbsk.s(context);
            return context.getString(R.string.WORK_LOCATION);
        } else if (ordinal != 4) {
            return "";
        } else {
            String str = this.f;
            dbsk.s(str);
            return str;
        }
    }

    @Override // defpackage.azwm
    public final boolean f() {
        return false;
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azva> h() {
        return null;
    }

    @Override // defpackage.azwm
    public final azwh<azva> i() {
        throw new UnsupportedOperationException();
    }

    public final boolean j(@dzsi akqq akqqVar) {
        return akqq.v(this.e, akqqVar, n.doubleValue());
    }
}

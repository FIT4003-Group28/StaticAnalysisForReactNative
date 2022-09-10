package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azvo  reason: default package */
/* loaded from: classes3.dex */
public final class azvo extends azwm<azvo> {
    @dzsi
    public azvm a;
    private final bvrt<dogc> b;

    public azvo(azvn azvnVar) {
        super(azvnVar);
        this.b = bvrt.b(azvnVar.a);
        this.a = azvnVar.b;
    }

    @Override // defpackage.azwm
    public final Long QH() {
        dnkc dnkcVar = m().d;
        if (dnkcVar == null) {
            dnkcVar = dnkc.h;
        }
        return Long.valueOf(dnkcVar.f);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        azvm azvmVar = this.a;
        return azvmVar != null ? azvmVar.e(context) : "";
    }

    public final long g() {
        azvm azvmVar = this.a;
        if (azvmVar != null) {
            return azvmVar.a();
        }
        dnkc dnkcVar = m().d;
        if (dnkcVar == null) {
            dnkcVar = dnkc.h;
        }
        return dnkcVar.f;
    }

    @Override // defpackage.azwm
    public final azxm<azvo> h() {
        return azxm.b;
    }

    @Override // defpackage.azwm
    public final azwh<azvo> i() {
        return new azvn(this, this.a);
    }

    public final dnkc j() {
        dnkc dnkcVar = m().d;
        return dnkcVar == null ? dnkc.h : dnkcVar;
    }

    public final dnkb k() {
        dnkc dnkcVar = m().d;
        if (dnkcVar == null) {
            dnkcVar = dnkc.h;
        }
        dnkb b = dnkb.b(dnkcVar.b);
        return b == null ? dnkb.UNKNOWN : b;
    }

    public final String l() {
        dnkc dnkcVar = m().d;
        if (dnkcVar == null) {
            dnkcVar = dnkc.h;
        }
        return dnkcVar.c;
    }

    public final dogc m() {
        return this.b.e((dssr) dogc.e.cu(7), dogc.e);
    }

    @dzsi
    public final String n() {
        azvm azvmVar = this.a;
        if (azvmVar != null) {
            return azvmVar.g().c;
        }
        return null;
    }

    public final String o(Context context) {
        dnkb dnkbVar = dnkb.UNKNOWN;
        dnkc dnkcVar = m().d;
        if (dnkcVar == null) {
            dnkcVar = dnkc.h;
        }
        dnkb b = dnkb.b(dnkcVar.b);
        if (b == null) {
            b = dnkb.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return context.getString(R.string.ADDRESS_TYPE_WORK);
            }
            if (ordinal == 4) {
                return context.getString(R.string.ADDRESS_TYPE_OTHER);
            }
            return l();
        }
        return context.getString(R.string.ADDRESS_TYPE_HOME);
    }
}

package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azwv  reason: default package */
/* loaded from: classes3.dex */
public abstract class azwv {
    public static azwq t(akqi akqiVar, akqq akqqVar, String str, @dzsi String str2) {
        azve azveVar = new azve();
        if (akqiVar != null) {
            azveVar.a = akqiVar;
            if (akqqVar != null) {
                azveVar.c = akqqVar;
                azveVar.b = akra.e(akqqVar.a, akqqVar.b);
                if (str != null) {
                    azveVar.d = str;
                    azveVar.e = str2;
                    azveVar.i = 0;
                    azveVar.h(false);
                    return azveVar;
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null latLng");
        }
        throw new NullPointerException("Null featureId");
    }

    public abstract akqi a();

    public abstract akra b();

    public abstract akqq c();

    public abstract String d();

    @dzsi
    public abstract String e();

    public abstract boolean f();

    @dzsi
    public abstract dndr g();

    @dzsi
    public abstract Long h();

    @dzsi
    public abstract List<azvo> i();

    public abstract int j();

    @dzsi
    public abstract String k();

    @dzsi
    public abstract decq l();

    @dzsi
    public abstract azws m();

    public abstract dcep<azwu> n();

    public abstract azwq o();

    public final boolean p() {
        return i() != null && !i().isEmpty();
    }

    public final boolean q() {
        return !n().isEmpty();
    }

    public final dcep<baab> r() {
        return dcbg.b(n()).s(azwp.a).B();
    }

    public final boolean s() {
        return g() == dndr.HOME || g() == dndr.WORK;
    }
}

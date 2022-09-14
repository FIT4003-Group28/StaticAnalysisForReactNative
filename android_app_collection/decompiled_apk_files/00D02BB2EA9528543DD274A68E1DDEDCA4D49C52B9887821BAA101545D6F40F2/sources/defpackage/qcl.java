package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: qcl  reason: default package */
/* loaded from: classes7.dex */
public abstract class qcl {
    public static qcl f() {
        qck l = l();
        ((qaj) l).a = dndr.HOME;
        return l.c();
    }

    @dzsi
    public static qcl g(azva azvaVar) {
        akqq akqqVar = azvaVar.e;
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = azvaVar.a.ordinal();
        if (ordinal == 1) {
            if (akqqVar == null) {
                return f();
            }
            akqi akqiVar = azvaVar.c;
            qck l = l();
            qaj qajVar = (qaj) l;
            qajVar.a = dndr.HOME;
            qajVar.c = akqqVar;
            qajVar.b = akqiVar;
            return l.c();
        } else if (ordinal != 2) {
            if (ordinal != 5 && ordinal != 6) {
                return null;
            }
            qck l2 = l();
            qaj qajVar2 = (qaj) l2;
            qajVar2.a = azvaVar.a;
            qajVar2.c = akqqVar;
            qajVar2.b = azvaVar.c;
            return l2.d();
        } else if (akqqVar == null) {
            qck l3 = l();
            ((qaj) l3).a = dndr.WORK;
            return l3.c();
        } else {
            akqi akqiVar2 = azvaVar.c;
            qck l4 = l();
            qaj qajVar3 = (qaj) l4;
            qajVar3.a = dndr.WORK;
            qajVar3.c = akqqVar;
            qajVar3.b = akqiVar2;
            return l4.c();
        }
    }

    @dzsi
    public static qcl h(amvh amvhVar) {
        if (amvhVar.n() || amvhVar.m() || amvhVar.b == dpjs.ENTITY_TYPE_HOME || amvhVar.b == dpjs.ENTITY_TYPE_WORK) {
            qck l = l();
            if (amvhVar.n()) {
                ((qaj) l).c = amvhVar.e;
            }
            if (amvhVar.m()) {
                ((qaj) l).b = amvhVar.d;
            }
            if (amvj.h(amvhVar.b)) {
                ((qaj) l).a = amvj.f(amvhVar.b);
            }
            String q = amvhVar.q(false);
            if (!TextUtils.isEmpty(q)) {
                ((qaj) l).d = q;
            }
            return l.c();
        }
        return null;
    }

    public static qcl i() {
        qck l = l();
        l.b(true);
        return l.c();
    }

    @dzsi
    public static qcl k(@dzsi Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        qck l = l();
        if (bundle.containsKey("StartCommuteBoardParams.a")) {
            ((qaj) l).a = dndr.b(bundle.getInt("StartCommuteBoardParams.a"));
        }
        if (bundle.containsKey("StartCommuteBoardParams.f")) {
            ((qaj) l).b = akqi.f(bundle.getString("StartCommuteBoardParams.f"));
        }
        if (bundle.containsKey("StartCommuteBoardParams.lat") && bundle.containsKey("StartCommuteBoardParams.lng")) {
            ((qaj) l).c = new akqq(bundle.getDouble("StartCommuteBoardParams.lat"), bundle.getDouble("StartCommuteBoardParams.lng"));
        }
        l.b(bundle.getBoolean("StartCommuteBoardParams.useCurrentLocation"));
        if (bundle.containsKey("StartCommuteBoardParams.name")) {
            ((qaj) l).d = bundle.getString("StartCommuteBoardParams.name");
        }
        return l.d();
    }

    public static qck l() {
        qaj qajVar = new qaj();
        qajVar.b(false);
        return qajVar;
    }

    @dzsi
    public abstract dndr a();

    @dzsi
    public abstract akqi b();

    @dzsi
    public abstract akqq c();

    public abstract boolean d();

    @dzsi
    public abstract String e();

    public final Bundle j() {
        Bundle bundle = new Bundle();
        dndr a = a();
        if (a != null) {
            bundle.putInt("StartCommuteBoardParams.a", a.h);
        }
        akqi b = b();
        if (b != null) {
            bundle.putString("StartCommuteBoardParams.f", b.o());
        }
        akqq c = c();
        if (c != null) {
            bundle.putDouble("StartCommuteBoardParams.lat", c.a);
            bundle.putDouble("StartCommuteBoardParams.lng", c.b);
        }
        bundle.putBoolean("StartCommuteBoardParams.useCurrentLocation", d());
        if (!TextUtils.isEmpty(e())) {
            bundle.putString("StartCommuteBoardParams.name", e());
        }
        return bundle;
    }
}

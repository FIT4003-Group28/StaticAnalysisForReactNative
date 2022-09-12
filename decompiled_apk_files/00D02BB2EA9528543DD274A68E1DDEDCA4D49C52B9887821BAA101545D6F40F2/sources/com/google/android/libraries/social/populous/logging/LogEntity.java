package com.google.android.libraries.social.populous.logging;

import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.ContainerInfo;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import java.util.EnumSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class LogEntity implements Parcelable {
    public static cyoz v() {
        cyoh cyohVar = new cyoh();
        cyohVar.i("");
        cyohVar.a = "";
        cyohVar.h(0);
        cyohVar.g(1);
        cyohVar.g = 5;
        cyohVar.r(EnumSet.noneOf(cygl.class));
        cyohVar.q(EnumSet.noneOf(cygl.class));
        cyohVar.k(false);
        cyohVar.l(false);
        cyohVar.j(false);
        cyohVar.e(false);
        cyohVar.m(false);
        return cyohVar;
    }

    public static cyoz w(ContactMethodField contactMethodField, @dzsi String str) {
        dcdc<ContainerInfo> dcdcVar;
        PersonFieldMetadata b = contactMethodField.b();
        cyoz v = v();
        v.o(b.j);
        v.h(b.k);
        v.r(EnumSet.copyOf((EnumSet) b.p));
        v.i(b.h.b());
        cyoh cyohVar = (cyoh) v;
        cyohVar.b = str;
        v.j(b.l);
        v.e(b.m);
        cyep cyepVar = cyep.EMAIL;
        int ordinal = contactMethodField.SA().ordinal();
        Long l = null;
        if (ordinal == 0) {
            cyohVar.c = contactMethodField.h().a().toString();
            v.g(2);
        } else if (ordinal == 1) {
            cyohVar.d = contactMethodField.i().a().toString();
            v.g(3);
        } else if (ordinal == 2) {
            int g = contactMethodField.j().g();
            int i = g - 1;
            if (g == 0) {
                throw null;
            }
            if (i == 0) {
                v.g(1);
            } else if (i == 1) {
                cyohVar.d = contactMethodField.j().a().toString();
                v.g(6);
            } else if (i == 2) {
                cyohVar.e = contactMethodField.j().a().toString();
                v.g(7);
            } else if (i == 3) {
                cyohVar.c = contactMethodField.j().a().toString();
                v.g(8);
            }
        } else if (ordinal == 3) {
            cyohVar.c = contactMethodField.j().a().toString();
            v.g(8);
        } else if (ordinal == 4) {
            cyohVar.d = contactMethodField.j().a().toString();
            v.g(6);
        } else if (ordinal == 5) {
            cyohVar.e = contactMethodField.j().a().toString();
            v.g(7);
        }
        cyohVar.e = contactMethodField.b().i();
        PersonFieldMetadata b2 = contactMethodField.b();
        if (b2 != null && (dcdcVar = b2.q) != null) {
            int size = dcdcVar.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    ContainerInfo containerInfo = dcdcVar.get(i2);
                    i2++;
                    if (containerInfo.a() == duej.CONTACT) {
                        l = z(containerInfo.b());
                        break;
                    }
                } else if (b2.d() == duej.CONTACT) {
                    l = z(b2.e());
                }
            }
        }
        cyohVar.f = l;
        x(v);
        return v;
    }

    public static void x(cyoz cyozVar) {
        if (cyozVar.c() != null) {
            cyozVar.n(4);
        } else {
            cyozVar.n(5);
        }
    }

    public static cyoz y(GroupMetadata groupMetadata, @dzsi String str) {
        cyoz v = v();
        v.g(9);
        v.o(groupMetadata.f());
        v.r(EnumSet.of(cygl.PAPI_TOPN));
        v.i(groupMetadata.e().b());
        ((cyoh) v).b = str;
        return v;
    }

    private static Long z(String str) {
        try {
            return Long.decode(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public abstract EnumSet<cygl> a();

    public abstract EnumSet<cygl> b();

    @dzsi
    public abstract String c();

    public abstract String d();

    public abstract int e();

    public abstract int f();

    @dzsi
    public abstract String g();

    @dzsi
    public abstract String h();

    @dzsi
    public abstract String i();

    @dzsi
    public abstract String j();

    @dzsi
    public abstract Long k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    @dzsi
    public abstract Integer q();

    public abstract cyoz r();

    public abstract int s();

    public abstract int t();

    public final boolean u() {
        return dcft.j(b(), cyox.a);
    }
}

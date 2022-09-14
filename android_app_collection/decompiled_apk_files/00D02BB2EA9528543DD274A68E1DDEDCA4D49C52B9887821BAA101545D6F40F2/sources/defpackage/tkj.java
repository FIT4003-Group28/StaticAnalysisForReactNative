package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tkj  reason: default package */
/* loaded from: classes7.dex */
public abstract class tkj {
    public abstract btlu a();

    public abstract tlv b();

    public abstract int c();

    public abstract tkn d();

    public int e() {
        throw null;
    }

    public dbsg<djiq> f() {
        throw null;
    }

    public amve g() {
        throw null;
    }

    public boolean h() {
        throw null;
    }

    public final dqvj i(Activity activity) {
        return j(activity).b().h;
    }

    public final dbsg<amub> j(Activity activity) {
        tlv b = b();
        int c = c();
        if (b.i == null) {
            b.D(activity);
        }
        return dbsg.j(b.i.get(Integer.valueOf(c)));
    }

    public final amuh k(Activity activity) {
        tlv b = b();
        dbsg i = dbsg.i(Integer.valueOf(c()));
        if (b.z(activity).isEmpty()) {
            return amuh.b;
        }
        int indexOf = b.c().indexOf(Integer.valueOf(b.a()));
        dbsu dbsuVar = (dbsu) i;
        if (b.c().contains(dbsuVar.a)) {
            indexOf = b.c().indexOf(dbsuVar.a);
        }
        return amuh.f(indexOf, b.z(activity));
    }
}

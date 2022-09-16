package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yua  reason: default package */
/* loaded from: classes4.dex */
public abstract class yua {
    private final ytz a;
    private final cez b;
    private boolean c;
    public final String d;
    public final boolean e;
    public cfc f;
    public Collection g;
    public boolean h;
    public boolean i;
    public final int j;

    public yua(int i, String str, cez cezVar) {
        this(i, str, ytz.NORMAL, cezVar, false);
    }

    public cff d(cff cffVar) {
        return cffVar;
    }

    public Map f() {
        return Collections.emptyMap();
    }

    public boolean h() {
        return false;
    }

    public ytz i() {
        return this.a;
    }

    public Optional j() {
        return Optional.empty();
    }

    public final Object k(Class cls) {
        Collection collection = this.g;
        if (collection == null) {
            return null;
        }
        for (Object obj : collection) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    public cfc kX() {
        return this.f;
    }

    public String kY() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public String l() {
        return m();
    }

    public String m() {
        return this.d;
    }

    public void n() {
        this.c = true;
    }

    public void o(cff cffVar) {
        cez cezVar = this.b;
        if (cezVar != null) {
            cezVar.kV(cffVar);
        }
    }

    public final void p(Object obj) {
        Collection collection = this.g;
        if (collection == null) {
            return;
        }
        collection.remove(obj);
    }

    public boolean q() {
        return this.c;
    }

    public byte[] qA() {
        return null;
    }

    public abstract cfb qy(cew cewVar);

    public abstract void qz(Object obj);

    public final void r(Object obj) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(obj);
    }

    public final void s() {
        this.i = true;
    }

    public yua(int i, String str, ytz ytzVar, cez cezVar, boolean z) {
        this.f = new cet(2500, 1, 1.0f);
        this.h = true;
        this.i = false;
        this.j = i;
        this.d = str;
        this.a = ytzVar;
        this.b = cezVar;
        this.e = z;
    }
}

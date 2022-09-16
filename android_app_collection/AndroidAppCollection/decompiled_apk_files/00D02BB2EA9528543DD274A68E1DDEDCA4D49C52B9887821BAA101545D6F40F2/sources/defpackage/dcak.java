package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: dcak  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcak<C extends Comparable> implements Comparable<dcak<C>>, Serializable {
    private static final long serialVersionUID = 0;
    final C b;

    public dcak(C c) {
        this.b = c;
    }

    public static <C extends Comparable> dcak<C> j(C c) {
        return new dcaj(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable> dcak<C> k(C c) {
        return new dcah(c);
    }

    public C a() {
        return this.b;
    }

    public abstract boolean b(C c);

    public abstract dcak<C> c(dbyz dbyzVar, dcau<C> dcauVar);

    public abstract dcak<C> d(dbyz dbyzVar, dcau<C> dcauVar);

    public abstract void e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof dcak) {
            try {
                if (compareTo((dcak) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract void f(StringBuilder sb);

    public abstract C g(dcau<C> dcauVar);

    public abstract C h(dcau<C> dcauVar);

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(dcak<C> dcakVar) {
        if (dcakVar != dcai.a) {
            if (dcakVar == dcag.a) {
                return -1;
            }
            int t = dclz.t(this.b, dcakVar.b);
            return t != 0 ? t : deby.a(this instanceof dcah, dcakVar instanceof dcah);
        }
        return 1;
    }
}

package defpackage;

import j$.util.Objects;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: babp  reason: default package */
/* loaded from: classes2.dex */
public abstract class babp implements Comparable, Serializable {
    private static final long serialVersionUID = 1;

    public static babp d(Object obj, Object obj2, Object obj3) {
        return new babo(obj, obj2, obj3);
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        babp babpVar = (babp) obj;
        babn babnVar = new babn();
        babnVar.a(a(), babpVar.a());
        babnVar.a(b(), babpVar.b());
        babnVar.a(c(), babpVar.c());
        return babnVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof babp) {
            babp babpVar = (babp) obj;
            if (Objects.equals(a(), babpVar.a()) && Objects.equals(b(), babpVar.b()) && Objects.equals(c(), babpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "(" + a() + "," + b() + "," + c() + ")";
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (a() == null ? 0 : a().hashCode()) ^ (b() == null ? 0 : b().hashCode());
        if (c() != null) {
            i = c().hashCode();
        }
        return hashCode ^ i;
    }
}

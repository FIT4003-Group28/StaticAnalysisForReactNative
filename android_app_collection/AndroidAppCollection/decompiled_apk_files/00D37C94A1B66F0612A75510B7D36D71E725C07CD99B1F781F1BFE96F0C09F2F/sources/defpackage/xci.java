package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: xci  reason: default package */
/* loaded from: classes4.dex */
public final class xci {
    public final String a;
    public final apcb b;
    public final int c;
    public final amuk d;
    public final amuk e;
    public final amuk f;
    public final amup g;
    public final ampq h;
    public final ampq i;
    public final ampq j;
    public final xac k;

    public xci(String str, apcb apcbVar, int i, amuk amukVar, amuk amukVar2, amuk amukVar3, amup amupVar, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, xac xacVar) {
        if (str != null) {
            this.a = str;
            if (apcbVar != null) {
                this.b = apcbVar;
                this.c = i;
                if (amukVar != null) {
                    this.d = amukVar;
                    if (amukVar2 != null) {
                        this.e = amukVar2;
                        if (amukVar3 != null) {
                            this.f = amukVar3;
                            this.g = amupVar;
                            this.h = ampqVar;
                            this.i = ampqVar2;
                            this.j = ampqVar3;
                            this.k = xacVar;
                            return;
                        }
                        throw new NullPointerException("Null layoutExitMuteTriggers");
                    }
                    throw new NullPointerException("Null layoutExitSkipTriggers");
                }
                throw new NullPointerException("Null layoutExitNormalTriggers");
            }
            throw new NullPointerException("Null layoutType");
        }
        throw new NullPointerException("Null layoutId");
    }

    public static int a(wzq wzqVar) {
        wzq wzqVar2 = wzq.VIDEO_ENDED;
        int ordinal = wzqVar.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 3:
                case 8:
                    return 2;
                case 4:
                    return 3;
                case 5:
                case 6:
                case 7:
                    return 0;
                default:
                    return 1;
            }
        }
        return 0;
    }

    public static xci b(String str, apcb apcbVar, int i, xac xacVar) {
        return new xci(str, apcbVar, i, amuk.q(), amuk.q(), amuk.q(), amyc.b, amon.a, amon.a, amon.a, xacVar);
    }

    public static xci c(String str, apcb apcbVar, int i, ampq ampqVar, xac xacVar) {
        return new xci(str, apcbVar, i, amuk.q(), amuk.q(), amuk.q(), amyc.b, ampqVar, amon.a, amon.a, xacVar);
    }

    public static xci d(String str, apcb apcbVar, int i, amuk amukVar, amuk amukVar2, amuk amukVar3, ampq ampqVar, ampq ampqVar2, xac xacVar) {
        return new xci(str, apcbVar, i, amukVar, amukVar2, amukVar3, amyc.b, ampqVar, ampqVar2, amon.a, xacVar);
    }

    public static xci h(String str, apcb apcbVar, amuk amukVar, ampq ampqVar, xac xacVar) {
        return new xci(str, apcbVar, 1, amukVar, amuk.q(), amuk.q(), amyc.b, amon.a, ampqVar, amon.a, xacVar);
    }

    public static xci i(String str, apcb apcbVar, amuk amukVar, amuk amukVar2, amuk amukVar3, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, xac xacVar) {
        return new xci(str, apcbVar, 1, amukVar, amukVar2, amukVar3, amyc.b, ampqVar, ampqVar2, ampqVar3, xacVar);
    }

    public final Object e(Class cls) {
        return this.k.c(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xci) {
            xci xciVar = (xci) obj;
            if (this.a.equals(xciVar.a) && this.b.equals(xciVar.b) && this.c == xciVar.c && amxp.v(this.d, xciVar.d) && amxp.v(this.e, xciVar.e) && amxp.v(this.f, xciVar.f) && this.g.equals(xciVar.g) && this.h.equals(xciVar.h) && this.i.equals(xciVar.i) && this.j.equals(xciVar.j) && this.k.equals(xciVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Class cls) {
        return this.k.d(cls);
    }

    public final boolean g(apcb apcbVar, Class... clsArr) {
        List<Class> asList = Arrays.asList(clsArr);
        if (apcbVar != this.b) {
            return false;
        }
        for (Class cls : asList) {
            if (!this.k.d(cls)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        return "Layout[layoutType=" + this.b.name() + ", managerLayer=" + this.c + ", layoutExitNormalTriggers=" + this.d + ", layoutExitSkipTriggers=" + this.e + ", layoutExitMuteTriggers=" + this.f + ", clientMetadata=" + this.k + "]";
    }

    public xci() {
    }
}

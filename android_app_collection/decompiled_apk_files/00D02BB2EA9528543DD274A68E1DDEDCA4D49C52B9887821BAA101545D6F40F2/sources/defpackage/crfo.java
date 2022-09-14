package defpackage;

import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: crfo  reason: default package */
/* loaded from: classes5.dex */
public final class crfo {
    public final arym a;
    public final long b;
    @dzsi
    public final amte c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    @dzsi
    public final asbz j;
    @dzsi
    public final dspd k;
    public final boolean l;

    public crfo(crfn crfnVar) {
        arym arymVar = crfnVar.a;
        this.a = arymVar;
        this.b = crfnVar.b;
        amte amteVar = crfnVar.c;
        this.c = amteVar;
        this.d = crfnVar.d;
        this.e = crfnVar.e;
        this.f = crfnVar.f;
        this.g = crfnVar.g;
        this.h = crfnVar.h;
        this.i = crfnVar.i;
        asbz asbzVar = crfnVar.j;
        this.j = asbzVar;
        this.k = crfnVar.k;
        this.l = crfnVar.l;
        if (arymVar == arym.GUIDED_NAV) {
            dbsk.s(amteVar);
        } else if (arymVar == arym.FREE_NAV) {
            dbsk.s(asbzVar);
        } else {
            String valueOf = String.valueOf(arymVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unrecognized mode: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static <T extends Serializable> T c(bwqv bwqvVar, Class<? super T> cls, String str) {
        try {
            T t = (T) bwqvVar.n(cls, str);
            dbsk.s(t);
            return t;
        } catch (IOException e) {
            throw new IllegalStateException("Error loading serialized item from storage", e);
        }
    }

    public final amte a() {
        amte amteVar = this.c;
        dbsk.s(amteVar);
        return amteVar;
    }

    public final asbz b() {
        asbz asbzVar = this.j;
        dbsk.s(asbzVar);
        return asbzVar;
    }
}

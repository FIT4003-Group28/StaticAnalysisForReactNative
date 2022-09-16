package defpackage;

import j$.util.function.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: akrs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akrs implements Function {
    private final /* synthetic */ int i;
    public static final /* synthetic */ akrs h = new akrs(7);
    public static final /* synthetic */ akrs g = new akrs(6);
    public static final /* synthetic */ akrs f = new akrs(5);
    public static final /* synthetic */ akrs e = new akrs(4);
    public static final /* synthetic */ akrs d = new akrs(3);
    public static final /* synthetic */ akrs c = new akrs(2);
    public static final /* synthetic */ akrs b = new akrs(1);
    public static final /* synthetic */ akrs a = new akrs();

    private /* synthetic */ akrs() {
    }

    private /* synthetic */ akrs(int i) {
        this.i = i;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.i) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.i) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i;
        amwf amwfVar;
        amsz amszVar;
        amsz amszVar2;
        amxt f2;
        amsz amszVar3;
        switch (this.i) {
            case 0:
                return ((awsb) obj).d;
            case 1:
                awsh awshVar = ((awsb) obj).g;
                return awshVar == null ? awsh.a : awshVar;
            case 2:
                awsb awsbVar = (awsb) obj;
                awsc awscVar = awsbVar.e;
                if (awscVar == null) {
                    awscVar = awsc.a;
                }
                if ((awscVar.b & 2) != 0) {
                    awsc awscVar2 = awsbVar.e;
                    if (awscVar2 == null) {
                        awscVar2 = awsc.a;
                    }
                    i = awscVar2.d;
                } else {
                    i = -16777216;
                }
                return Integer.valueOf(i);
            case 3:
                awsh awshVar2 = (awsh) obj;
                if (awshVar2.b == 1) {
                    return ((awry) awshVar2.c).b;
                }
                return new ArrayList();
            case 4:
                return ((amuf) obj).g();
            case 5:
                return ((amum) obj).b();
            case 6:
                amvi amviVar = (amvi) obj;
                amuf amufVar = new amuf(amviVar.a.size());
                Collections.sort(amviVar.a, amxt.c());
                Iterator it = amviVar.a.iterator();
                if (it instanceof amwf) {
                    amwfVar = (amwf) it;
                } else {
                    amwfVar = new amwf(it);
                }
                while (amwfVar.hasNext()) {
                    amxt amxtVar = (amxt) amwfVar.mo416next();
                    while (amwfVar.hasNext()) {
                        if (!amwfVar.b) {
                            amwfVar.c = amwfVar.a.next();
                            amwfVar.b = true;
                        }
                        amxt amxtVar2 = (amxt) amwfVar.c;
                        if (amxtVar.l(amxtVar2)) {
                            int compareTo = amxtVar.b.compareTo(amxtVar2.b);
                            int compareTo2 = amxtVar.c.compareTo(amxtVar2.c);
                            if (compareTo >= 0 && compareTo2 <= 0) {
                                f2 = amxtVar;
                            } else if (compareTo > 0 || compareTo2 < 0) {
                                if (compareTo < 0) {
                                    amszVar = amxtVar2.b;
                                } else {
                                    amszVar = amxtVar.b;
                                }
                                if (compareTo2 > 0) {
                                    amszVar2 = amxtVar2.c;
                                } else {
                                    amszVar2 = amxtVar.c;
                                }
                                f2 = amxt.f(amszVar, amszVar2);
                            } else {
                                f2 = amxtVar2;
                            }
                            aqxo.w(f2.m(), "Overlapping ranges not permitted but found %s overlapping %s", amxtVar, amxtVar2);
                            amxt amxtVar3 = (amxt) amwfVar.mo416next();
                            int compareTo3 = amxtVar.b.compareTo(amxtVar3.b);
                            int compareTo4 = amxtVar.c.compareTo(amxtVar3.c);
                            if (compareTo3 > 0 || compareTo4 < 0) {
                                if (compareTo3 < 0 || compareTo4 > 0) {
                                    amsz amszVar4 = compareTo3 <= 0 ? amxtVar.b : amxtVar3.b;
                                    if (compareTo4 >= 0) {
                                        amszVar3 = amxtVar.c;
                                    } else {
                                        amszVar3 = amxtVar3.c;
                                    }
                                    amxtVar = amxt.f(amszVar4, amszVar3);
                                } else {
                                    amxtVar = amxtVar3;
                                }
                            }
                        }
                    }
                    amufVar.h(amxtVar);
                }
                amuk g2 = amufVar.g();
                if (!g2.isEmpty()) {
                    if (((amxx) g2).c != 1 || !((amxt) arey.t(g2)).equals(amxt.a)) {
                        return new amvk(g2);
                    }
                    return amvk.b;
                }
                return amvk.a;
            default:
                return ((amvl) obj).g();
        }
    }
}

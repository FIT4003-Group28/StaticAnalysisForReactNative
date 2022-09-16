package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: apdw  reason: default package */
/* loaded from: classes.dex */
public final class apdw {
    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            default:
                return 0;
        }
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static String e(aoob aoobVar) {
        StringBuilder sb = new StringBuilder(aoobVar.d());
        for (int i = 0; i < aoobVar.d(); i++) {
            byte a = aoobVar.a(i);
            if (a != 34) {
                if (a != 39) {
                    if (a == 92) {
                        sb.append("\\\\");
                    } else {
                        switch (a) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a < 32 || a > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
                                    break;
                                } else {
                                    sb.append((char) a);
                                    continue;
                                }
                                break;
                        }
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final void f(aoob aoobVar, ArrayDeque arrayDeque) {
        if (aoobVar.h()) {
            int m = m(aoobVar.d());
            int c = aorl.c(m + 1);
            if (arrayDeque.isEmpty() || ((aoob) arrayDeque.peek()).d() >= c) {
                arrayDeque.push(aoobVar);
                return;
            }
            int c2 = aorl.c(m);
            aoob aoobVar2 = (aoob) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((aoob) arrayDeque.peek()).d() < c2) {
                aoobVar2 = new aorl((aoob) arrayDeque.pop(), aoobVar2);
            }
            aorl aorlVar = new aorl(aoobVar2, aoobVar);
            while (!arrayDeque.isEmpty()) {
                if (((aoob) arrayDeque.peek()).d() >= aorl.c(m(aorlVar.d) + 1)) {
                    break;
                }
                aorlVar = new aorl((aoob) arrayDeque.pop(), aorlVar);
            }
            arrayDeque.push(aorlVar);
        } else if (aoobVar instanceof aorl) {
            aorl aorlVar2 = (aorl) aoobVar;
            int[] iArr = aorl.a;
            f(aorlVar2.e, arrayDeque);
            f(aorlVar2.f, arrayDeque);
        } else {
            String valueOf = String.valueOf(aoobVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static int g(aopd aopdVar) {
        aoru aoruVar = aopdVar.l.b;
        int a = aoruVar.a();
        if (a != 1) {
            StringBuilder sb = new StringBuilder("Expected only one extension, saw ");
            sb.append(a);
            if (a != 0) {
                sb.append(": ");
                int a2 = aoruVar.a() < 3 ? aoruVar.a() : 3;
                for (int i = 0; i < a2; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(((aopf) aoruVar.f(i).getKey()).b);
                }
                if (a > 3) {
                    sb.append("...");
                }
            }
            throw new IllegalStateException(sb.toString());
        }
        return ((aopf) aoruVar.f(0).getKey()).b;
    }

    public static final aoqn h(Object obj) {
        return ((aoqo) obj).a;
    }

    public static final int i(int i, Object obj, Object obj2) {
        aoqp aoqpVar = (aoqp) obj;
        aoqo aoqoVar = (aoqo) obj2;
        int i2 = 0;
        if (!aoqpVar.isEmpty()) {
            for (Map.Entry entry : aoqpVar.entrySet()) {
                i2 += aool.ac(i) + aool.S(aoqo.a(aoqoVar.a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }

    public static final boolean j(Object obj) {
        return !((aoqp) obj).b;
    }

    public static final Object k(Object obj, Object obj2) {
        aoqp aoqpVar = (aoqp) obj;
        aoqp aoqpVar2 = (aoqp) obj2;
        if (!aoqpVar2.isEmpty()) {
            if (!aoqpVar.b) {
                aoqpVar = aoqpVar.a();
            }
            aoqpVar.b();
            if (!aoqpVar2.isEmpty()) {
                aoqpVar.putAll(aoqpVar2);
            }
        }
        return aoqpVar;
    }

    public static final Object l() {
        return aoqp.a.a();
    }

    private static final int m(int i) {
        int binarySearch = Arrays.binarySearch(aorl.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}

package defpackage;

import io.grpc.Status;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayme */
/* loaded from: classes2.dex */
public final class ayme {
    private ayme() {
    }

    public static Set a(Map map, String str) {
        Status.Code a;
        List e = ayic.e(map, str);
        if (e == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : e) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                boolean z = true;
                araa.y(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                a = Status.fromCodeValue(intValue).getCode();
                if (a.value() != d.intValue()) {
                    z = false;
                }
                araa.y(z, "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    a = Status.Code.a((String) obj);
                } catch (IllegalArgumentException e2) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Status code ");
                    sb.append(valueOf);
                    sb.append(" is not valid");
                    throw new amqw(sb.toString(), e2);
                }
            } else {
                String valueOf2 = String.valueOf(obj);
                String valueOf3 = String.valueOf(obj.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 65 + String.valueOf(valueOf3).length());
                sb2.append("Can not convert status code ");
                sb2.append(valueOf2);
                sb2.append(" to Status.Code, because its type is ");
                sb2.append(valueOf3);
                throw new amqw(sb2.toString());
            }
            noneOf.add(a);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static ayoi b(Object obj, ayqe ayqeVar) {
        azid azidVar = new azid(obj, ayqeVar);
        azqc.i();
        return azidVar;
    }

    public static boolean c(ayok ayokVar, ayom ayomVar, ayqe ayqeVar) {
        if (ayokVar instanceof Callable) {
            try {
                Object call = ((Callable) ayokVar).call();
                if (call == null) {
                    ayqj.f(ayomVar);
                    return true;
                }
                try {
                    ayok ayokVar2 = (ayok) ayqeVar.a(call);
                    ayrd.b(ayokVar2, "The mapper returned a null ObservableSource");
                    if (ayokVar2 instanceof Callable) {
                        try {
                            Object call2 = ((Callable) ayokVar2).call();
                            if (call2 == null) {
                                ayqj.f(ayomVar);
                                return true;
                            }
                            azic azicVar = new azic(ayomVar, call2);
                            ayomVar.sj(azicVar);
                            azicVar.run();
                        } catch (Throwable th) {
                            bapv.j(th);
                            ayqj.h(th, ayomVar);
                            return true;
                        }
                    } else {
                        ayokVar2.az(ayomVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    bapv.j(th2);
                    ayqj.h(th2, ayomVar);
                    return true;
                }
            } catch (Throwable th3) {
                bapv.j(th3);
                ayqj.h(th3, ayomVar);
                return true;
            }
        }
        return false;
    }

    public static final aztr d(boolean z) {
        return new aztr(z);
    }

    public static final aztt e(long j) {
        return new aztt(j);
    }

    public static final aztu f(Object obj) {
        return new aztu(obj);
    }

    public static final azts g() {
        return new azts();
    }

    public static boolean h(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            azqs it = new aztd(0, charSequence.length() - 1).iterator();
            while (it.a) {
                if (!aztk.a(charSequence.charAt(it.a()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int i(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static boolean j(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (charSequence.charAt(i3) != charSequence2.charAt(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String k(String str) {
        str.getClass();
        str.getClass();
        int lastIndexOf = str.lastIndexOf(46, i(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ int l(CharSequence charSequence, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(46, i);
    }
}

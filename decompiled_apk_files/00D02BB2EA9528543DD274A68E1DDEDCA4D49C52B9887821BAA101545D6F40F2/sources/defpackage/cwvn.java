package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwvn  reason: default package */
/* loaded from: classes5.dex */
public final class cwvn {
    private static final Pattern b = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap<Long, Long> a = new ConcurrentHashMap<>();

    static String a(String str) {
        String[] split = str.split("/");
        return (split == null || split.length != 3) ? "MALFORMED" : split[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dzys b(dzys dzysVar) {
        dzyi dzyiVar = dzysVar.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        if ((dzyiVar.a & 1) != 0) {
            dzyi dzyiVar2 = dzysVar.d;
            if (dzyiVar2 == null) {
                dzyiVar2 = dzyi.d;
            }
            dsqp dsqpVar = (dsqp) dzyiVar2.cu(5);
            dsqpVar.bC(dzyiVar2);
            dzyh dzyhVar = (dzyh) dsqpVar;
            Long l = this.a.get(Long.valueOf(((dzyi) dzyhVar.b).b));
            dbsk.s(l);
            dsqp dsqpVar2 = (dsqp) dzysVar.cu(5);
            dsqpVar2.bC(dzysVar);
            dzyr dzyrVar = (dzyr) dsqpVar2;
            long longValue = l.longValue();
            if (dzyhVar.c) {
                dzyhVar.bF();
                dzyhVar.c = false;
            }
            dzyi dzyiVar3 = (dzyi) dzyhVar.b;
            dzyiVar3.a |= 1;
            dzyiVar3.b = longValue;
            if (dzyrVar.c) {
                dzyrVar.bF();
                dzyrVar.c = false;
            }
            dzys dzysVar2 = (dzys) dzyrVar.b;
            dzyi bK = dzyhVar.bK();
            bK.getClass();
            dzysVar2.d = bK;
            dzysVar2.a |= 4;
            return dzyrVar.bK();
        }
        return dzysVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dzys c(int i, dzys dzysVar) {
        dzyi dzyiVar = dzysVar.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        if ((dzyiVar.a & 2) != 0) {
            dzyi dzyiVar2 = dzysVar.d;
            if (dzyiVar2 == null) {
                dzyiVar2 = dzyi.d;
            }
            dsqp dsqpVar = (dsqp) dzyiVar2.cu(5);
            dsqpVar.bC(dzyiVar2);
            dzyh dzyhVar = (dzyh) dsqpVar;
            dsqp dsqpVar2 = (dsqp) dzysVar.cu(5);
            dsqpVar2.bC(dzysVar);
            dzyr dzyrVar = (dzyr) dsqpVar2;
            String str = ((dzyi) dzyhVar.b).c;
            Long a = deka.a(str);
            dbsk.s(a);
            long longValue = a.longValue();
            ConcurrentHashMap<Long, Long> concurrentHashMap = this.a;
            Long valueOf = Long.valueOf(longValue);
            if (!concurrentHashMap.containsKey(valueOf)) {
                int i2 = i - 1;
                if (i2 == 0) {
                    Matcher matcher = b.matcher(str);
                    if (matcher.matches()) {
                        if (str.startsWith("*sync*/")) {
                            String valueOf2 = String.valueOf(a(str.substring(7)));
                            str = valueOf2.length() != 0 ? "*sync*/".concat(valueOf2) : new String("*sync*/");
                        } else {
                            str = matcher.group(1);
                        }
                    }
                } else if (i2 == 1) {
                    str = a(str);
                } else if (i2 == 2) {
                    str = "--";
                }
                Long a2 = deka.a(str);
                if (a2 != null) {
                    this.a.putIfAbsent(valueOf, a2);
                }
            }
            if (dzyhVar.c) {
                dzyhVar.bF();
                dzyhVar.c = false;
            }
            dzyi dzyiVar3 = (dzyi) dzyhVar.b;
            int i3 = dzyiVar3.a | 1;
            dzyiVar3.a = i3;
            dzyiVar3.b = longValue;
            dzyiVar3.a = i3 & (-3);
            dzyiVar3.c = dzyi.d.c;
            if (dzyrVar.c) {
                dzyrVar.bF();
                dzyrVar.c = false;
            }
            dzys dzysVar2 = (dzys) dzyrVar.b;
            dzyi bK = dzyhVar.bK();
            bK.getClass();
            dzysVar2.d = bK;
            dzysVar2.a |= 4;
            return dzyrVar.bK();
        }
        return dzysVar;
    }
}

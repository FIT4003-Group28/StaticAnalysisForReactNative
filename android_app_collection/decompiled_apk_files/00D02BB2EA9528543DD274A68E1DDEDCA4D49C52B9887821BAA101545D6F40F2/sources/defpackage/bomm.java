package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bomm  reason: default package */
/* loaded from: classes3.dex */
public final class bomm {
    private static final Pattern a = Pattern.compile("\\s(\\d{6}?)($|\\s|,)");

    public static dvxz a(dwhj dwhjVar) {
        dvyw dvywVar = dwhjVar.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        dvxz dvxzVar = dvywVar.s;
        if (dvxzVar == null) {
            dvxzVar = dvxz.h;
        }
        if (dvxzVar.e.isEmpty() && dvxzVar.g.equals("IN")) {
            Pattern pattern = a;
            Matcher matcher = pattern.matcher(dvywVar.p);
            if (matcher.find()) {
                dsqp dsqpVar = (dsqp) dvxzVar.cu(5);
                dsqpVar.bC(dvxzVar);
                dvxy dvxyVar = (dvxy) dsqpVar;
                String group = matcher.group(1);
                dbsk.s(group);
                if (dvxyVar.c) {
                    dvxyVar.bF();
                    dvxyVar.c = false;
                }
                dvxz dvxzVar2 = (dvxz) dvxyVar.b;
                group.getClass();
                dvxzVar2.a |= 8;
                dvxzVar2.e = group;
                return dvxyVar.bK();
            }
            dpjx dpjxVar = dwhjVar.c;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            Matcher matcher2 = pattern.matcher(dpjxVar.b);
            if (matcher2.find()) {
                dsqp dsqpVar2 = (dsqp) dvxzVar.cu(5);
                dsqpVar2.bC(dvxzVar);
                dvxy dvxyVar2 = (dvxy) dsqpVar2;
                String group2 = matcher2.group(1);
                dbsk.s(group2);
                if (dvxyVar2.c) {
                    dvxyVar2.bF();
                    dvxyVar2.c = false;
                }
                dvxz dvxzVar3 = (dvxz) dvxyVar2.b;
                group2.getClass();
                dvxzVar3.a |= 8;
                dvxzVar3.e = group2;
                return dvxyVar2.bK();
            }
        }
        return dvxzVar;
    }
}

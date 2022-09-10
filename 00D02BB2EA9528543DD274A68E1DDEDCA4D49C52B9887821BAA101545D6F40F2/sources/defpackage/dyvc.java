package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dyvc  reason: default package */
/* loaded from: classes6.dex */
public final class dyvc {
    private dyvc() {
    }

    public static Set<dyiy> a(Map<String, ?> map, String str) {
        dyiy a;
        List<?> a2 = dyqb.a(map, str);
        if (a2 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(dyiy.class);
        for (Object obj : a2) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                boolean z = true;
                dbuh.b(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                a = dyjb.a(intValue).p;
                if (a.r != d.intValue()) {
                    z = false;
                }
                dbuh.b(z, "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    a = dyiy.a((String) obj);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Status code ");
                    sb.append(valueOf);
                    sb.append(" is not valid");
                    throw new dbui(sb.toString(), e);
                }
            } else {
                String valueOf2 = String.valueOf(obj);
                String valueOf3 = String.valueOf(obj.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 65 + String.valueOf(valueOf3).length());
                sb2.append("Can not convert status code ");
                sb2.append(valueOf2);
                sb2.append(" to Status.Code, because its type is ");
                sb2.append(valueOf3);
                throw new dbui(sb2.toString());
            }
            noneOf.add(a);
        }
        return Collections.unmodifiableSet(noneOf);
    }
}

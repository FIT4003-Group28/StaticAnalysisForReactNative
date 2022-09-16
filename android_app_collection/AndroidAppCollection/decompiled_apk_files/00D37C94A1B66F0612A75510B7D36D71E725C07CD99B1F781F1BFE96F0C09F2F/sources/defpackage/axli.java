package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: axli  reason: default package */
/* loaded from: classes2.dex */
public final class axli {
    static final Pattern a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static cvs a(axiw axiwVar, String str) {
        List c = c(axiwVar, str, true);
        if (c.isEmpty()) {
            return null;
        }
        return (cvs) c.get(0);
    }

    public static List b(cvx cvxVar, String str) {
        return c(cvxVar, str, false);
    }

    public static List c(Object obj, String str, boolean z) {
        String str2;
        if (str.startsWith("/")) {
            str = str.substring(1);
            while (obj instanceof cvs) {
                obj = ((cvs) obj).c();
            }
        }
        if (str.length() == 0) {
            if (obj instanceof cvs) {
                return Collections.singletonList((cvs) obj);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        int i = 0;
        if (str.contains("/")) {
            str2 = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            str2 = "";
        }
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if ("..".equals(group)) {
                if (obj instanceof cvs) {
                    return c(((cvs) obj).c(), str2, z);
                }
                return Collections.emptyList();
            } else if (obj instanceof cvx) {
                int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                LinkedList linkedList = new LinkedList();
                for (cvs cvsVar : ((cvx) obj).i()) {
                    if (cvsVar.d().matches(group)) {
                        if (parseInt == -1 || parseInt == i) {
                            linkedList.addAll(c(cvsVar, str2, z));
                        }
                        i++;
                    }
                    if (z || parseInt >= 0) {
                        if (!linkedList.isEmpty()) {
                            break;
                        }
                    }
                }
                return linkedList;
            } else {
                return Collections.emptyList();
            }
        }
        throw new RuntimeException(String.valueOf(str).concat(" is invalid path."));
    }
}

package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cjxj  reason: default package */
/* loaded from: classes4.dex */
public final class cjxj {
    private static final Pattern a = Pattern.compile("\\b([23456789C][23456789CFGHJMPQRV][23456789CFGHJMPQRVWX]{6}\\+[23456789CFGHJMPQRVWX]{2,7}\\b)", 2);
    private static final Pattern b = Pattern.compile("\\b([23456789CFGHJMPQRVWX][23456789CFGHJMPQRVWX]{2,3}\\+[23456789CFGHJMPQRVWX]{2,7})\\b", 2);

    public static cjxi a(String str) {
        String group;
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            group = matcher.group(1);
        } else {
            Matcher matcher2 = b.matcher(str);
            group = matcher2.find() ? matcher2.group(1) : "";
        }
        if (!group.isEmpty()) {
            str = str.replace(group, "");
        }
        return new cjwv(group, str.trim());
    }
}

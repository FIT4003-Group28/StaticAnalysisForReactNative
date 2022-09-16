package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: acpl  reason: default package */
/* loaded from: classes.dex */
final class acpl {
    private static final Pattern b = Pattern.compile("a=rtpmap:(\\d+) H264");
    private static final Pattern c = Pattern.compile("a=rtpmap:(\\d+) H265X");
    private static final Pattern d = Pattern.compile("a=rtpmap:(\\d+) VP8");
    private static final Pattern e = Pattern.compile("a=rtpmap:(\\d+) VP9");
    public static final Pattern a = Pattern.compile("a=rtpmap:(\\d+) opus/(\\d+)/(\\d+)");
    private static final Pattern f = Pattern.compile("m=video.+");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, axgq axgqVar) {
        Pattern pattern;
        Matcher matcher = f.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String group = matcher.group(0);
        ArrayList arrayList = new ArrayList();
        axgq axgqVar2 = axgq.UNKNOWN;
        int ordinal = axgqVar.ordinal();
        if (ordinal == 1) {
            pattern = d;
        } else if (ordinal == 2) {
            pattern = e;
        } else if (ordinal == 3) {
            pattern = b;
        } else if (ordinal != 4) {
            String valueOf = String.valueOf(axgqVar.name());
            zep.m("SessionDescriptionUtil", valueOf.length() != 0 ? "Unexpected codec ".concat(valueOf) : new String("Unexpected codec "));
            return str;
        } else {
            pattern = c;
        }
        Matcher matcher2 = pattern.matcher(str);
        while (matcher2.find()) {
            arrayList.add(matcher2.group(1));
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(group.split(" ")));
        if (arrayList2.size() <= 3) {
            return str;
        }
        b(arrayList2, arrayList);
        b(arrayList2, arrayList);
        return matcher.replaceFirst(TextUtils.join(" ", arrayList2));
    }

    private static void b(List list, List list2) {
        for (int i = 3; i < list.size(); i++) {
            String str = (String) list.get(i);
            if (list2.contains(str)) {
                list.subList(3, list.size()).remove(str);
                list.add(3, str);
            }
        }
    }
}

package defpackage;

import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: avog  reason: default package */
/* loaded from: classes3.dex */
public final class avog {
    @dzsi
    public Exception c;
    public dluy a = dluy.UNKNOWN_RESOURCE_TYPE;
    public int b = 0;
    public String d = "";

    public final avoh a() {
        Exception exc;
        String str;
        String str2 = this.d;
        if ((str2 == null || str2.isEmpty()) && (exc = this.c) != null) {
            this.d = dbsj.e(exc.getMessage());
        }
        if (this.b == 0 && (str = this.d) != null) {
            Matcher matcher = avoh.a.matcher(str);
            int i = 0;
            if (matcher.find()) {
                try {
                    String group = matcher.group(1);
                    dbsk.s(group);
                    i = Integer.parseInt(group);
                } catch (NumberFormatException unused) {
                }
            }
            this.b = i;
        }
        return new avoh(this.d, this.a, this.c);
    }
}

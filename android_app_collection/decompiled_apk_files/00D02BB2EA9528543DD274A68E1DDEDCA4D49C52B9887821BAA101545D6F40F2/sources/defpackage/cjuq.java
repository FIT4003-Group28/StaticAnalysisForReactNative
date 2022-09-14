package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjuq  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjuq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjuq c(int i, long j) {
        return new cjum(i, j);
    }

    public abstract int a();

    public abstract long b();

    public final String toString() {
        int a = a();
        String format = SimpleDateFormat.getDateTimeInstance().format(new Date(b()));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 29);
        sb.append("http://go/veat/");
        sb.append(a);
        sb.append(" @ ");
        sb.append(format);
        return sb.toString();
    }
}

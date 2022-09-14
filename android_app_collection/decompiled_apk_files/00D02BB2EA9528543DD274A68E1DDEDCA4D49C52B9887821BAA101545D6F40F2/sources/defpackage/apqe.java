package defpackage;

import java.util.Formatter;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: apqe  reason: default package */
/* loaded from: classes2.dex */
public class apqe {
    private final StringBuilder a;
    private final Formatter b;

    public apqe() {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        this.b = new Formatter(sb, Locale.getDefault());
    }

    public final String a(long j) {
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        this.a.setLength(0);
        if (j5 > 0) {
            return this.b.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return this.b.format("%d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }
}

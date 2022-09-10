package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atlu  reason: default package */
/* loaded from: classes2.dex */
public final class atlu {
    public static final cqtv a = cqsv.d(cqrp.d(-4.0d), cqrp.d(4.0d));

    public static Integer a(atna atnaVar, Context context) {
        int i = true != btpf.c(context).e ? -4 : 4;
        int i2 = 0;
        if (atnaVar.ak().booleanValue() && btpf.c(context).f) {
            i2 = i - 8;
        }
        return Integer.valueOf(atnaVar.W().booleanValue() ? i2 + 80 : i2 + 88);
    }

    public static Integer b(atna atnaVar, Context context) {
        if (!atnaVar.ak().booleanValue()) {
            return atnaVar.W().booleanValue() ? 143 : 159;
        }
        int i = btpf.c(context).f ? (true != btpf.c(context).e ? -4 : 4) - 8 : 0;
        return atnaVar.W().booleanValue() ? Integer.valueOf(i + 80) : Integer.valueOf(i + 88);
    }
}

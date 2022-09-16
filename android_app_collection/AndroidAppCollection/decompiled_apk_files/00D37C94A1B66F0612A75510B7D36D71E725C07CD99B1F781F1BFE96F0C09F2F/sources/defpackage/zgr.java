package defpackage;

import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: zgr  reason: default package */
/* loaded from: classes4.dex */
public final class zgr {
    private final zgq a;

    public zgr(zgq zgqVar) {
        zgqVar.getClass();
        this.a = zgqVar;
    }

    public final osf a(String str) {
        osh a = osh.a(this.a.a);
        Matcher matcher = a.c.matcher(str);
        if (matcher.lookingAt()) {
            int i = 0;
            while (i < a.b.length) {
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    return a.b[i];
                }
                i = i2;
            }
        }
        return osf.a;
    }
}

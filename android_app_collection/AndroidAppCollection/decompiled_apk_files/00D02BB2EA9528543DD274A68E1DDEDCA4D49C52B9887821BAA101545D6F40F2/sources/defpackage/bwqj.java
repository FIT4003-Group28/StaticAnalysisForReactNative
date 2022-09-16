package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bwqj  reason: default package */
/* loaded from: classes4.dex */
public final class bwqj extends bwrm {
    static final long a = TimeUnit.MINUTES.toMillis(30);
    static final long b = TimeUnit.HOURS.toMillis(12);
    public final bwqi c;
    public final String d;

    public bwqj(bwqi bwqiVar, String str) {
        this.c = bwqiVar;
        this.d = str;
    }

    @Override // defpackage.bwrm
    public final bwrl a() {
        return this.c;
    }

    @Override // defpackage.bwrm
    public final String b() {
        return this.d;
    }

    public static void c(cqat cqatVar, dvsb dvsbVar) {
        if ((dvsbVar.a & 1) == 0 || dvsbVar.b < 0) {
            cqatVar.e();
        } else {
            cqatVar.e();
        }
    }
}

package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: chkp  reason: default package */
/* loaded from: classes4.dex */
public class chkp implements chmq {
    private final dqei a;

    public chkp(dqei dqeiVar) {
        this.a = dqeiVar;
    }

    private static String d(int i) {
        return String.format(Locale.getDefault(), "%,d", Integer.valueOf(i));
    }

    @Override // defpackage.chmq
    public Float a() {
        return Float.valueOf(this.a.d);
    }

    @Override // defpackage.chmq
    public String b() {
        dqei dqeiVar = this.a;
        return (dqeiVar.a & 1) != 0 ? d(dqeiVar.b) : "";
    }

    @Override // defpackage.chmq
    public String c() {
        dqei dqeiVar = this.a;
        return (dqeiVar.a & 2) != 0 ? d(dqeiVar.c) : "";
    }
}

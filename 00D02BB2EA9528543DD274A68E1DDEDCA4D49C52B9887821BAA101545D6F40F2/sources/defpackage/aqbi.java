package defpackage;

import java.lang.ref.WeakReference;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqbi  reason: default package */
/* loaded from: classes2.dex */
public final class aqbi implements Runnable {
    private final WeakReference<aqbo> a;
    private final int b;
    private final String c;
    private final String d;

    public aqbi(gga ggaVar, aqbo aqboVar, int i, String str, String str2) {
        new WeakReference(ggaVar);
        this.a = new WeakReference<>(aqboVar);
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dehn<dbsg<ctyy>> i;
        aqbo aqboVar = this.a.get();
        if (aqboVar == null) {
            return;
        }
        if (!this.c.equals(this.d)) {
            i = aqboVar.i(this.c, this.b);
        } else {
            i = aqboVar.g(this.b);
        }
        Level level = Level.INFO;
        String str = this.c;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Failed to register for account ");
        sb.append(str);
        sb.append(" as type ");
        sb.append(i2);
        deha.q(i, new aqbd(level, sb.toString()), dege.a);
    }
}

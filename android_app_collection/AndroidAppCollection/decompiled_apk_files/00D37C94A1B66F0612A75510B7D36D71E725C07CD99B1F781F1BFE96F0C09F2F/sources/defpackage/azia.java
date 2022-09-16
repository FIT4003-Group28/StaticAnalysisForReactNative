package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: azia  reason: default package */
/* loaded from: classes2.dex */
final class azia extends ArrayList implements azhv {
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int a;

    public azia() {
        super(16);
    }

    @Override // defpackage.azhv
    public final void b() {
        add(azoq.a);
        this.a++;
    }

    @Override // defpackage.azhv
    public final void c(Throwable th) {
        add(azoq.b(th));
        this.a++;
    }

    @Override // defpackage.azhv
    public final void d(Object obj) {
        azoq azoqVar = azoq.a;
        add(obj);
        this.a++;
    }

    @Override // defpackage.azhv
    public final void e(azht azhtVar) {
        if (azhtVar.getAndIncrement() != 0) {
            return;
        }
        ayom ayomVar = azhtVar.b;
        int i = 1;
        while (!azhtVar.d) {
            int i2 = this.a;
            Integer num = (Integer) azhtVar.c;
            int intValue = num != null ? num.intValue() : 0;
            while (intValue < i2) {
                if (azoq.e(get(intValue), ayomVar) || azhtVar.d) {
                    return;
                }
                intValue++;
            }
            azhtVar.c = Integer.valueOf(intValue);
            i = azhtVar.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }
}

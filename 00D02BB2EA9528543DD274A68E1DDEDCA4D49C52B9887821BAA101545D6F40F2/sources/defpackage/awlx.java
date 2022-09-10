package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awlx  reason: default package */
/* loaded from: classes3.dex */
public final class awlx {
    public static final long a = TimeUnit.HOURS.toSeconds(2);
    public final awlw b;

    public awlx(awlw awlwVar) {
        this.b = awlwVar;
    }

    public final void a() {
        awlw awlwVar = this.b;
        try {
            awlwVar.a.c("timeout");
        } catch (RuntimeException e) {
            awlwVar.b.a(17, e);
        }
    }
}

package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: exo  reason: default package */
/* loaded from: classes3.dex */
public class exo extends ymg {
    public exo(long j) {
        if (j < 0) {
            afus.b(1, 18, String.format(Locale.US, "elapsedMillisTimestamp(%d) < 0", Long.valueOf(j)));
            j = 0;
        }
        super.i(j);
    }
}

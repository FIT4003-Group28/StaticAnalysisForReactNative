package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cvqc  reason: default package */
/* loaded from: classes5.dex */
public final class cvqc {
    private final Context a;

    public cvqc(Context context) {
        this.a = context;
    }

    public final synchronized cvqb a(@dzsi cvkc cvkcVar) {
        long longValue;
        if (cvkcVar != null) {
            try {
                longValue = cvkcVar.a().longValue();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            longValue = -1;
        }
        return new cvqb(this.a, longValue);
    }
}

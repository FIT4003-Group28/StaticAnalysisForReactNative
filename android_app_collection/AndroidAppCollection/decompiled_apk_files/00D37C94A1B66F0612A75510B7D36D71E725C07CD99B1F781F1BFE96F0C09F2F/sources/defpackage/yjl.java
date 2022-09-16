package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: yjl  reason: default package */
/* loaded from: classes4.dex */
public final class yjl {
    private final azqb a;

    public yjl(azqb azqbVar) {
        this.a = azqbVar;
    }

    public final int a(String str, Bundle bundle) {
        zgh.m(str);
        yjo a = ((yjm) this.a.get()).a(str);
        if (a != null) {
            return a.a(bundle);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Unknown task tag ");
        sb.append(str);
        sb.append("; aborting...");
        zep.l(sb.toString());
        return 1;
    }
}

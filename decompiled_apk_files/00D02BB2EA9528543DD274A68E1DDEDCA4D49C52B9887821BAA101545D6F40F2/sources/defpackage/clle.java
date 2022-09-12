package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: clle  reason: default package */
/* loaded from: classes5.dex */
public final class clle extends IOException {
    public final clku a;

    public clle(clku clkuVar) {
        this.a = clkuVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 2 + String.valueOf(valueOf).length());
        sb.append(message);
        sb.append("; ");
        sb.append(valueOf);
        return sb.toString();
    }

    public clle(clku clkuVar, Throwable th) {
        super(th);
        this.a = clkuVar;
    }

    public clle(String str) {
        super(str);
        this.a = clku.f(str);
    }

    public clle(Throwable th) {
        super(th);
        this.a = clku.f(th.getMessage());
    }
}

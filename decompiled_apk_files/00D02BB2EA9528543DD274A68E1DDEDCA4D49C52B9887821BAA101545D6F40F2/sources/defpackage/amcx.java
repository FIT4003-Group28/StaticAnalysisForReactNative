package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: amcx  reason: default package */
/* loaded from: classes.dex */
public final class amcx extends IOException {
    public final int a;

    public amcx() {
        super("Failed to create sqlite disk cache directory");
        this.a = 0;
    }

    public amcx(Throwable th) {
        super(th);
        int i;
        int i2 = 0;
        if ((th instanceof anam) && (i = ((anam) th).b) >= 65536 && i < 81920) {
            i2 = i - 65536;
        }
        this.a = i2;
    }
}

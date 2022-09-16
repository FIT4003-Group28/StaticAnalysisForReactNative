package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: pjq  reason: default package */
/* loaded from: classes4.dex */
public class pjq extends IOException {
    public final boolean a;
    public final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public pjq(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static pjq a(String str, Throwable th) {
        return new pjq(str, th, true, 1);
    }

    public static pjq b(String str, Throwable th) {
        return new pjq(str, th, true, 0);
    }

    public static pjq c(String str) {
        return new pjq(str, null, false, 1);
    }

    public static pjq d(Throwable th) {
        return new pjq(null, th, true, 4);
    }
}

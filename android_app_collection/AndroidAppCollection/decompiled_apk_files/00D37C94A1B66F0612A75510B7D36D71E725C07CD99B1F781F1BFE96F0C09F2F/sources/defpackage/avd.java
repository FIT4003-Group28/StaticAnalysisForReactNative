package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: avd  reason: default package */
/* loaded from: classes2.dex */
public final class avd {
    public final String a;
    public final String b;
    public final int c = 1;
    public final int d = 1;

    public avd(String str) {
        this.a = str;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avd)) {
            return false;
        }
        avd avdVar = (avd) obj;
        int i = avdVar.c;
        int i2 = avdVar.d;
        return akzj.f(this.a, avdVar.a) && akzj.f(this.b, avdVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, 1, 1});
    }
}

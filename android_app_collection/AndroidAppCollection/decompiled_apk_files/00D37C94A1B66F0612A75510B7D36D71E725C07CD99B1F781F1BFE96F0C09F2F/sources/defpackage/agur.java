package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agur  reason: default package */
/* loaded from: classes.dex */
final class agur {
    public final String a;
    public final long b;

    public agur(atrv atrvVar, long j) {
        this.a = atrvVar.b;
        this.b = j + TimeUnit.SECONDS.toMillis(atrvVar.d);
    }

    public agur(String str, long j) {
        this.a = str;
        this.b = j;
    }
}

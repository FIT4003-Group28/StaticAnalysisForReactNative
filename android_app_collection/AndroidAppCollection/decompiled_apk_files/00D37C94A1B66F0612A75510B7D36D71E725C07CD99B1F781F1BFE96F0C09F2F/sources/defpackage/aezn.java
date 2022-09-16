package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aezn  reason: default package */
/* loaded from: classes.dex */
public final class aezn extends IOException implements afma {
    final long a;
    public final String b;

    public aezn(long j, long j2) {
        afms.b(j < j2);
        this.a = j2;
        StringBuilder sb = new StringBuilder(25);
        sb.append("diff.");
        sb.append(j2 - j);
        this.b = sb.toString();
    }

    @Override // defpackage.afma
    public final String a(boolean z) {
        return "manifestless.head.race";
    }

    @Override // defpackage.afma
    public final String b() {
        return this.b;
    }
}

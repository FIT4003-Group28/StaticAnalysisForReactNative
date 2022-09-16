package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: aevr  reason: default package */
/* loaded from: classes.dex */
final class aevr extends afes {
    public volatile Format a;
    public volatile Format b;

    public aevr(Format format) {
        this.a = format;
    }

    @Override // defpackage.afes
    public final int a() {
        return this.a.h;
    }

    @Override // defpackage.afes
    public final int b() {
        return this.a.r;
    }

    @Override // defpackage.afes
    public final int c() {
        return this.a.q;
    }

    @Override // defpackage.afes
    public final String d() {
        return amps.d(this.a.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aevr) && this.a.equals(((aevr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

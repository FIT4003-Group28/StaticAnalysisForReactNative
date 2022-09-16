package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ftd  reason: default package */
/* loaded from: classes3.dex */
public final class ftd {
    public Optional a;
    public Optional b;
    private Boolean c;

    public ftd(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    public final fte a() {
        Boolean bool = this.c;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: shouldShowPivotBar");
        }
        return new fte(this.a, bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(ftf ftfVar) {
        this.b = Optional.of(ftfVar);
    }

    public final void d(ftg ftgVar) {
        this.a = Optional.of(ftgVar);
    }

    public ftd() {
    }
}

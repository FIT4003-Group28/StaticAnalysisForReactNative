package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jbd  reason: default package */
/* loaded from: classes3.dex */
public final class jbd {
    public String a;
    public String b;
    public String c;
    public Optional d;
    public amuk e;
    public Integer f;
    public Optional g;

    public jbd(byte[] bArr) {
        this.d = Optional.empty();
        this.g = Optional.empty();
    }

    public final void a(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null subtitle");
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void d(amuk amukVar) {
        if (amukVar != null) {
            this.e = amukVar;
            return;
        }
        throw new NullPointerException("Null videos");
    }

    public jbd() {
    }
}

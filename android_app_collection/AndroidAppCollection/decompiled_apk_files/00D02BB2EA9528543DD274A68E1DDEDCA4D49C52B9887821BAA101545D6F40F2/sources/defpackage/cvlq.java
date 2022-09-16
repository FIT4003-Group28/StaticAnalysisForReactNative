package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cvlq  reason: default package */
/* loaded from: classes5.dex */
public final class cvlq {
    public final Long a;
    public final drvb b;
    public Long c = 0L;
    public Long d = 0L;
    public Long e = 0L;
    public Long f = 0L;
    public Long g = 0L;
    public Long h = 0L;

    public cvlq(Long l, drvb drvbVar) {
        this.a = l;
        this.b = drvbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvlq)) {
            return false;
        }
        cvlq cvlqVar = (cvlq) obj;
        return dbsd.a(this.a, cvlqVar.a) && dbsd.a(this.b, cvlqVar.b) && dbsd.a(this.c, cvlqVar.c) && dbsd.a(this.d, cvlqVar.d) && dbsd.a(this.e, cvlqVar.e) && dbsd.a(this.f, cvlqVar.f) && dbsd.a(this.g, cvlqVar.g) && dbsd.a(this.h, cvlqVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }
}

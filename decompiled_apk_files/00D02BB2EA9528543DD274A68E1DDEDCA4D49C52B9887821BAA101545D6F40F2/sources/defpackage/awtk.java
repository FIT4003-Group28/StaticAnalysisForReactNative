package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: awtk  reason: default package */
/* loaded from: classes3.dex */
public final class awtk extends awtm {
    public String a;
    public String b;
    private Long c;
    private Long d;
    private akqq e;
    private Long f;
    private dcdc<String> g;
    private Boolean h;
    private int i;

    public awtk() {
    }

    public awtk(awtn awtnVar) {
        awtl awtlVar = (awtl) awtnVar;
        this.c = Long.valueOf(awtlVar.a);
        this.d = Long.valueOf(awtlVar.b);
        this.e = awtlVar.c;
        this.f = Long.valueOf(awtlVar.d);
        this.a = awtlVar.e;
        this.b = awtlVar.f;
        this.g = awtlVar.g;
        this.i = awtlVar.i;
        this.h = Boolean.valueOf(awtlVar.h);
    }

    @Override // defpackage.awtm
    public final void b(long j) {
        this.f = Long.valueOf(j);
    }

    @Override // defpackage.awtm
    public final void c(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // defpackage.awtm
    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.awtm
    public final void e(@dzsi String str) {
        this.a = str;
    }

    @Override // defpackage.awtm
    public final void f(@dzsi String str) {
        this.b = str;
    }

    @Override // defpackage.awtm
    public final void g(List<String> list) {
        this.g = dcdc.r(list);
    }

    @Override // defpackage.awtm
    public final void h(akqq akqqVar) {
        if (akqqVar != null) {
            this.e = akqqVar;
            return;
        }
        throw new NullPointerException("Null position");
    }

    @Override // defpackage.awtm
    public final void i(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.awtm
    public final void j(int i) {
        if (i != 0) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null provenance");
    }

    @Override // defpackage.awtm
    public final awtn a() {
        String str = this.c == null ? " saveTimestampMicros" : "";
        if (this.d == null) {
            str = str.concat(" expirationTimestampMillis");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" position");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" editTimestampMillis");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" photoUris");
        }
        if (this.i == 0) {
            str = String.valueOf(str).concat(" provenance");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" hasBeenWrittenToSync");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new awtl(this.c.longValue(), this.d.longValue(), this.e, this.f.longValue(), this.a, this.b, this.g, this.i, this.h.booleanValue());
    }
}

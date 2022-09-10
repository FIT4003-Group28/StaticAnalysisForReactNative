package defpackage;
/* compiled from: PG */
/* renamed from: csgf  reason: default package */
/* loaded from: classes5.dex */
public final class csgf extends csgh {
    public ddby a;
    public Integer b;
    public Long c;
    public Long d;
    public int[] e;
    private String f;
    private dssj g;
    private int h;

    @Override // defpackage.csgh
    public final void b(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null logSource");
    }

    @Override // defpackage.csgh
    public final void c(dssj dssjVar) {
        if (dssjVar != null) {
            this.g = dssjVar;
            return;
        }
        throw new NullPointerException("Null message");
    }

    @Override // defpackage.csgh
    public final void d(int i) {
        if (i != 0) {
            this.h = i;
            return;
        }
        throw new NullPointerException("Null qosTier");
    }

    @Override // defpackage.csgh
    public final csgi a() {
        String str = this.f == null ? " logSource" : "";
        if (this.g == null) {
            str = str.concat(" message");
        }
        if (this.h == 0) {
            str = String.valueOf(str).concat(" qosTier");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new csgg(this.f, this.g, this.a, this.b, this.c, this.d, this.h, this.e);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ajmt  reason: default package */
/* loaded from: classes.dex */
public final class ajmt {
    public Boolean a;
    public Boolean b;
    public ajmw c;
    public ajnb d;
    public int e;
    private Boolean f;
    private Boolean g;
    private Integer h;

    public ajmt() {
    }

    public ajmt(ajmu ajmuVar) {
        this.f = Boolean.valueOf(ajmuVar.c);
        this.g = Boolean.valueOf(ajmuVar.d);
        this.h = Integer.valueOf(ajmuVar.e);
        this.a = Boolean.valueOf(ajmuVar.f);
        this.b = Boolean.valueOf(ajmuVar.g);
        this.e = ajmuVar.j;
        this.c = ajmuVar.h;
        this.d = ajmuVar.i;
    }

    public final void b(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final ajmu a() {
        Boolean bool = this.f;
        if (bool == null || this.g == null || this.h == null || this.a == null || this.b == null || this.e == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" shouldUpdateOnLayoutChange");
            }
            if (this.g == null) {
                sb.append(" shouldAnimate");
            }
            if (this.h == null) {
                sb.append(" placeholderResId");
            }
            if (this.a == null) {
                sb.append(" cleanUpDrawableWhenLoading");
            }
            if (this.b == null) {
                sb.append(" waitLayoutRequest");
            }
            if (this.e == 0) {
                sb.append(" retrieveFromCacheOption");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajmu(bool.booleanValue(), this.g.booleanValue(), this.h.intValue(), this.a.booleanValue(), this.b.booleanValue(), this.e, this.c, this.d);
    }
}

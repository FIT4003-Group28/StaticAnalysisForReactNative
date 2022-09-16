package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alvs  reason: default package */
/* loaded from: classes.dex */
public final class alvs extends alye {
    public Integer a;
    public Integer b;
    public Float c;
    public Float d;
    public Float e;
    public Boolean f;
    private Integer g;
    private Integer h;

    public alvs() {
    }

    public alvs(alyf alyfVar) {
        alvt alvtVar = (alvt) alyfVar;
        this.a = Integer.valueOf(alvtVar.a);
        this.b = Integer.valueOf(alvtVar.b);
        this.g = Integer.valueOf(alvtVar.c);
        this.c = Float.valueOf(alvtVar.d);
        this.d = Float.valueOf(alvtVar.e);
        this.e = Float.valueOf(alvtVar.f);
        this.h = Integer.valueOf(alvtVar.g);
        this.f = Boolean.valueOf(alvtVar.h);
    }

    @Override // defpackage.alye
    public final void b(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.alye
    public final void c(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.alye
    public final alyf a() {
        String str = this.a == null ? " color" : "";
        if (this.b == null) {
            str = str.concat(" outlineColor");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" size");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" outlineWidth");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" leadingRatio");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" trackingRatio");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" attributes");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" off");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new alvt(this.a.intValue(), this.b.intValue(), this.g.intValue(), this.c.floatValue(), this.d.floatValue(), this.e.floatValue(), this.h.intValue(), this.f.booleanValue());
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnio  reason: default package */
/* loaded from: classes3.dex */
public final class bnio extends bnjh {
    public CharSequence a;
    public CharSequence b;
    public cqtd c;
    public String d;
    public cqtd e;
    public cjtd f;
    public Boolean g;
    public Integer h;
    public Integer i;
    private dcdc<cqix<?>> j;
    private Runnable k;

    @Override // defpackage.bnjh
    public final void b(Runnable runnable) {
        if (runnable != null) {
            this.k = runnable;
            return;
        }
        throw new NullPointerException("Null callbackRunnable");
    }

    @Override // defpackage.bnjh
    public final void c(Integer num) {
        this.h = num;
    }

    @Override // defpackage.bnjh
    public final void d(dcdc<cqix<?>> dcdcVar) {
        if (dcdcVar != null) {
            this.j = dcdcVar;
            return;
        }
        throw new NullPointerException("Null styledPlaceAnnotationLayoutItems");
    }

    @Override // defpackage.bnjh
    public final bnji a() {
        String str = this.j == null ? " styledPlaceAnnotationLayoutItems" : "";
        if (this.g == null) {
            str = str.concat(" visible");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" maxLines");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" annotationLayoutType");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" callbackRunnable");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bnip(this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.k);
    }
}

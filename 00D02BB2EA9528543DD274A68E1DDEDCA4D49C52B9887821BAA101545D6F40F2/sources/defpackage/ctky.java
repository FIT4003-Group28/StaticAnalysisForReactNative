package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ctky  reason: default package */
/* loaded from: classes5.dex */
public final class ctky extends ctlo {
    public dcdc<String> a;
    public String b;
    public dcdc<String> c;
    public String d;
    public dbsl<?> e;
    private Uri f;
    private Integer g;
    private Integer h;

    @Override // defpackage.ctlo
    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.ctlo
    public final void c() {
        this.h = 0;
    }

    @Override // defpackage.ctlo
    public final void d(Uri uri) {
        if (uri != null) {
            this.f = uri;
            return;
        }
        throw new NullPointerException("Null tableUri");
    }

    @Override // defpackage.ctlo
    public final ctlp a() {
        String str = this.f == null ? " tableUri" : "";
        if (this.g == null) {
            str = str.concat(" limit");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" offset");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctkz(this.f, this.a, this.b, this.c, this.d, this.g.intValue(), this.h.intValue(), this.e);
    }
}

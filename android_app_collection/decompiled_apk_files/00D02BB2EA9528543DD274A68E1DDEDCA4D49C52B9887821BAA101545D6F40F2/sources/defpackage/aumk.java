package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aumk  reason: default package */
/* loaded from: classes2.dex */
public final class aumk extends aumn {
    public Intent a;
    private Integer d;
    private String e;
    private dplx f;
    public dbsg<ddcu> b = dbpy.a;
    public dbsg<String> c = dbpy.a;
    private dbsg<cjtd> g = dbpy.a;

    @Override // defpackage.aumn
    public final void b(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null actionText");
    }

    @Override // defpackage.aumn
    public final void c(dplx dplxVar) {
        if (dplxVar != null) {
            this.f = dplxVar;
            return;
        }
        throw new NullPointerException("Null androidIntent");
    }

    @Override // defpackage.aumn
    public final void d(cjtd cjtdVar) {
        this.g = dbsg.i(cjtdVar);
    }

    @Override // defpackage.aumn
    public final void e(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.aumn
    public final aumo a() {
        String str = this.d == null ? " icon" : "";
        if (this.e == null) {
            str = str.concat(" actionText");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" intent");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" androidIntent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new auml(this.d.intValue(), this.e, this.a, this.f, this.b, this.c, this.g);
    }
}

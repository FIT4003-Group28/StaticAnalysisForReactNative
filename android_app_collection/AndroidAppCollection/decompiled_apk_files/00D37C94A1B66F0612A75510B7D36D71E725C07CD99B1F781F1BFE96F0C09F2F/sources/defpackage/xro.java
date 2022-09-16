package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: xro  reason: default package */
/* loaded from: classes4.dex */
public final class xro {
    public Drawable a;
    public arif b;
    public String c;
    private Uri d;
    private Integer e;
    private Integer f;

    public xro() {
    }

    public xro(xrp xrpVar) {
        this.d = xrpVar.a;
        this.e = Integer.valueOf(xrpVar.b);
        this.a = xrpVar.c;
        this.b = xrpVar.d;
        this.f = Integer.valueOf(xrpVar.e);
        this.c = xrpVar.f;
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void d(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final xrp a() {
        Integer num;
        Uri uri = this.d;
        if (uri == null || (num = this.e) == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" uri");
            }
            if (this.e == null) {
                sb.append(" rotationAngle");
            }
            if (this.f == null) {
                sb.append(" uploadingState");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xrp(uri, num.intValue(), this.a, this.b, this.f.intValue(), this.c);
    }
}

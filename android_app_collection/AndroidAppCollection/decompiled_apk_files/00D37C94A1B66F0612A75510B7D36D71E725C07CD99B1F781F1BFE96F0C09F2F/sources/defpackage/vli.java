package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: vli  reason: default package */
/* loaded from: classes4.dex */
public final class vli {
    public Boolean a;
    private Uri b;
    private aoqu c;
    private vkt d;
    private amuf e;
    private amuk f;
    private vmr g;
    private Boolean h;
    private Boolean i;

    public final vlj a() {
        aoqu aoquVar;
        vkt vktVar;
        vmr vmrVar;
        Boolean bool;
        amuf amufVar = this.e;
        if (amufVar != null) {
            this.f = amufVar.g();
        } else if (this.f == null) {
            this.f = amuk.q();
        }
        Uri uri = this.b;
        if (uri == null || (aoquVar = this.c) == null || (vktVar = this.d) == null || (vmrVar = this.g) == null || (bool = this.h) == null || this.a == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" uri");
            }
            if (this.c == null) {
                sb.append(" schema");
            }
            if (this.d == null) {
                sb.append(" handler");
            }
            if (this.g == null) {
                sb.append(" variantConfig");
            }
            if (this.h == null) {
                sb.append(" useGeneratedExtensionRegistry");
            }
            if (this.a == null) {
                sb.append(" updateSequencingBugFix");
            }
            if (this.i == null) {
                sb.append(" enableTracing");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new vlj(uri, aoquVar, vktVar, this.f, vmrVar, bool.booleanValue(), this.a.booleanValue(), this.i.booleanValue());
    }

    public final void b(vld vldVar) {
        if (this.e == null) {
            if (this.f == null) {
                this.e = amuk.f();
            } else {
                amuf f = amuk.f();
                this.e = f;
                f.j(this.f);
                this.f = null;
            }
        }
        this.e.h(vldVar);
    }

    public final void c() {
        this.i = false;
    }

    public final void d(vkt vktVar) {
        if (vktVar != null) {
            this.d = vktVar;
            return;
        }
        throw new NullPointerException("Null handler");
    }

    public final void e(aoqu aoquVar) {
        if (aoquVar != null) {
            this.c = aoquVar;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public final void f(Uri uri) {
        if (uri != null) {
            this.b = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void h(vmr vmrVar) {
        if (vmrVar != null) {
            this.g = vmrVar;
            return;
        }
        throw new NullPointerException("Null variantConfig");
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: vdl  reason: default package */
/* loaded from: classes4.dex */
public final class vdl {
    private final String a;
    private final boolean b;
    private final boolean c;

    public vdl(String str) {
        this(str, false, false);
    }

    private vdl(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final vdg a(String str, double d) {
        return new vdg(this.a, str, Double.valueOf(d), new vci(this.b, this.c, vdh.c, new vdj(Double.class)));
    }

    public final vdg b(String str, long j) {
        return new vdg(this.a, str, Long.valueOf(j), new vci(this.b, this.c, vdh.d, new vdj(Long.class, 2)));
    }

    public final vdg c(String str, String str2) {
        return new vdg(this.a, str, str2, new vci(this.b, this.c, vdh.b, new vdj(String.class, 3)));
    }

    public final vdg d(String str, boolean z) {
        return new vdg(this.a, str, Boolean.valueOf(z), new vci(this.b, this.c, vdh.a, new vdj(Boolean.class, 1)));
    }

    public final vdg e(String str, Object obj, vdk vdkVar) {
        return new vdg(this.a, str, obj, new vci(this.b, this.c, new vdi(vdkVar), new vdi(vdkVar, 1)));
    }

    public final vdl f() {
        return new vdl(this.a, true, this.c);
    }

    public final vdl g() {
        return new vdl(this.a, this.b, true);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bdhb  reason: default package */
/* loaded from: classes3.dex */
public final class bdhb extends bdhe {
    public String a;
    public String b;
    public String c;
    public int d;
    private String e;
    private dwyd f;
    private String g;
    private String h;
    private dcdc<bbtm> i;
    private bdhf j;

    @Override // defpackage.bdhe
    public final void b(dwyd dwydVar) {
        if (dwydVar != null) {
            this.f = dwydVar;
            return;
        }
        throw new NullPointerException("Null entryPoint");
    }

    @Override // defpackage.bdhe
    public final void c(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null fid");
    }

    @Override // defpackage.bdhe
    public final void d(dcdc<bbtm> dcdcVar) {
        if (dcdcVar != null) {
            this.i = dcdcVar;
            return;
        }
        throw new NullPointerException("Null preselectedPhotos");
    }

    @Override // defpackage.bdhe
    public final void e(bdhf bdhfVar) {
        if (bdhfVar != null) {
            this.j = bdhfVar;
            return;
        }
        throw new NullPointerException("Null selectionMode");
    }

    @Override // defpackage.bdhe
    public final void f(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null subtitle");
    }

    @Override // defpackage.bdhe
    public final void g(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.bdhe
    public final bdhg a() {
        String str = this.e == null ? " fid" : "";
        if (this.f == null) {
            str = str.concat(" entryPoint");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" title");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" subtitle");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" localUploadBehavior");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" preselectedPhotos");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" selectionMode");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bdhc(this.e, this.a, this.b, this.f, this.g, this.h, this.c, this.d, this.i, this.j);
    }
}

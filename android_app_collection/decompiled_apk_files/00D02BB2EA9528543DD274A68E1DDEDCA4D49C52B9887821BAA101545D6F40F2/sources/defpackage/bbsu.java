package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bbsu  reason: default package */
/* loaded from: classes3.dex */
public final class bbsu extends bbuz {
    public bbvd a;
    public ilo b;
    public dbsg<Integer> c;
    private bbvb d;
    private bbuy e;
    private dwyd f;
    private String g;
    private dcdc<bbtm> h;
    private dcdc<bbtm> i;
    private Boolean j;
    private Boolean k;

    public bbsu() {
        this.c = dbpy.a;
    }

    public bbsu(bbve bbveVar) {
        this.c = dbpy.a;
        bbsv bbsvVar = (bbsv) bbveVar;
        this.a = bbsvVar.a;
        this.d = bbsvVar.b;
        this.e = bbsvVar.c;
        this.f = bbsvVar.d;
        this.g = bbsvVar.e;
        this.b = bbsvVar.f;
        this.h = bbsvVar.g;
        this.i = bbsvVar.h;
        this.j = Boolean.valueOf(bbsvVar.i);
        this.k = Boolean.valueOf(bbsvVar.j);
        this.c = bbsvVar.k;
    }

    @Override // defpackage.bbuz
    public final void b(bbuy bbuyVar) {
        if (bbuyVar != null) {
            this.e = bbuyVar;
            return;
        }
        throw new NullPointerException("Null afterUploadBehavior");
    }

    @Override // defpackage.bbuz
    public final void c(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.bbuz
    public final void d(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.bbuz
    public final void e(dwyd dwydVar) {
        if (dwydVar != null) {
            this.f = dwydVar;
            return;
        }
        throw new NullPointerException("Null entryPoint");
    }

    @Override // defpackage.bbuz
    public final void f(bbvb bbvbVar) {
        if (bbvbVar != null) {
            this.d = bbvbVar;
            return;
        }
        throw new NullPointerException("Null photoPickerAppearanceOptions");
    }

    @Override // defpackage.bbuz
    public final void g(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null photosLabel");
    }

    @Override // defpackage.bbuz
    public final void h(@dzsi bbvd bbvdVar) {
        this.a = bbvdVar;
    }

    @Override // defpackage.bbuz
    public final void i(List<bbtm> list) {
        this.h = dcdc.r(list);
    }

    @Override // defpackage.bbuz
    public final void j(List<bbtm> list) {
        this.i = dcdc.r(list);
    }

    @Override // defpackage.bbuz
    public final bbve a() {
        String str = this.d == null ? " photoPickerAppearanceOptions" : "";
        if (this.e == null) {
            str = str.concat(" afterUploadBehavior");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" entryPoint");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" photosLabel");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" selectedPhotoList");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" suggestedPhotoList");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" captioningPhotosEnabled");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" editingPhotosEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbsv(this.a, this.d, this.e, this.f, this.g, this.b, this.h, this.i, this.j.booleanValue(), this.k.booleanValue(), this.c);
    }
}

package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdad  reason: default package */
/* loaded from: classes4.dex */
public final class cdad extends cdez {
    public Integer a;
    public ilo b;
    public Boolean c;
    public String d;
    public int e;
    public int f;
    private Boolean g;
    private Boolean h;
    private List<bvrt<dwfl>> i;

    public cdad() {
    }

    public cdad(cdfa cdfaVar) {
        cdae cdaeVar = (cdae) cdfaVar;
        this.a = Integer.valueOf(cdaeVar.a);
        this.b = cdaeVar.b;
        this.f = cdaeVar.i;
        this.e = cdaeVar.h;
        this.g = Boolean.valueOf(cdaeVar.c);
        this.c = Boolean.valueOf(cdaeVar.d);
        this.h = Boolean.valueOf(cdaeVar.e);
        this.d = cdaeVar.f;
        this.i = cdaeVar.g;
    }

    @Override // defpackage.cdez
    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.cdez
    public final void c(int i) {
        this.e = i;
    }

    @Override // defpackage.cdez
    public final void d(ilo iloVar) {
        this.b = iloVar;
    }

    @Override // defpackage.cdez
    public final void e(List<bvrt<dwfl>> list) {
        this.i = list;
    }

    @Override // defpackage.cdez
    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cdez
    public final cdfa a() {
        String str = this.a == null ? " placeIndex" : "";
        if (this.b == null) {
            str = str.concat(" placemark");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" entryType");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" placeCardStatus");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" ugcPhotoMissing");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" onDevicePhotos");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" forceExpanded");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" placeVed");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" serializedPhotos");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cdae(this.a.intValue(), this.b, this.f, this.e, this.g.booleanValue(), this.c.booleanValue(), this.h.booleanValue(), this.d, this.i);
    }
}

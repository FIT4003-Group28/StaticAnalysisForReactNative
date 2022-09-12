package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: bosg  reason: default package */
/* loaded from: classes3.dex */
public final class bosg extends bosi {
    public byee a;
    public byee b;
    public Boolean c;
    public Boolean d;
    private String e;
    private bokf f;
    private String g;
    private Set<byea> h;

    public bosg() {
    }

    public bosg(bosj bosjVar) {
        bosh boshVar = (bosh) bosjVar;
        this.e = boshVar.a;
        this.a = boshVar.b;
        this.b = boshVar.c;
        this.f = boshVar.d;
        this.g = boshVar.e;
        this.c = boshVar.f;
        this.d = boshVar.g;
        this.h = boshVar.h;
    }

    @Override // defpackage.bosi
    public final void b(bokf bokfVar) {
        if (bokfVar != null) {
            this.f = bokfVar;
            return;
        }
        throw new NullPointerException("Null businessHoursPhotosPreview");
    }

    @Override // defpackage.bosi
    public final void c(Set<byea> set) {
        if (set != null) {
            this.h = set;
            return;
        }
        throw new NullPointerException("Null daysVerifiedIncorrect");
    }

    @Override // defpackage.bosi
    public final void d(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null placeName");
    }

    @Override // defpackage.bosi
    public final void e(@dzsi byee byeeVar) {
        this.a = byeeVar;
    }

    @Override // defpackage.bosi
    public final void f(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null timezoneId");
    }

    @Override // defpackage.bosi
    public final void g(Boolean bool) {
        this.c = bool;
    }

    @Override // defpackage.bosi
    public final void h(Boolean bool) {
        this.d = bool;
    }

    @Override // defpackage.bosi
    public final bosj a() {
        String str = this.e == null ? " placeName" : "";
        if (this.f == null) {
            str = str.concat(" businessHoursPhotosPreview");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" timezoneId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" verifiedCorrectHours");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" verifiedIncorrectHours");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" daysVerifiedIncorrect");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bosh(this.e, this.a, this.b, this.f, this.g, this.c, this.d, this.h);
    }
}

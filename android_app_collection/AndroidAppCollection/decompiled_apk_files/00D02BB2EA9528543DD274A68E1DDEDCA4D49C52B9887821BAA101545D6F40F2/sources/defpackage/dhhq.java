package defpackage;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: dhhq  reason: default package */
/* loaded from: classes6.dex */
public final class dhhq extends dhib {
    public Uri a;
    public Bitmap b;
    public String c;
    public Location d;
    public String e;
    public Long f;
    public Boolean g;
    public csfh h;
    public Integer i;
    public Integer j;
    public String k;

    public dhhq() {
    }

    public dhhq(dhic dhicVar) {
        dhhr dhhrVar = (dhhr) dhicVar;
        this.a = dhhrVar.a;
        this.b = dhhrVar.b;
        this.c = dhhrVar.c;
        this.d = dhhrVar.d;
        this.e = dhhrVar.e;
        this.f = dhhrVar.g;
        this.g = dhhrVar.h;
        this.h = dhhrVar.i;
        this.i = dhhrVar.j;
        this.j = dhhrVar.k;
        this.k = dhhrVar.l;
    }

    @Override // defpackage.dhib
    public final dhic a() {
        return new dhhr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.dhib
    public final void b(Bitmap bitmap) {
        this.b = bitmap;
    }

    @Override // defpackage.dhib
    public final void c(Long l) {
        this.f = l;
    }
}

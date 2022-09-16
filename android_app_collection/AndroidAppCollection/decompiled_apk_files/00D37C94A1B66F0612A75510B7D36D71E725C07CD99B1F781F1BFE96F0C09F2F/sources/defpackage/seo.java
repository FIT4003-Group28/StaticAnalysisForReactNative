package defpackage;
/* compiled from: PG */
/* renamed from: seo  reason: default package */
/* loaded from: classes4.dex */
public final class seo {
    sek a;
    public boolean b;
    float c;
    float d;
    public sek e;
    public boolean f;

    public seo() {
        this.b = true;
        this.e = null;
    }

    public seo(seo seoVar) {
        this.b = true;
        this.e = null;
        this.a = seoVar.a.a();
        this.b = seoVar.b;
        this.c = seoVar.c;
        this.d = seoVar.d;
        sek sekVar = seoVar.e;
        if (sekVar != null) {
            this.e = sekVar.a();
        }
        this.f = seoVar.f;
    }
}

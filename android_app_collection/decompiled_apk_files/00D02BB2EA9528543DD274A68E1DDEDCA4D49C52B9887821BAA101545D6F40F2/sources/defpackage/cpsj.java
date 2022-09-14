package defpackage;
/* compiled from: PG */
/* renamed from: cpsj  reason: default package */
/* loaded from: classes5.dex */
public final class cpsj {
    cpsf<Integer> a;
    public boolean b;
    float c;
    float d;
    boolean e;
    cpsf<Double> f;
    boolean g;

    public cpsj() {
        this.b = true;
        this.e = false;
        this.f = null;
    }

    public cpsj(cpsj cpsjVar) {
        this.b = true;
        this.e = false;
        this.f = null;
        this.a = cpsjVar.a.a();
        this.b = cpsjVar.b;
        this.c = cpsjVar.c;
        this.d = cpsjVar.d;
        this.e = cpsjVar.e;
        cpsf<Double> cpsfVar = cpsjVar.f;
        if (cpsfVar != null) {
            this.f = cpsfVar.a();
        }
        this.g = cpsjVar.g;
    }
}

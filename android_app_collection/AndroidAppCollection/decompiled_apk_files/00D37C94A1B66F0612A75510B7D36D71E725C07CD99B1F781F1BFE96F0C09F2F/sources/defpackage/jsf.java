package defpackage;
/* compiled from: PG */
/* renamed from: jsf  reason: default package */
/* loaded from: classes3.dex */
public final class jsf {
    public final fbh a;
    public final yrj b;

    public jsf(fbh fbhVar, yrj yrjVar) {
        this.a = fbhVar;
        this.b = yrjVar;
    }

    public final ayos a() {
        return this.a.a(fbg.a).w(new ayqe() { // from class: jse
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                aqpe aqpeVar = (aqpe) obj;
                return Boolean.valueOf(jsf.this.b.p() ? aqpeVar.c : aqpeVar.d);
            }
        }).R(false);
    }
}

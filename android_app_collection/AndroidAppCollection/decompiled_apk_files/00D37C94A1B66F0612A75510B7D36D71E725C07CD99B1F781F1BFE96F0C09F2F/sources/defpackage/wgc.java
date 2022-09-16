package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wgc  reason: default package */
/* loaded from: classes4.dex */
public final class wgc implements afzf {
    final /* synthetic */ wfk a;

    public wgc(wfk wfkVar) {
        this.a = wfkVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.b(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aase aaseVar = (aase) obj;
        aarw a = aaseVar.a();
        if (a == null) {
            List c = aaseVar.c();
            if (c.size() == 1) {
                a = (aarw) c.get(0);
            }
        }
        if (a != null) {
            this.a.c(a);
        } else {
            this.a.a();
        }
    }
}

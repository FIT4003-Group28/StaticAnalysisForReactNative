package defpackage;

import com.google.android.libraries.youtube.metadataeditor.geo.Place;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ikc  reason: default package */
/* loaded from: classes3.dex */
public final class ikc implements afqs {
    public asvl a;
    final /* synthetic */ ike b;
    public aysm c;

    public ikc(ike ikeVar) {
        this.b = ikeVar;
    }

    @Override // defpackage.afqs
    public final void d() {
        this.b.z();
        aysm aysmVar = this.c;
        if (aysmVar != null) {
            aysmVar.a();
        }
    }

    @Override // defpackage.afqs
    public final void e(Place place) {
        asvl asvlVar = this.a;
        if ((asvlVar.c & 1) != 0) {
            aopa createBuilder = asvm.a.createBuilder();
            String str = place.b;
            createBuilder.copyOnWrite();
            asvm asvmVar = (asvm) createBuilder.instance;
            str.getClass();
            asvmVar.b |= 2;
            asvmVar.c = str;
            String str2 = place.a;
            createBuilder.copyOnWrite();
            asvm asvmVar2 = (asvm) createBuilder.instance;
            str2.getClass();
            asvmVar2.b |= 4;
            asvmVar2.d = str2;
            this.b.y.b(asvlVar.d, ((asvm) createBuilder.mo39build()).toByteArray());
            if (!place.a.equals(asvlVar.f)) {
                aopa createBuilder2 = awpn.a.createBuilder();
                createBuilder2.copyOnWrite();
                awpn awpnVar = (awpn) createBuilder2.instance;
                awpnVar.b |= 1;
                awpnVar.c = true;
                this.b.y.b(asvlVar.e, ((awpn) createBuilder2.mo39build()).toByteArray());
            }
        }
        this.b.z();
        aysm aysmVar = this.c;
        if (aysmVar != null) {
            aysmVar.a();
        }
    }
}

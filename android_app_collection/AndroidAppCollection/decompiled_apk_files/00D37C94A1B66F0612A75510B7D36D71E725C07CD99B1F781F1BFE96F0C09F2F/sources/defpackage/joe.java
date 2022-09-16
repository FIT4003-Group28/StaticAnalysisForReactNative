package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: joe  reason: default package */
/* loaded from: classes3.dex */
public final class joe implements agvu {
    private final afvn a;
    private final aahf b;
    private final Context c;

    public joe(Context context, afvn afvnVar, aahf aahfVar) {
        this.c = context;
        this.a = afvnVar;
        this.b = aahfVar;
    }

    @Override // defpackage.agvu
    public final asaj a(asaj asajVar, String str) {
        aopc aopcVar = (aopc) asajVar.mo52toBuilder();
        ylr.b();
        aqqv aqqvVar = (aqqv) this.b.a(this.a.c()).f(emn.l(str)).g(aqqv.class).W();
        if (aqqvVar != null && (((aqqvVar.b.c & 2) == 0 || aqqvVar.getPlaybackStartSeconds().longValue() == 0) && !aqqvVar.getLicenses().isEmpty() && !((aqqz) aqqvVar.getLicenses().get(0)).f)) {
            asaa asaaVar = asajVar.f;
            if (asaaVar == null) {
                asaaVar = asaa.a;
            }
            int i = (int) (((aqqz) aqqvVar.getLicenses().get(0)).e / 3600);
            String quantityString = this.c.getResources().getQuantityString(R.plurals.rental_expiry_notice, i, Integer.valueOf(i));
            aopa createBuilder = awip.a.createBuilder();
            aopc aopcVar2 = (aopc) arag.a.createBuilder();
            aopcVar2.copyOnWrite();
            arag aragVar = (arag) aopcVar2.instance;
            quantityString.getClass();
            aragVar.b |= 1;
            aragVar.d = quantityString;
            arag aragVar2 = (arag) aopcVar2.mo39build();
            createBuilder.copyOnWrite();
            awip awipVar = (awip) createBuilder.instance;
            aragVar2.getClass();
            awipVar.c = aragVar2;
            awipVar.b |= 4;
            awip awipVar2 = (awip) createBuilder.mo39build();
            asar asarVar = asaaVar.m;
            if (asarVar == null) {
                asarVar = asar.a;
            }
            aopa mo52toBuilder = asarVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            asar asarVar2 = (asar) mo52toBuilder.instance;
            awipVar2.getClass();
            asarVar2.c = awipVar2;
            asarVar2.b = 86428467;
            asar asarVar3 = (asar) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = asaaVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            asaa asaaVar2 = (asaa) mo52toBuilder2.instance;
            asarVar3.getClass();
            asaaVar2.m = asarVar3;
            asaaVar2.b |= 65536;
            asaa asaaVar3 = (asaa) mo52toBuilder2.mo39build();
            aopcVar.copyOnWrite();
            asaj asajVar2 = (asaj) aopcVar.instance;
            asaaVar3.getClass();
            asajVar2.f = asaaVar3;
            asajVar2.b |= 4;
            atzv atzvVar = asajVar.e;
            if (atzvVar == null) {
                atzvVar = atzv.a;
            }
            atzg atzgVar = atzvVar.g;
            if (atzgVar == null) {
                atzgVar = atzg.a;
            }
            aopa mo52toBuilder3 = atzgVar.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            atzg atzgVar2 = (atzg) mo52toBuilder3.instance;
            atzgVar2.b |= 32;
            atzgVar2.e = true;
            atzg atzgVar3 = (atzg) mo52toBuilder3.mo39build();
            aopa mo52toBuilder4 = atzvVar.mo52toBuilder();
            mo52toBuilder4.copyOnWrite();
            atzv atzvVar2 = (atzv) mo52toBuilder4.instance;
            atzgVar3.getClass();
            atzvVar2.g = atzgVar3;
            atzvVar2.b |= 128;
            atzv atzvVar3 = (atzv) mo52toBuilder4.mo39build();
            aopcVar.copyOnWrite();
            asaj asajVar3 = (asaj) aopcVar.instance;
            atzvVar3.getClass();
            asajVar3.e = atzvVar3;
            asajVar3.b |= 2;
        }
        return (asaj) aopcVar.mo39build();
    }
}

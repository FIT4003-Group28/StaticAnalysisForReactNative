package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import j$.util.Collection;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: jgn  reason: default package */
/* loaded from: classes3.dex */
public final class jgn {
    public final Context a;
    public final aadd b;
    public final ankw c;
    public final axxa d;
    public final axwt e;
    public final jgo f;

    public jgn(Context context, aadd aaddVar, ankw ankwVar, axxa axxaVar, axwt axwtVar, jgo jgoVar) {
        this.a = context;
        this.b = aaddVar;
        this.c = ankwVar;
        this.d = axxaVar;
        this.e = axwtVar;
        this.f = jgoVar;
    }

    public static amuk a(amuk amukVar) {
        return (amuk) Collection.EL.stream(amukVar).map(ioc.o).collect(amsf.a);
    }

    public final aqnp b(amuk amukVar, amuk amukVar2, amuk amukVar3, int i, String str, boolean z) {
        aopa createBuilder = aqnp.a.createBuilder();
        String string = this.a.getString(R.string.offline_quality_selection_upsell_description);
        createBuilder.copyOnWrite();
        aqnp aqnpVar = (aqnp) createBuilder.instance;
        string.getClass();
        aqnpVar.b |= 1;
        aqnpVar.c = string;
        String string2 = this.a.getString(R.string.offline_remember_stream_setting);
        createBuilder.copyOnWrite();
        aqnp aqnpVar2 = (aqnp) createBuilder.instance;
        string2.getClass();
        aqnpVar2.b |= 2;
        aqnpVar2.f = string2;
        String quantityString = this.a.getResources().getQuantityString(R.plurals.offline_remember_setting_for_days, i, Integer.valueOf(i));
        createBuilder.copyOnWrite();
        aqnp aqnpVar3 = (aqnp) createBuilder.instance;
        quantityString.getClass();
        aqnpVar3.b |= 4;
        aqnpVar3.g = quantityString;
        createBuilder.copyOnWrite();
        aqnp aqnpVar4 = (aqnp) createBuilder.instance;
        aqnpVar4.b |= 8;
        aqnpVar4.h = z;
        aopa createBuilder2 = aqnm.a.createBuilder();
        String string3 = this.a.getString(R.string.accessibility_selected);
        createBuilder2.copyOnWrite();
        aqnm aqnmVar = (aqnm) createBuilder2.instance;
        string3.getClass();
        aqnmVar.b |= 1;
        aqnmVar.c = string3;
        aqnm aqnmVar2 = (aqnm) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqnp aqnpVar5 = (aqnp) createBuilder.instance;
        aqnmVar2.getClass();
        aqnpVar5.i = aqnmVar2;
        aqnpVar5.b |= 32;
        if (!amukVar.isEmpty()) {
            aopa createBuilder3 = aqno.a.createBuilder();
            String string4 = this.a.getString(R.string.download_quality_picker_title);
            createBuilder3.copyOnWrite();
            aqno aqnoVar = (aqno) createBuilder3.instance;
            string4.getClass();
            aqnoVar.b |= 1;
            aqnoVar.c = string4;
            createBuilder.copyOnWrite();
            aqnp aqnpVar6 = (aqnp) createBuilder.instance;
            aqno aqnoVar2 = (aqno) createBuilder3.mo39build();
            aqnoVar2.getClass();
            aqnpVar6.l = aqnoVar2;
            aqnpVar6.b |= 512;
            createBuilder.copyOnWrite();
            aqnp aqnpVar7 = (aqnp) createBuilder.instance;
            aopu aopuVar = aqnpVar7.d;
            if (!aopuVar.c()) {
                aqnpVar7.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) amukVar, (List) aqnpVar7.d);
            createBuilder.copyOnWrite();
            aqnp aqnpVar8 = (aqnp) createBuilder.instance;
            aopu aopuVar2 = aqnpVar8.k;
            if (!aopuVar2.c()) {
                aqnpVar8.k = aopi.mutableCopy(aopuVar2);
            }
            aonk.addAll((Iterable) amukVar3, (List) aqnpVar8.k);
        }
        if (!amukVar2.isEmpty()) {
            createBuilder.copyOnWrite();
            aqnp aqnpVar9 = (aqnp) createBuilder.instance;
            aopu aopuVar3 = aqnpVar9.e;
            if (!aopuVar3.c()) {
                aqnpVar9.e = aopi.mutableCopy(aopuVar3);
            }
            aonk.addAll((Iterable) amukVar2, (List) aqnpVar9.e);
            aopa createBuilder4 = aqno.a.createBuilder();
            String string5 = this.a.getString(R.string.download_audio_track_picker_title);
            createBuilder4.copyOnWrite();
            aqno aqnoVar3 = (aqno) createBuilder4.instance;
            string5.getClass();
            aqnoVar3.b |= 1;
            aqnoVar3.c = string5;
            String string6 = this.a.getString(R.string.download_audio_track_picker_subtitle);
            createBuilder4.copyOnWrite();
            aqno aqnoVar4 = (aqno) createBuilder4.instance;
            string6.getClass();
            aqnoVar4.b |= 2;
            aqnoVar4.d = string6;
            aqno aqnoVar5 = (aqno) createBuilder4.mo39build();
            createBuilder.copyOnWrite();
            aqnp aqnpVar10 = (aqnp) createBuilder.instance;
            aqnoVar5.getClass();
            aqnpVar10.m = aqnoVar5;
            aqnpVar10.b |= 1024;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            aqnp aqnpVar11 = (aqnp) createBuilder.instance;
            aqnpVar11.b |= 64;
            aqnpVar11.j = str;
        }
        return (aqnp) createBuilder.mo39build();
    }

    public final ampq c(amuk amukVar, ampq ampqVar, amuk amukVar2, String str, String str2, boolean z, int i, String str3, amuk amukVar3, int i2, ampq ampqVar2) {
        aopa createBuilder = aqnv.a.createBuilder();
        aopa createBuilder2 = aqnw.a.createBuilder();
        boolean isEmpty = amukVar2.isEmpty();
        aqnp b = b(amukVar, amukVar2, a(amukVar3), i2, null, isEmpty);
        aqns d = d(amukVar, str, str2, new int[]{1, 2, 3}[i - 1], ampqVar2, null, isEmpty);
        if (!amukVar.isEmpty()) {
            createBuilder2.copyOnWrite();
            aqnw aqnwVar = (aqnw) createBuilder2.instance;
            aqnwVar.d = (aqnl) ampqVar.c();
            aqnwVar.b |= 2;
        }
        if (!amukVar2.isEmpty()) {
            aqnh aqnhVar = (aqnh) amukVar2.get(0);
            createBuilder2.copyOnWrite();
            aqnw aqnwVar2 = (aqnw) createBuilder2.instance;
            aqnhVar.getClass();
            aqnwVar2.e = aqnhVar;
            aqnwVar2.b |= 4;
        }
        aopa createBuilder3 = aqnr.a.createBuilder();
        createBuilder3.copyOnWrite();
        aqnr aqnrVar = (aqnr) createBuilder3.instance;
        aqnrVar.b |= 2;
        aqnrVar.c = true;
        createBuilder.copyOnWrite();
        aqnv aqnvVar = (aqnv) createBuilder.instance;
        aqnr aqnrVar2 = (aqnr) createBuilder3.mo39build();
        aqnrVar2.getClass();
        aqnvVar.d = aqnrVar2;
        aqnvVar.c |= 2048;
        createBuilder.copyOnWrite();
        aqnv aqnvVar2 = (aqnv) createBuilder.instance;
        b.getClass();
        aqnvVar2.g = b;
        aqnvVar2.c |= 536870912;
        createBuilder.copyOnWrite();
        aqnv aqnvVar3 = (aqnv) createBuilder.instance;
        d.getClass();
        aqnvVar3.h = d;
        aqnvVar3.c |= 1073741824;
        createBuilder2.copyOnWrite();
        aqnw aqnwVar3 = (aqnw) createBuilder2.instance;
        aqnwVar3.b |= 1;
        aqnwVar3.c = z;
        aqnw aqnwVar4 = (aqnw) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqnv aqnvVar4 = (aqnv) createBuilder.instance;
        aqnwVar4.getClass();
        aqnvVar4.e = aqnwVar4;
        aqnvVar4.c |= 131072;
        createBuilder.copyOnWrite();
        aqnv aqnvVar5 = (aqnv) createBuilder.instance;
        str3.getClass();
        aqnvVar5.c |= 262144;
        aqnvVar5.f = str3;
        return this.f.a(R.raw.download_options_picker_element_android, aqnv.b, (aqnv) createBuilder.mo39build());
    }

    public final aqns d(amuk amukVar, String str, String str2, int i, ampq ampqVar, String str3, boolean z) {
        aopa createBuilder = aqns.a.createBuilder();
        String h = akzj.h(this.a.getString(R.string.cancel));
        createBuilder.copyOnWrite();
        aqns aqnsVar = (aqns) createBuilder.instance;
        h.getClass();
        aqnsVar.b |= 2;
        aqnsVar.h = h;
        createBuilder.copyOnWrite();
        aqns aqnsVar2 = (aqns) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        aqnsVar2.g = i2;
        aqnsVar2.b |= 1;
        String h2 = akzj.h(this.a.getString(R.string.offline_quality_selection_get_premium));
        createBuilder.copyOnWrite();
        aqns aqnsVar3 = (aqns) createBuilder.instance;
        h2.getClass();
        aqnsVar3.b |= 4;
        aqnsVar3.i = h2;
        String h3 = akzj.h(this.a.getString(R.string.download));
        createBuilder.copyOnWrite();
        aqns aqnsVar4 = (aqns) createBuilder.instance;
        h3.getClass();
        aqnsVar4.b |= 8;
        aqnsVar4.j = h3;
        createBuilder.copyOnWrite();
        aqns aqnsVar5 = (aqns) createBuilder.instance;
        aqnsVar5.b |= 512;
        aqnsVar5.m = z;
        if (str != null) {
            createBuilder.copyOnWrite();
            aqns aqnsVar6 = (aqns) createBuilder.instance;
            aqnsVar6.c = 6;
            aqnsVar6.d = str;
        } else if (str2 != null) {
            createBuilder.copyOnWrite();
            aqns aqnsVar7 = (aqns) createBuilder.instance;
            aqnsVar7.c = 7;
            aqnsVar7.d = str2;
        }
        if (ampqVar.h()) {
            createBuilder.copyOnWrite();
            aqns aqnsVar8 = (aqns) createBuilder.instance;
            aqnsVar8.e = 8;
            aqnsVar8.f = (aoob) ampqVar.c();
        }
        if (i == 2) {
            aopc aopcVar = (aopc) awmt.a.createBuilder();
            aopcVar.e(aqmn.b, aqmn.a);
            awmt awmtVar = (awmt) aopcVar.mo39build();
            createBuilder.copyOnWrite();
            aqns aqnsVar9 = (aqns) createBuilder.instance;
            awmtVar.getClass();
            aqnsVar9.k = awmtVar;
            aqnsVar9.b |= 16;
        } else if (i == 3) {
            aopc aopcVar2 = (aopc) awmt.a.createBuilder();
            aopcVar2.e(awsk.b, awsk.a);
            awmt awmtVar2 = (awmt) aopcVar2.mo39build();
            createBuilder.copyOnWrite();
            aqns aqnsVar10 = (aqns) createBuilder.instance;
            awmtVar2.getClass();
            aqnsVar10.k = awmtVar2;
            aqnsVar10.b |= 16;
        }
        if (!amukVar.isEmpty()) {
            createBuilder.copyOnWrite();
            aqns aqnsVar11 = (aqns) createBuilder.instance;
            aopu aopuVar = aqnsVar11.l;
            if (!aopuVar.c()) {
                aqnsVar11.l = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) amukVar, (List) aqnsVar11.l);
        }
        if (str3 != null) {
            createBuilder.copyOnWrite();
            aqns aqnsVar12 = (aqns) createBuilder.instance;
            aqnsVar12.b |= 1024;
            aqnsVar12.n = str3;
        }
        return (aqns) createBuilder.mo39build();
    }
}

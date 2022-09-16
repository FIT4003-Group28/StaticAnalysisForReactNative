package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: lxb  reason: default package */
/* loaded from: classes3.dex */
final class lxb extends akam {
    final ampq a;
    final ampq b;
    final ampq c;
    final aakw d;
    final Parcelable e;
    public final boolean f;
    public final boolean g;
    final aopa h;
    public final aopa i;

    public lxb(aopa aopaVar, ampq ampqVar, ampq ampqVar2, ampq ampqVar3, aakw aakwVar, LinearLayoutManager linearLayoutManager, boolean z, boolean z2, aopa aopaVar2, boolean z3, ajsm ajsmVar) {
        if (aopaVar != null && !z3) {
            ArrayList arrayList = new ArrayList(ajsmVar.size());
            ajsmVar.k(arrayList);
            aopaVar.copyOnWrite();
            aqyd aqydVar = aqyd.a;
            ((aqyd) aopaVar.instance).c = aqyd.emptyProtobufList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof apvg) {
                    aopc aopcVar = (aopc) aunb.a.createBuilder();
                    aopcVar.e(ChipCloudRendererOuterClass.chipCloudChipRenderer, (apvg) obj);
                    aopaVar.ad(aopcVar);
                } else if (obj instanceof apoj) {
                    aopc aopcVar2 = (aopc) aunb.a.createBuilder();
                    aopcVar2.e(ButtonRendererOuterClass.buttonRenderer, (apoj) obj);
                    aopaVar.ad(aopcVar2);
                } else if (obj instanceof apvl) {
                    aopc aopcVar3 = (aopc) aunb.a.createBuilder();
                    aopcVar3.e(ChipCloudRendererOuterClass.chipDividerRenderer, (apvl) obj);
                    aopaVar.ad(aopcVar3);
                }
            }
        }
        this.a = ampqVar;
        this.b = ampqVar2;
        this.c = ampqVar3;
        this.d = aakwVar;
        this.e = linearLayoutManager.P();
        this.h = aopaVar;
        this.f = z;
        this.g = z2;
        this.i = aopaVar2;
    }
}

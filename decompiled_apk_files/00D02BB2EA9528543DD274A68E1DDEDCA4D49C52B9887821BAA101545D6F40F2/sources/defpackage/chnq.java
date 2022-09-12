package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chnq  reason: default package */
/* loaded from: classes4.dex */
final class chnq implements btzi<dwtm, dwul> {
    final /* synthetic */ chns a;

    public chnq(chns chnsVar) {
        this.a = chnsVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwtm> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwtm> btzrVar, dwul dwulVar) {
        dwul dwulVar2 = dwulVar;
        if (!this.a.m.a()) {
            return;
        }
        dori doriVar = dwulVar2.b;
        if (doriVar == null) {
            doriVar = dori.l;
        }
        if (doriVar.i <= this.a.m.b().intValue()) {
            return;
        }
        dori doriVar2 = dwulVar2.b;
        if (doriVar2 == null) {
            doriVar2 = dori.l;
        }
        int i = doriVar2.i;
        chns chnsVar = this.a;
        chny chnyVar = chnsVar.f;
        Resources resources = chnsVar.e;
        Integer valueOf = Integer.valueOf(i);
        chnyVar.b(resources.getString(R.string.AWARD_NEW_LOCAL_GUIDE_LEVEL, valueOf), dwulVar2.e);
        this.a.m = dbsg.i(valueOf);
    }
}

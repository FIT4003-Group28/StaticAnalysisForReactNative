package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agut  reason: default package */
/* loaded from: classes.dex */
public final class agut extends agus {
    private final List a;

    public agut(aguv aguvVar, agvf agvfVar, snc sncVar, SharedPreferences sharedPreferences, aadd aaddVar, agkp agkpVar, yni yniVar) {
        super(aguvVar, agvfVar, sncVar, sharedPreferences, aaddVar, agkpVar, yniVar);
        this.a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agus
    public final void e(arzo arzoVar, atse atseVar, agvx agvxVar, long j, agqu agquVar) {
        if (agquVar == null) {
            return;
        }
        aopa mo52toBuilder = atseVar.mo52toBuilder();
        if (this.a.size() != 0) {
            aopa mo52toBuilder2 = arzoVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            ((arzo) mo52toBuilder2.instance).c = arzo.emptyIntList();
            List<atru> list = this.a;
            mo52toBuilder2.copyOnWrite();
            arzo arzoVar2 = (arzo) mo52toBuilder2.instance;
            aopq aopqVar = arzoVar2.c;
            if (!aopqVar.c()) {
                arzoVar2.c = aopi.mutableCopy(aopqVar);
            }
            for (atru atruVar : list) {
                arzoVar2.c.g(atruVar.h);
            }
            arzoVar = (arzo) mo52toBuilder2.mo39build();
        }
        super.e(arzoVar, (atse) mo52toBuilder.mo39build(), agvxVar, j, agquVar);
    }
}

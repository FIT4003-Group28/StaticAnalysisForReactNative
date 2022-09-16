package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: jka  reason: default package */
/* loaded from: classes3.dex */
public final class jka extends agsr {
    private final jml a;
    private final String b;

    public jka(jml jmlVar, aadd aaddVar, aacz aaczVar) {
        super(aaddVar);
        this.a = jmlVar;
        asxj asxjVar = aaczVar.b().e;
        this.b = (asxjVar == null ? asxj.a : asxjVar).aD;
    }

    private static asgf o(Context context, agqo agqoVar) {
        arag aragVar;
        arag j = j(agqoVar.j());
        String string = context.getString(R.string.video_views, Long.valueOf(agqoVar.b()));
        agqa agqaVar = agqoVar.a;
        String str = agqaVar != null ? agqaVar.b : "";
        aopa createBuilder = aubi.a.createBuilder();
        createBuilder.copyOnWrite();
        aubi aubiVar = (aubi) createBuilder.instance;
        j.getClass();
        aubiVar.c = j;
        aubiVar.b |= 1;
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(string);
        if (z && z2) {
            aragVar = j(TextUtils.concat(str, " · ", string).toString());
        } else if (z) {
            aragVar = j(str.toString());
        } else if (z2) {
            aragVar = j(string.toString());
        } else {
            aragVar = arag.a;
        }
        createBuilder.copyOnWrite();
        aubi aubiVar2 = (aubi) createBuilder.instance;
        aragVar.getClass();
        aubiVar2.d = aragVar;
        aubiVar2.b |= 2;
        aubi aubiVar3 = (aubi) createBuilder.mo39build();
        aopa createBuilder2 = aube.a.createBuilder();
        aopa createBuilder3 = aubj.a.createBuilder();
        createBuilder3.copyOnWrite();
        aubj aubjVar = (aubj) createBuilder3.instance;
        aubiVar3.getClass();
        aubjVar.c = aubiVar3;
        aubjVar.b = 128392103;
        createBuilder2.copyOnWrite();
        aube aubeVar = (aube) createBuilder2.instance;
        aubj aubjVar2 = (aubj) createBuilder3.mo39build();
        aubjVar2.getClass();
        aubeVar.i = aubjVar2;
        aubeVar.b |= 4096;
        aube aubeVar2 = (aube) createBuilder2.mo39build();
        aopa createBuilder4 = asgf.a.createBuilder();
        createBuilder4.copyOnWrite();
        asgf asgfVar = (asgf) createBuilder4.instance;
        aubeVar2.getClass();
        asgfVar.c = aubeVar2;
        asgfVar.b = 78882851;
        return (asgf) createBuilder4.mo39build();
    }

    @Override // defpackage.agsr, defpackage.agup
    public final WatchNextResponseModel a(WatchNextResponseModel watchNextResponseModel, Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar) {
        watchNextResponseModel.getClass();
        if (agqfVar != null) {
            aopc aopcVar = (aopc) k(context, watchNextResponseModel.a, agqfVar, list, i, str, bArr, apjjVar).mo52toBuilder();
            if (!TextUtils.isEmpty(this.b)) {
                String str2 = this.b;
                apzg apzgVar = ((asgt) aopcVar.instance).v;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (str2.equals(ntr.e((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)))) {
                    aopcVar.copyOnWrite();
                    asgt asgtVar = (asgt) aopcVar.instance;
                    asgtVar.v = null;
                    asgtVar.b &= -262145;
                }
            }
            return new WatchNextResponseModel((asgt) aopcVar.mo39build());
        }
        return watchNextResponseModel;
    }

    @Override // defpackage.agsr, defpackage.agup
    public final WatchNextResponseModel b(Context context, agqo agqoVar, String str, byte[] bArr) {
        agqoVar.getClass();
        asgt l = l(context, agqoVar, str, bArr);
        if (l == null) {
            return new WatchNextResponseModel(asgt.a);
        }
        aopc aopcVar = (aopc) l.mo52toBuilder();
        asgf o = o(context, agqoVar);
        aopcVar.copyOnWrite();
        asgt asgtVar = (asgt) aopcVar.instance;
        o.getClass();
        asgtVar.f = o;
        asgtVar.b |= 32;
        return new WatchNextResponseModel((asgt) aopcVar.mo39build());
    }

    @Override // defpackage.agsr, defpackage.agup
    public final WatchNextResponseModel c(Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        asgt m = m(context, agqfVar, list, max, str, bArr, apjjVar);
        if (m == null) {
            return new WatchNextResponseModel(asgt.a);
        }
        aopc aopcVar = (aopc) m.mo52toBuilder();
        asgf o = o(context, (agqo) list.get(max));
        aopcVar.copyOnWrite();
        asgt asgtVar = (asgt) aopcVar.instance;
        o.getClass();
        asgtVar.f = o;
        asgtVar.b |= 32;
        return new WatchNextResponseModel((asgt) aopcVar.mo39build());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agsr
    public final Collection d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(super.d());
        return hashSet;
    }

    @Override // defpackage.agsr
    protected final List e(Context context, agqo agqoVar) {
        jml jmlVar = this.a;
        agqoVar.getClass();
        auxn auxnVar = (auxn) jmlVar.g(agqo.class, auxn.class, agqoVar, null);
        if (auxnVar == null) {
            return amuk.q();
        }
        aopa createBuilder = auqk.a.createBuilder();
        createBuilder.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder.instance;
        auqkVar.bk = auxnVar;
        auqkVar.e |= 8192;
        return amuk.r((auqk) createBuilder.mo39build());
    }

    @Override // defpackage.agsr
    protected final void f(agqo agqoVar, aopc aopcVar) {
        aopa createBuilder = asxl.a.createBuilder();
        createBuilder.copyOnWrite();
        asxl asxlVar = (asxl) createBuilder.instance;
        asxlVar.c = 2;
        asxlVar.b |= 1;
        aopcVar.copyOnWrite();
        audk audkVar = (audk) aopcVar.instance;
        asxl asxlVar2 = (asxl) createBuilder.mo39build();
        audk audkVar2 = audk.a;
        asxlVar2.getClass();
        audkVar.t = asxlVar2;
        audkVar.b |= 2097152;
        if (((audk) aopcVar.instance).k) {
            aopcVar.cn(aguy.e(agqoVar.f(), true));
            aopcVar.cn(aguy.e(agqoVar.f(), false));
        }
    }
}

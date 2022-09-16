package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: abfi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abfi implements vlp {
    public final /* synthetic */ yjc a;
    private final /* synthetic */ int b;

    public /* synthetic */ abfi(yjc yjcVar) {
        this.a = yjcVar;
    }

    public /* synthetic */ abfi(yjc yjcVar, int i) {
        this.b = i;
        this.a = yjcVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, aoqu] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, aoqu] */
    @Override // defpackage.vlp
    public final aoqu a(vlq vlqVar, aoqu aoquVar) {
        apij apijVar;
        int i = this.b;
        apij apijVar2 = null;
        if (i == 0) {
            yjc yjcVar = this.a;
            String d = vlqVar.d("com.google.android.libraries.youtube.innertube.pref.player_config_supplier", null);
            if (d == null) {
                return aoquVar;
            }
            try {
                atzv atzvVar = (atzv) ((aopa) atzv.a.createBuilder().mo38mergeFrom(Base64.decode(d, 0), aoos.b())).mo39build();
                aopa mo52toBuilder = ((awtm) aoquVar).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awtm awtmVar = (awtm) mo52toBuilder.instance;
                atzvVar.getClass();
                awtmVar.c = atzvVar;
                awtmVar.b |= 1;
                return yjcVar.a(aoquVar, (awtm) mo52toBuilder.mo39build());
            } catch (aopx | IllegalArgumentException | NullPointerException unused) {
                return aoquVar;
            }
        } else if (i == 1) {
            return (aoqu) this.a.a(vlqVar, aoquVar);
        } else {
            yjc yjcVar2 = this.a;
            String d2 = vlqVar.d("attribution_data", null);
            if (d2 == null) {
                return aoquVar;
            }
            try {
                try {
                    apijVar = (apij) aopi.parseFrom(apij.a, Base64.decode(d2, 0), aoos.b());
                } catch (aopx unused2) {
                    apijVar = null;
                }
                if (apijVar != null && apijVar.b.size() > 0) {
                    apijVar2 = apijVar;
                }
                aopa mo52toBuilder2 = ((awtm) aoquVar).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                awtm awtmVar2 = (awtm) mo52toBuilder2.instance;
                apijVar2.getClass();
                awtmVar2.d = apijVar2;
                awtmVar2.b |= 2;
                return yjcVar2.a(aoquVar, (awtm) mo52toBuilder2.mo39build());
            } catch (IllegalArgumentException | NullPointerException unused3) {
                return aoquVar;
            }
        }
    }
}

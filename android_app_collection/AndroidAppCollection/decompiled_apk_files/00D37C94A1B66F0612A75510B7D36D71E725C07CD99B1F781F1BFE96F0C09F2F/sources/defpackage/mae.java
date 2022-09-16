package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: mae  reason: default package */
/* loaded from: classes3.dex */
public final class mae extends lzm implements wkd {
    public mae(ajmy ajmyVar, ajyc ajycVar, aafo aafoVar, acti actiVar, Context context, aaar aaarVar, lzu lzuVar) {
        super(ajmyVar, ajycVar, aafoVar, actiVar, context, aaarVar, lzuVar);
    }

    @Override // defpackage.wkd
    public final boolean g(String str, PlayerResponseModel playerResponseModel, asit asitVar) {
        auuk auukVar = null;
        asaj asajVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (asajVar == null) {
            return false;
        }
        atzu atzuVar = asajVar.A;
        if (atzuVar == null) {
            atzuVar = atzu.a;
        }
        if (atzuVar.b == 114449537) {
            atzu atzuVar2 = asajVar.A;
            if (atzuVar2 == null) {
                atzuVar2 = atzu.a;
            }
            if (atzuVar2.b == 114449537) {
                auukVar = (auuk) atzuVar2.c;
            } else {
                auukVar = auuk.a;
            }
        }
        this.f = auukVar;
        auuk auukVar2 = this.f;
        return auukVar2 != null && auukVar2.f.size() > 0;
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
    }
}

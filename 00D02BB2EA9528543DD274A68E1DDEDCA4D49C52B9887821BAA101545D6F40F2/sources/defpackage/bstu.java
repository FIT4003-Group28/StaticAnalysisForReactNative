package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bstu  reason: default package */
/* loaded from: classes4.dex */
public final class bstu extends bszv {
    public Context ad;
    public btwr ae;
    public btvo af;

    @Override // defpackage.bszv
    protected final String aQ() {
        return "Client Parameters";
    }

    final void aS(String str, Object obj) {
        String obj2;
        if (obj instanceof dssj) {
            String valueOf = String.valueOf(Base64.encodeToString(((dssj) obj).bS(), 11));
            obj2 = valueOf.length() != 0 ? "Base64 encoding of ParameterGroupProto\n".concat(valueOf) : new String("Base64 encoding of ParameterGroupProto\n");
        } else {
            obj2 = obj.toString();
        }
        Preference preference = new Preference(this.ad);
        preference.s(str);
        preference.o = new bstt(this, str, obj2);
        d().aj(preference);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        e(this.b.b(J()));
        aS("ClientParametersManager", this.ae.f());
        for (dbsi<String, ?> dbsiVar : this.af.getParametersList()) {
            Object obj = dbsiVar.b;
            dbsk.s(obj);
            aS(dbsiVar.a, obj);
        }
    }

    @Override // defpackage.bszv
    public final void w() {
        bstv bstvVar = (bstv) btsx.b(bstv.class, this);
    }
}

package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: ckuj  reason: default package */
/* loaded from: classes4.dex */
public final class ckuj {
    @dzsi
    public final GoogleApiClient a;
    public String c;
    public String d;
    private final ckuu f;
    public final Object b = new Object();
    public final GoogleApiClient.ConnectionCallbacks e = new ckui(this);

    public ckuj(@dzsi GoogleApiClient googleApiClient, ckuu ckuuVar) {
        this.a = googleApiClient;
        dbsk.s(ckuuVar);
        this.f = ckuuVar;
    }

    public final void a(String str, String str2, @dzsi String str3) {
        ckwa bZ = ckwb.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckwb ckwbVar = (ckwb) bZ.b;
        str2.getClass();
        int i = ckwbVar.a | 1;
        ckwbVar.a = i;
        ckwbVar.b = str2;
        if (str3 != null) {
            str3.getClass();
            ckwbVar.a = i | 4;
            ckwbVar.d = str3;
        }
        ckuu ckuuVar = this.f;
        ckxx bZ2 = ckxy.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ckxy ckxyVar = (ckxy) bZ2.b;
        ckwb bK = bZ.bK();
        bK.getClass();
        ckxyVar.b = bK;
        ckxyVar.a |= 1;
        ckuw.a(ckuuVar, str, "/place_details_response", bZ2.bK().bS());
    }
}

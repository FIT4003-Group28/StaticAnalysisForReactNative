package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: zrv  reason: default package */
/* loaded from: classes7.dex */
public class zrv extends zsb implements zdt {
    @dzsi
    private final String c;

    public zrv(@dzsi jhk jhkVar, @dzsi zvb zvbVar) {
        super(jhkVar, zvbVar);
        this.c = jhkVar != null ? jhkVar.c.f() : null;
    }

    @Override // defpackage.zdt
    @dzsi
    public String a() {
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        zvb c = c();
        if (c == null) {
            return null;
        }
        dcdc<dpce> c2 = c.c();
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            dpce dpceVar = c2.get(i);
            if (dpceVar != null && (dpceVar.a & 4) != 0) {
                douj doujVar = dpceVar.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                if ((doujVar.a & 4) != 0) {
                    douj doujVar2 = dpceVar.d;
                    if (doujVar2 == null) {
                        doujVar2 = douj.h;
                    }
                    return doujVar2.e;
                }
            }
            if (dpceVar != null && (dpceVar.a & 2) != 0) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                return doulVar.b;
            }
        }
        return null;
    }
}

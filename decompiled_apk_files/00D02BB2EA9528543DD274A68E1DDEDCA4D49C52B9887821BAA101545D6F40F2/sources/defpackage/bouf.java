package defpackage;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bouf  reason: default package */
/* loaded from: classes3.dex */
public final class bouf implements bvwz {
    public final gga a;
    public final Executor b;
    public final buqs c;
    public final chhs d;
    public final bvrb e;
    public final btvo f;
    public final bovf g;
    public final dbsg<bwrs<ilo>> h;

    public bouf(Activity activity, Executor executor, buqs buqsVar, chht chhtVar, bvrb bvrbVar, btvo btvoVar, bovf bovfVar, dbsg<bwrs<ilo>> dbsgVar) {
        this.a = gga.L(activity);
        this.b = executor;
        this.c = buqsVar;
        this.d = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.e = bvrbVar;
        this.f = btvoVar;
        this.g = bovfVar;
        this.h = dbsgVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new boub(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rap.ft";
    }
}

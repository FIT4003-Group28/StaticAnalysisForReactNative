package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bouu  reason: default package */
/* loaded from: classes3.dex */
public final class bouu implements bvwz {
    public final gga a;
    public final bokf b;
    public final bbut c;
    public final bbtt d;
    public final dwyd e;
    private final bvrb f;

    public bouu(Activity activity, bbut bbutVar, bvrb bvrbVar, bbtt bbttVar, bokf bokfVar, dwyd dwydVar) {
        this.a = gga.L(activity);
        this.c = bbutVar;
        this.f = bvrbVar;
        this.d = bbttVar;
        this.b = bokfVar;
        this.e = dwydVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bous(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        if (!(obj instanceof bbuf)) {
            return null;
        }
        deig d = deig.d();
        this.f.b(new bout(this, (bbuf) obj, d), bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rap.lpp";
    }
}

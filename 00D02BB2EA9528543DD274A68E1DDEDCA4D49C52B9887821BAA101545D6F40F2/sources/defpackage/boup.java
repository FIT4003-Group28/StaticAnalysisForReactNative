package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: boup  reason: default package */
/* loaded from: classes3.dex */
public final class boup implements bvwz {
    public final gga a;
    public final dxio<afha> b;
    public final bwrs<ilo> c;

    public boup(Activity activity, dxio<afha> dxioVar, bwrs<ilo> bwrsVar) {
        this.a = gga.L(activity);
        this.b = dxioVar;
        this.c = bwrsVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bouo(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rap.lts";
    }
}

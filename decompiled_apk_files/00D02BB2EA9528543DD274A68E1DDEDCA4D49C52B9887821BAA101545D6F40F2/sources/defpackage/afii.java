package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afii  reason: default package */
/* loaded from: classes.dex */
public final class afii implements afip {
    private static final String a = "afii";
    private final Context b;

    public afii(Context context) {
        this.b = context;
    }

    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        return "vnd.android.cursor.item/postal-address_v2".equals(this.b.getContentResolver().getType(intent.getData()));
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        String str2;
        dbsk.l(a(intent));
        try {
            btou btouVar = new btou(this.b, intent.getData(), "data1");
            str2 = (String) btouVar.g(btouVar.a("data1")).f();
            btouVar.close();
        } catch (btnx e) {
            bvoo.j(e);
            str2 = null;
        }
        if (dbsj.d(str2)) {
            return afia.R;
        }
        afhz e2 = afia.e();
        e2.a = afib.SEARCH;
        e2.b = str2;
        e2.G = str;
        return e2.a();
    }
}

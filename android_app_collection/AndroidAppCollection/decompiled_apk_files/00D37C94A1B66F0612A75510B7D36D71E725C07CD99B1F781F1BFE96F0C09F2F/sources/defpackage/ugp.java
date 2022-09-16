package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: ugp  reason: default package */
/* loaded from: classes4.dex */
public final class ugp extends ugt {
    private static final Charset b = Charset.forName("UTF-8");
    private final ufs c;
    private final ucv d;

    public ugp(ufs ufsVar, ucv ucvVar) {
        this.c = ufsVar;
        this.d = ucvVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List<ucu> b2 = this.d.b(string, 4);
        TreeSet treeSet = new TreeSet();
        for (ucu ucuVar : b2) {
            treeSet.add(new String(ucuVar.b, b));
        }
        ufr c = this.c.c(string, new ArrayList(treeSet), aomkVar);
        if (!c.b() || !c.d) {
            this.d.d(string, b2);
        }
        return c;
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "DeleteUserSubscriptionCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }
}

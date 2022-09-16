package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ugt  reason: default package */
/* loaded from: classes4.dex */
public abstract class ugt implements ujj {
    public Map a;

    public abstract ufr a(Bundle bundle, aomk aomkVar);

    protected abstract String b();

    @Override // defpackage.ujj
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // defpackage.ujj
    public final uby e(Bundle bundle) {
        String b = b();
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT");
        aopa createBuilder = aomk.a.createBuilder();
        createBuilder.copyOnWrite();
        aomk aomkVar = (aomk) createBuilder.instance;
        aomkVar.b |= 1;
        aomkVar.c = i;
        ufr a = a(bundle, (aomk) createBuilder.mo39build());
        if (!a.b() || !a.d) {
            if (TextUtils.isEmpty(b) || !this.a.containsKey(b)) {
                uev.a("ScheduledRpcHandler", "Scheduled RPC callback not found. Callback key: [%s]", b);
            } else {
                uev.a("ScheduledRpcHandler", "Calling scheduled RPC callback. Callback key: [%s]", b);
                ugk ugkVar = (ugk) this.a.get(b);
                if (!a.b()) {
                    ugkVar.b(string, a.a, a.b);
                } else {
                    ugkVar.a(string, a.a, a.c);
                }
            }
            if (a.b()) {
                return uby.a(a.c);
            }
            return uby.a;
        }
        Throwable th = a.c;
        ubu b2 = uby.b();
        b2.b = 2;
        b2.a = th;
        return b2.a();
    }

    @Override // defpackage.ujj
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void i() {
    }
}

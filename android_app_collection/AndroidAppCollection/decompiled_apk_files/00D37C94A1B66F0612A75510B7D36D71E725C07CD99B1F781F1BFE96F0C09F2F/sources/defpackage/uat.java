package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: uat  reason: default package */
/* loaded from: classes4.dex */
public final class uat implements uac {
    public final vlc a;
    public final tzv b;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Context e;
    private final Executor f;
    private final vjb g;
    private final vlk h;
    private final String i;

    public uat(Context context, Executor executor, String str, vjb vjbVar, vlk vlkVar, tzv tzvVar, vlc vlcVar) {
        this.e = context;
        this.f = executor;
        this.g = vjbVar;
        this.h = vlkVar;
        this.b = tzvVar;
        this.i = str;
        this.a = vlcVar;
    }

    @Override // defpackage.uac
    public final uab a(final Account account) {
        uab uabVar;
        synchronized (this.c) {
            if (!this.d.containsKey(account)) {
                Map map = this.d;
                vjf a = vjg.a(this.e);
                a.a = "com.google.android.gms";
                a.d("managed");
                a.e("mdisync");
                a.c(account);
                a.f("profilesync/public/profile_info.pb");
                Uri a2 = a.a();
                vlk vlkVar = this.h;
                vli a3 = vlj.a();
                a3.h(new vlt(this.a));
                a3.e(uav.a);
                a3.f(a2);
                tzw tzwVar = new tzw(vlkVar.a(a3.a()));
                uay uayVar = new uay(this.f, this.g);
                AtomicReference atomicReference = new AtomicReference(uan.a);
                AtomicReference atomicReference2 = new AtomicReference(uao.a);
                uar uarVar = new uar(atomicReference, 1);
                uar uarVar2 = new uar(atomicReference2);
                ube ubeVar = new ube(this.e, new rgy(this.e, new rgu(account)), this.i, uarVar, uarVar2);
                tzu.a(this.e.getApplicationContext(), this.i);
                account.toString();
                new tpq();
                new amqo() { // from class: uaq
                    @Override // defpackage.amqo
                    public final Object get() {
                        new qqh(uat.this.b.a, "MDI_SYNC_COMPONENTS_GAIA", account.name);
                        return new uaw();
                    }
                };
                final tzv tzvVar = this.b;
                amqo amqoVar = new amqo() { // from class: uap
                    @Override // defpackage.amqo
                    public final Object get() {
                        new qqh(tzv.this.a, "MDI_SYNC_COMPONENTS_VERBOSE", null);
                        return new uaw();
                    }
                };
                new Random();
                tzu.a(this.e.getApplicationContext(), this.i);
                new uaw(amqoVar);
                uam uamVar = new uam(ubeVar, uayVar, tzwVar);
                vbt.g(this.e);
                if (axve.a.get().a()) {
                    uamVar.e(new uas(this, a2), anjk.a);
                }
                atomicReference.set(uamVar);
                atomicReference2.set(uamVar);
                map.put(account, uamVar);
            }
            uabVar = (uab) this.d.get(account);
        }
        return uabVar;
    }
}

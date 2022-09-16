package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* compiled from: PG */
/* renamed from: acd  reason: default package */
/* loaded from: classes.dex */
public final class acd {
    final /* synthetic */ abp h;
    public Random a = new Random();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    private final Map i = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient Map e = new HashMap();
    public final Map f = new HashMap();
    public final Bundle g = new Bundle();

    public acd(abp abpVar) {
        this.h = abpVar;
    }

    private final void g(String str) {
        if (((Integer) this.c.get(str)) == null) {
            int nextInt = this.a.nextInt(2147418112);
            while (true) {
                int i = nextInt + 65536;
                if (this.b.containsKey(Integer.valueOf(i))) {
                    nextInt = this.a.nextInt(2147418112);
                } else {
                    c(i, str);
                    return;
                }
            }
        }
    }

    public final aby a(String str, ach achVar, abw abwVar) {
        g(str);
        this.e.put(str, new acb(abwVar, achVar));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            abwVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.g.getParcelable(str);
        if (activityResult != null) {
            this.g.remove(str);
            abwVar.a(achVar.a(activityResult.a, activityResult.b));
        }
        return new aca(this, str, achVar);
    }

    public final aby b(final String str, apy apyVar, final ach achVar, final abw abwVar) {
        apu lifecycle = apyVar.getLifecycle();
        if (lifecycle.a().a(apt.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + apyVar + " is attempting to register while current state is " + lifecycle.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        acc accVar = (acc) this.i.get(str);
        if (accVar == null) {
            accVar = new acc(lifecycle);
        }
        j jVar = new j() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // defpackage.j
            public final void a(apy apyVar2, aps apsVar) {
                if (aps.ON_START.equals(apsVar)) {
                    acd.this.e.put(str, new acb(abwVar, achVar));
                    if (acd.this.f.containsKey(str)) {
                        Object obj = acd.this.f.get(str);
                        acd.this.f.remove(str);
                        abwVar.a(obj);
                    }
                    ActivityResult activityResult = (ActivityResult) acd.this.g.getParcelable(str);
                    if (activityResult == null) {
                        return;
                    }
                    acd.this.g.remove(str);
                    abwVar.a(achVar.a(activityResult.a, activityResult.b));
                } else if (aps.ON_STOP.equals(apsVar)) {
                    acd.this.e.remove(str);
                } else if (!aps.ON_DESTROY.equals(apsVar)) {
                } else {
                    acd.this.d(str);
                }
            }
        };
        accVar.a.c(jVar);
        accVar.b.add(jVar);
        this.i.put(str, accVar);
        return new abz(this, str, achVar);
    }

    public final void c(int i, String str) {
        Map map = this.b;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.c.put(str, valueOf);
    }

    public final void d(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.b.remove(num);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.getParcelable(str));
            this.g.remove(str);
        }
        acc accVar = (acc) this.i.get(str);
        if (accVar != null) {
            ArrayList arrayList = accVar.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                accVar.a.e((j) arrayList.get(i));
            }
            accVar.b.clear();
            this.i.remove(str);
        }
    }

    public final boolean e(int i, int i2, Intent intent) {
        abw abwVar;
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.d.remove(str);
        acb acbVar = (acb) this.e.get(str);
        if (acbVar == null || (abwVar = acbVar.a) == null) {
            this.f.remove(str);
            this.g.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        abwVar.a(acbVar.b.a(i2, intent));
        return true;
    }

    public final void f(int i, ach achVar, Object obj) {
        Bundle bundle;
        abp abpVar = this.h;
        acg c = achVar.c(abpVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new abm(this, i, c));
            return;
        }
        Intent b = achVar.b(obj);
        if (b.getExtras() != null && b.getExtras().getClassLoader() == null) {
            b.setExtrasClassLoader(abpVar.getClassLoader());
        }
        if (b.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(b.getAction())) {
            String[] stringArrayExtra = b.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ake.i(abpVar, stringArrayExtra, i);
        } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(b.getAction())) {
            abpVar.startActivityForResult(b, i, bundle);
        } else {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) b.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                abpVar.startIntentSenderForResult(intentSenderRequest.a, i, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new abn(this, i, e));
            }
        }
    }

    public acd() {
    }
}

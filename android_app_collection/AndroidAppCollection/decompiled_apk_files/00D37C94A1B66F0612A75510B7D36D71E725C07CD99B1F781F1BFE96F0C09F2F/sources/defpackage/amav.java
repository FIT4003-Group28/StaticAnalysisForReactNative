package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amav  reason: default package */
/* loaded from: classes.dex */
public final class amav {
    public final Set a;
    public final Random c = new Random();
    public final ArrayList b = new ArrayList(2);

    public amav(Set set) {
        this.a = set;
    }

    public final void a(AccountId accountId, ambp ambpVar) {
        boolean z = true;
        aqxo.y(ambpVar != null);
        aqxo.y(!ambpVar.equals(ambp.a));
        if ((ambpVar.b & 256) == 0) {
            z = false;
        }
        aqxo.y(z);
        String str = ambpVar.i;
        new amat(accountId);
        amzs it = ((amyg) this.a).iterator();
        while (it.hasNext()) {
            ((amau) it.next()).d();
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((amau) arrayList.get(i)).d();
        }
    }

    public final void b(AccountId accountId, ambp ambpVar) {
        amlp l = amna.l("onBeforeActivityAccountReady");
        try {
            String str = ambpVar.i;
            new amas(new amat(accountId));
            amzs it = ((amyg) this.a).iterator();
            while (it.hasNext()) {
                amau amauVar = (amau) it.next();
                if (amauVar instanceof amaw) {
                    ((amaw) amauVar).g();
                }
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                amau amauVar2 = (amau) it2.next();
                if (amauVar2 instanceof amaw) {
                    ((amaw) amauVar2).g();
                }
            }
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void c() {
        amlp l = amna.l("onBeforeAccountError");
        try {
            amzs it = ((amyg) this.a).iterator();
            while (it.hasNext()) {
                amau amauVar = (amau) it.next();
                if (amauVar instanceof amaw) {
                    ((amaw) amauVar).e();
                }
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                amau amauVar2 = (amau) it2.next();
                if (amauVar2 instanceof amaw) {
                    ((amaw) amauVar2).e();
                }
            }
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d() {
        amlp l = amna.l("onBeforeAccountLoading");
        try {
            amzs it = ((amyg) this.a).iterator();
            while (it.hasNext()) {
                amau amauVar = (amau) it.next();
                if (amauVar instanceof amaw) {
                    ((amaw) amauVar).f();
                }
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                amau amauVar2 = (amau) it2.next();
                if (amauVar2 instanceof amaw) {
                    ((amaw) amauVar2).f();
                }
            }
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}

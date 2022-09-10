package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: awnk  reason: default package */
/* loaded from: classes.dex */
public final class awnk implements awnm {
    private static final dcqe b = dcqe.c("awnk");
    HashMap<Integer, awnl> a = dcjz.d();
    private final Activity c;
    private final bwqv d;
    private final dbsg<dxio<afha>> e;

    public awnk(Activity activity, bwqv bwqvVar, dbsg<dxio<afha>> dbsgVar) {
        this.c = activity;
        this.d = bwqvVar;
        this.e = dbsgVar;
    }

    @Override // defpackage.awnm
    public final void a(@dzsi Bundle bundle) {
        if (bundle != null) {
            try {
                HashMap<Integer, awnl> hashMap = (HashMap) this.d.d(HashMap.class, bundle, "pendingRequests");
                if (hashMap == null) {
                    return;
                }
                this.a = hashMap;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.awnm
    public final void b(Bundle bundle) {
        if (!this.a.isEmpty()) {
            this.d.c(bundle, "pendingRequests", this.a);
        }
    }

    @Override // defpackage.awnm
    public final boolean c(int i, int i2, Intent intent) {
        awnl remove = this.a.remove(Integer.valueOf(i));
        if (remove == null) {
            return false;
        }
        remove.b(this.c, i2, intent);
        return true;
    }

    @Override // defpackage.awnm
    public final int d(awnl awnlVar) {
        int ordinal = awnlVar.a().ordinal();
        this.a.put(Integer.valueOf(ordinal), awnlVar);
        return ordinal;
    }

    @Override // defpackage.awnm
    public final void e(Intent intent, awnl awnlVar) {
        int d = d(awnlVar);
        if (!this.e.a()) {
            if (this.c instanceof gga) {
                bvoo.h("Should not directly launch intents in GmmActivity.", new Object[0]);
            }
            this.c.startActivityForResult(intent, d);
            return;
        }
        deha.q(this.e.b().a().j(intent, d, 4), new awnj(this, d), dege.a);
    }
}

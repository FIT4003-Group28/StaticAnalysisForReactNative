package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: ahyr  reason: default package */
/* loaded from: classes2.dex */
public final class ahyr extends afhs<Void> {
    private static final dcqe d = dcqe.c("ahyr");
    public final btrm b;
    public final deig<Void> c;
    private final ahwf e;
    private final btvo i;

    public ahyr(Intent intent, @dzsi String str, ahwf ahwfVar, btvo btvoVar, btrm btrmVar) {
        super(intent, str, afid.LOCATION_SHARE_SHORTCUT);
        this.e = ahwfVar;
        this.i = btvoVar;
        this.b = btrmVar;
        this.c = deig.d();
    }

    public static Intent l(Context context, dbsg<btlu> dbsgVar, ahwe ahweVar) {
        return m(context, ahweVar, p(dbsgVar));
    }

    public static Intent m(Context context, ahwe ahweVar, dbsg<String> dbsgVar) {
        return q(context, dbsgVar, dbpy.a, ahweVar);
    }

    public static Intent n(Context context, dbsg<btlu> dbsgVar, PersonId personId, ahwe ahweVar) {
        return q(context, p(dbsgVar), dbsg.i(personId), ahweVar);
    }

    private final void o() {
        String stringExtra;
        ahwe ahweVar;
        if (!this.i.getEnableFeatureParameters().z) {
            return;
        }
        PersonId personId = null;
        if (this.f.hasExtra("account")) {
            stringExtra = this.f.getStringExtra("account");
        } else {
            stringExtra = this.f.hasExtra("userId") ? this.f.getStringExtra("userId") : null;
        }
        if (this.f.hasExtra("selectedPerson")) {
            byte[] bytes = this.f.getStringExtra("selectedPerson").getBytes();
            if (bytes != null) {
                try {
                    personId = PersonId.j(((ajix) ajja.d.bZ().by(bytes)).bK());
                } catch (dsrm unused) {
                    bvoo.h("Corrupted personId. %s", bytes);
                }
            }
        } else if (this.f.hasExtra("friendId")) {
            personId = PersonId.c(this.f.getStringExtra("friendId"));
        }
        if (this.f.hasExtra("selectionReason")) {
            ahweVar = (ahwe) dbsg.j(ahwe.m.get(Integer.valueOf(this.f.getIntExtra("selectionReason", -1)))).c(ahwe.SHORTCUT);
        } else {
            ahweVar = ahwe.SHORTCUT;
        }
        if (personId == null) {
            this.e.m(dbsg.j(stringExtra), ahweVar);
        } else {
            this.e.n(dbsg.j(stringExtra), personId, ahweVar);
        }
    }

    private static dbsg<String> p(dbsg<btlu> dbsgVar) {
        return (!dbsgVar.a() || !dbsgVar.b().u()) ? dbpy.a : dbsg.j(dbsgVar.b().j());
    }

    private static Intent q(Context context, dbsg<String> dbsgVar, dbsg<PersonId> dbsgVar2, ahwe ahweVar) {
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 34);
        sb.append(packageName);
        sb.append(".");
        sb.append("ShowSharedLocationsScreenActivity");
        intent.setComponent(new ComponentName(context, sb.toString()));
        intent.putExtra("selectionReason", ahweVar.n);
        if (dbsgVar.a()) {
            intent.putExtra("account", dbsgVar.b());
        }
        if (dbsgVar2.a()) {
            intent.putExtra("selectedPerson", new String(dbsgVar2.b().i().bR().G()));
        }
        intent.putExtra("com.google.android.apps.gmm.locationsharing.waitForClientParameters", false);
        return intent;
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_LOCATION_SHARING;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final /* bridge */ /* synthetic */ void d(Void r1) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final void e(ExecutionException executionException) {
        o();
    }

    @Override // defpackage.afhs
    protected final void i(deig<Void> deigVar) {
        if (this.f.getBooleanExtra("com.google.android.apps.gmm.locationsharing.waitForClientParameters", false)) {
            btrm btrmVar = this.b;
            dceq a = dcet.a();
            a.b(btwe.class, new ahyt(btwe.class, this));
            btrmVar.g(this, a.a());
            deigVar.p(this.c);
            return;
        }
        deigVar.j(null);
    }
}

package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: pev  reason: default package */
/* loaded from: classes7.dex */
public final class pev extends itb implements cnon<Status> {
    private static final String f = "pev";
    public final Activity a;
    public final dxio<akox> b;
    public final bvrb c;
    public final pey d;
    public dbty<GoogleApiClient> e;
    private final btrm g;
    private final btvo h;
    private final dxio<akfa> i;
    private final AtomicLong j = new AtomicLong();

    public pev(Activity activity, dxio<akox> dxioVar, btrm btrmVar, btvo btvoVar, dxio<akfa> dxioVar2, bvrb bvrbVar, pey peyVar) {
        this.a = activity;
        this.b = dxioVar;
        this.g = btrmVar;
        this.h = btvoVar;
        this.i = dxioVar2;
        this.c = bvrbVar;
        this.d = peyVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.e = dbud.a(new pet(this));
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        btrm btrmVar = this.g;
        dceq a = dcet.a();
        a.b(pfp.class, new pew(0, pfp.class, this, bvrj.UI_THREAD));
        a.b(alim.class, new pew(1, alim.class, this, bvrj.UI_THREAD));
        a.b(brll.class, new pew(2, brll.class, this, bvrj.UI_THREAD));
        a.b(azrf.class, new pew(3, azrf.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(Status status) {
        Status status2 = status;
        if (!status2.d()) {
            bvoo.j(new Exception(String.valueOf(status2)));
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        this.g.a(this);
        if (this.e.a() != null) {
            this.e.a().disconnect();
        }
        super.Po();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.bvrb r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pev.e(bvrb, java.lang.String, java.lang.String):void");
    }
}

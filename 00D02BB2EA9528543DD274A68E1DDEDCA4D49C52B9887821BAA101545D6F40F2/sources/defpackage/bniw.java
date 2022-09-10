package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bniw  reason: default package */
/* loaded from: classes3.dex */
public class bniw implements bnid, bega, jkk {
    private final Context a;
    @dzsi
    private bwrs<ilo> b;
    private int c = 0;

    public bniw(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.bnid
    public Boolean a() {
        bwrs<ilo> bwrsVar = this.b;
        boolean z = false;
        if (bwrsVar != null && bwrsVar.c() != null && this.b.c().i()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnid
    public cqss b() {
        return irg.i();
    }

    @Override // defpackage.bnid
    public cqss c() {
        return irg.l();
    }

    @Override // defpackage.bnid
    public cqss d() {
        return irg.a();
    }

    @Override // defpackage.bnid
    public CharSequence e() {
        return this.a.getString(R.string.OFFLINE_NEW_PLACE_INFO_AVAILABLE);
    }

    @Override // defpackage.bnid
    public CharSequence f() {
        return this.a.getString(R.string.OFFLINE_SHOW_NEW_PLACE_INFO);
    }

    @Override // defpackage.jkk
    public void g(int i) {
        if (this.c != i) {
            this.c = i;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bnid
    public cqkl h() {
        bwrs<ilo> bwrsVar = this.b;
        if (bwrsVar != null && bwrsVar.c() != null && this.b.c().i()) {
            bwrs<ilo> bwrsVar2 = this.b;
            bwrsVar2.d(bwrsVar2.c().g);
        }
        return cqkl.a;
    }

    @Override // defpackage.bnid
    public Integer i() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.b = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.b = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return a();
    }
}

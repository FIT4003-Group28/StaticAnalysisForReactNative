package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: zxr  reason: default package */
/* loaded from: classes4.dex */
public abstract class zxr implements zxy, ajgy {
    public final acti D;
    private final zxz a;
    private final eo b;
    private final Optional c;

    /* JADX INFO: Access modifiers changed from: protected */
    public zxr(Context context, eo eoVar, acti actiVar, Optional optional, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ReelsBottomSheetDialogRoundCorners", z);
        boolean z4 = false;
        if (!h()) {
            bundle.putBoolean("ReelsBottomSheetDialogDimBackgroundKey", false);
        }
        bundle.putBoolean("ReelsBottomSheetDialogTopViewKey", lN() != null ? true : z4);
        bundle.putBoolean("ReelsBottomSheetDialoginitExpandedKey", z3);
        bundle.putBoolean("ReelsBottomSheetDialogDraggableKey", true);
        zxz zyaVar = z2 ? new zya() : new zxz();
        this.a = zyaVar;
        zyaVar.ae(bundle);
        zyaVar.al = context;
        zyaVar.ak = this;
        this.b = eoVar;
        this.D = actiVar;
        this.c = optional;
    }

    @Override // defpackage.zxy
    public final void A() {
        if (H()) {
            this.D.H(3, new acte(actj.REELS_BOTTOM_SHEET_CLOSE_BUTTON), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(boolean z) {
        this.a.n(z);
    }

    public final void C(float f) {
        Bundle x = x();
        x.putFloat("ReelsBottomSheetDialogMaxDefaultHeightKey", f);
        this.a.ae(x);
    }

    public final void D(float f) {
        Bundle x = x();
        x.putFloat("ReelsBottomSheetDialogMinHeightKey", f);
        this.a.ae(x);
    }

    public final void E(boolean z) {
        Bundle x = x();
        x.putBoolean("ReelsBottomSheetDialogDropShadowKey", z);
        this.a.ae(x);
    }

    public final void F(String str) {
        Bundle x = x();
        x.putString("ReelsBottomSheetDialogTextureCloseButtonKey", str);
        this.a.ae(x);
    }

    public final void G() {
        if (this.a.ap()) {
            return;
        }
        zxz zxzVar = this.a;
        zxzVar.am = b();
        if (zxzVar.aj) {
            zxzVar.aH();
        }
        zxz zxzVar2 = this.a;
        zxzVar2.an = a();
        if (zxzVar2.aj) {
            zxzVar2.aE();
        }
        zxz zxzVar3 = this.a;
        View lN = lN();
        if (lN != null) {
            zxzVar3.ao = lN;
            if (zxzVar3.aj) {
                zxzVar3.aI();
            }
        }
        zxz zxzVar4 = this.a;
        boolean lO = lO();
        zxzVar4.ap = Boolean.valueOf(lO);
        if (zxzVar4.aj) {
            zxzVar4.aF(lO);
        }
        zxz zxzVar5 = this.a;
        eo eoVar = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append("ReelsBottomSheetDialog_");
        CharSequence charSequence = zxzVar5.am;
        if (charSequence != null) {
            sb.append(charSequence.toString().replace(" ", ""));
        } else {
            sb.append("NoTitleSet");
        }
        String valueOf = String.valueOf(sb.toString());
        zxzVar5.qw(eoVar, valueOf.length() != 0 ? "ReelsBottomSheetDialog_".concat(valueOf) : new String("ReelsBottomSheetDialog_"));
        zxz zxzVar6 = this.a;
        if (zxzVar6.d != null) {
            zxzVar6.n(true);
            this.a.aq = c();
            this.a.d.setCanceledOnTouchOutside(true);
        }
        Dialog dialog = this.a.d;
        if (dialog != null && dialog.getWindow() != null) {
            this.a.d.getWindow().clearFlags(8);
        }
        if (!H()) {
            return;
        }
        this.D.D(new acte(lR()));
        if (!lO()) {
            return;
        }
        this.D.D(new acte(actj.REELS_BOTTOM_SHEET_CLOSE_BUTTON));
    }

    protected final boolean H() {
        return (this.D == null || lR() == null) ? false : true;
    }

    public final boolean I() {
        return this.a.at();
    }

    protected abstract View a();

    protected abstract CharSequence b();

    protected boolean c() {
        return true;
    }

    @Override // defpackage.zxy
    public void f() {
        if (H()) {
            this.D.q(new acte(lR()), null);
            if (lO()) {
                this.D.q(new acte(actj.REELS_BOTTOM_SHEET_CLOSE_BUTTON), null);
            }
        }
        if (this.c.isPresent()) {
            ((ajgz) this.c.get()).d(this);
        }
    }

    @Override // defpackage.zxy
    public void g() {
        if (H()) {
            this.D.u(new acte(lR()), null);
            if (lO()) {
                this.D.u(new acte(actj.REELS_BOTTOM_SHEET_CLOSE_BUTTON), null);
            }
        }
        if (this.c.isPresent()) {
            ((ajgz) this.c.get()).a(this);
        }
    }

    protected boolean h() {
        return true;
    }

    @Override // defpackage.zxy
    public void k() {
    }

    @Override // defpackage.zxy
    public void l() {
    }

    @Override // defpackage.ajgy
    public final void lL() {
        if (this.a.at()) {
            z();
        }
    }

    protected View lN() {
        return null;
    }

    protected boolean lO() {
        return true;
    }

    protected actj lR() {
        return actj.REELS_GENERIC_BOTTOM_SHEET;
    }

    @Override // defpackage.zxy
    public boolean lZ() {
        return false;
    }

    protected final Bundle x() {
        Bundle bundle = this.a.m;
        return bundle == null ? new Bundle() : bundle;
    }

    public final eo y() {
        return this.a.mL();
    }

    public final void z() {
        this.a.dismiss();
    }

    public zxr(Context context, eo eoVar, acti actiVar, boolean z, boolean z2) {
        this(context, eoVar, actiVar, Optional.empty(), z, z2, false);
    }
}

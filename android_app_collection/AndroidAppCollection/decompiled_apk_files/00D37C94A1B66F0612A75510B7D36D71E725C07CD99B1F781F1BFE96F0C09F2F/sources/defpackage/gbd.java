package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: gbd  reason: default package */
/* loaded from: classes3.dex */
public class gbd extends dp implements acth, gcl {
    public oa ap;
    public fsx aq;
    public axnm ar;
    public fsx as;
    public gbh at;
    public gbq au;
    public aacz av;

    @Override // defpackage.dp
    public void T(Activity activity) {
        super.T(activity);
        this.ap = (oa) activity;
    }

    @Override // defpackage.dp
    public void Y() {
        super.Y();
        if (!ggs.i()) {
            this.au.r(this);
        }
    }

    public int aJ() {
        return Integer.MAX_VALUE;
    }

    public fsx aK() {
        return this.as;
    }

    public fsx aL(fsx fsxVar) {
        return fsxVar;
    }

    public final apzg aM() {
        return PaneDescriptor.b(this).e();
    }

    public ayoi aN() {
        return ayoi.O(gbb.a);
    }

    public Optional aO(PaneDescriptor paneDescriptor) {
        return Optional.empty();
    }

    public CharSequence aP() {
        return null;
    }

    public Object aQ() {
        return null;
    }

    public String aR() {
        return null;
    }

    @Override // defpackage.gcl
    public void aS(int i) {
    }

    public void aT() {
    }

    public void aU() {
    }

    public void aV(Object obj) {
    }

    public void aW(boolean z) {
    }

    public final boolean aX() {
        Bundle bundle;
        return ba() && (bundle = this.m) != null && bundle.getBoolean("needs_nested_header", false);
    }

    public boolean aY() {
        return false;
    }

    public final boolean aZ() {
        return this.C != null;
    }

    public final boolean ba() {
        gbd gbdVar = (gbd) this.C;
        return gbdVar != null && gbdVar.aY();
    }

    public boolean bb() {
        return false;
    }

    public boolean bc() {
        return false;
    }

    public fsx lt() {
        if (this.aq == null && aK() != null) {
            if (aP() == null) {
                this.aq = aK();
            } else {
                fsw a = aK().a();
                a.m(new ampg() { // from class: gba
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        frz frzVar = (frz) obj;
                        frzVar.a = gbd.this.aP();
                        return frzVar;
                    }
                });
                this.aq = a.a();
            }
        }
        fsx fsxVar = this.aq;
        fsxVar.getClass();
        return fsxVar;
    }

    @Override // defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        gbd gbdVar = (gbd) this.C;
        if (gbdVar != null) {
            gbdVar.aO(PaneDescriptor.b(this)).ifPresent(new Consumer() { // from class: gbc
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    gbd.this.aV(obj);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
        }
    }

    @Override // defpackage.dp
    public void mR() {
        super.mR();
        oi().t();
    }

    @Override // defpackage.dp
    public void mS() {
        super.mS();
        if (ggs.i()) {
            this.au.r(this);
        }
    }

    public void mT() {
    }

    @Override // defpackage.acth
    public final acti oi() {
        axnm axnmVar = this.ar;
        if (axnmVar == null) {
            return null;
        }
        return (acti) axnmVar.get();
    }
}

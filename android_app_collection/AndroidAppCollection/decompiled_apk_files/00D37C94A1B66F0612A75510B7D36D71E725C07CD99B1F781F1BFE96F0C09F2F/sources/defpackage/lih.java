package defpackage;

import com.google.android.apps.youtube.app.settings.accessibility.AccessibilitySettingsActivity;
/* compiled from: PG */
/* renamed from: lih  reason: default package */
/* loaded from: classes3.dex */
public class lih extends oa implements axoo {
    private volatile axnv a;
    private final Object b = new Object();
    private boolean c = false;

    public lih() {
        addOnContextAvailableListener(new lig(this));
    }

    public void b() {
        if (!this.c) {
            this.c = true;
            AccessibilitySettingsActivity accessibilitySettingsActivity = (AccessibilitySettingsActivity) this;
            dwq dwqVar = (dwq) lI();
            accessibilitySettingsActivity.a = (gfu) dwqVar.a.eA.get();
            accessibilitySettingsActivity.b = (acti) dwqVar.K.get();
        }
    }

    @Override // defpackage.axoo
    /* renamed from: c */
    public final axnv lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axnv(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.abp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.r(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }
}

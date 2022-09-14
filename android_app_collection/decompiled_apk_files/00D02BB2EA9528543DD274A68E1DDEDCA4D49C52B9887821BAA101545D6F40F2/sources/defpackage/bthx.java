package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: bthx  reason: default package */
/* loaded from: classes4.dex */
final class bthx implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ bthy a;

    public bthx(bthy bthyVar) {
        this.a = bthyVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
        this.a.a.runOnUiThread(new Runnable(this, z) { // from class: bthw
            private final bthx a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bthx bthxVar = this.a;
                boolean z2 = this.b;
                bthy bthyVar = bthxVar.a;
                bthyVar.b = z2;
                cqkx.p(bthyVar);
            }
        });
    }
}

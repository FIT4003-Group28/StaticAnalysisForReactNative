package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: few  reason: default package */
/* loaded from: classes3.dex */
abstract class few extends aibs implements axoo {
    private axok a;
    private boolean b;

    public few(aibx aibxVar, Context context, AttributeSet attributeSet) {
        super(aibxVar, context, attributeSet);
        if (!this.b) {
            this.b = true;
            ((ffp) lI()).f((ffh) this);
        }
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axok lH() {
        if (this.a == null) {
            this.a = new axok(this, false);
        }
        return this.a;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }
}

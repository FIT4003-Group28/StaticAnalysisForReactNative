package defpackage;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjjt  reason: default package */
/* loaded from: classes4.dex */
public final class cjjt extends dzvy implements dzut<MovementMethod> {
    final /* synthetic */ cjju a;

    public cjjt(cjju cjjuVar) {
        this.a = cjjuVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ MovementMethod a() {
        if (((Boolean) this.a.a.a()).booleanValue()) {
            return LinkMovementMethod.getInstance();
        }
        return null;
    }
}

package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: df  reason: default package */
/* loaded from: classes3.dex */
public final class df implements u {
    final /* synthetic */ dh a;

    public df(dh dhVar) {
        this.a = dhVar;
    }

    @Override // defpackage.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((apy) obj) != null) {
            dh dhVar = this.a;
            if (!dhVar.c) {
                return;
            }
            View K = dhVar.K();
            if (K.getParent() == null) {
                if (this.a.d == null) {
                    return;
                }
                if (eo.X(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(this.a.d);
                }
                this.a.d.setContentView(K);
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    }
}

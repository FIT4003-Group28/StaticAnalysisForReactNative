package defpackage;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cpwq  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cpwq implements dbrn {
    static final dbrn a = new cpwq();

    private cpwq() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cpwp cpwpVar = (cpwp) obj;
        Uri uri = cpwx.a;
        boolean z = false;
        if (cpwpVar != null && cpwpVar.c.c(false).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

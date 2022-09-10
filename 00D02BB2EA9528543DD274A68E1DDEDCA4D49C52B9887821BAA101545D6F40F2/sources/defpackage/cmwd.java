package defpackage;

import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmwd  reason: default package */
/* loaded from: classes5.dex */
public final class cmwd implements Runnable {
    final /* synthetic */ cmwf a;

    public cmwd(cmwf cmwfVar) {
        this.a = cmwfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*cmvs*/.u();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}

package defpackage;

import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agd  reason: default package */
/* loaded from: classes.dex */
public final class agd implements Runnable {
    final /* synthetic */ agi a;

    public agd(agi agiVar) {
        this.a = agiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*iw*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}

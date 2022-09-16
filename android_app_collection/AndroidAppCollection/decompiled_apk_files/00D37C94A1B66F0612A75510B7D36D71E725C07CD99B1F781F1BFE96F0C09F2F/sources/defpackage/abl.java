package defpackage;

import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abl  reason: default package */
/* loaded from: classes.dex */
public final class abl implements Runnable {
    final /* synthetic */ abp a;

    public abl(abp abpVar) {
        this.a = abpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*gb*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}

package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdo  reason: default package */
/* loaded from: classes2.dex */
public final class akdo implements Runnable {
    final /* synthetic */ akdv a;

    public akdo(akdv akdvVar) {
        this.a = akdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.a, (int) R.string.BAD_ACCOUNT_ERROR, 1).show();
    }
}

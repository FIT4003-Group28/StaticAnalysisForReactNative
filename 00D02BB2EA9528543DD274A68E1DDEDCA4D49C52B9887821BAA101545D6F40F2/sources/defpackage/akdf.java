package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdf  reason: default package */
/* loaded from: classes2.dex */
public final class akdf implements Runnable {
    final /* synthetic */ akdv a;

    public akdf(akdv akdvVar) {
        this.a = akdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.a, (int) R.string.UNKNOWN_ERROR, 1).show();
    }
}

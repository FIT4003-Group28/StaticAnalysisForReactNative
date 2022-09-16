package defpackage;

import android.util.SparseArray;
import com.google.cardboard.sdk.qrcode.QrCodeTrackerFactory;
/* compiled from: PG */
/* renamed from: rwc  reason: default package */
/* loaded from: classes4.dex */
public final class rwc {
    public final SparseArray a = new SparseArray();
    public QrCodeTrackerFactory b;

    public final void a() {
        for (int i = 0; i < this.a.size(); i++) {
            ((rwb) this.a.valueAt(i)).a.onDone();
        }
        this.a.clear();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yjk  reason: default package */
/* loaded from: classes4.dex */
public final class yjk {
    public final Activity a;
    public final yiv b;

    public yjk(Activity activity, yiv yivVar) {
        this.a = activity;
        this.b = yivVar;
    }

    public final void a(Intent intent, int i, yiu yiuVar) {
        if (this.b.a(i)) {
            return;
        }
        yiv yivVar = this.b;
        if (yivVar.a == null) {
            yivVar.a = new SparseArray();
        }
        yivVar.a.put(i, yiuVar);
        try {
            this.a.startActivityForResult(intent, i, null);
        } catch (Exception unused) {
            zag.q(this.a, R.string.error_processing_link, 0);
        }
    }
}

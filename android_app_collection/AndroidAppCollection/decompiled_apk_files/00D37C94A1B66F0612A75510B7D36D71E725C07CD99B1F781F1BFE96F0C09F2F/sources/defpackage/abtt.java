package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abtt  reason: default package */
/* loaded from: classes.dex */
public final class abtt {
    private static final amuk d = amuk.t(2, 4, 3);
    public final SparseArray a;
    public final HashMap b;
    public abts c;
    private final abts e;
    private final Handler f;
    private int g;

    public abtt(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = new SparseArray();
        this.b = new HashMap();
        this.f = handler;
        String string = context.getResources().getString(R.string.lc_default_stream_status_unknown_text);
        this.e = new abts(-1, string == null ? null : new SpannedString(string), null);
        c();
    }

    private final void e() {
        for (Runnable runnable : this.b.values()) {
            if (this.f.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                this.f.post(runnable);
            }
        }
    }

    private final void f() {
        abts abtsVar = null;
        abts abtsVar2 = null;
        int i = 0;
        while (true) {
            if (i < this.a.size()) {
                abts abtsVar3 = (abts) this.a.valueAt(i);
                if (!TextUtils.isEmpty(abtsVar3.b)) {
                    int i2 = abtsVar3.a;
                    if (d.contains(Integer.valueOf(i2))) {
                        abtsVar = abtsVar3;
                        break;
                    } else if (i2 == 1) {
                        if (abtsVar == null) {
                            abtsVar = abtsVar3;
                        }
                    } else if (i2 == 0 && abtsVar2 == null) {
                        abtsVar2 = abtsVar3;
                    }
                }
                i++;
            } else if (abtsVar == null) {
                abtsVar = abtsVar2 == null ? this.e : abtsVar2;
            }
        }
        this.c = abtsVar;
    }

    public final int a() {
        int i = this.g;
        this.g = i + 1;
        this.a.put(i, new abts(i, null, new abtr(this, i)));
        return i;
    }

    public final void b(int... iArr) {
        for (int i = 0; i <= 0; i++) {
            int i2 = iArr[i];
            if (i2 >= 0 && i2 < this.g) {
                abts abtsVar = (abts) this.a.get(i2);
                abtsVar.a = -1;
                abtsVar.b = null;
            }
        }
        f();
        e();
    }

    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            this.f.removeCallbacks(((abts) this.a.valueAt(i)).c);
        }
        this.a.clear();
        this.b.clear();
        this.c = this.e;
    }

    public final void d(int i, int i2, String str, boolean z) {
        SpannedString spannedString = str == null ? null : new SpannedString(str);
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.g) {
            z2 = true;
        }
        int i3 = this.g;
        StringBuilder sb = new StringBuilder(60);
        sb.append("statusSource (");
        sb.append(i2);
        sb.append(") must be between 0 and ");
        sb.append(i3);
        aqxo.q(z2, sb.toString());
        abts abtsVar = (abts) this.a.get(i2);
        if (abtsVar == null) {
            StringBuilder sb2 = new StringBuilder(58);
            sb2.append("Trying to set status for a nonexistent source: ");
            sb2.append(i2);
            Log.w("CaptureHealthManager", sb2.toString());
            return;
        }
        abtsVar.a = i;
        abtsVar.b = spannedString;
        Runnable runnable = abtsVar.c;
        this.f.removeCallbacks(runnable);
        if (z) {
            this.f.postDelayed(runnable, 4500L);
        }
        f();
        e();
    }
}

package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ks  reason: default package */
/* loaded from: classes3.dex */
public class ks {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        return view.hasOnClickListeners();
    }

    public static int b(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i < i2 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        if (typedValue.type == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (typedValue.type != 6) {
            return -2;
        } else {
            fraction = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
        }
        return (int) fraction;
    }

    public static bem c(azf azfVar) {
        byte[] bArr;
        pwu pwuVar = new pwu(16);
        if (aesq.b(azfVar, pwuVar).b == 1380533830) {
            azfVar.j(pwuVar.a, 0, 4);
            pwuVar.G(0);
            int d = pwuVar.d();
            if (d != 1463899717) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unsupported RIFF format: ");
                sb.append(d);
                Log.e("WavHeaderReader", sb.toString());
                return null;
            }
            aesq b = aesq.b(azfVar, pwuVar);
            while (b.b != 1718449184) {
                azfVar.f((int) b.a);
                b = aesq.b(azfVar, pwuVar);
            }
            ptx.e(b.a >= 16);
            azfVar.j(pwuVar.a, 0, 16);
            pwuVar.G(0);
            int g = pwuVar.g();
            int g2 = pwuVar.g();
            int f = pwuVar.f();
            pwuVar.f();
            int g3 = pwuVar.g();
            int g4 = pwuVar.g();
            int i = ((int) b.a) - 16;
            if (i > 0) {
                byte[] bArr2 = new byte[i];
                azfVar.j(bArr2, 0, i);
                bArr = bArr2;
            } else {
                bArr = pxi.f;
            }
            return new bem(g, g2, f, g3, g4, bArr);
        }
        return null;
    }
}

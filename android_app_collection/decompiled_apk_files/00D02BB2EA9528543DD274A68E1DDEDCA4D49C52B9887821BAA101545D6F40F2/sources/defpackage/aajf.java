package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aajf  reason: default package */
/* loaded from: classes2.dex */
public class aajf extends aajc {
    public aajf(final dgfy dgfyVar, ditv ditvVar, final String str, cjtd cjtdVar, final bmdq bmdqVar, final Activity activity) {
        super(k(ditvVar, 2131232333), alp.a().b(dgfyVar.b), activity.getString(R.string.ACCESSIBILITY_PLACE_PHONE_NUMBER, new Object[]{alp.a().b(dgfyVar.b)}), false, cjtdVar, new Runnable(dgfyVar, str, bmdqVar, activity) { // from class: aajd
            private final dgfy a;
            private final String b;
            private final bmdq c;
            private final Activity d;

            {
                this.a = dgfyVar;
                this.b = str;
                this.c = bmdqVar;
                this.d = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dgfy dgfyVar2 = this.a;
                String str2 = this.b;
                bmdq bmdqVar2 = this.c;
                Activity activity2 = this.d;
                dgbo dgboVar = dgfyVar2.e;
                if (dgboVar == null) {
                    dgboVar = dgbo.e;
                }
                if (dgboVar.c.isEmpty() || !bmdqVar2.c()) {
                    aajf.l(dgfyVar2.b, activity2);
                    return;
                }
                String str3 = dgfyVar2.b;
                dgbo dgboVar2 = dgfyVar2.e;
                if (dgboVar2 == null) {
                    dgboVar2 = dgbo.e;
                }
                bmdqVar2.b(str2, str3, Uri.parse(dgboVar2.c), dgfyVar2.c, activity2, null);
            }
        }, new Runnable(dgfyVar, activity) { // from class: aaje
            private final dgfy a;
            private final Activity b;

            {
                this.a = dgfyVar;
                this.b = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dgfy dgfyVar2 = this.a;
                aajf.l(dgfyVar2.b, this.b);
            }
        });
    }

    public static void l(String str, Activity activity) {
        if (str.isEmpty()) {
            return;
        }
        ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
        Toast.makeText(activity, activity.getString(R.string.COPIED_PHONE_TOAST), 1).show();
    }
}

package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aahc  reason: default package */
/* loaded from: classes2.dex */
public class aahc implements aahd {
    public dbsg<dgfy> a = dbpy.a;
    private final Activity b;
    private final bmdq c;

    public aahc(Activity activity, bmdq bmdqVar) {
        this.b = activity;
        this.c = bmdqVar;
    }

    @Override // defpackage.aahd
    public final Boolean a() {
        boolean z = false;
        if (this.a.a() && this.c.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aahd
    public final void b() {
        if (!this.a.a()) {
            return;
        }
        if (!this.c.c()) {
            d();
            return;
        }
        bmdq bmdqVar = this.c;
        dgbo dgboVar = this.a.b().e;
        if (dgboVar == null) {
            dgboVar = dgbo.e;
        }
        bmdqVar.e(Uri.parse(dgboVar.c), this.b, null);
    }

    @Override // defpackage.aahd
    public final Runnable c() {
        return new Runnable(this) { // from class: aahb
            private final aahc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        };
    }

    public final void d() {
        if (!this.a.a()) {
            return;
        }
        ((ClipboardManager) this.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", this.a.b().b));
        Activity activity = this.b;
        Toast.makeText(activity, activity.getString(R.string.COPIED_PHONE_TOAST), 1).show();
    }
}

package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: wzi  reason: default package */
/* loaded from: classes4.dex */
public final class wzi implements afzn {
    private Integer a;
    private Integer b;
    private View c;

    public wzi() {
    }

    public wzi(View view) {
        this.c = view;
    }

    public wzi(View view, byte[] bArr) {
        this.c = view;
        view.setOnTouchListener(new wzh(this, view.getResources().getDisplayMetrics().density));
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num;
        if (str == null || (num = (Integer) wzc.a.get(str)) == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 66) {
            View view = this.c;
            if (view == null) {
                return null;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.c.getMeasuredHeight();
            float f = this.c.getResources().getDisplayMetrics().density;
            return String.format(Locale.US, "%dx%d", Integer.valueOf((int) (measuredWidth / f)), Integer.valueOf((int) (measuredHeight / f)));
        } else if (intValue == 68) {
            if (this.a == null) {
                return null;
            }
            return String.format(Locale.US, "%d", this.a);
        } else if (intValue != 69 || this.b == null) {
            return null;
        } else {
            return String.format(Locale.US, "%d", this.b);
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wzi";
    }

    public final void c() {
        this.a = null;
        this.b = null;
    }

    public final void d(int i, int i2) {
        this.a = Integer.valueOf(i);
        this.b = Integer.valueOf(i2);
    }
}

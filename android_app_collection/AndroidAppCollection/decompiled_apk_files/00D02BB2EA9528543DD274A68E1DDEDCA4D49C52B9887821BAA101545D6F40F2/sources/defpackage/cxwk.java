package defpackage;

import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cxwk  reason: default package */
/* loaded from: classes5.dex */
public final class cxwk implements cxwm {
    private final ResolveInfo a;
    private String b;
    private Drawable c;

    public cxwk(cxwj cxwjVar) {
        dbsk.t(cxwjVar.a, "Please set resolveInfo.");
        this.a = cxwjVar.a;
    }

    public static cxwj d() {
        return new cxwj();
    }

    @Override // defpackage.cxwm
    public final String a() {
        String str = this.a.activityInfo.name;
        String str2 = this.a.activityInfo.packageName;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    @Override // defpackage.cxwm
    public final void b(ImageView imageView) {
        if (this.c == null) {
            try {
                this.c = this.a.loadIcon(imageView.getContext().getPackageManager());
            } catch (SecurityException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Error loading app icon: ");
                sb.append(valueOf);
                sb.toString();
            }
            if (this.c == null) {
                this.c = this.a.activityInfo.applicationInfo.loadIcon(imageView.getContext().getPackageManager());
            }
        }
        imageView.setImageDrawable(this.c);
    }

    @Override // defpackage.cxwm
    public final void c(TextView textView) {
        if (this.b == null) {
            this.b = this.a.loadLabel(textView.getContext().getPackageManager()).toString();
        }
        textView.setText(this.b);
    }
}

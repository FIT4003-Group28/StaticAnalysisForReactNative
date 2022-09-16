package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acfz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acfz implements Runnable {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ hm b;
    private final /* synthetic */ int c;

    public /* synthetic */ acfz(ImageView imageView, hm hmVar) {
        this.a = imageView;
        this.b = hmVar;
    }

    public /* synthetic */ acfz(ImageView imageView, hm hmVar, int i) {
        this.c = i;
        this.a = imageView;
        this.b = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.setImageDrawable(this.b);
        } else {
            this.a.setImageDrawable(this.b);
        }
    }
}

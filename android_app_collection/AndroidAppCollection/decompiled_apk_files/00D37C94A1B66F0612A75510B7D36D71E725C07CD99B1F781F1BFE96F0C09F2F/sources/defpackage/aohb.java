package defpackage;

import android.app.Activity;
import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* renamed from: aohb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aohb implements Runnable {
    public final /* synthetic */ LensApi a;
    public final /* synthetic */ Activity b;
    private final /* synthetic */ int c;

    public /* synthetic */ aohb(LensApi lensApi, Activity activity) {
        this.a = lensApi;
        this.b = activity;
    }

    public /* synthetic */ aohb(LensApi lensApi, Activity activity, int i) {
        this.c = i;
        this.a = lensApi;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.a(this.b);
        } else {
            this.a.a(this.b);
        }
    }
}

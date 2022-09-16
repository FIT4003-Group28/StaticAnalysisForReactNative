package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: enq  reason: default package */
/* loaded from: classes3.dex */
public final class enq {
    public final Context a;
    public final Resources b;
    public final ajmy c;
    public final NotificationManager d;
    public final aadd e;
    public int f;
    public String g;
    public volatile String h;
    public fi i;
    public fi j;
    public boolean k;

    public enq(Context context, ajmy ajmyVar, aadd aaddVar) {
        this.a = context;
        ajmyVar.getClass();
        this.c = ajmyVar;
        this.e = aaddVar;
        this.b = context.getResources();
        this.d = (NotificationManager) context.getSystemService("notification");
        this.k = false;
    }

    public final void a() {
        this.d.cancel(1005);
        this.k = false;
    }
}

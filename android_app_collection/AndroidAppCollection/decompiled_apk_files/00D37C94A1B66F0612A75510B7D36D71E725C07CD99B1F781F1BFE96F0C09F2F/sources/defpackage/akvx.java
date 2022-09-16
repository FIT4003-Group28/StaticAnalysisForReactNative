package defpackage;

import android.content.Context;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: akvx  reason: default package */
/* loaded from: classes.dex */
public final class akvx {
    public final long a;
    public final akvs b;
    public final Handler c;
    public final akvq d;
    public final Thread e = new akvw(this);

    public akvx(Context context, akwr akwrVar, akvq akvqVar, akvs akvsVar) {
        this.b = akvsVar;
        this.d = akvqVar;
        this.c = new Handler(context.getMainLooper());
        aver averVar = akwrVar.get().i;
        this.a = (averVar == null ? aver.a : averVar).b;
    }
}

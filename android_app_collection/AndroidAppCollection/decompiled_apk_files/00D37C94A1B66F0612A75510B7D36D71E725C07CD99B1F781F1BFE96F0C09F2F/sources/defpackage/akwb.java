package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: akwb  reason: default package */
/* loaded from: classes.dex */
public final class akwb {
    public final long a;
    public final Handler b;
    public final akvt c;
    public final akwh e;
    public final Thread f = new akwa(this);
    public final AtomicReference d = new AtomicReference();

    public akwb(akwh akwhVar, akvt akvtVar) {
        this.e = akwhVar;
        this.a = akwhVar.e.b();
        this.b = new Handler(akwhVar.b.getMainLooper());
        this.c = akvtVar;
    }
}

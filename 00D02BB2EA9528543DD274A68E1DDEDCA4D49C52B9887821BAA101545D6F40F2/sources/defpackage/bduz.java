package defpackage;

import android.content.Context;
import android.view.GestureDetector;
/* compiled from: PG */
/* renamed from: bduz  reason: default package */
/* loaded from: classes3.dex */
public final class bduz {
    public final bduv a;
    public boolean b;
    public final bbyt c;
    private final GestureDetector.OnGestureListener d;

    public bduz(Context context, bbyt bbytVar) {
        bduy bduyVar = new bduy(this);
        this.d = bduyVar;
        this.b = false;
        this.a = new bduv(context, bduyVar);
        this.c = bbytVar;
    }
}

package defpackage;

import android.os.IInterface;
import android.os.Looper;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: clcr  reason: default package */
/* loaded from: classes5.dex */
public final class clcr<L, W extends IInterface> {
    public final Looper a;
    public final HashMap<L, W> b = new HashMap<>();
    public final cnyr c;

    public clcr(Looper looper, cnyr cnyrVar) {
        this.a = looper;
        this.c = cnyrVar;
    }
}

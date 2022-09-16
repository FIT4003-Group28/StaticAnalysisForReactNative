package defpackage;

import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: akfv  reason: default package */
/* loaded from: classes.dex */
public final class akfv extends WeakReference {
    public final String a;

    public akfv(String str, View view, ReferenceQueue referenceQueue) {
        super(view, referenceQueue);
        this.a = str;
    }

    public akfv(View view, ReferenceQueue referenceQueue, String str) {
        super(view, referenceQueue);
        this.a = str;
    }
}

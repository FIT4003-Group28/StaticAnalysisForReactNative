package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy implements Iterable<Intent> {
    public final ArrayList<Intent> a = new ArrayList<>();
    public final Context b;

    public iy(Context context) {
        this.b = context;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}

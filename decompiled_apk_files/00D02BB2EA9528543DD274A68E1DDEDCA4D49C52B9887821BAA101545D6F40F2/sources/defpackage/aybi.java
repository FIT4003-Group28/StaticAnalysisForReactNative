package defpackage;

import android.content.Context;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aybi  reason: default package */
/* loaded from: classes3.dex */
public final class aybi implements Comparator<baal> {
    private final Context a;

    public aybi(Context context) {
        this.a = context;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(baal baalVar, baal baalVar2) {
        return baalVar.y(this.a).compareTo(baalVar2.y(this.a));
    }
}

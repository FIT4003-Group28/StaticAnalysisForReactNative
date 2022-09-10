package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: nsz  reason: default package */
/* loaded from: classes7.dex */
final class nsz extends dclu<cqtv> {
    private final Context a;

    public nsz(Context context) {
        this.a = context;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((cqtv) obj).a(this.a), ((cqtv) obj2).a(this.a));
    }
}

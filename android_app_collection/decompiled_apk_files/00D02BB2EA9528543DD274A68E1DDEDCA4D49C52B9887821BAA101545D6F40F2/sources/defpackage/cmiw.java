package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.Comparator;
/* renamed from: cmiw  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmiw implements Comparator {
    static final Comparator a = new cmiw();

    private cmiw() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Format) obj2).h - ((Format) obj).h;
    }
}

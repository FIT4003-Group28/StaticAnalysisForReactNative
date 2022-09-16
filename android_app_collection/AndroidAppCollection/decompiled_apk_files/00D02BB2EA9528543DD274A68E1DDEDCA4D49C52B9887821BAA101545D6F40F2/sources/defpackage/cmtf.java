package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
/* renamed from: cmtf  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cmtf implements Comparator {
    public static final Comparator a = new cmtf();

    private cmtf() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).b.compareTo(((Scope) obj2).b);
    }
}

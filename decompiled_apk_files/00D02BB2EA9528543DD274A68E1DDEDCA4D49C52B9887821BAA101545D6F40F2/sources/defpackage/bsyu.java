package defpackage;

import java.io.File;
import java.util.Comparator;
/* renamed from: bsyu  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsyu implements Comparator {
    static final Comparator a = new bsyu();

    private bsyu() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
    }
}

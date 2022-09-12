package defpackage;

import java.util.Comparator;
/* renamed from: chrp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chrp implements Comparator {
    static final Comparator a = new chrp();

    private chrp() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((dcla) obj).a()).compareTo((String) ((dcla) obj2).a());
    }
}

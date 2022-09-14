package com.google.firebase.crashlytics.c.h;

import com.google.firebase.crashlytics.c.j.v;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f8631b = new g0();

    private g0() {
    }

    public static Comparator a() {
        return f8631b;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((v.b) obj).a().compareTo(((v.b) obj2).a());
        return compareTo;
    }
}

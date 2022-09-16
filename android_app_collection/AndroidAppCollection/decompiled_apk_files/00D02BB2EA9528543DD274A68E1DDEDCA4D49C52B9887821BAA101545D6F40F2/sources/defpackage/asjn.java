package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: asjn  reason: default package */
/* loaded from: classes2.dex */
enum asjn {
    DIRECTIONS,
    NAVIGATION;
    
    public static final String c = asjn.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        bundle.putSerializable(c, this);
    }
}

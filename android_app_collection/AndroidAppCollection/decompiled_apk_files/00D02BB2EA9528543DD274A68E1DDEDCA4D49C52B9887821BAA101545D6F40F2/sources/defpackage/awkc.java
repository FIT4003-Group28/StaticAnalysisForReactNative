package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: awkc  reason: default package */
/* loaded from: classes3.dex */
public final class awkc {
    public final bcl a;
    public final isa b;

    public awkc(bcl bclVar, isa isaVar) {
        this.a = bclVar;
        this.b = isaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(avjy avjyVar) {
        return Base64.encodeToString(avjyVar.bS(), 3);
    }
}

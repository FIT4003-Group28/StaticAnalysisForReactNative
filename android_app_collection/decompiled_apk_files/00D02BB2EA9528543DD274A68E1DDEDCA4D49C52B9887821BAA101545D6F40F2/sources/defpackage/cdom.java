package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cdom  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdom implements Serializable {
    public static cdom e(String str, boolean z, drfq drfqVar) {
        return new cdoj(str, z, bvrt.b(drfqVar));
    }

    public abstract String a();

    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bvrt<drfq> c();

    public drfq d() {
        throw null;
    }

    public final cdom f(boolean z) {
        return e(a(), z, d());
    }
}

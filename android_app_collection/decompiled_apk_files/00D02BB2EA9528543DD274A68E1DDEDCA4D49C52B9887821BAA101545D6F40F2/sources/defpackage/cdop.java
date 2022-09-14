package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cdop  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdop implements Serializable {
    public static cdop f(String str, dcdc<cdom> dcdcVar, boolean z, drfq drfqVar) {
        return new cdok(str, dcdcVar, z, bvrt.b(drfqVar));
    }

    public abstract String a();

    public abstract dcdc<cdom> b();

    public abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bvrt<drfq> d();

    public drfq e() {
        throw null;
    }
}

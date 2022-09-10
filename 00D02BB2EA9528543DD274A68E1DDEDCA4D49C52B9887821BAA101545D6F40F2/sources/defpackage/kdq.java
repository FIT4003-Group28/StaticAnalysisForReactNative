package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: kdq  reason: default package */
/* loaded from: classes7.dex */
public abstract class kdq {
    public abstract dbsg<Rect> a();

    public abstract dbsg<Rect> b();

    public abstract Rect c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public final String toString() {
        Object[] objArr = new Object[6];
        int f = f();
        objArr[0] = f != 1 ? f != 2 ? "null" : "CLEAR" : "EDIT";
        objArr[1] = kdn.a(d());
        objArr[2] = kdn.a(e());
        objArr[3] = a().h(kdo.a).c("");
        objArr[4] = b().h(kdp.a).c("<none>");
        objArr[5] = c();
        return String.format("Update(%s): %s->%s;%s margin: %s->%s", objArr);
    }
}

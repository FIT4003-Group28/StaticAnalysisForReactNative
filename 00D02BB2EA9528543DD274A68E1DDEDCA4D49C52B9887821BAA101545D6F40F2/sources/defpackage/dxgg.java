package defpackage;
/* compiled from: PG */
/* renamed from: dxgg  reason: default package */
/* loaded from: classes6.dex */
public final class dxgg {
    public static final String a(int i, dxhp dxhpVar) {
        try {
            return dxhpVar.a.b(i).c();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final int b(int i, dxhp dxhpVar) {
        return dxhpVar.a(i);
    }

    public static final dxhq c(int i, dxhp dxhpVar) {
        try {
            return new dxhq(dxhpVar.b, dxhpVar.a.b(i));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}

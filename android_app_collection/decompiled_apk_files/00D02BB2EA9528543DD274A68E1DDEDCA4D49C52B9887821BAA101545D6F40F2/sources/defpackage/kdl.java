package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: kdl  reason: default package */
/* loaded from: classes7.dex */
public final class kdl extends kdq {
    private final dbsg<Rect> a;
    private final dbsg<Rect> b;
    private final Rect c;
    private final int d;
    private final int e;

    public kdl(int i, int i2, dbsg<Rect> dbsgVar, dbsg<Rect> dbsgVar2, Rect rect) {
        if (i != 0) {
            this.d = i;
            if (i2 != 0) {
                this.e = i2;
                this.a = dbsgVar;
                this.b = dbsgVar2;
                this.c = rect;
                return;
            }
            throw new NullPointerException("Null to");
        }
        throw new NullPointerException("Null from");
    }

    @Override // defpackage.kdq
    public final dbsg<Rect> a() {
        return this.a;
    }

    @Override // defpackage.kdq
    public final dbsg<Rect> b() {
        return this.b;
    }

    @Override // defpackage.kdq
    public final Rect c() {
        return this.c;
    }

    @Override // defpackage.kdq
    public final int d() {
        return this.d;
    }

    @Override // defpackage.kdq
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kdq) {
            kdq kdqVar = (kdq) obj;
            if (this.d == kdqVar.d() && this.e == kdqVar.e() && kdqVar.f() == 1 && this.a.equals(kdqVar.a()) && this.b.equals(kdqVar.b()) && this.c.equals(kdqVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kdq
    public final int f() {
        return 1;
    }

    public final int hashCode() {
        return ((((((((((this.d ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ 1) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}

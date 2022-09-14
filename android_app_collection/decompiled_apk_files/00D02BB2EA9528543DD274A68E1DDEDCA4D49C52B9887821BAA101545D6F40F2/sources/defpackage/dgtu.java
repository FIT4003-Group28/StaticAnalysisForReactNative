package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgtu  reason: default package */
/* loaded from: classes6.dex */
public final class dgtu implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;

    public dgtu(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        boolean z = true;
        dgtr.a(length <= 1);
        dgtr.a(typeArr.length == 1);
        if (length == 1) {
            dgtr.b(typeArr2[0]);
            dgtv.i(typeArr2[0]);
            dgtr.a(typeArr[0] != Object.class ? false : z);
            this.b = dgtv.b(typeArr2[0]);
            this.a = Object.class;
            return;
        }
        dgtr.b(typeArr[0]);
        dgtv.i(typeArr[0]);
        this.b = null;
        this.a = dgtv.b(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && dgtv.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : dgtv.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        if (this.b != null) {
            return "? super " + dgtv.e(this.b);
        } else if (this.a == Object.class) {
            return "?";
        } else {
            return "? extends " + dgtv.e(this.a);
        }
    }
}

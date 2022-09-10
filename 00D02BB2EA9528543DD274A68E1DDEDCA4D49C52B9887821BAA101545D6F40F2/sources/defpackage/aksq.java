package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: aksq  reason: default package */
/* loaded from: classes2.dex */
public final class aksq extends aksw {
    private final dmsl a;
    private final Bitmap b;

    public aksq(dmsl dmslVar, @dzsi Bitmap bitmap) {
        if (dmslVar != null) {
            this.a = dmslVar;
            this.b = bitmap;
            return;
        }
        throw new NullPointerException("Null strokeStyle");
    }

    @Override // defpackage.aksw
    public final dmsl a() {
        return this.a;
    }

    @Override // defpackage.aksw
    @dzsi
    public final Bitmap b() {
        return this.b;
    }

    @Override // defpackage.aksw
    @dzsi
    public final Bitmap c() {
        return null;
    }

    @Override // defpackage.aksw
    @dzsi
    public final Bitmap d() {
        return null;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aksw) {
            aksw akswVar = (aksw) obj;
            if (this.a.equals(akswVar.a()) && ((bitmap = this.b) != null ? bitmap.equals(akswVar.b()) : akswVar.b() == null) && akswVar.c() == null && akswVar.d() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dmsl dmslVar = this.a;
        int i = dmslVar.bC;
        if (i == 0) {
            i = dsst.a.b(dmslVar).c(dmslVar);
            dmslVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        return ((bitmap == null ? 0 : bitmap.hashCode()) ^ i2) * (-721379959);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + "null".length() + "null".length());
        sb.append("BitmapLineDefinition{strokeStyle=");
        sb.append(valueOf);
        sb.append(", lineBitmap=");
        sb.append(valueOf2);
        sb.append(", startCapBitmap=");
        sb.append("null");
        sb.append(", endCapBitmap=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}

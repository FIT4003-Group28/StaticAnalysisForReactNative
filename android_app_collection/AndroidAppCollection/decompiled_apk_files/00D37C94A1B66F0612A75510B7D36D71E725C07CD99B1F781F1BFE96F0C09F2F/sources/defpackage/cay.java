package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cay  reason: default package */
/* loaded from: classes2.dex */
public final class cay implements can {
    public final String a;
    public final List b;
    public final boolean c;

    public cay(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byd(bxnVar, cbdVar, this);
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(arrays).length());
        sb.append("ShapeGroup{name='");
        sb.append(str);
        sb.append("' Shapes: ");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}

package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: bne  reason: default package */
/* loaded from: classes3.dex */
public final class bne implements bms {
    public final String a;
    public final List<bms> b;
    public final boolean c;

    public bne(String str, List<bms> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        return new bkl(bjrVar, bnlVar, this);
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

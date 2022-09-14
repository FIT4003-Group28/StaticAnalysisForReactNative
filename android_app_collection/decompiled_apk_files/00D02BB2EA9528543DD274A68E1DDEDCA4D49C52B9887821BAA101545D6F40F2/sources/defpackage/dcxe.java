package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dcxe  reason: default package */
/* loaded from: classes5.dex */
final class dcxe implements Comparator<dcxf> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dcxf dcxfVar, dcxf dcxfVar2) {
        int i = dcxfVar.a;
        int i2 = dcxfVar2.a;
        if (i < i2) {
            return 1;
        }
        return i <= i2 ? 0 : -1;
    }
}

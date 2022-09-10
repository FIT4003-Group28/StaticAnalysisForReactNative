package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zxf  reason: default package */
/* loaded from: classes7.dex */
public final class zxf implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof zxd) {
            zxd zxdVar = zxd.a;
            if (((zxd) cqkuVar).ordinal() != 0 || !(view instanceof zxe) || !(obj instanceof Boolean)) {
                return false;
            }
            ((zxe) view).setIsReorderable(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}

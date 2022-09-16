package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: biq  reason: default package */
/* loaded from: classes2.dex */
public final class biq {
    static final bjj f = new bjj();
    public final List a;
    public final List b;
    public final bip e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final agd c = new agd();

    public biq(List list, List list2) {
        this.a = list;
        this.b = list2;
        int size = list.size();
        int i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        bip bipVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            bip bipVar2 = (bip) this.a.get(i2);
            int i3 = bipVar2.b;
            bipVar = i3 > i ? bipVar2 : bipVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.e = bipVar;
    }

    public static bin b(Bitmap bitmap) {
        return new bin(bitmap);
    }

    public final int a(int i) {
        bip bipVar = this.e;
        return bipVar != null ? bipVar.a : i;
    }

    public final bip c(bir birVar) {
        return (bip) this.c.get(birVar);
    }

    public final List d() {
        return Collections.unmodifiableList(this.a);
    }
}

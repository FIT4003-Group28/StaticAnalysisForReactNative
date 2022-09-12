package defpackage;

import android.content.res.Resources;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bvlg  reason: default package */
/* loaded from: classes.dex */
public final class bvlg {
    @dzsi
    public final Resources a;
    public final int b;
    @dzsi
    private final byte[] c = null;

    public bvlg(@dzsi Resources resources, int i) {
        this.a = resources;
        this.b = i;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvlg)) {
            return false;
        }
        bvlg bvlgVar = (bvlg) obj;
        if (this.b == bvlgVar.b) {
            byte[] bArr = bvlgVar.c;
            if (dbsd.a(this.a, bvlgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(System.identityHashCode(null))});
    }
}

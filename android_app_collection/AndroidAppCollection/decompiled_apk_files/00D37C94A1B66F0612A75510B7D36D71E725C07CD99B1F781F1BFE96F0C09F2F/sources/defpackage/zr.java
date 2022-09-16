package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.Arrays;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: zr  reason: default package */
/* loaded from: classes4.dex */
public final class zr {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public zr(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}

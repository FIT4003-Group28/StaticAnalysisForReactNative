package defpackage;

import android.os.Bundle;
import com.google.android.youtube.R;
import j$.util.function.Supplier;
/* compiled from: PG */
/* renamed from: ibz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibz implements Supplier {
    private final /* synthetic */ int o;
    public static final /* synthetic */ ibz n = new ibz(13);
    public static final /* synthetic */ ibz m = new ibz(12);
    public static final /* synthetic */ ibz l = new ibz(11);
    public static final /* synthetic */ ibz k = new ibz(10);
    public static final /* synthetic */ ibz j = new ibz(9);
    public static final /* synthetic */ ibz i = new ibz(8);
    public static final /* synthetic */ ibz h = new ibz(7);
    public static final /* synthetic */ ibz g = new ibz(6);
    public static final /* synthetic */ ibz f = new ibz(5);
    public static final /* synthetic */ ibz e = new ibz(4);
    public static final /* synthetic */ ibz d = new ibz(3);
    public static final /* synthetic */ ibz c = new ibz(2);
    public static final /* synthetic */ ibz b = new ibz(1);
    public static final /* synthetic */ ibz a = new ibz();

    private /* synthetic */ ibz() {
    }

    private /* synthetic */ ibz(int i2) {
        this.o = i2;
    }

    @Override // j$.util.function.Supplier
    /* renamed from: get */
    public final Object mo515get() {
        switch (this.o) {
            case 0:
                return new Bundle();
            case 1:
                return new Bundle();
            case 2:
                return hve.i(R.attr.ytTextPrimary);
            case 3:
                return hve.i(R.attr.ytTextSecondary);
            case 4:
                return hve.i(R.attr.ytIconActiveOther);
            case 5:
                return new Bundle();
            case 6:
                return hve.i(R.attr.ytBrandBackgroundSolid);
            case 7:
                return hve.i(R.attr.ytStatusBarBackground);
            case 8:
                return asgt.a;
            case 9:
                return amuk.q();
            case 10:
                return amuk.f();
            case 11:
                return amvk.c();
            case 12:
                return amvn.i();
            default:
                return new amum();
        }
    }
}

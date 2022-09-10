package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: xel  reason: default package */
/* loaded from: classes7.dex */
public final class xel {
    public final Context a;
    private dbsg<Boolean> e = dbpy.a;
    public dbsg<Boolean> b = dbpy.a;
    public dbsg<Long> c = dbpy.a;
    public dbsg<Integer> d = dbpy.a;

    public xel(Context context) {
        this.a = context;
    }

    public final boolean a() {
        if (!this.e.a()) {
            try {
                this.e = dbsg.i(Boolean.valueOf(this.a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce")));
            } catch (NoSuchMethodError unused) {
                this.e = dbsg.i(false);
            }
        }
        return this.e.b().booleanValue();
    }
}

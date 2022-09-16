package defpackage;
/* compiled from: PG */
/* renamed from: mhi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhi implements aypx {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ mhi(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        boolean z = false;
        if (this.b == 0) {
            String str = this.a;
            String str2 = (String) obj2;
            if (((Boolean) obj).booleanValue() || str2.equals(str)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        String str3 = this.a;
        String str4 = (String) obj2;
        if (((Boolean) obj).booleanValue() || str4.equals(str3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
